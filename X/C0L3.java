package X;

import java.io.File;

/* renamed from: X.0L3, reason: invalid class name */
/* loaded from: 0L3.class */
public abstract class C0L3 {
    public static void A00(0LF r301, File file) {
        r301.CYH(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A00(r301, file2);
                } else {
                    r301.DA4(file2);
                }
                i = i2 + 1;
            }
        }
        r301.CY5(file);
    }

    public static void A01(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            A02(listFiles[i2]);
            i = i2 + 1;
        }
    }

    public static boolean A02(File file) {
        if (file.isDirectory()) {
            A01(file);
        }
        return file.delete();
    }
}
