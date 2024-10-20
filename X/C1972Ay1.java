package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.Ay1, reason: case insensitive filesystem */
/* loaded from: Ay1.class */
public final class C1972Ay1 extends 1LH {
    public final Edx A00;
    public final MigColorScheme A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;

    public C1972Ay1(Edx edx, MigColorScheme migColorScheme, Boolean bool, Integer num, Integer num2, boolean z) {
        11T.A0F(edx, 4);
        this.A01 = migColorScheme;
        this.A05 = z;
        this.A03 = num;
        this.A00 = edx;
        this.A02 = bool;
        this.A04 = num2;
    }

    private final C1rh A01(C2k6 c2k6, String str, String str2, int i, boolean z) {
        1Iw r308;
        MigColorScheme migColorScheme;
        1LI A2W;
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, new C2xi(0S2.A01, true, 1));
        Boolean bool = this.A02;
        2lO A0L = 4YV.A0L(A0g, 0S2.A0F, Boolean.valueOf(AnonymousClass001.A1U(bool)), 1);
        C2sn A0U = 7zQ.A0U(c2k6.AeS());
        Integer num = this.A04;
        if (num == null || num.intValue() != i) {
            r308 = A0U.A00;
            8TG A00 = Dyd.A00(r308);
            A00.A01.A02 = Boolean.valueOf(z);
            migColorScheme = this.A01;
            A00.A2X(migColorScheme);
            A00.A2Y(AnonymousClass001.A1U(bool));
            7zR.A1A(A00, new GAc(i, 10, this));
            A00.A0W();
            A2W = A00.A2W();
        } else {
            r308 = A0U.A00;
            8Tj A002 = C8m4.A00(r308);
            A002.A2X(24.0f);
            migColorScheme = this.A01;
            A002.A2Y(migColorScheme.AZc());
            A002.A2Z(migColorScheme);
            A002.A0W();
            A2W = A002.A2W();
        }
        11T.A0D(A2W);
        A0U.A00(A2W);
        55N A003 = 55M.A00(r308);
        CJ4 cj4 = new CJ4();
        cj4.A07 = migColorScheme;
        cj4.A04(str);
        cj4.A03 = CJh.A00(str2);
        cj4.A0A = AnonymousClass001.A1U(bool);
        7zU.A1I(A0U, cj4.A01(), A003);
        return C2so.A0I(A0U, c2k6, A0L);
    }

    public 1LI A0s(C2k5 c2k5) {
        Integer num;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, new C2xi(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        Integer num2 = 0S2.A01;
        2lO A0L = 4YV.A0L(A0g, num2, true, 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        boolean z = true;
        Object c59e = this.A02 != null ? new C59e(migColorScheme) : new C59y(migColorScheme, "contact_card_component_key", this.A05, AnonymousClass001.A1U(this.A04));
        1Iw AeS = A0L2.AeS();
        55N A00 = 55M.A00(AeS);
        AnonymousClass557 A0p = 7zL.A0p();
        7zU.A1S(A0p, A0L2, 2131952761);
        7zN.A1W(A0p, c59e);
        A0p.A05(migColorScheme);
        A0p.A01 = new Fjz(this, 17);
        if (this.A04 != null) {
            z = false;
        }
        A0p.A0C = z;
        7zU.A1I(A0L2, A0p.A00(), A00);
        55N A002 = 55M.A00(AeS);
        int i = 9GF.A00;
        int i2 = 9GF.A01;
        LightColorScheme.A00();
        7zU.A1I(A0L2, new C55g(C1u7.A0A, migColorScheme, 2KE.A04, 3yH.A09(A0L2, 2131952760), i, 7zM.A01(), i2, -1, A1W), A002);
        if (this.A05 && (num = this.A03) != null) {
            55N A003 = 55M.A00(AeS);
            LightColorScheme.A00();
            7zU.A1I(A0L2, new 55Y(migColorScheme, 7, A1W ? 1 : 0, A1W ? 1 : 0, A1W ? 1 : 0), A003);
            C1302Adf c1302Adf = (C1302Adf) 1Bn.A0A(68462);
            55N A004 = 55M.A00(AeS);
            c1302Adf.A04 = migColorScheme;
            c1302Adf.A07 = 3yH.A09(A0L2, 2131968150);
            7zU.A1I(A0L2, c1302Adf.A02(), A004);
            2lO A0L3 = 4YV.A0L((2lO) null, num2, true, 1);
            C2sn A0U = 7zQ.A0U(AeS);
            String A09 = 3yH.A09(A0U, 2131952784);
            String A092 = 3yH.A09(A0U, 2131952783);
            int intValue = num.intValue();
            A0U.A00(A01(A0U, A09, A092, 1, AnonymousClass001.A1Q(intValue, 1)));
            7zQ.A1E(A01(A0U, 3yH.A09(A0U, 2131962506), 3yH.A09(A0U, 2131962505), 2, AnonymousClass001.A1Q(intValue, 2)), A0U, A0L2, A0L3);
        }
        return C2so.A02(A0L2, c2k5, A0L);
    }
}
