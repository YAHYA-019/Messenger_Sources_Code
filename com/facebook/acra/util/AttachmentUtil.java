package com.facebook.acra.util;

import X.0Ug;
import X.AnonymousClass001;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: AttachmentUtil.class */
public class AttachmentUtil {
    public static String compressToBase64String(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr, 0, bArr.length);
            gZIPOutputStream.finish();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            gZIPOutputStream.close();
            return encodeToString;
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    public static String loadAttachment(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - i2;
            if (i4 > 0) {
                i3 = inputStream.read(bArr, i2, i4);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } else if (i3 == 0) {
                return "";
            }
        }
        return compressToBase64String(bArr);
    }

    public static File[] sortPruneOldFiles(File file, int i) {
        File[] listFiles = file.listFiles();
        sortPruneOldFiles(listFiles, i);
        return listFiles;
    }

    public static File[] sortPruneOldFiles(File[] fileArr, int i) {
        int length = fileArr.length;
        if (length != 0) {
            Arrays.sort(fileArr, new Comparator() { // from class: com.facebook.acra.util.AttachmentUtil.1
                @Override // java.util.Comparator
                public int compare(File file, File file2) {
                    return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
                }
            });
            if (length > i) {
                while (i < length) {
                    fileArr[i].delete();
                    fileArr[i] = null;
                    i++;
                }
            }
        }
        return fileArr;
    }

    public static boolean validateGzip(File file) {
        try {
            FileInputStream A0F = AnonymousClass001.A0F(file);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(A0F);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream));
                    while (bufferedReader.ready()) {
                        try {
                            bufferedReader.readLine();
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    gZIPInputStream.close();
                    A0F.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
