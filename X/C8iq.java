package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8iq, reason: invalid class name */
/* loaded from: 8iq.class */
public final class C8iq extends 2Kb {
    public static final L8z A07 = new L8z("**", "Fill 1");
    public static final L8z A08 = new L8z("**", "Stroke 1");
    public final int A00 = 2132475993;
    public final Drawable A01;
    public final 1Im A02;
    public final Integer A03;
    public final Integer A04;
    public final C00m A05;
    public final 2lO A06;

    public C8iq(Drawable drawable, 1Im r303, 2lO r304, Integer num, Integer num2, C00m c00m) {
        this.A01 = drawable;
        this.A06 = r304;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = r303;
        this.A05 = c00m;
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        A2q a2q = A2q.A00;
        2lO r305 = null;
        C2ll A0r = 7zQ.A0r(r302, 7zQ.A0s(RwB.A00, false), AVF.A01(this, 27));
        2lO r309 = this.A06;
        if (r309 != null) {
            C2xi A0k = 7zR.A0k(AVF.A01(this, 28));
            if (r309 == 2lO.A02) {
                r309 = null;
            }
            r305 = 7zL.A0g(r309, A0k);
        }
        return new C2lt(r305, a2q, A0r);
    }
}
