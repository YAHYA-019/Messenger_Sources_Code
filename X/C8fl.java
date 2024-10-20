package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.8fl, reason: invalid class name */
/* loaded from: 8fl.class */
public final class C8fl extends 1LH {
    public static final 2lO A03;
    public final AX1 A00;
    public final 1GU A01;
    public final GjV A02;

    static {
        long A08 = 7zP.A08();
        2lQ r0 = 2lO.A02;
        A03 = 4YV.A0L(7zQ.A0Y((2lO) null, 0S2.A01, A08), 0S2.A0Y, 2dP.A01, 0);
    }

    public C8fl(1GU r302, AX1 ax1, GjV gjV) {
        1BL.A1H(gjV, r302, ax1);
        this.A02 = gjV;
        this.A01 = r302;
        this.A00 = ax1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, SHb.A00);
        2rO.A00(c2k5, SHc.A00, new Object[0]);
        C2lc.A00(c2k5, new J9t(A00, 6));
        2lQ r0 = 2lO.A02;
        2lO A0h = 7zS.A0h(0S2.A1G, new J9x(this, 41), 1);
        1Iw r02 = c2k5.A05;
        Context A0A = 7zL.A0A(r02);
        C1qo c1qo = c2k5.AeS().A0E;
        11T.A0A(c1qo);
        int dimensionPixelSize = A0A.getResources().getDimensionPixelSize(2132279342);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        7zV.A07(A0A).getRealMetrics(displayMetrics);
        long A07 = 7zL.A07(c1qo.A00(displayMetrics.heightPixels - dimensionPixelSize));
        Integer num = 0S2.A01;
        2lO A0L = 4YV.A0L(4YV.A0L(4YV.A0K(A0h, num, A07), 0S2.A03, new J9x(this, 42), 1), 0S2.A04, new J9x(this, 43), 1);
        C2sn A0U = 7zQ.A0U(r02);
        2lO r03 = A03;
        1Iw r04 = A0U.A00;
        Context A0A2 = 7zL.A0A(r04);
        C1qo c1qo2 = A0U.AeS().A0E;
        11T.A0A(c1qo2);
        int dimensionPixelSize2 = A0A2.getResources().getDimensionPixelSize(2132279342);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        7zV.A07(A0A2).getRealMetrics(displayMetrics2);
        2lO A0K = 4YV.A0K(r03, num, 7zL.A07(c1qo2.A00(displayMetrics2.heightPixels - dimensionPixelSize2)));
        C2sn A0U2 = 7zQ.A0U(r04);
        GjV gjV = this.A02;
        String str = gjV.A02;
        7zQ.A1F(new C2675Gkr(gjV.A00, str), A0U2, A0U, A0K);
        C1ro c1ro = C1ro.FLEX_END;
        C2sn A0U3 = 7zQ.A0U(r04);
        C2604Git c2604Git = gjV.A01;
        AX1 ax1 = this.A00;
        A0U3.A00(new 8Ze(c2604Git, str, new AKE(ax1, 1), new AKE(ax1, 2)));
        return 7zN.A0R(C2so.A0R(A0U3, A0U, r03, c1ro), A0U, c2k5, A0L);
    }
}
