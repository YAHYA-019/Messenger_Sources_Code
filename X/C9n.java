package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;

/* loaded from: C9n.class */
public final class C9n {
    public static final void A00(FbUserSession fbUserSession, String str, String str2, String str3) {
        C03z c03z = GraphQlCallInput.A02;
        Integer A0h = 7zN.A0h();
        07S A0J = 4YU.A0J(c03z, A0h, "token_ent_id");
        07S.A00(A0J, A0h, "thread_key");
        07S.A00(A0J, str2, "thread_key_string");
        07S.A00(A0J, str, "token_ent_id_string");
        07S.A00(A0J, str3, "user_action_type");
        AbstractC05414dq A06 = 1VX.A06(FbInjector.A00(), fbUserSession);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "input");
        5Dh A09 = AbO.A09(A0M, new C01643sd(AqJ.class, "NotificationMessagesMutationCall", null, null, "fbandroid", -1915709187, 0, 2721899677L, 2721899677L, false, true));
        4YU.A1J(A09, 1344955725873500L);
        A06.A06(A09);
    }
}
