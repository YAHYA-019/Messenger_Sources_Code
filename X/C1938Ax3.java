package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ax3, reason: case insensitive filesystem */
/* loaded from: Ax3.class */
public final class C1938Ax3 extends 1LH {
    public final 1Im A00;
    public final MigColorScheme A01;
    public final CharSequence A02;

    public C1938Ax3(1Im r302, MigColorScheme migColorScheme, CharSequence charSequence) {
        1BL.A1F(migColorScheme, charSequence);
        this.A01 = migColorScheme;
        this.A02 = charSequence;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zV.A0U(migColorScheme));
        long A06 = 4YV.A06(2RH.A03);
        2RH r0 = 2RH.A04;
        2lO A0K = 4YV.A0K(4YV.A0K(A0g, 0S2.A04, A06), 0S2.A05, 4YV.A06(r0));
        C1ro c1ro = C1ro.CENTER;
        1Iw r02 = c2k5.A05;
        C2sn A0U = 7zQ.A0U(r02);
        1Iw r03 = A0U.A00;
        2KD A0X = 7zN.A0X(r03, migColorScheme, A1W ? 1 : 0);
        A0X.A0R();
        A0X.A2X();
        A0X.A2z(this.A02);
        A0X.A2i();
        A0X.A2c();
        7zO.A1F(A0X, r0);
        7zN.A1Q(A0U, A0X);
        C2sn A0U2 = 7zQ.A0U(r02);
        8TZ A00 = C8nr.A00(r03);
        A00.A2a(migColorScheme);
        A00.A2Y(2131965606);
        A00.A2T(this.A00);
        A0U2.A00(A00.A2W());
        A0U.A00(new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0U2.A01, A1W));
        return C2so.A03(A0U, c2k5, A0K);
    }
}
