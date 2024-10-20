package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8cz, reason: invalid class name */
/* loaded from: 8cz.class */
public final class C8cz extends 1LH {
    public final AnonymousClass553 A00;
    public final C00m A01;
    public final C1u7 A02;
    public final MigColorScheme A03;
    public final 2KE A04;
    public final String A05;
    public final boolean A06;

    public C8cz(AnonymousClass553 anonymousClass553, C1u7 c1u7, MigColorScheme migColorScheme, 2KE r305, String str, C00m c00m, boolean z) {
        this.A03 = migColorScheme;
        this.A05 = str;
        this.A06 = z;
        this.A00 = anonymousClass553;
        this.A01 = c00m;
        this.A04 = r305;
        this.A02 = c1u7;
    }

    public 1LI A0s(C2k5 c2k5) {
        2lO A0L;
        long A06;
        Integer num;
        1Iw A0X = 7zL.A0X(c2k5);
        2KD A01 = 2K3.A01(A0X, 0);
        A01.A2z(this.A05);
        A01.A2y(this.A04);
        A01.A2w(this.A02);
        2K3 A0Z = 7zN.A0Z(this.A03, A01);
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A08, 7zO.A09());
        AV3 A00 = AV3.A00(this, 44);
        Integer num2 = 0S2.A00;
        2lO A0Z2 = 7zQ.A0Z(A0g, num2, A00);
        if (this.A06) {
            A0L = 4YV.A0L(A0Z2, num2, C1ro.FLEX_END, 0);
            A06 = 7zM.A08(c2k5);
            num = 0S2.A09;
        } else {
            A0L = 4YV.A0L(A0Z2, num2, C1ro.FLEX_START, 0);
            A06 = 3yH.A06(c2k5, 2132279328);
            num = 0S2.A07;
        }
        return 7zT.A0F(A0Z, A0X, c2k5, 4YV.A0K(A0L, num, A06), 7zR.A0k(AV3.A00(this, 45)));
    }
}
