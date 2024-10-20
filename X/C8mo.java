package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8mo, reason: invalid class name */
/* loaded from: 8mo.class */
public final class C8mo extends C1rj {
    public C1u2 A00;
    public JLB A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public C8mo() {
        super("UserActionsInterstitial");
    }

    public static final 2K3 A00(1Iw r301, MigColorScheme migColorScheme, CharSequence charSequence, String str) {
        2KD A00 = 2K3.A00(r301);
        A00.A2z(charSequence);
        A00.A2S(charSequence);
        A00.A2x(migColorScheme);
        A00.A2k();
        A00.A2e();
        A00.A01.A0M = true;
        A00.A2v(2K4.A03);
        A00.A2Y();
        7zL.A1J(A00);
        A00.A0P();
        A00.A2K(str);
        return A00.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A09), this.A02, this.A03, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0B), this.A01, this.A00, this.A04, this.A05, this.A06, this.A07, Boolean.valueOf(this.A0C), this.A08};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rh c1rh;
        2K3 A00;
        Class cls;
        String str;
        int i;
        CharSequence charSequence = this.A06;
        boolean z = this.A09;
        CharSequence charSequence2 = this.A04;
        boolean z2 = this.A0C;
        CharSequence charSequence3 = this.A07;
        boolean z3 = this.A0A;
        boolean z4 = this.A0B;
        CharSequence charSequence4 = this.A03;
        CharSequence charSequence5 = this.A08;
        C1u2 c1u2 = this.A00;
        MigColorScheme migColorScheme = this.A02;
        11T.A0F(r302, 0);
        7zR.A1N(charSequence, charSequence2);
        11T.A0F(charSequence3, 5);
        7zR.A1Q(charSequence4, charSequence5);
        7zR.A1R(c1u2, migColorScheme);
        2cM A0i = 7zM.A0i(r302);
        2RH r0 = 2RH.A06;
        7zO.A1G(A0i, r0);
        2KD A0f = 7zR.A0f(r302, charSequence, false);
        A0f.A2f();
        A0f.A2d();
        A0f.A2Y();
        4YU.A1L(A0f, r0);
        7zO.A1F(A0f, 2RH.A04);
        A0f.A2x(migColorScheme);
        4YU.A1K(A0i, A0f);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0k(0.0f);
        A01.A2g(C1ro.FLEX_START);
        C2k3 A002 = C2k2.A00(r302);
        A002.A0k(0.0f);
        A002.A2X(migColorScheme.Atp());
        A002.A0z(0.0f);
        A002.A1L(1);
        A002.A0R();
        A01.A2e(A002);
        7zL.A1I(A0i, A01);
        if (!z3 && z) {
            1LI A003 = A00(r302, migColorScheme, charSequence2, "mute_action");
            C1u3 c1u3 = C1u3.A4P;
            int BKg = migColorScheme.BKg();
            C5bb c5bb = new C5bb(migColorScheme.AYv());
            c5bb.Cmv(true);
            C2cq A004 = C2cp.A00(r302, 0);
            7zO.A1D(A004);
            A004.A0D(c5bb);
            A004.A2U(false);
            7zM.A1I(c1u3, c1u2, A004, BKg);
            C2cp A2W = A004.A2W();
            1Im A09 = 1LI.A09(r302, C8mo.class, "UserActionsInterstitial", -388267921);
            C1rq A005 = C1rg.A00(r302);
            A005.A2f(A003);
            4YU.A1L(A005, r0);
            7zO.A1E(A005, 2RH.A03);
            A005.A2f(A2W);
            A005.A2d();
            A005.A2T(A09);
            A005.A0P();
            A005.A2U(true);
            A005.A2Q(true);
            A0i.A2e(A005.A00);
        }
        if (z2) {
            1LI A006 = A00(r302, migColorScheme, charSequence3, "remove_action");
            C1u3 c1u32 = C1u3.A1w;
            int AkX = migColorScheme.AkX();
            C5bb c5bb2 = new C5bb(migColorScheme.AYv());
            c5bb2.Cmv(true);
            C2cq A007 = C2cp.A00(r302, 0);
            7zO.A1D(A007);
            A007.A0D(c5bb2);
            A007.A2U(false);
            7zM.A1I(c1u32, c1u2, A007, AkX);
            C2cp A2W2 = A007.A2W();
            1Im A092 = 1LI.A09(r302, C8mo.class, "UserActionsInterstitial", -1382336668);
            C1rq A008 = C1rg.A00(r302);
            A008.A2f(A006);
            4YU.A1L(A008, r0);
            7zO.A1E(A008, 2RH.A03);
            A008.A2f(A2W2);
            A008.A2d();
            A008.A2T(A092);
            A008.A0P();
            A008.A2U(true);
            A008.A2Q(true);
            c1rh = A008.A00;
        } else {
            c1rh = null;
        }
        A0i.A2e(c1rh);
        if (z4) {
            A00 = A00(r302, migColorScheme, charSequence4, "hide_video_action");
            cls = C8mo.class;
            str = "UserActionsInterstitial";
            i = -1192741491;
        } else {
            A00 = A00(r302, migColorScheme, charSequence5, "show_video_action");
            cls = C8mo.class;
            str = "UserActionsInterstitial";
            i = -1978699064;
        }
        1Im A093 = 1LI.A09(r302, cls, str, i);
        C1rq A0O = 7zN.A0O(A00, r302);
        4YU.A1L(A0O, r0);
        7zO.A1E(A0O, 2RH.A03);
        A0O.A2T(A093);
        A0O.A0P();
        A0O.A2U(true);
        A0O.A2Q(true);
        7zL.A1I(A0i, A0O);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2h(C1ro.STRETCH);
        A012.A1H(migColorScheme.Abp());
        7zL.A1H(A0i, A012);
        return A012.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1978699064:
                JLB jlb = ((C8mo) r302.A00.A01).A01;
                11T.A0F(jlb, 1);
                jlb.CLY();
                return null;
            case -1382336668:
                JLB jlb2 = ((C8mo) r302.A00.A01).A01;
                11T.A0F(jlb2, 1);
                jlb2.CGN();
                return null;
            case -1192741491:
                JLB jlb3 = ((C8mo) r302.A00.A01).A01;
                11T.A0F(jlb3, 1);
                jlb3.C16();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -388267921:
                JLB jlb4 = ((C8mo) r302.A00.A01).A01;
                11T.A0F(jlb4, 1);
                jlb4.C8I();
                return null;
            default:
                return null;
        }
    }
}
