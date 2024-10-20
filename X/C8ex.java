package X;

import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;

/* renamed from: X.8ex, reason: invalid class name */
/* loaded from: 8ex.class */
public final class C8ex extends 1LH {
    public final HTImmersiveColorScheme A00;
    public static final long A02 = 7zP.A0H();
    public static final long A01 = Double.doubleToRawLongBits(436.0d);

    public C8ex(HTImmersiveColorScheme hTImmersiveColorScheme) {
        11T.A0F(hTImmersiveColorScheme, 1);
        this.A00 = hTImmersiveColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        2lO A0g;
        11T.A0F(c2k5, 0);
        boolean A012 = C5bz.A01();
        2lQ r0 = 2lO.A02;
        if (A012) {
            A0g = 4YV.A0K((2lO) null, 0S2.A01, A01);
        } else {
            A0g = 7zT.A0g(7zT.A0H((2lO) null, C9mV.A03.A03(7zL.A0A(c2k5.A05))), 0S2.A00, this.A00.Abp());
        }
        2lO A00 = 4YV.A0K((2lO) null, 0S2.A04, A02).A00(A0g);
        C2sn A0L = 7zR.A0L(c2k5);
        HTImmersiveColorScheme hTImmersiveColorScheme = this.A00;
        11T.A0F(hTImmersiveColorScheme, 1);
        2KD A0g2 = 7zR.A0g(A0L.AeS(), false);
        A0g2.A2r(2131957833);
        A0g2.A2M(true);
        A0g2.A2g();
        A0g2.A2e();
        7zQ.A1K(A0L, hTImmersiveColorScheme, A0g2);
        2KD A0g3 = 7zR.A0g(A0L.AeS(), 7zP.A1X(hTImmersiveColorScheme));
        4YU.A1N(A0g3, 2RH.A05);
        A0g3.A2r(2131957832);
        A0g3.A2j();
        A0g3.A2d();
        return 7zM.A0k(7zN.A0Z(hTImmersiveColorScheme, A0g3), A0L, c2k5, A00);
    }
}
