package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.8gw, reason: invalid class name */
/* loaded from: 8gw.class */
public final class C8gw extends 1LH {
    public final CharSequence A00;
    public final 2lO A01;
    public final GOe A02;
    public final CharSequence A03;
    public final C00m A04;
    public final boolean A05;
    public final boolean A06;

    public C8gw(2lO r302, GOe gOe, CharSequence charSequence, CharSequence charSequence2, C00m c00m, boolean z, boolean z2) {
        1BK.A1K(charSequence, 1, charSequence2);
        this.A00 = charSequence;
        this.A02 = gOe;
        this.A04 = c00m;
        this.A03 = charSequence2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = r302;
    }

    private final 1LI A01(C2k6 c2k6, 2lO r303, C9cl c9cl, boolean z) {
        2lQ r0 = 2lO.A02;
        Fy2 fy2 = c9cl.A07;
        if (z && fy2 != null) {
            return 7zM.A0n(new Dv3(r0, fy2), 7zS.A0L(c2k6), c2k6, r303);
        }
        2lO A00 = r0.A00(r303);
        EJ0 ej0 = new EJ0(7zL.A08(c9cl.A0G.intValue()), 7zL.A08(c9cl.A0F.intValue()));
        CharSequence charSequence = this.A00;
        return new Dvk(A00, ELv.A01, EL4.A02, c9cl.A0A, ej0, charSequence, 1);
    }

    public 1LI A0s(C2k5 c2k5) {
        float f;
        GradientDrawable gradientDrawable;
        C00m c00m;
        boolean z;
        11T.A0F(c2k5, 0);
        C9cl c9cl = (C9cl) F2c.A01(c2k5, this.A02);
        C99p c99p = c9cl.A08;
        float f2 = 1.0f;
        if (11T.A0O(c99p, C94b.A00)) {
            f = 0.0f;
        } else {
            if (!11T.A0O(c99p, C94c.A00)) {
                throw 1BK.A1F();
            }
            f = 1.0f;
        }
        Integer num = c9cl.A0B;
        if (num != null) {
            int intValue = num.intValue();
            int i = c9cl.A02;
            int i2 = c9cl.A01;
            int A05 = 7zR.A05(c9cl.A0C);
            gradientDrawable = 7zO.A0G(0);
            gradientDrawable.setColor(intValue);
            gradientDrawable.setStroke(7zS.A01(c2k5, i2), A05);
            gradientDrawable.setCornerRadius(7zS.A01(c2k5, i));
        } else {
            gradientDrawable = null;
        }
        boolean z2 = this.A05;
        if (!z2) {
            f2 = c9cl.A00;
        }
        2lO r0 = 2lO.A02;
        Integer num2 = 0S2.A01;
        2lO A0X = 7zQ.A0X((2lO) null, num2, f);
        long A08 = 7zL.A08(c9cl.A03);
        2lO A0K = 4YV.A0K(4YV.A0K(A0X, num2, A08), 0S2.A0C, A08);
        long A082 = 7zL.A08(c9cl.A05);
        long A083 = 7zL.A08(c9cl.A04);
        2lO A0K2 = 4YV.A0K(A0K, 0S2.A0u, A082);
        Integer num3 = 0S2.A1G;
        2lO A0g = 7zL.A0g(4YV.A0L(4YV.A0K(A0K2, num3, A083), 0S2.A00, gradientDrawable, 1), new C6na(num3, 7zL.A08(c9cl.A06)));
        CharSequence charSequence = this.A03;
        if (charSequence != null) {
            A0g = 7zS.A0d(A0g, charSequence);
        }
        2lO A00 = 32E.A00(4YV.A0L(7zR.A0Q(A0g, num2, "android.widget.Button"), 0S2.A0F, Boolean.valueOf(z2), 1), f2);
        GOf gOf = c9cl.A09;
        if (!z2 || (c00m = this.A04) == null || (z = this.A06)) {
            return A01(c2k5, A00.A00(this.A01), c9cl, this.A06);
        }
        1LI A01 = A01(c2k5, A00, c9cl, z);
        2lO r307 = this.A01;
        if (r307 == null) {
            r307 = r0;
        }
        return new DvW(A01, r307, gOf, c00m, (C00m) null);
    }
}
