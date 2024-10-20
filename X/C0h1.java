package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.0h1, reason: invalid class name */
/* loaded from: 0h1.class */
public abstract class C0h1 implements Closeable {
    public static void A00(C0h3 c0h3, File file, InputStream inputStream, byte[] bArr) {
        String str = c0h3.A01;
        String A0W = 0Pz.A0W("extracting DSO ", str);
        if (android.util.Log.isLoggable("fb-UnpackingSoSource", 4)) {
            android.util.Log.i("fb-UnpackingSoSource", A0W);
        }
        File A0D = AnonymousClass001.A0D(file, str);
        try {
            try {
                RandomAccessFile A0I = AnonymousClass001.A0I(A0D);
                try {
                    int available = inputStream.available();
                    if (available > 1) {
                        SysUtil$LollipopSysdeps.fallocateIfSupported(A0I.getFD(), available);
                    }
                    int i = (-1) >>> 1;
                    int i2 = 0;
                    do {
                        int read = inputStream.read(bArr, 0, Math.min(Constants.LOAD_RESULT_PGO, i - i2));
                        if (read == -1) {
                            break;
                        }
                        A0I.write(bArr, 0, read);
                        i2 += read;
                    } while (i2 < i);
                    A0I.setLength(A0I.getFilePointer());
                    if (!A0D.setExecutable(true, false)) {
                        throw AnonymousClass001.A0G(AnonymousClass001.A0Z(A0D, "cannot make file executable: ", AnonymousClass001.A0k()));
                    }
                    A0I.close();
                } catch (Throwable th) {
                    try {
                        A0I.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("error extracting dso  ");
                A0k.append(A0D);
                android.util.Log.e("fb-UnpackingSoSource", AnonymousClass001.A0Z(e, " due to: ", A0k));
                0iJ.A03(A0D);
                throw e;
            }
        } finally {
            if (A0D.exists() && !A0D.setWritable(false)) {
                StringBuilder A0m = AnonymousClass001.A0m(A0D, "Error removing ");
                A0m.append(" write permission from directory ");
                A0m.append(file);
                AnonymousClass001.A15(file, " (writable: ", A0m);
                android.util.Log.e("SoLoader", AnonymousClass001.A0d(")", A0m));
            }
        }
    }

    public abstract void A01(File file);

    public abstract C0h3[] A02();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
