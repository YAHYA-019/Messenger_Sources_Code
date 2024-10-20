package X;

import android.graphics.Bitmap;

/* renamed from: X.3Pw, reason: invalid class name */
/* loaded from: 3Pw.class */
public final class C3Pw {
    public final 1Br A01 = 1Bq.A00(49958);
    public final 1Br A00 = 1Bq.A00(67389);

    public static final void A00(2IA r301) {
        2rA r0 = new 2rA();
        r0.A00(r301.A04);
        if (Runtime.getRuntime().maxMemory() <= 268435456 || 2sM.A00) {
            r0.A03 = Bitmap.Config.RGB_565;
        }
        if (2sM.A00) {
            r0.A02 = Bitmap.Config.RGB_565;
        }
        r301.A04 = new C2r9(r0);
    }
}
