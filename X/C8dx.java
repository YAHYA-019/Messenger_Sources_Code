package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8dx, reason: invalid class name */
/* loaded from: 8dx.class */
public final class C8dx extends 1LH {
    public final C00m A00;
    public final C00m A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final MigColorScheme A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C8dx(MigColorScheme migColorScheme, String str, String str2, String str3, C00m c00m, C00m c00m2, boolean z) {
        1BL.A1F(str, str2);
        this.A08 = str;
        this.A06 = str2;
        this.A00 = c00m;
        this.A01 = c00m2;
        this.A07 = str3;
        this.A05 = migColorScheme;
        this.A09 = z;
        this.A02 = 48;
        this.A04 = 6;
        this.A03 = 16;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A0Y, 7zL.A08(this.A02));
        long A08 = 7zL.A08(this.A04);
        long A082 = 7zL.A08(this.A03);
        2lO A0K2 = 4YV.A0K(C82m.A00(7zT.A0a(A0K, 7zN.A0U(A082), A08), A1W ? 1 : 0), 0S2.A0E, A082);
        1Iw r0 = c2k5.A05;
        C83g A00 = C02413v4.A00(r0);
        A00.A2Z(2MQ.A1g);
        A00.A2X();
        MigColorScheme migColorScheme = this.A05;
        A00.A2e(migColorScheme);
        A00.A2c(C83o.A04);
        A00.A2f(this.A07);
        C83g.A08(A00, new DKU(this, 38));
        C1ro c1ro = C1ro.CENTER;
        C2sn A0U = 7zQ.A0U(r0);
        2lO A0R = 7zS.A0R((2lO) null, 1.0f);
        1Iw r02 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        C2sn A0K3 = 7zS.A0K(A0U2);
        2KD A0X = 7zN.A0X(A0K3.A00, migColorScheme, A1W ? 1 : 0);
        A0X.A2n();
        A0X.A2d();
        A0X.A2a();
        A0X.A1y(c1ro);
        A0X.A2z(this.A08);
        7zN.A1Q(A0K3, A0X);
        A0K3.A00(A00.A2V());
        7zQ.A1E(C2so.A0F(A0K3, A0U2), A0U2, A0U, A0R);
        if (this.A09) {
            2lO A0X2 = 7zQ.A0X((2lO) null, 0S2.A0C, 0.0f);
            C2sn A0U3 = 7zQ.A0U(r02);
            8TX A002 = C8nl.A00(A0U3.A00);
            A002.A2Z(migColorScheme);
            A002.A2a(this.A06);
            A002.A2Y(C9py.A03(this, 5));
            7zQ.A1E(A002.A2W(), A0U3, A0U, A0X2);
        }
        return C2so.A0P(A0U, c2k5, A0K2);
    }
}
