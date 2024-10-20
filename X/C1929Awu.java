package X;

import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Awu, reason: case insensitive filesystem */
/* loaded from: Awu.class */
public final class C1929Awu extends 1LH {
    public final Bet A00;
    public final MigColorScheme A01;

    public C1929Awu(Bet bet, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = bet;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C5yc c5yc = (C5yc) 1Bi.A03(66467);
        1Iw r0 = c2k5.A05;
        Dud A01 = Dzc.A01(r0);
        A01.A0j(1.0f);
        A01.A2e(true);
        C1rp c1rp = C1rp.CENTER;
        2lQ r02 = 2lO.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(27.0d);
        long A06 = 4YV.A06(2RH.A05);
        Integer num = 0S2.A04;
        C1rh c1rh = null;
        2lO A0X = 7zQ.A0X(4YV.A0K(4YV.A0K((2lO) null, num, doubleToRawLongBits), 0S2.A05, A06), 0S2.A01, 1.0f);
        C2sn A0U = 7zQ.A0U(r0);
        1Iw r03 = A0U.A00;
        2KD A012 = 2K3.A01(r03, 0);
        A012.A2r(2131958990);
        A012.A2g();
        A012.A2b();
        A012.A2X();
        7zO.A1F(A012, 2RH.A04);
        MigColorScheme migColorScheme = this.A01;
        A012.A2x(migColorScheme);
        2KD A0d = 7zR.A0d(r03, A0U, A012, 0);
        7zQ.A1U(A0d, BUF.A00(3vP.A00(A0U), migColorScheme, 2131958989));
        A0d.A2X();
        A0d.A2x(migColorScheme);
        7zN.A1Q(A0U, A0d);
        Bet bet = this.A00;
        if (C5yc.A00(c5yc).AZk(36315700837229911L)) {
            C3O7 c3o7 = (C3O7) 1Bi.A03(67770);
            EnumC00743oh enumC00743oh = EnumC00743oh.WRAP;
            2lO A0K = 4YV.A0K(4YV.A0K((2lO) null, num, 4YV.A06(2RH.A06)), 0S2.A15, Double.doubleToRawLongBits(28.0d));
            C2sn A0J = 7zS.A0J(A0U);
            Iterator A14 = AbM.A14(c3o7.A02);
            while (A14.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A14);
                8Au A00 = 8Av.A00(A0J.A00);
                A00.A2a(0Pz.A0j(((MagicWord) A0z.getValue()).A02, "  ", ((MagicWord) A0z.getValue()).A03));
                A00.A2Z(migColorScheme);
                7zO.A1M(A00, 2RH.A07, C26z.ALL);
                A00.A2J(((MagicWord) A0z.getValue()).A03);
                A00.A2Y(new CZE(bet, A0z, 36));
                A0J.A00(A00.A2W());
            }
            c1rh = C2so.A0U(A0J, A0U, A0K, null, null, c1rp, enumC00743oh, false);
        }
        A0U.A00(c1rh);
        return 7zM.A0w(C2so.A06(A0U, c2k5, A0X), A01);
    }
}
