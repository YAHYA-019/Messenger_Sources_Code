package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: Izm.class */
public final class Izm implements Runnable {
    public static final String __redex_internal_original_name = "PhotoCaptureControllerImpl$2$1";
    public final /* synthetic */ IeJ A00;
    public final /* synthetic */ HZg A01;
    public final /* synthetic */ I49 A02;

    public Izm(IeJ ieJ, HZg hZg, I49 i49) {
        this.A00 = ieJ;
        this.A02 = i49;
        this.A01 = hZg;
    }

    @Override // java.lang.Runnable
    public void run() {
        IeJ ieJ = this.A00;
        C2423Gck c2423Gck = ieJ.A02;
        I49 i49 = this.A02;
        byte[] bArr = (byte[]) i49.A01(I49.A0X);
        IBB ibb = ieJ.A03;
        boolean z = ieJ.A05;
        JHs jHs = ieJ.A00;
        HZg hZg = this.A01;
        if (AnonymousClass001.A1W(Thread.currentThread(), DKD.A10())) {
            throw AnonymousClass001.A0T("Method handleNativePhotoTakenOnBackground must be invoked on a background thread");
        }
        if (I9m.A03()) {
            throw AnonymousClass001.A0T("Method processJpegToBitmap must be invoked on a background thread");
        }
        Bitmap A01 = I9m.A01(ibb, ibb, bArr, z);
        if (A01 != null) {
            Rect rect = (Rect) i49.A00(I49.A0M);
            Rect rect2 = (Rect) i49.A00(I49.A0N);
            Object A00 = i49.A00(I49.A0L);
            11T.A0A(A00);
            ((Number) A00).intValue();
            Object A002 = i49.A00(I49.A0K);
            11T.A0A(A002);
            int A03 = AnonymousClass001.A03(A002);
            if (A03 != 0 && 1 != A03) {
                throw GOp.A16("Could not convert camera facing from optic: ", A03);
            }
            i49.A01(I49.A0T);
            i49.A01(I49.A0Z);
            i49.A01(I49.A0O);
            i49.A01(I49.A0V);
            i49.A01(I49.A0P);
            HZe hZe = new HZe(rect, rect2);
            i49.A01(I49.A0R);
            C2423Gck.A01(c2423Gck);
            IHZ.A01(A01, jHs, hZe, hZg);
        } else {
            C2423Gck.A01(c2423Gck);
            IHZ.A02(jHs, AnonymousClass001.A0T("Failed to generate photo bitmap."));
        }
        JQ3 jq3 = c2423Gck.A03;
        if (jq3 == null || !ieJ.A06) {
            return;
        }
        jq3.CtE(true);
    }
}
