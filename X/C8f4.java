package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8f4, reason: invalid class name */
/* loaded from: 8f4.class */
public final class C8f4 extends 1LH {
    public final FbUserSession A00;
    public final MigColorScheme A01;

    public C8f4(FbUserSession fbUserSession, MigColorScheme migColorScheme) {
        1BL.A1F(fbUserSession, migColorScheme);
        this.A00 = fbUserSession;
        this.A01 = migColorScheme;
    }

    public static final 2cL A01(C2k6 c2k6, MigColorScheme migColorScheme, float f, long j) {
        MigColorScheme migColorScheme2 = (MigColorScheme) 7zN.A0p(c2k6, 16980);
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A0K = 4YV.A0K((2lO) null, num, j);
        Integer num2 = 0S2.A00;
        2lO A0g = 7zT.A0g(C82m.A04(A0K, num2, 100.0f, 0), num2, migColorScheme2.Abp());
        C2sn A0L = 7zS.A0L(c2k6);
        2lO A02 = C82m.A02(null, 7zL.A0i(num, j), num2, 100.0f, 0);
        1Iw r02 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r02);
        8Td A00 = C8ng.A00(A0U.A00);
        GzW A0q = 7zT.A0q();
        A0q.A03(0.7f);
        8Td.A06(A00, A0q);
        A00.A10(100.0f);
        A00.A2X(new 1LH());
        7zQ.A1E(A00.A2W(), A0U, A0L, A02);
        8O3 A002 = 8nD.A00(r02);
        A002.A1L((int) f);
        A002.A01.A00 = 7zL.A05(A002, 2132279365);
        A002.A10(100.0f);
        A002.A0c();
        A002.A1X(2132279325);
        A002.A01.A01 = migColorScheme.AZN();
        A002.A0J();
        return 7zM.A0l(A002.A01, A0L, c2k6, A0g);
    }

    public 1LI A0s(C2k5 c2k5) {
        long j = ((C2lu) AQl.A00(c2k5, 7zL.A1Z(c2k5), 9)).A00;
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A01;
        int AZN = migColorScheme.AZN();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zS.A0o(num, AZN));
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A04 = C82m.A04(null, num, 100.0f, 0);
        C2sn A0K = 7zS.A0K(A0L);
        C9mV c9mV = C9mV.A03;
        A0K.A00(A01(A0K, migColorScheme, C9mV.A00(3vP.A00(A0K)), 7zU.A05(A0K, c9mV)));
        2lO A02 = C82m.A02(7zS.A0S((2lO) null, 0), new 2lV(0S2.A0N, j), num, 100.0f, 0);
        C2sn A0K2 = 7zS.A0K(A0K);
        7zQ.A1E(A01(A0K2, migColorScheme, C9mV.A00(3vP.A00(A0K2)), 7zU.A05(A0K2, c9mV)), A0K2, A0K, A02);
        7zN.A1I(A0K, A0L, A04);
        return C2so.A02(A0L, c2k5, A0g);
    }
}
