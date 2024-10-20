package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8Wu, reason: invalid class name */
/* loaded from: 8Wu.class */
public final class C8Wu extends 1LH {
    public final 2Of A00;
    public final MigColorScheme A01;
    public final boolean A02;

    public C8Wu(MigColorScheme migColorScheme, 2Of r303, boolean z) {
        11T.A0F(migColorScheme, 2);
        this.A00 = r303;
        this.A01 = migColorScheme;
        this.A02 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2sn A0K = 7zR.A0K(7zL.A0X(c2k5));
        Integer num = 0S2.A00;
        2lO A04 = C82m.A04(null, num, 100.0f, 0);
        1Iw r0 = A0K.A00;
        C6nh A0R = 7zO.A0R(r0, 0);
        C26z c26z = C26z.TOP;
        A0R.A07(c26z, 1.0f);
        MigColorScheme migColorScheme = this.A01;
        A0R.A08(c26z, migColorScheme.Amh());
        C6ni A01 = A0R.A01();
        Integer num2 = 0S2.A01;
        7zN.A1N(A0K, 4YV.A0L(A04, num2, A01, 0));
        2lO A02 = C82m.A02(null, 7zL.A0k(num2, 1.0f), num, 100.0f, 0);
        2RH r02 = 2RH.A04;
        2lO A00 = A02.A00(4YV.A0K(7zT.A0I((2lO) null, 7zL.A00(r02)), 0S2.A0Y, 7zO.A0B(4YU.A0E(r0).getDimensionPixelSize(2132279359))));
        C2sn A0U = 7zQ.A0U(r0);
        2lO A0c = 7zS.A0c(7zQ.A0X((2lO) null, num2, 1.0f), 0S2.A0u, true);
        1Iw r03 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r03);
        1Iw r04 = A0U2.A00;
        2KD A0X = 7zN.A0X(r04, migColorScheme, 0);
        A0X.A2q(1);
        boolean z = this.A02;
        int i = 2131959743;
        if (z) {
            i = 2131959756;
        }
        7zM.A1X(A0X, A0U2, i);
        A0X.A2b();
        A0X.A2j();
        2KD A0d = 7zR.A0d(r04, A0U2, A0X, 0);
        A0d.A2x(migColorScheme);
        int i2 = 2131959735;
        if (z) {
            i2 = 2131959755;
        }
        7zQ.A1T(A0d, 3yH.A09(A0U2, i2));
        A0d.A2q(2);
        7zN.A1Q(A0U2, A0d);
        A0U.A00(C2so.A05(A0U2, A0U, A0c));
        8Tl A002 = C5hr.A00(r03);
        7zL.A1J(A002);
        A002.A2Y(migColorScheme);
        7zM.A1M(A002, r03, 2131959734);
        A002.A0S();
        7zO.A1H(A002, r02);
        8Tl.A08(A002);
        7zS.A1M(A002, (2lO) null, 0S2.A1G, AV4.A00(this, 26), 1);
        A0U.A00(A002.A2W());
        7zM.A1Q(A0U, A0K, A00);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0K.A01, false);
    }
}
