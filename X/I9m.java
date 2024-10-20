package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: I9m.class */
public abstract class I9m {
    public static Bitmap A00(Bitmap bitmap, IBB ibb, int i, boolean z) {
        int i2;
        int i3;
        Bitmap bitmap2;
        if (A03()) {
            throw AnonymousClass001.A0T("Method processBitmap must be invoked on a background thread");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        IBB A01 = ibb == null ? null : Hvg.A01(new IBB(width, height), ibb);
        if (!z && A01 == null && i == 0) {
            return bitmap;
        }
        Matrix A0F = GOn.A0F();
        if (A01 != null) {
            i2 = A01.A02;
            i3 = A01.A01;
        } else {
            i2 = width;
            i3 = height;
        }
        if (i != 0) {
            A0F.postRotate(i);
        }
        if (z) {
            A0F.preScale(-1.0f, 1.0f);
        }
        int i4 = (width - i2) / 2;
        int i5 = (height - i3) / 2;
        try {
            0gF.A00(bitmap);
            bitmap2 = Bitmap.createBitmap(bitmap, i4, i5, i2, i3, A0F, false);
        } catch (Throwable unused) {
            bitmap2 = null;
        }
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
    
        if (r0 != 270) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap A01(X.IBB r301, X.IBB r302, byte[] r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9m.A01(X.IBB, X.IBB, byte[], boolean):android.graphics.Bitmap");
    }

    public static IOException A02(Bitmap bitmap, File file) {
        BufferedOutputStream bufferedOutputStream;
        if (A03()) {
            throw AnonymousClass001.A0T("Method processBitmapToBitmapFile must be invoked on a background thread");
        }
        IOException e = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(GOn.A14(file));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
                bufferedOutputStream.flush();
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException unused) {
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedOutputStream.close();
            return e;
        } catch (IOException unused2) {
            return e;
        }
    }

    public static boolean A03() {
        return AnonymousClass001.A1W(DKD.A10(), Thread.currentThread());
    }
}
