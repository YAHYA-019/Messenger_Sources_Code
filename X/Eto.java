package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLGamesServiceProfilePictureType;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.List;

/* loaded from: Eto.class */
public final class Eto {
    public final 1Br A00 = 7zM.A0P();
    public final 1Br A01;
    public final 1De A02;

    public Eto(1De r302) {
        this.A02 = r302;
        this.A01 = AbI.A0O(r302);
    }

    public final void A00(FbUserSession fbUserSession, GEo gEo, GraphQLGamesServiceProfilePictureType graphQLGamesServiceProfilePictureType, String str, String str2, String str3, List list, List list2) {
        11T.A0F(fbUserSession, 0);
        if (str == null) {
            gEo.CGr(false, null);
            return;
        }
        FwL A00 = FwL.A00(gEo, 16);
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A09("app_id", str);
        graphQlCallInput.A0A("scope", list);
        graphQlCallInput.A0A("seen_scope", list2);
        graphQlCallInput.A09("selected_privacy_option", str2);
        graphQlCallInput.A09("tracking_preference", "INSTALL_FROM_FIRST_PARTY_SURFACE");
        graphQlCallInput.A09(graphQLGamesServiceProfilePictureType == GraphQLGamesServiceProfilePictureType.A01 ? "facebook_avatar_sticker_id" : AnonymousClass000.A00(173), str3);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(graphQlCallInput, "input");
        1Br.A0D(this.A00, A00, 7zT.A09(this.A01).A09(5Dh.A00(A0M, new C01643sd(DhS.class, "GamingLoginNativeToSSubmitMutation", null, "input", "fbandroid", -1871986848, 384, 1280179610L, 1280179610L, false, true))));
    }
}
