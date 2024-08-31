package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import java.lang.Thread;

public class SketchApplication extends Application {
    private static Context mApplicationContext;
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public static Context getContext() {
        return mApplicationContext;
    }

    public void onCreate() {
        mApplicationContext = getApplicationContext();
        this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                Intent intent = new Intent(SketchApplication.this.getApplicationContext(), DebugActivity.class);
                intent.setFlags(32768);
                intent.putExtra("error", Log.getStackTraceString(th));
                ((AlarmManager) SketchApplication.this.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, 1000, PendingIntent.getActivity(SketchApplication.this.getApplicationContext(), 11111, intent, BasicMeasure.EXACTLY));
                SketchLogger.broadcastLog(Log.getStackTraceString(th));
                Process.killProcess(Process.myPid());
                System.exit(1);
                SketchApplication.this.uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        });
        SketchLogger.startLogging();
        super.onCreate();
    }
}
