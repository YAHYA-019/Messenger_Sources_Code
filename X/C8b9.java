package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8b9, reason: invalid class name */
/* loaded from: 8b9.class */
public final class C8b9 extends 1LH {
    public final MigColorScheme A00;
    public final C00m A01;
    public final float A02;
    public final float A03;
    public final boolean A04;

    public C8b9(MigColorScheme migColorScheme, C00m c00m, float f, float f2, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = z;
        this.A01 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI A2W;
        11T.A0F(c2k5, 0);
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346671);
        2qR A0k = 7zQ.A0k(A0o, 2132346670);
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        C1ro c1ro = C1ro.FLEX_END;
        C1rp c1rp = C1rp.FLEX_END;
        2lQ r0 = 2lO.A02;
        long A0A = 7zP.A0A();
        Integer num = 0S2.A04;
        2lO A0K = 4YV.A0K((2lO) null, num, A0A);
        Integer num2 = 0S2.A15;
        2lO A0K2 = 4YV.A0K(A0K, num2, A0A);
        1Iw r02 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        C83g A00 = C02413v4.A00(A0U2.A00);
        A00.A2Z(2MQ.A0z);
        A00.A2X();
        MigColorScheme migColorScheme = this.A00;
        A00.A2e(migColorScheme);
        A00.A2c(C83o.A04);
        C83g.A06(A0U2, A00, AV2.A00(this, 29));
        A0U.A00(C2so.A0B(A0U2, A0U, A0K2, c1ro, c1rp));
        long A06 = 7zQ.A06();
        2lO A0T = 7zT.A0T(4YV.A0K((2lO) null, num, A0A), 7zL.A0i(num2, A06));
        C2sn A0U3 = 7zQ.A0U(r02);
        1Iw r03 = A0U3.A00;
        8St A002 = C8nj.A00(r03);
        A002.A2X(7zS.A02(A0k, migColorScheme));
        A002.A0l(171.0f);
        A002.A0z(233.0f);
        2RH r04 = 2RH.A03;
        7zO.A1F(A002, r04);
        A0U3.A00(A002.A2W());
        2KD A0X = 7zN.A0X(r03, migColorScheme, 0);
        A0X.A2m();
        A0X.A2b();
        A0X.A2a();
        7zM.A1X(A0X, A0U3, 2131966673);
        7zO.A1F(A0X, r04);
        2KD A0d = 7zR.A0d(r03, A0U3, A0X, 0);
        7zQ.A1N(migColorScheme, A0d);
        A0d.A2a();
        A0d.A1y(C1ro.STRETCH);
        boolean z = this.A04;
        A0d.A2z(z ? 3yH.A09(A0U3, 2131966672) : 3yH.A09(A0U3, 2131966671));
        A0d.A17(12.0f);
        7zN.A1Q(A0U3, A0d);
        if (z) {
            float f = this.A02 / this.A03;
            8T3 A003 = C8o0.A00(r03);
            A003.A2Y(f);
            int[] iArr = {migColorScheme.Ah8()};
            C8o0 c8o0 = A003.A00;
            c8o0.A06 = iArr;
            c8o0.A02 = 7zO.A05(migColorScheme, 251658240, 352321535);
            A003.A2X(2.0f);
            c8o0.A05 = true;
            c8o0.A04 = "progress";
            A003.A0e();
            A003.A17(20.0f);
            A2W = A003.A2W();
        } else {
            8Tj A004 = C8m4.A00(r03);
            A004.A2Z(migColorScheme);
            C5z7.A00(A004, 7zT.A0d((2lO) null, 2RH.A07, num2));
            A2W = A004.A2W();
            11T.A0D(A2W);
        }
        7zQ.A1G(A2W, A0U3, A0U, A0T);
        2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num, A0A), num2, A06);
        C2sn A0U4 = 7zQ.A0U(r02);
        8Th A005 = C8nq.A00(A0U4.A00);
        A005.A2Z(migColorScheme);
        A005.A2X(2131966676);
        A005.A2Y(83S.A00(this, 20));
        7zQ.A1E(A005.A2W(), A0U4, A0U, A0V);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}
