package X;

import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;

/* renamed from: X.8eo, reason: invalid class name */
/* loaded from: 8eo.class */
public final class C8eo extends 1LH {
    public static final long A03 = 7zP.A0H();
    public static final long A02 = 7zP.A0F();
    public static final long A01 = 7zQ.A06();
    public static final int A00 = 0KF.A01(127.5f);

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A04 = C82m.A04(7zL.A0g((2lO) null, 7zL.A0u(num, c1ro, 0)), num, 100.0f, 0);
        Integer num2 = 0S2.A01;
        2lO A0L = 4YV.A0L(C82m.A04(A04, num2, 100.0f, 0), num, 7zL.A0j(0), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        C1u2 A0I = 4YV.A0I();
        RippleDrawable A07 = 7zN.A07(7zO.A01(A0L2, A01), Color.argb(A00, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216)), -1291845632);
        2lO A0S = 7zS.A0S(C82m.A05(null, num, num2, 100.0f, 0), 0);
        long A08 = 7zP.A08();
        Integer num3 = 0S2.A0C;
        2lO A0h = 7zT.A0h(A0S, num3, A08);
        Integer num4 = 0S2.A0j;
        2lO A0L3 = 4YV.A0L(A0h, num4, true, 1);
        C2sn A0J = 7zS.A0J(A0L2);
        2lO A0L4 = 4YV.A0L(7zS.A0W(7zT.A0j((2lO) null, num2, num3, 0.0f), 7zL.A0i(0S2.A06, A02), num, A07, 1), num4, true, 1);
        C2sn A0K = 7zS.A0K(A0J);
        C2cm A0I2 = 7zL.A0I(A0K);
        7zN.A18(A0I2, C1u3.A51, A0I);
        A0I2.A2X(-1);
        7zT.A1H(A0I2, A0K, A03);
        7zQ.A1E(7zL.A0J(A0I2), A0K, A0J, A0L4);
        return 7zM.A0k(C2so.A06(A0J, A0L2, A0L3), A0L2, c2k5, A0L);
    }
}
