package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Axp, reason: case insensitive filesystem */
/* loaded from: Axp.class */
public final class C1960Axp extends 1LH {
    public final BOj A00;
    public final C9ct A01;
    public final DIX A02;
    public final MigColorScheme A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final Context A08;

    public C1960Axp(Context context, BOj bOj, C9ct c9ct, DIX dix, MigColorScheme migColorScheme, List list, boolean z, boolean z2, boolean z3) {
        4YV.A1M(migColorScheme, 2, list);
        11T.A0F(dix, 10);
        this.A08 = context;
        this.A03 = migColorScheme;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A04 = list;
        this.A00 = bOj;
        this.A01 = c9ct;
        this.A02 = dix;
    }

    public 1LI A0s(C2k5 c2k5) {
        C8m4 A06;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A03;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2cL r312 = null;
        2lO A04 = C82m.A04(7zL.A0g((2lO) null, new C2xi(num, 7zL.A0j(BDl), 1)), num, 100.0f, A1W ? 1 : 0);
        Integer num2 = 0S2.A01;
        2lO A042 = C82m.A04(A04, num2, 100.0f, A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        2lO A0a = 7zS.A0a(4YV.A0K(C82m.A04(null, num, 100.0f, A1W ? 1 : 0), num2, Double.doubleToRawLongBits(56.0d)), num, migColorScheme.BDl());
        C1ro c1ro = C1ro.CENTER;
        2lO A0L2 = 4YV.A0L(A0a, num, c1ro, A1W ? 1 : 0);
        C2sn A0U = 7zQ.A0U(AeS);
        C1u2 A0I = 4YV.A0I();
        AwX awX = new AwX(A0U.AeS(), new B0g());
        B0g b0g = awX.A01;
        b0g.A06 = migColorScheme;
        awX.A10(100.0f);
        b0g.A0A = "";
        awX.A2a(3yH.A09(A0U, 2131952568));
        awX.A2Z(2KE.A0C);
        awX.A2Y(this.A02);
        b0g.A01 = 268435459;
        b0g.A00 = migColorScheme.B36();
        awX.A2X(A0I.A00());
        b0g.A0E = true;
        b0g.A0C = "search_in_chat_edit_text_tag";
        b0g.A0B = Integer.valueOf(migColorScheme.B4h());
        A0U.A00(awX.A2W());
        A0L.A00(AbstractC02613vo.A00(C2so.A0I(A0U, A0L, A0L2), AeS, migColorScheme, 6));
        long A062 = 4YV.A06(2RH.A05);
        Object obj = new Object();
        2lO A043 = C82m.A04(null, num2, 100.0f, A1W ? 1 : 0);
        8Dm A01 = C9d1.A01(A0L, null, new C2lu(A062), null, new C2lu(A062));
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        2NI r0 = C8nc.A0O;
        C02A c02a = AeS.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn c9sn = new C9sn(AeS);
        C9sn.A04(c9sn, this.A04, ARw.A00, new 83Q(obj, this, 18));
        C1qo c1qo = A0L.AeS().A0E;
        11T.A0A(c1qo);
        A0L.A00(new C8ej(r0, A01, null, A043, null, C9mj.A02(AeS, c1j8, C2lu.A01(c1qo, doubleToRawLongBits), z), c9sn.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true));
        if (this.A05) {
            8Tj A00 = C8m4.A00(AeS);
            A00.A2Y(migColorScheme.AZc());
            A00.A1y(c1ro);
            A00.A0c();
            A00.A28(C26z.TOP, 50.0f);
            A06 = 8Tj.A06(A00, migColorScheme);
        } else {
            A06 = null;
        }
        A0L.A00(A06);
        if (this.A07) {
            2lO A0X = 7zQ.A0X(4YV.A0L(7zS.A0a(4YV.A0L(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), num, c1ro, A1W ? 1 : 0), num, migColorScheme.BDl()), 0S2.A0Y, 2dP.A01, A1W ? 1 : 0), 0S2.A15, 50.0f);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(48.0d);
            2lO A0K = 4YV.A0K(4YV.A0K(A0X, 0S2.A0u, doubleToRawLongBits2), 0S2.A1G, doubleToRawLongBits2);
            C2sn A0U2 = 7zQ.A0U(AeS);
            1Iw r02 = A0U2.A00;
            2KD A0X2 = 7zN.A0X(r02, migColorScheme, A1W ? 1 : 0);
            A0X2.A2z(3yH.A09(A0U2, 2131967500));
            A0X2.A2f();
            A0X2.A2b();
            A0X2.A2a();
            2dP r03 = 2dP.A03;
            A0X2.A2H(r03);
            2KD A0d = 7zR.A0d(r02, A0U2, A0X2, A1W ? 1 : 0);
            A0d.A2x(migColorScheme);
            7zQ.A1T(A0d, 3yH.A09(A0U2, 2131967499));
            A0d.A2a();
            4YU.A1N(A0d, 2RH.A07);
            A0d.A2H(r03);
            7zN.A1Q(A0U2, A0d);
            r312 = C2so.A02(A0U2, A0L, A0K);
        }
        return 7zM.A0l(r312, A0L, c2k5, A042);
    }
}
