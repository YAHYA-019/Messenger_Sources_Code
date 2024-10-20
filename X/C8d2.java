package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8d2, reason: invalid class name */
/* loaded from: 8d2.class */
public final class C8d2 extends 1LH {
    public final 4LS A00;
    public final 4LT A01;
    public final MigColorScheme A02;
    public final 9LZ A03;
    public final Integer A04;
    public final String A05;
    public final List A06;

    public C8d2(4LS r302, 4LT r303, MigColorScheme migColorScheme, 9LZ r305, Integer num, String str, List list) {
        11T.A0F(list, 1);
        7zT.A11(2, str, r302, r303, r305);
        this.A06 = list;
        this.A05 = str;
        this.A02 = migColorScheme;
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = r305;
        this.A04 = num;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, AO3.A00);
        4NU A002 = 4NT.A00(c2k5, AO4.A00);
        2lQ r0 = 2lO.A02;
        83T A01 = 83T.A01(this, A00, 10);
        Integer num = 0S2.A01;
        2lO A0Z = 7zQ.A0Z((2lO) null, num, A01);
        C2sn A0L = 7zR.A0L(c2k5);
        C1u2 A0I = 4YV.A0I();
        1Iw AeS = A0L.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        2lO A0L2 = 4YV.A0L((2lO) null, 0S2.A1G, new AVE(this, 46), 1);
        1Iw r02 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        C2cm A0I2 = 7zL.A0I(A0U2);
        C26z c26z = C26z.START;
        7zO.A1M(A0I2, 2RH.A03, c26z);
        7zN.A18(A0I2, C1u3.A0U, A0I);
        MigColorScheme migColorScheme = this.A02;
        7zM.A1H(A0I2, migColorScheme);
        7zQ.A1F(7zL.A0J(A0I2), A0U2, A0U, A0L2);
        C2ze A003 = 2hU.A00(r02);
        4YU.A1O(A003, 2RH.A05, c26z);
        2hU r03 = A003.A01;
        r03.A0D = false;
        A003.A0j(1.0f);
        r03.A05 = this.A00;
        A003.A2Y(new 2hR(migColorScheme));
        A0L.A00(new C1rh(null, null, null, null, 7zL.A16(A003.A2W(), A0U), false));
        9N0 r04 = new 9N0(AQp.A01(this, 31), 2yD.A00(2TI.A00(7zQ.A0p()), 36603042739853295L));
        8Dw r05 = new 8Dw(this, 11);
        long A08 = 7zP.A08();
        Integer num2 = 0S2.A00;
        2NI r06 = C8nc.A0O;
        C02A c02a = AeS.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A004 = C9sn.A00(AeS);
        List list = this.A06;
        C9sn.A04(A004, list, ATf.A00, new AVX(9, A002, this, A00));
        if (list.isEmpty() && this.A04 == num) {
            2lO A0a = 7zT.A0a(7zQ.A0X((2lO) null, num, 1.0f), 7zN.A0U(3yH.A04(A004)), 3yH.A06(A004, 2132279455));
            C2sn A0U3 = 7zQ.A0U(A004.A00);
            2KD A0r = 7zL.A0r(A0U3, 0);
            A0r.A2z(3yH.A0A(A0U3, this.A05, 2131961948));
            A0r.A2n();
            A0r.A2w(C1u7.A0B);
            7zQ.A1K(A0U3, migColorScheme, A0r);
            C9sn.A01(C2so.A0I(A0U3, A004, A0a), A004, null);
        }
        if (this.A04 == num2) {
            2lO A0K = 4YV.A0K(7zQ.A0X((2lO) null, num, 1.0f), 0S2.A15, 3yH.A06(A004, 2132279312));
            C2sn A0U4 = 7zQ.A0U(A004.A00);
            36Z A005 = C2rs.A00(A0U4.A00);
            A005.A0L();
            A005.A1W(2132279321);
            A005.A1M(2132279321);
            A005.A0J();
            A0U4.A00(A005.A01);
            C9sn.A01(C2so.A0N(A0U4, A004, A0K), A004, null);
        }
        return 7zM.A0l(new C8ej(r06, null, r05, null, null, C9mj.A02(AeS, c1j8, 7zN.A03(A0L, A08), z), A004.A01, null, r04, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true), A0L, c2k5, A0Z);
    }
}
