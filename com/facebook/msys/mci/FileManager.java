package com.facebook.msys.mci;

import X.0T9;
import X.1Ne;
import X.1SL;
import X.AnonymousClass001;
import X.C3ip;
import android.content.ContentResolver;
import com.facebook.common.dextricks.Constants;
import com.facebook.msys.mcf.MsysError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: FileManager.class */
public class FileManager {
    public static File mCacheDir;
    public static ContentResolver mContentResolver;
    public static volatile boolean sInitialized;

    static {
        1SL.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f1, code lost:
    
        if (r0.contains("space") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01dc, code lost:
    
        if (r0.contains("space") == false) goto L136;
     */
    /* JADX WARN: Type inference failed for: r0v101, types: [X.0w6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void copyFile(java.lang.String r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.copyFile(java.lang.String, java.lang.String):void");
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        0T9.A02("FileManager.copyInputStreamIntoOutputStream", -612725792);
        byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                0T9.A00(1003219040);
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static String createCacheDirectory(String str) {
        File file = new File(mCacheDir, str);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            return file.toString();
        }
        throw createFileManagerError(7, null);
    }

    public static void createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if ((!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) && !fileFromPathWithOptionalScheme.mkdirs()) {
            throw createFileManagerError(7, null);
        }
    }

    public static MsysError createFileManagerError(int i, Throwable th) {
        return new MsysError("com.facebook.msys.filesystem", i, th != null ? Collections.singletonMap(MsysError.getLocalizedFailureReasonKey(), th.toString()) : null);
    }

    public static void deleteItem(String str) {
        if (!deleteItemRecursive(getFileFromPathWithOptionalScheme(str))) {
            throw createFileManagerError(8, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean deleteItemRecursive(java.io.File r301) {
        /*
            r0 = r301
            boolean r0 = r0.isDirectory()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L6c
            r0 = r301
            java.io.File[] r0 = r0.listFiles()
            r303 = r0
            r0 = r303
            int r0 = r0.length
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 1
            r307 = r0
        L1a:
            r0 = r306
            r1 = r304
            if (r0 >= r1) goto L5c
            r0 = r303
            r1 = r306
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            boolean r0 = r0.isDirectory()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4e
            r0 = r307
            if (r0 == 0) goto L42
            r0 = r308
            boolean r0 = deleteItemRecursive(r0)
            r302 = r0
        L3b:
            r0 = 1
            r307 = r0
            r0 = r302
            if (r0 != 0) goto L45
        L42:
            r0 = 0
            r307 = r0
        L45:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L1a
        L4e:
            r0 = r307
            if (r0 == 0) goto L42
            r0 = r308
            boolean r0 = r0.delete()
            r302 = r0
            goto L3b
        L5c:
            r0 = r301
            boolean r0 = r0.delete()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L72
            r0 = r307
            if (r0 == 0) goto L72
            r0 = 1
            return r0
        L6c:
            r0 = r301
            boolean r0 = r0.delete()
            r305 = r0
        L72:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.deleteItemRecursive(java.io.File):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        r312 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (r0.isDirectory() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        r0 = java.util.Locale.ROOT;
        r0 = java.lang.Boolean.valueOf(r0);
        r0 = java.lang.Boolean.valueOf(r0);
        r0 = java.lang.Boolean.valueOf(r0);
        r0 = java.lang.Long.valueOf(r0);
        r0 = java.lang.Long.valueOf(r0);
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
    
        r324 = r0.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0129, code lost:
    
        return java.lang.String.format(r0, "File Error: Path = %s, Exists = %b, Can Read = %b, Can Write = %b, Size = %d, Last Modified = %d, Is Directory = %b, Parent Path = %s, Parent Exists = %b, Parent Can Read = %b, Parent Can Write = %b, Parent Is Directory = %b", r0, r0, r0, r0, r0, r0, r0, r324, java.lang.Boolean.valueOf(r313), java.lang.Boolean.valueOf(r314), java.lang.Boolean.valueOf(r315), java.lang.Boolean.valueOf(r312));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012a, code lost:
    
        r324 = "<null>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        r312 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r0.canWrite() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (r0.exists() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        r314 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        if (r0.canRead() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r314 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r315 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String generateFileNotFoundError(java.io.File r301) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.generateFileNotFoundError(java.io.File):java.lang.String");
    }

    public static long getAvailableDiskSpace() {
        File file = mCacheDir;
        if (file == null) {
            return 0L;
        }
        return getFileFromPathWithOptionalScheme(file.toString()).getFreeSpace();
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static File getFileFromPathWithOptionalScheme(String str) {
        File A0D;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                new File(URI.create(str));
            } else if (str.startsWith("cache://")) {
                A0D = AnonymousClass001.A0D(mCacheDir, str.substring(8));
            } else {
                new File(str);
            }
        }
        return A0D;
    }

    public static boolean isMCPEnabledForFileManager() {
        return 1Ne.A00(18);
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles == null) {
            throw createFileManagerError(6, null);
        }
        int length = listFiles.length;
        if (length > 1) {
            HashMap hashMap = new HashMap(length + 1, 1.0f);
            int i = 0;
            do {
                File file = listFiles[i];
                hashMap.put(file, Long.valueOf(file.lastModified()));
                i++;
            } while (i < length);
            Arrays.sort(listFiles, new C3ip(3, hashMap));
        }
        String[] strArr = new String[length];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return strArr;
            }
            strArr[i3] = listFiles[i3].getAbsolutePath();
            i2 = i3 + 1;
        }
    }

    public static void moveFile(String str, String str2) {
        int i;
        0T9.A02("FileManager.moveFile", -767238930);
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
            File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
            if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2)) {
                i = 714495504;
            } else if (fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
                i = -1080445344;
            } else {
                copyFile(str, str2);
                if (!fileFromPathWithOptionalScheme.delete()) {
                    throw createFileManagerError(8, null);
                }
                i = -1891552760;
            }
            0T9.A00(i);
        } catch (Throwable th) {
            0T9.A00(-1933485415);
            throw th;
        }
    }

    public static native void nativeInitialize();

    public static byte[] readFile(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(getFileFromPathWithOptionalScheme(str), "r");
            try {
                long length = randomAccessFile.length();
                if (length > 2147483647L) {
                    android.util.Log.e("FileUtils", "Cannot read more than 2GB into an array");
                    throw AnonymousClass001.A0G("Cannot read more than 2GB into an array");
                }
                byte[] bArr = new byte[(int) length];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            } finally {
            }
        } catch (IOException e) {
            throw createFileManagerError(6, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (r0.contains("space") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void writeDataToFile(byte[] r301, java.lang.String r302, boolean r303) {
        /*
            r0 = r302
            java.io.File r0 = getFileFromPathWithOptionalScheme(r0)
            r304 = r0
            r0 = r304
            java.io.File r0 = r0.getParentFile()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L22
            r0 = r305
            boolean r0 = r0.exists()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L22
            r0 = r305
            boolean r0 = r0.mkdirs()
        L22:
            r0 = r302
            java.io.File r0 = getFileFromPathWithOptionalScheme(r0)
            r305 = r0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L75 java.io.FileNotFoundException -> La1
            r307 = r0
            r0 = r307
            r1 = r301
            r0.<init>(r1)     // Catch: java.io.IOException -> L75 java.io.FileNotFoundException -> La1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L75 java.io.FileNotFoundException -> La1
            r304 = r0
            r0 = r304
            r1 = r305
            r2 = r303
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L61
            r0 = r307
            r1 = r304
            copyInputStreamIntoOutputStream(r0, r1)     // Catch: java.lang.Throwable -> L4e
            r0 = r304
            r0.close()     // Catch: java.lang.Throwable -> L61
            r0 = r307
            r0.close()     // Catch: java.io.IOException -> L75 java.io.FileNotFoundException -> La1
            return
        L4e:
            r305 = move-exception
            r0 = r304
            r0.close()     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r304 = move-exception
            r0 = r305
            r1 = r304
            X.7kF.A00(r0, r1)     // Catch: java.lang.Throwable -> L61
        L5e:
            r0 = r305
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r305 = move-exception
            r0 = r307
            r0.close()     // Catch: java.lang.Throwable -> L6b
            goto L72
        L6b:
            r304 = move-exception
            r0 = r305
            r1 = r304
            X.7kF.A00(r0, r1)     // Catch: java.io.IOException -> L75 java.io.FileNotFoundException -> La1
        L72:
            r0 = r305
            throw r0     // Catch: java.io.IOException -> L75 java.io.FileNotFoundException -> La1
        L75:
            r307 = move-exception
            r0 = r307
            java.lang.String r0 = r0.getMessage()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            java.lang.String r0 = "space"
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = 4
            r306 = r0
            r0 = r308
            if (r0 != 0) goto L99
        L96:
            r0 = 1
            r306 = r0
        L99:
            r0 = r306
            r1 = r307
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r1)
            throw r0
        La1:
            r305 = move-exception
            r0 = 3
            r1 = r305
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.writeDataToFile(byte[], java.lang.String, boolean):void");
    }
}
