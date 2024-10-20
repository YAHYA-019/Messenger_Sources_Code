package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbavatar.logging.AvatarScubaLoggerParams;
import com.facebook.graphql.enums.GraphQLAvatarHomeActionType;

/* loaded from: Dz0.class */
public final class Dz0 extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("NewHomeBannerComponentSpec");
    public GCZ A00;
    public RoC A01;

    public Dz0() {
        super("NewHomeBannerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r304;
        Dzn dzn = (Dzn) 4YU.A0P(r302);
        RoC roC = this.A01;
        C06974ih c06974ih = dzn.A00;
        int A05 = 7zP.A05(roC, c06974ih, 1);
        Fcg fcg = (Fcg) DKC.A0y();
        C1rq A01 = C1rg.A01(r302, null, 0);
        C2166Dfu A00 = EVm.A00(r302);
        5BH A012 = 5BG.A01(r302);
        A012.A0c();
        C26z c26z = C26z.ALL;
        A012.A27(c26z, 0.0f);
        A012.A2Z(c06974ih);
        CallerContext callerContext = A02;
        A012.A2b(callerContext);
        7zM.A1J(A012, roC.A01);
        String str = roC.A04;
        String str2 = roC.A03;
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A25(c26z, 16.0f);
        A013.A2h(C1ro.FLEX_END);
        1LI r321 = null;
        if (str != null) {
            1LI A0M = 7zN.A0M(r302, (String) null);
            C2152Dfg c2152Dfg = new C2152Dfg(r302);
            c2152Dfg.A05 = str;
            FAa A052 = AbstractC2178Dg6.A05(c2152Dfg, EP4.A0A);
            A052.A01 = A05;
            2MR r0 = 2MR.A1m;
            AbstractC2178Dg6.A0C(r0, c2152Dfg, A052);
            AbstractC2178Dg6.A07(callerContext, c2152Dfg, A0M);
            if (str2 != null) {
                C2152Dfg c2152Dfg2 = new C2152Dfg(r302);
                c2152Dfg2.A05 = str2;
                FAa A053 = AbstractC2178Dg6.A05(c2152Dfg2, EP4.A08);
                A053.A01 = A05;
                AbstractC2178Dg6.A0C(r0, c2152Dfg2, A053);
                c2152Dfg2.A0h(C26z.TOP, 8.0f);
                r321 = c2152Dfg2.A0O(callerContext);
            }
            A0M.A2e(r321);
            r321 = A0M;
        }
        A013.A2e(r321);
        C2cm A002 = C2cl.A00(r302);
        A002.A24(C26z.LEFT, 16.0f);
        2MR r02 = 2MR.A1m;
        A002.A2Y(r02.attr);
        A002.A2b(fcg.A04(r302.A0D, 3Eh.A52));
        A002.A0J();
        A013.A2f(A002.A00);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        A014.A0e();
        A014.A2h(C1rp.FLEX_END);
        7zL.A1J(A014);
        A014.A2d(A012);
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        A015.A0c();
        A015.A1E(0.0f);
        A015.A0e();
        A015.A0l(96.0f);
        A015.A1I(2132411268);
        7zL.A1G(A015, A014);
        String str3 = roC.A02;
        if (str3 == null) {
            r304 = null;
        } else {
            2cM A016 = 2cK.A01(r302, (String) null, 0);
            A016.A0c();
            A016.A1F(0.0f);
            A016.A0e();
            A016.A0f(1.4f);
            A016.A2c();
            C2152Dfg c2152Dfg3 = new C2152Dfg(r302);
            c2152Dfg3.A05 = str3;
            c2152Dfg3.A03 = EP4.A0E;
            c2152Dfg3.A0e(true);
            FAa A003 = FAa.A00();
            A003.A06(r02);
            AbstractC2178Dg6.A0H(c2152Dfg3, A003);
            AbstractC2178Dg6.A07(callerContext, c2152Dfg3, A016);
            r304 = A016.A00;
        }
        A014.A2e(r304);
        A014.A2d(A013);
        float f = 2.26f;
        if (roC.A00 == GraphQLAvatarHomeActionType.SATP) {
            f = 1.0f;
        }
        A014.A0f(f);
        AbstractC2150Dfe A0g = A00.A0g(A014.A00);
        A0g.A04 = 1LI.A06(r302, Dz0.class, "NewHomeBannerComponent");
        DfL A03 = AbstractC2178Dg6.A03(A0g, r302, null);
        A03.A03(8.0f);
        A0g.A00 = A03;
        A0g.A02 = A0g.A03;
        AbstractC2178Dg6.A09(CallerContext.A08, A0g, A01);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        Dz0 dz0 = (Dz0) r302.A00.A01;
        RoC roC = dz0.A01;
        GCZ gcz = dz0.A00;
        1BL.A1F(roC, gcz);
        Ra0 ra0 = ((Fda) gcz).A00;
        GraphQLAvatarHomeActionType graphQLAvatarHomeActionType = roC.A00;
        Ra0.A00(ra0, graphQLAvatarHomeActionType);
        FIl fIl = (FIl) 1Br.A0B(Q4e.A06(ra0.A00).A00);
        String A0j = 0Pz.A0j("banner", "_", graphQLAvatarHomeActionType.name());
        11T.A0A(A0j);
        AvatarScubaLoggerParams.A00(fIl, "avatar_home", 1BK.A13(A0j));
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        11T.A0F(r302, 0);
        C07004ik A00 = C06984ii.A00();
        A00.A00(InterfaceC07034in.A01);
        7zM.A1K(A00, 3yG.A03(7zQ.A0J(r302)));
        ((Dzn) r303).A00 = new C06974ih(A00);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
