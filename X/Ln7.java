package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ln7.class */
public final class Ln7 implements Runnable {
    public static final String __redex_internal_original_name = "FBContactAutomaticAutofillActionHandler$optInAutomaticAutofill$1";
    public final /* synthetic */ KuT A00;
    public final /* synthetic */ 1Br A01;

    public Ln7(KuT kuT, 1Br r303) {
        this.A00 = kuT;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        50K r0 = (50K) 1Br.A0B(this.A01);
        long j = this.A00.A00.A00.A04.A00;
        50O r02 = r0.A05;
        50O.A01(r02, r02.A06, true);
        1G2 r03 = r02.A05;
        1Ql A0V = 1BL.A0V(r02.A0F);
        A0V.CaH(r03, j);
        A0V.commit();
        50M r04 = r02.A0G;
        FbUserSession fbUserSession = r02.A0E;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, "AUTO_AUTOFILL_OPT_IN", "update_settings_operator");
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        4YV.A1A(A0J, graphQlQueryParamSet, "request");
        5Dh A00 = 5Dh.A00(graphQlQueryParamSet, new C01643sd(C3308Jq3.class, "IABAutofillUpdateInteractionMutation", null, null, "fbandroid", 126639053, 0, 54368477L, 54368477L, false, true));
        AbstractC05414dq A07 = 1VX.A07(r04.A01, fbUserSession);
        4YV.A1B(A00);
        try {
            GraphQLResult graphQLResult = (GraphQLResult) A07.A06(A00).get();
            if (graphQLResult != null) {
                Object obj = ((AbstractC08294mh) graphQLResult).A03;
                if (obj != null) {
                    2JX A0L = ((C3308Jq3) obj).A0L(2000857412, 2JX.class, 990870204);
                    if (A0L == null || !"SUCCESS".equals(A0L.A0t(GraphQLStringDefUtil.A00(), "GraphQLIABAutofillUpdateSettingsStatus", -892481550))) {
                        return;
                    }
                    50O r05 = (50O) r04.A02.get();
                    50O.A00(r05, r05.A08, A0L.getIntValue(94851343));
                }
            }
        } catch (Exception unused) {
        }
    }
}
