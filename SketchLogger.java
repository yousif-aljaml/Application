package com.Nasa.Soft.Exzam.Editor35;

import android.content.Context;
import android.content.Intent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SketchLogger {
    /* access modifiers changed from: private */
    public static volatile boolean isRunning = false;
    private static Thread loggerThread = new Thread() {
        public void run() {
            BufferedReader bufferedReader;
            SketchLogger.isRunning = true;
            try {
                Runtime.getRuntime().exec("logcat -c");
                Throwable th = null;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()));
                    String readLine = bufferedReader.readLine();
                    do {
                        SketchLogger.broadcastLog(readLine);
                        if (!SketchLogger.isRunning || (readLine = bufferedReader.readLine()) == null) {
                        }
                        SketchLogger.broadcastLog(readLine);
                        break;
                    } while ((readLine = bufferedReader.readLine()) == null);
                    if (SketchLogger.isRunning) {
                        SketchLogger.broadcastLog("Logger got killed. Restarting.");
                        SketchLogger.startLogging();
                    } else {
                        SketchLogger.broadcastLog("Logger stopped.");
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (th != null) {
                        if (th != th) {
                            th.addSuppressed(th);
                        }
                        th = th;
                    }
                    throw th;
                }
            } catch (Exception e) {
                SketchLogger.broadcastLog(e.toString());
            }
        }
    };

    public static void startLogging() {
        if (!isRunning) {
            loggerThread.start();
            return;
        }
        throw new IllegalStateException("Logger already running");
    }

    public static void broadcastLog(String str) {
        Context context = SketchApplication.getContext();
        Intent intent = new Intent();
        intent.setAction("com.sketchware.remod.ACTION_NEW_DEBUG_LOG");
        intent.putExtra("log", str);
        intent.putExtra("packageName", context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void stopLogging() {
        if (isRunning) {
            isRunning = false;
            broadcastLog("Stopping logger by user request.");
            return;
        }
        throw new IllegalStateException("Logger not running");
    }
}
