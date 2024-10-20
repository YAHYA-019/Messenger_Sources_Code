package X;

import android.widget.ImageView;

/* renamed from: X.8el, reason: invalid class name */
/* loaded from: 8el.class */
public final class C8el extends 1LH {
    public static final QFV A01(C2k6 c2k6) {
        C2cq A00 = C2cp.A00(c2k6.AeS(), 0);
        A00.A2a(7zR.A0D());
        A00.A2b(ImageView.ScaleType.CENTER);
        A00.A1M(2132279342);
        A00.A1W(2132279342);
        return new QFV(A00.A2W());
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw A0X = 7zL.A0X(c2k5);
        8Td A00 = C8ng.A00(A0X);
        GzX gzX = new GzX();
        Hkb hkb = ((HuR) gzX).A00;
        hkb.A0D = 2000L;
        hkb.A03 = 0.0f;
        gzX.A05(-1);
        gzX.A02(0.0f);
        8Td.A06(A00, gzX);
        A00.A0e();
        C2sn A0U = 7zQ.A0U(A0X);
        C1rp c1rp = C1rp.SPACE_EVENLY;
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A0A, 3yH.A04(A0U));
        1Iw r02 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        int i = 1;
        int i2 = 1;
        do {
            A0U2.A00(A01(A0U2));
            i2++;
        } while (i2 < 4);
        7zN.A1M(A0U2, A0U, A0K, c1rp);
        C2sn A0U3 = 7zQ.A0U(r02);
        do {
            A0U3.A00(A01(A0U3));
            i++;
        } while (i < 4);
        7zN.A1M(A0U3, A0U, (2lO) null, c1rp);
        A00.A2X(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false));
        return A00.A2W();
    }
}
