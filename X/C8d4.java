package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8d4, reason: invalid class name */
/* loaded from: 8d4.class */
public final class C8d4 extends 1LH {
    public final MigColorScheme A00;
    public final 9PX A01;
    public final C00m A02;
    public final C00m A03;
    public final Function1 A04;
    public final FbUserSession A05;
    public final Function1 A06;

    public C8d4(FbUserSession fbUserSession, MigColorScheme migColorScheme, 9PX r304, C00m c00m, C00m c00m2, Function1 function1, Function1 function12) {
        1BL.A1F(fbUserSession, migColorScheme);
        11T.A0F(r304, 5);
        this.A05 = fbUserSession;
        this.A00 = migColorScheme;
        this.A02 = c00m;
        this.A04 = function1;
        this.A01 = r304;
        this.A06 = function12;
        this.A03 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        9PX r0 = this.A01;
        List list = r0.A00;
        boolean A1V = AnonymousClass001.A1V(2rO.A00(c2k5, new J9p(this, 48), new Object[]{list}));
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.CENTER;
        C2sn A0K = 7zR.A0K(c2k5.A05);
        Integer num = 0S2.A00;
        2lO A00 = 32E.A00(C82m.A01(null, C82m.A08(num, 100.0f, 0), 0), 0.4f);
        MigColorScheme migColorScheme = this.A00;
        7zN.A1I(7zS.A0J(A0K), A0K, 7zS.A0a(A00, num, migColorScheme.AZN()));
        2lO A0Z = 7zS.A0Z((2lO) null, num, 376.0d);
        long A08 = 7zQ.A08();
        2lO A0L = 4YV.A0L(4YV.A0K(A0Z, 0S2.A06, A08), 0S2.A05, new 8CF(1), 1);
        Integer num2 = 0S2.A0N;
        2lO A0a = 7zS.A0a(7zS.A0c(A0L, num2, true), num, migColorScheme.AYp());
        2dP r02 = 2dP.A01;
        Integer num3 = 0S2.A0Y;
        2lO A0L2 = 4YV.A0L(A0a, num3, r02, 0);
        C2sn A0K2 = 7zS.A0K(A0K);
        2lO A0l = 7zT.A0l(4YV.A0L((2lO) null, num3, r02, 0), num2, num3, A08);
        1Iw AeS = A0K2.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        C83g A002 = C02413v4.A00(A0U.A00);
        A002.A2Z(2MQ.A11);
        A002.A2Y();
        A002.A2e(migColorScheme);
        A002.A2d(C1u7.A08);
        A002.A2c(C83o.A03);
        A002.A2b(7zL.A0a(new JBV(this, 17)));
        7zQ.A1E(A002.A2V(), A0U, A0K2, A0l);
        2KD A01 = 2K3.A01(AeS, 0);
        A01.A2r(2131953863);
        A01.A1y(c1ro);
        A01.A2X();
        A01.A2h();
        A01.A2e();
        7zQ.A1K(A0K2, migColorScheme, A01);
        C1rp c1rp2 = C1rp.SPACE_AROUND;
        2lO A0N = 7zT.A0N(C82m.A04(null, num, 100.0f, 0), 4YU.A00(2RH.A06));
        C2sn A0U2 = 7zQ.A0U(AeS);
        8Sw A003 = 8oD.A00(A0U2.A00);
        A003.A2X(migColorScheme);
        8oD r03 = A003.A01;
        r03.A0B = true;
        A003.A10(100.0f);
        r03.A09 = 3yH.A09(A0U2, 2131953864);
        r03.A03 = 7zL.A0a(new JBV(this, 18));
        7zU.A1F(A003.A2W(), A0U2, A0K2, A0N, c1rp2);
        A0K2.A00(new 8bH(this.A05, migColorScheme, list, this.A06, r0.A01));
        8TZ A004 = C8nr.A00(AeS);
        A004.A2Y(2131966267);
        A004.A2a(migColorScheme);
        A004.A01.A04 = 86K.A03;
        A004.A2c(A1V);
        7zO.A1N(A004, new JBV(this, 16));
        7zQ.A1E(A004.A2W(), A0K2, A0K, A0L2);
        return new 2cL((C1ro) null, c1ro, c1rp, (EnumC00743oh) null, A0K.A01, false);
    }
}
