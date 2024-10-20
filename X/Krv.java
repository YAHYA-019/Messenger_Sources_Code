package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;

/* loaded from: Krv.class */
public abstract class Krv {
    public Kdj A01;
    public MHx A02;
    public boolean A04;
    public float A00 = 1.0f;
    public KMW A03 = KMW.A01;
    public final Function1 A05 = M6m.A00(this, 11);

    public long A00() {
        if (this instanceof C2917Jd5) {
            return 9205357640488583168L;
        }
        if (this instanceof C2918Jd6) {
            return ((LCr) ((C2918Jd6) this).A02.getValue()).A00;
        }
        if (this instanceof C2915Jd3) {
            return 9205357640488583168L;
        }
        return KvR.A01(((C2916Jd4) this).A03);
    }

    public void A01(MNg mNg) {
        if (this instanceof C2917Jd5) {
            return;
        }
        if (this instanceof C2918Jd6) {
            C2918Jd6 c2918Jd6 = (C2918Jd6) this;
            11T.A0F(mNg, 0);
            MLE A00 = KtN.A00(mNg);
            ((Number) c2918Jd6.A01.getValue()).intValue();
            Drawable drawable = c2918Jd6.A00;
            long BB6 = mNg.BB6();
            drawable.setBounds(0, 0, 0KF.A01(LCr.A01(BB6)), 0KF.A01(LCr.A00(BB6)));
            try {
                A00.CjL();
                drawable.draw(LOM.A00(A00, A00));
                return;
            } finally {
                A00.CiE();
            }
        }
        if (this instanceof C2915Jd3) {
            C2915Jd3 c2915Jd3 = (C2915Jd3) this;
            long j = c2915Jd3.A02;
            float f = c2915Jd3.A00;
            mNg.AOi(c2915Jd3.A01, C2914Jd2.A00, f, 3, j, 0L, LE0.A05(mNg));
            return;
        }
        C2916Jd4 c2916Jd4 = (C2916Jd4) this;
        MLM mlm = c2916Jd4.A05;
        long j2 = c2916Jd4.A04;
        long A02 = LCr.A02(mNg.BB6());
        float f2 = c2916Jd4.A00;
        mNg.AOY(c2916Jd4.A02, mlm, C2914Jd2.A00, f2, 3, c2916Jd4.A01, 0L, j2, 0L, A02);
    }
}
