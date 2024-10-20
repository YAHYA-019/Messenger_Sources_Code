package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.UnsafeContextInjection;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Ewx.class */
public final class Ewx {
    public final Context A00;
    public final C00i A01;
    public final Context A02;
    public final C00i A03;

    public Ewx() {
        Context A00 = 1Bn.A00();
        this.A02 = A00;
        this.A03 = 1Bn.A06(A00, 1EZ.class, (Class) null);
        this.A00 = (Context) 1Bn.A0F(A00, Context.class, UnsafeContextInjection.class);
        this.A01 = 1Bn.A09(5iG.class, (Class) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void A00(FbUserSession fbUserSession, 2JX r303, 2JX r304, 1K9 r305, String str) {
        2JX A0L;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "fdid");
        07S.A00(A0J, "CROSS_POSTING", "service_id");
        2JX A1X = r303.A1X();
        String A17 = DKG.A17(A1X);
        switch (A17.hashCode()) {
            case -1808689588:
                if (A17.equals("IG_USER")) {
                    A0L = 1BL.A0L(A1X.A17(), 1738742348, -998309346);
                    break;
                }
                throw 1BK.A0i("Unsupported identity type: ", A17);
            case -319545294:
                if (A17.equals("FB_PAGE")) {
                    A0L = 1BL.A0L(A1X.A13(), -1067080654, 163307723);
                    break;
                }
                throw 1BK.A0i("Unsupported identity type: ", A17);
            case -319379090:
                if (A17.equals("FB_USER")) {
                    A0L = 1BL.A0L(A1X.A15(), -1066914450, 756904006);
                    break;
                }
                throw 1BK.A0i("Unsupported identity type: ", A17);
            default:
                throw 1BK.A0i("Unsupported identity type: ", A17);
        }
        07S.A00(A0J, A0L.A0k(), "destination_identity_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, RhP.A04(r304), "source_identity_id");
        4YV.A1A(A0J, A0N, "input");
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(Dn0.class, "FxCalSettingsServiceIdentityMutation", null, "input", "fbandroid", 1994357581, 96, 2999513263L, 2999513263L, false, true));
        AbstractC05414dq A07 = 1VX.A07(this.A00, fbUserSession);
        4YU.A1J(A00, 1076419692814423L);
        ListenableFuture A04 = A07.A04(A00, 5Dj.A02);
        String A02 = RhP.A02(r304);
        DKF.A0h(this.A01).A04(new C2069Dau(r305, this, 11), A04, 0Pz.A0W("update_xpost_service_identity_", A02));
    }

    public void A01(1RN r302, C3sa c3sa) {
        DKF.A0h(this.A01).A04(r302, ((DKN) 1Bn.A0F(this.A02, DKN.class, (Class) null)).A01().A09(c3sa), "fetch_screen_content");
    }
}
