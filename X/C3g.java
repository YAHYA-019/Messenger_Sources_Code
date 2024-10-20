package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: C3g.class */
public final class C3g {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C3g(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 83719);
        this.A01 = 1Bu.A03(r0, 49829);
    }

    public final void A00(FbUserSession fbUserSession, DEl dEl, String str) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        GraphQlQueryParamSet A0H = AbJ.A0H(str);
        AbI.A0o(this.A01).A04(new C1606Amn(dEl, 3), AeR.A00(7zT.A09(this.A00), C3sa.A00(7zM.A0L(A0H, new 2Jf(2JX.class, (Class) null, "MessengerPageRTCEntrypointQuery", (String) null, "fbandroid", 300596912, 0, 4213234129L, 4213234129L, false, A1X)).A0K)), "biz_rtc_entrypoint_setting_query");
    }
}
