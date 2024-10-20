package com.facebook.acra.util;

import X.AnonymousClass001;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.UUID;

/* loaded from: Installation.class */
public class Installation {
    public static final String INSTALLATION = "ACRA-INSTALLATION";
    public static String sID;

    public static String id(Context context) {
        String str;
        synchronized (Installation.class) {
            str = sID;
            if (str == null) {
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    str = "n/a";
                } else {
                    File file = new File(filesDir.getParent(), INSTALLATION);
                    try {
                        if (!file.exists()) {
                            writeInstallationFile(file);
                        }
                        str = readInstallationFile(file);
                        sID = str;
                    } catch (Exception unused) {
                        str = "n/a";
                    }
                }
            }
        }
        return str;
    }

    public static String readInstallationFile(File file) {
        RandomAccessFile A0H = AnonymousClass001.A0H(file);
        try {
            byte[] bArr = new byte[(int) A0H.length()];
            A0H.readFully(bArr);
            return new String(bArr);
        } finally {
            A0H.close();
        }
    }

    public static void writeInstallationFile(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(UUID.randomUUID().toString().getBytes());
        } finally {
            fileOutputStream.close();
        }
    }
}
