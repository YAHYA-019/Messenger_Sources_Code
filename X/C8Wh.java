package X;

import android.graphics.Typeface;

/* renamed from: X.8Wh, reason: invalid class name */
/* loaded from: 8Wh.class */
public final class C8Wh extends 1LH {
    public final C00m A00;
    public final 2lO A01;
    public final String A02;

    public C8Wh(2lO r302, String str, C00m c00m) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A01 = r302;
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lO r0 = this.A01;
        2lQ r02 = 2lO.A02;
        2lO A00 = r0.A00(7zL.A0g((2lO) null, 7zL.A0u(0S2.A1G, AV1.A00(this, 8), 1)));
        String str = this.A02;
        1Iw r03 = c2k5.A05;
        Typeface A002 = 2KU.A00(r03.A0D);
        long A06 = 7zS.A06(12.0f);
        int A04 = c2k5.B7k().A04(2132213904);
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(r03, str, 0);
        7zS.A1N(c2k5, A0v, A04, A06);
        A0v.A33(0);
        7zU.A0y(A002, c2k5, A0v, A08);
        7zP.A1G(A0v, 0);
        A0v.A2e();
        A0v.A3D(true);
        A0v.A2v(0);
        A0v.A2c();
        7zS.A1V(A0v, false);
        return 7zQ.A0c(A00, A0v);
    }
}
