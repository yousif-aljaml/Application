package com.Nasa.Soft.Exzam.Editor35;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileUtil {
    private static void createNewFile(String str) {
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf > 0) {
            makeDir(str.substring(0, lastIndexOf));
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[SYNTHETIC, Splitter:B:28:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFile(java.lang.String r5) {
        /*
            createNewFile(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0033 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0033 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0033 }
            r5 = 1024(0x400, float:1.435E-42)
            char[] r5 = new char[r5]     // Catch:{ IOException -> 0x002e, all -> 0x002b }
        L_0x0017:
            int r1 = r2.read(r5)     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            if (r1 > 0) goto L_0x0021
            r2.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0041
        L_0x0021:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            r4 = 0
            r3.<init>(r5, r4, r1)     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            r0.append(r3)     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            goto L_0x0017
        L_0x002b:
            r5 = move-exception
            r1 = r2
            goto L_0x0046
        L_0x002e:
            r5 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0046
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r5.printStackTrace()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0041:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x0046:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0050:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.FileUtil.readFile(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032 A[SYNTHETIC, Splitter:B:21:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeFile(java.lang.String r3, java.lang.String r4) {
        /*
            createNewFile(r3)
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0021 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0021 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0021 }
            r3 = 0
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0021 }
            r1.write(r4)     // Catch:{ IOException -> 0x001c, all -> 0x0019 }
            r1.flush()     // Catch:{ IOException -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x0019:
            r3 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x001c:
            r3 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001f:
            r3 = move-exception
            goto L_0x0030
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            r3.printStackTrace()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r3 = move-exception
            r3.printStackTrace()
        L_0x002f:
            return
        L_0x0030:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.FileUtil.writeFile(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0046 A[SYNTHETIC, Splitter:B:36:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0050 A[SYNTHETIC, Splitter:B:41:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x005c A[SYNTHETIC, Splitter:B:47:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0066 A[SYNTHETIC, Splitter:B:52:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = isExistFile(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            createNewFile(r4)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            r2 = 0
            r3.<init>(r4, r2)     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
        L_0x001a:
            int r0 = r1.read(r4)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            if (r0 > 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0028:
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x002c:
            r3.write(r4, r2, r0)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            goto L_0x001a
        L_0x0030:
            r4 = move-exception
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            goto L_0x003a
        L_0x0034:
            r4 = move-exception
            r3 = r0
        L_0x0036:
            r0 = r1
            goto L_0x005a
        L_0x0038:
            r4 = move-exception
            r3 = r0
        L_0x003a:
            r0 = r1
            goto L_0x0041
        L_0x003c:
            r4 = move-exception
            r3 = r0
            goto L_0x005a
        L_0x003f:
            r4 = move-exception
            r3 = r0
        L_0x0041:
            r4.printStackTrace()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004e:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0058:
            return
        L_0x0059:
            r4 = move-exception
        L_0x005a:
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0064:
            if (r3 == 0) goto L_0x006e
            r3.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r3 = move-exception
            r3.printStackTrace()
        L_0x006e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.FileUtil.copyFile(java.lang.String, java.lang.String):void");
    }

    public static void copyDir(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                copyFile(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            } else if (file2.isDirectory()) {
                copyDir(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            }
        }
    }

    public static void moveFile(String str, String str2) {
        copyFile(str, str2);
        deleteFile(str);
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteFile(file2.getAbsolutePath());
                    }
                    if (file2.isFile()) {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean isExistFile(String str) {
        return new File(str).exists();
    }

    public static void makeDir(String str) {
        if (!isExistFile(str)) {
            new File(str).mkdirs();
        }
    }

    public static void listDir(String str, ArrayList<String> arrayList) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null && listFiles.length > 0 && arrayList != null) {
            arrayList.clear();
            for (File absolutePath : listFiles) {
                arrayList.add(absolutePath.getAbsolutePath());
            }
        }
    }

    public static boolean isDirectory(String str) {
        if (!isExistFile(str)) {
            return false;
        }
        return new File(str).isDirectory();
    }

    public static boolean isFile(String str) {
        if (!isExistFile(str)) {
            return false;
        }
        return new File(str).isFile();
    }

    public static long getFileLength(String str) {
        if (!isExistFile(str)) {
            return 0;
        }
        return new File(str).length();
    }

    public static String getExternalStorageDir() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String getPackageDataDir(Context context) {
        return context.getExternalFilesDir((String) null).getAbsolutePath();
    }

    public static String getPublicDir(String str) {
        return Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String convertUriToFilePath(android.content.Context r5, android.net.Uri r6) {
        /*
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x00b4
            boolean r0 = isExternalStorageDocument(r6)
            java.lang.String r2 = ":"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003f
            java.lang.String r5 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r5 = r5.split(r2)
            r6 = r5[r4]
            java.lang.String r0 = "primary"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x00d6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r6.append(r0)
            java.lang.String r0 = "/"
            r6.append(r0)
            r5 = r5[r3]
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x00d7
        L_0x003f:
            boolean r0 = isDownloadsDocument(r6)
            if (r0 == 0) goto L_0x0075
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "raw:"
            boolean r2 = r6.startsWith(r0)
            if (r2 == 0) goto L_0x005e
            java.lang.String r5 = ""
            java.lang.String r5 = r6.replaceFirst(r0, r5)
            return r5
        L_0x005e:
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r2 = r6.longValue()
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r0, r2)
            java.lang.String r5 = getDataColumn(r5, r6, r1, r1)
            goto L_0x00d7
        L_0x0075:
            boolean r0 = isMediaDocument(r6)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r6 = r6.split(r2)
            r0 = r6[r4]
            java.lang.String r2 = "image"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0090
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x00a7
        L_0x0090:
            java.lang.String r2 = "video"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x009b
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x00a7
        L_0x009b:
            java.lang.String r2 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a6
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            goto L_0x00a7
        L_0x00a6:
            r0 = r1
        L_0x00a7:
            java.lang.String[] r2 = new java.lang.String[r3]
            r6 = r6[r3]
            r2[r4] = r6
            java.lang.String r6 = "_id=?"
            java.lang.String r5 = getDataColumn(r5, r0, r6, r2)
            goto L_0x00d7
        L_0x00b4:
            java.lang.String r0 = r6.getScheme()
            java.lang.String r2 = "content"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r5 = getDataColumn(r5, r6, r1, r1)
            goto L_0x00d7
        L_0x00c5:
            java.lang.String r5 = r6.getScheme()
            java.lang.String r0 = "file"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r6.getPath()
            goto L_0x00d7
        L_0x00d6:
            r5 = r1
        L_0x00d7:
            if (r5 == 0) goto L_0x00e0
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r6)     // Catch:{ Exception -> 0x00e0 }
            return r5
        L_0x00e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.FileUtil.convertUriToFilePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th != null) {
                        if (th != th) {
                            try {
                                th.addSuppressed(th);
                            } catch (Exception unused) {
                            }
                        }
                        th = th;
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            th = null;
        }
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static void saveBitmap(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        createNewFile(str);
        Throwable th = null;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            if (th != null) {
                if (th != th) {
                    try {
                        th.addSuppressed(th);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                th = th;
            }
            throw th;
        }
    }

    public static Bitmap getScaledBitmap(String str, int i) {
        int i2;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (width > height) {
            i2 = (int) (((float) height) * (((float) i) / ((float) width)));
        } else {
            int i3 = (int) (((float) width) * (((float) i) / ((float) height)));
            i2 = i;
            i = i3;
        }
        return Bitmap.createScaledBitmap(decodeFile, i, i2, true);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        if (i4 > i2 || i3 > i) {
            int i6 = i4 / 2;
            int i7 = i3 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap decodeSampleBitmapFromPath(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void resizeBitmapFileRetainRatio(String str, String str2, int i) {
        if (isExistFile(str)) {
            saveBitmap(getScaledBitmap(str, i), str2);
        }
    }

    public static void resizeBitmapFileToSquare(String str, String str2, int i) {
        if (isExistFile(str)) {
            saveBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeFile(str), i, i, true), str2);
        }
    }

    public static void resizeBitmapFileToCircle(String str, String str2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle((float) (decodeFile.getWidth() / 2), (float) (decodeFile.getHeight() / 2), (float) (decodeFile.getWidth() / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(decodeFile, rect, rect, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void resizeBitmapFileWithRoundedBorder(String str, String str2, int i) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
            RectF rectF = new RectF(rect);
            float f = (float) i;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(decodeFile, rect, rect, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void cropBitmapFileFromCenter(String str, String str2, int i, int i2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            int width = decodeFile.getWidth();
            int height = decodeFile.getHeight();
            if (width >= i || height >= i2) {
                int i3 = 0;
                int i4 = width > i ? (width - i) / 2 : 0;
                if (height > i2) {
                    i3 = (height - i2) / 2;
                }
                if (i > width) {
                    i = width;
                }
                if (i2 > height) {
                    i2 = height;
                }
                saveBitmap(Bitmap.createBitmap(decodeFile, i4, i3, i, i2), str2);
            }
        }
    }

    public static void rotateBitmapFile(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void scaleBitmapFile(String str, String str2, float f, float f2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void skewBitmapFile(String str, String str2, float f, float f2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postSkew(f, f2);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void setBitmapFileColorFilter(String str, String str2, int i) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth() - 1, decodeFile.getHeight() - 1);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(i, 1));
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void setBitmapFileBrightness(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 1.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 1.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), decodeFile.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void setBitmapFileContrast(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), decodeFile.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static int getJpegRotate(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", -1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    public static File createNewPictureFile(Context context) {
        return new File(String.valueOf(context.getExternalFilesDir(Environment.DIRECTORY_DCIM).getAbsolutePath()) + File.separator + (String.valueOf(new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())) + ".jpg"));
    }
}
