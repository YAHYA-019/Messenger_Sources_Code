package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ezm.class */
public final class Ezm {
    public final Context A00;
    public final 1GU A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final FAX A05;

    public Ezm(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A03 = DKF.A0O(context);
        this.A04 = 1HG.A00(context, 98353);
        this.A01 = 7zQ.A0Q();
        this.A02 = 1Bq.A00(16449);
        this.A05 = ((F6C) 1Br.A0B(this.A03)).A00;
    }

    public final void A00() {
        String str;
        Er6 er6 = this.A05.A03;
        if (er6 == null || (str = er6.A0g) == null || str.length() == 0) {
            throw AnonymousClass001.A0N("No game information or game id found");
        }
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "app_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, "android_v0", "defer_tos_version");
        4YV.A1A(A0J, A0N, "input");
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(C2278Diy.class, "InstantGamePlayedMutation", null, "input", "fbandroid", 2086810192, 384, 3625647870L, 3625647870L, false, true));
        Context context = this.A00;
        1Vd A0A = DKI.A0A(context, context);
        DKH.A1H(A00);
        A0A.A08(A00, 5Dj.A01);
    }

    public final void A01(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        FAX fax = this.A05;
        Eyl eyl = fax.A05;
        EjT ejT = (EjT) 1Br.A0B(this.A04);
        String str = (eyl == null || GraphQLInstantGameContextType.THREAD != eyl.A00()) ? null : eyl.A00;
        Er6 er6 = fax.A03;
        String str2 = er6 != null ? er6.A0g : null;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, "CLICKED", "status_type");
        if (str2 != null && str2.length() != 0) {
            07S.A00(A0J, str2, "game_id");
        }
        if (str != null && str.length() != 0) {
            07S.A00(A0J, str, 1BJ.A00(35));
        }
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, false, "dismiss_suggestions_for_you_section");
        4YV.A1A(A0J, A0N, "input");
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(C2233Dhp.class, "InstantGameClearBadgeMutation", null, "input", "fbandroid", 842182345, 384, 918058060L, 918058060L, false, true));
        1Vd A0K = 7zM.A0K(ejT.A00);
        DKH.A1H(A00);
        1Br.A0D(ejT.A01, new Fvp(0), A0K.A08(A00, 5Dj.A01));
    }

    public final void A02(Eqp eqp, String str, boolean z) {
        String str2;
        C03z c03z = GraphQlCallInput.A02;
        String str3 = eqp.A05;
        if (str3 == null || (str2 = eqp.A0B) == null) {
            return;
        }
        07S A0J = 4YU.A0J(c03z, eqp.A01, "context_token_id");
        07S.A00(A0J, str3, "game_id");
        07S.A00(A0J, eqp.A02, "cta");
        07S.A00(A0J, str2, "text");
        07S.A00(A0J, eqp.A06, "image");
        07S.A00(A0J, eqp.A03, "data");
        07S.A00(A0J, eqp.A04, "extra");
        07S.A00(A0J, eqp.A0A, "session_id");
        07S.A00(A0J, Boolean.valueOf(z), "client_enable_e2ee");
        07S.A00(A0J, eqp.A07, "additional_message_text");
        07S.A00(A0J, str, "update_trigger");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, eqp.A09, "play_style");
        4YV.A1A(A0J, A0N, "input");
        Context context = this.A00;
        1Vd A0A = DKI.A0A(context, context);
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(C2259Dif.class, "InstantGameCustomUpdateMutation", null, "input", "fbandroid", -228588794, 192, 738531636L, 738531636L, false, true));
        DKH.A1H(A00);
        A0A.A08(A00, 5Dj.A01);
    }

    public final void A03(String str, String str2) {
        11T.A0F(str2, 1);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "link_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, str2, 7zK.A00(403));
        4YV.A1A(A0J, A0N, "input");
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(DkE.class, "XFBGamingUpdatePlayLinkImageMutation", null, "input", "fbandroid", 1385661768, 128, 1243516661L, 1243516661L, false, true));
        Context context = this.A00;
        1Vd A0A = DKI.A0A(context, context);
        DKH.A1H(A00);
        A0A.A09(A00);
    }
}
