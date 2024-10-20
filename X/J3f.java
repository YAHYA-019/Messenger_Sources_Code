package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: J3f.class */
public final class J3f implements Runnable {
    public static final String __redex_internal_original_name = "PhotoCaptureControllerImpl$4";
    public final /* synthetic */ JHt A00;
    public final /* synthetic */ C2423Gck A01;
    public final /* synthetic */ IBB A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public J3f(JHt jHt, C2423Gck c2423Gck, IBB ibb, File file, byte[] bArr, boolean z, boolean z2) {
        this.A01 = c2423Gck;
        this.A04 = z;
        this.A06 = bArr;
        this.A03 = file;
        this.A02 = ibb;
        this.A05 = z2;
        this.A00 = jHt;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file;
        Exception e;
        boolean z = this.A04;
        byte[] bArr = this.A06;
        if (z) {
            file = this.A03;
            if (I9m.A03()) {
                throw AnonymousClass001.A0T("Method processJpegToJpegFile must be invoked on a background thread");
            }
            e = null;
            try {
                FileOutputStream A14 = GOn.A14(file);
                try {
                    A14.write(bArr, 0, bArr.length);
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        A14.close();
                        throw th;
                    } catch (IOException unused) {
                        throw th;
                    }
                }
                try {
                    A14.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            IBB ibb = this.A02;
            boolean z2 = this.A05;
            file = this.A03;
            if (I9m.A03()) {
                throw AnonymousClass001.A0T("Method processJpegToBitmapFile must be invoked on a background thread");
            }
            Bitmap A01 = I9m.A01(null, ibb, bArr, z2);
            e = A01 == null ? AnonymousClass001.A0T("Failed to generate bitmap.") : I9m.A02(A01, file);
        }
        IHZ.A03(this.A00, file, e);
    }
}
