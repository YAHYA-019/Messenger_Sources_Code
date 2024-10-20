package X;

import android.content.res.Resources;

/* renamed from: X.88l, reason: invalid class name */
/* loaded from: 88l.class */
public final class C88l extends 1LH {
    public final 5zD A00;
    public final C88h A01;

    public C88l(5zD r302, C88h c88h) {
        this.A01 = c88h;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1rp c1rp;
        int i;
        String A00;
        11T.A0F(c2k5, 0);
        C88m c88m = (C88m) 1Bn.A0A(68246);
        C88h c88h = this.A01;
        boolean z = c88h.A06;
        int i2 = 0;
        1Iw r0 = c2k5.A05;
        Resources A0E = 4YU.A0E(r0);
        if (z) {
            i = A0E.getDimensionPixelSize(2132279348);
            c1rp = C1rp.FLEX_END;
        } else {
            i2 = A0E.getDimensionPixelSize(2132279324);
            c1rp = C1rp.FLEX_START;
            i = 0;
        }
        2lQ r02 = 2lO.A02;
        2K3 r321 = null;
        2lO A0K = 4YV.A0K(4YV.A0K(4YV.A0K((2lO) null, 0S2.A15, 3yH.A03(c2k5)), 0S2.A02, i2 | 9221401712017801216L), 0S2.A03, i | 9221401712017801216L);
        C2sn A0U = 7zQ.A0U(r0);
        5zD r03 = this.A00;
        32M r04 = c88h.A04;
        if (r04 != null && r04.ordinal() == 3 && (A00 = c88m.A00(c88h)) != null) {
            2KD A0a = 7zO.A0a(A0U, 0);
            A0a.A25(C26z.RIGHT, 8.0f);
            A0a.A25(C26z.LEFT, 1.0f);
            7zN.A1V(r03, A0a);
            A0a.A2z(A00);
            A0a.A2q(1);
            int BKa = r03.BKa();
            A0a.A2w(new 3yK(BKa, BKa));
            A0a.A2i();
            r321 = A0a.A2W();
        }
        A0U.A00(r321);
        return C2so.A0W(A0U, c2k5, A0K, c1rp);
    }
}
