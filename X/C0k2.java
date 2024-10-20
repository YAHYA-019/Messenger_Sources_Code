package X;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.0k2, reason: invalid class name */
/* loaded from: 0k2.class */
public abstract class C0k2 {
    public static final java.util.Map A00 = Collections.synchronizedMap(AnonymousClass001.A0u());

    public static int A00(0dF r301, String str, int i) {
        boolean exists;
        FileInputStream openFileInput;
        DataInputStream dataInputStream;
        java.util.Map map = A00;
        Number number = (Number) map.get(str);
        if (number != null) {
            return number.intValue();
        }
        try {
            exists = A01(r301, str).exists();
            try {
            } catch (Throwable th) {
                if (!exists) {
                    try {
                        r301.A00.deleteFile(str);
                    } catch (SecurityException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        try {
            if (!exists) {
                if (new File(r301.A00.getFilesDir(), str).exists()) {
                    openFileInput = r301.A00.openFileInput(str);
                }
                map.put(str, Integer.valueOf(i));
                return i;
            }
            new FileInputStream(A01(r301, str));
            int readInt = dataInputStream.readInt();
            if (!exists) {
                A03(r301, str, readInt);
            }
            dataInputStream.close();
            if (!exists) {
                try {
                    r301.A00.deleteFile(str);
                } catch (SecurityException unused3) {
                }
            }
            i = readInt;
            map.put(str, Integer.valueOf(i));
            return i;
        } finally {
        }
        dataInputStream = new DataInputStream(openFileInput);
    }

    public static File A01(0dF r301, String str) {
        return new File(new File(r301.A00.getFilesDir(), "GkBootstrap"), str);
    }

    public static void A02(0dF r301, String str) {
        File A01 = A01(r301, str).exists() ? A01(r301, str) : AnonymousClass001.A0D(r301.A00.getFilesDir(), str);
        if (A01.delete()) {
            return;
        }
        if (!A01.exists()) {
            return;
        }
        0fH.A17("GkBootstrap", "Unable to clean up GK file %s", new Object[]{str});
    }

    public static void A03(0dF r301, String str, int i) {
        if (r301 != null) {
            try {
                File file = new File(r301.A00.getFilesDir(), "GkBootstrap");
                if (!file.exists()) {
                    if (!file.mkdir()) {
                        return;
                    }
                }
                File A01 = A01(r301, str);
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(A01));
                    try {
                        dataOutputStream.writeInt(i);
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException | SecurityException e) {
                    0fH.A11("GkBootstrap", "Unable to persist GK value to %s", e, new Object[]{A01});
                }
            } catch (SecurityException e2) {
                0fH.A0z("GkBootstrap", "Unable to create %s directory", e2, new Object[]{"GkBootstrap"});
            }
        }
    }
}
