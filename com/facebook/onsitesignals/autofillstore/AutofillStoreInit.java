package com.facebook.onsitesignals.autofillstore;

import X.07S;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BO;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EK;
import X.1Fv;
import X.1G2;
import X.1GD;
import X.1JU;
import X.1Kd;
import X.1VX;
import X.1iF;
import X.2JX;
import X.2Jf;
import X.2yD;
import X.50K;
import X.50L;
import X.50M;
import X.50N;
import X.50O;
import X.50Q;
import X.5Dh;
import X.AbstractC05414dq;
import X.AbstractC08294mh;
import X.C00i;
import X.C01643sd;
import X.C03z;
import X.C3308Jq3;
import X.C3sa;
import X.C3sb;
import X.DLb;
import X.JTm;
import X.LXU;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.smartcapture.logging.MC;

/* loaded from: AutofillStoreInit.class */
public final class AutofillStoreInit {
    public 1BY A00;
    public final 50K A01 = (50K) 1Bn.A0E((Context) null, (1BY) null, 49436);

    public AutofillStoreInit(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public void A00() {
        int ArU;
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        50K r0 = this.A01;
        50N r02 = r0.A02;
        1GD r03 = 1GD.A07;
        C00i c00i = r02.A00.A00;
        if (((2yD) c00i.get()).AZr(r03, 36311839660314065L)) {
            r0.A05.A02();
        }
        if (((2yD) c00i.get()).AZr(r03, 36311839661559253L)) {
            boolean A00 = r02.A00(false);
            50L r04 = r0.A04;
            FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) r0.A03.get();
            1G2 r05 = r0.A00;
            if (A00) {
                try {
                    50M r06 = r04.A02;
                    LXU lxu = new LXU(r04, fbSharedPreferences, r05);
                    GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                    2Jf r07 = new 2Jf(2JX.class, (Class) null, "FBIABAutofillDataRootCallMultiEntries", (String) null, "fbandroid", 1322927235, 0, 2539815084L, 2539815084L, false, true);
                    r07.A00 = graphQlQueryParamSet;
                    C3sa A002 = C3sa.A00(r07);
                    ((C3sb) A002).A03 = 0L;
                    A002.A0B = false;
                    AbstractC05414dq A07 = 1VX.A07(r06.A01, A04);
                    A002.A05 = new 1iF(1EK.A01(), 0L);
                    1Kd.A0F(new JTm(r06, lxu, 4), A07.A03(A002), 1JU.A01);
                } catch (Exception e) {
                    0fH.A0p("AutofillGraphQLHelper", "Error creating multiple query autofill request", e);
                }
            } else {
                1G2 r08 = r0.A07;
                try {
                    50M r09 = r04.A02;
                    50Q r010 = new 50Q(r04, fbSharedPreferences, r05, r08);
                    C03z c03z = GraphQlCallInput.A02;
                    GraphQlQueryParamSet graphQlQueryParamSet2 = new GraphQlQueryParamSet();
                    graphQlQueryParamSet2.A00.A03().A0H(c03z.A02(), "query_params");
                    2Jf r011 = new 2Jf(2JX.class, (Class) null, "FBIABAutofillDataRootCall", (String) null, "fbandroid", -176567682, 0, 3315520266L, 3315520266L, false, true);
                    r011.A00 = graphQlQueryParamSet2;
                    C3sa A003 = C3sa.A00(r011);
                    ((C3sb) A003).A03 = 0L;
                    A003.A0B = false;
                    Context context = r09.A01;
                    11T.A0F(context, 0);
                    Object A0A = 1Bn.A0A(99990);
                    11T.A0A(A0A);
                    if (DLb.A01((DLb) A0A).AZk(MC.android_payment.use_payments_subdomain_fetch_autofill)) {
                        A003.A06 = 0S2.A0Y;
                    }
                    AbstractC05414dq A072 = 1VX.A07(context, A04);
                    A003.A05 = new 1iF(1EK.A01(), 0L);
                    1Kd.A0F(new JTm(r09, r010, 3), A072.A03(A003), 1JU.A01);
                } catch (Exception e2) {
                    1BK.A09(r04.A01).softReport("AutofillGraphQLHelper", "Error creating query autofill request", e2);
                }
            }
        }
        if (((2yD) c00i.get()).AZr(r03, 36311839660314065L) && 1BK.A0M(c00i).AZr(r03, 36311839659986384L)) {
            r0.A05.A02();
        }
        50O r012 = r0.A05;
        C00i c00i2 = r012.A0F;
        if (((FbSharedPreferences) c00i2.get()).AZn(r012.A09, false) || (ArU = ((FbSharedPreferences) c00i2.get()).ArU(r012.A08, -1)) == -1) {
            r012.A02();
            return;
        }
        50M r013 = r012.A0G;
        FbUserSession fbUserSession = r012.A0E;
        07S A02 = GraphQlCallInput.A02.A02();
        07S.A00(A02, "SYNC", "update_settings_operator");
        07S.A00(A02, Integer.valueOf(ArU), "consecutive_neg_interaction");
        GraphQlQueryParamSet graphQlQueryParamSet3 = new GraphQlQueryParamSet();
        graphQlQueryParamSet3.A00.A03().A0H(A02, "request");
        C01643sd c01643sd = new C01643sd(C3308Jq3.class, "IABAutofillUpdateInteractionMutation", null, null, "fbandroid", 126639053, 0, 54368477L, 54368477L, false, true);
        ((2Jf) c01643sd).A00 = graphQlQueryParamSet3;
        5Dh r014 = new 5Dh(c01643sd);
        AbstractC05414dq A073 = 1VX.A07(r013.A01, fbUserSession);
        r014.A05 = new 1iF(1EK.A01(), 0L);
        try {
            GraphQLResult graphQLResult = (GraphQLResult) A073.A06(r014).get();
            if (graphQLResult != null) {
                Object obj = ((AbstractC08294mh) graphQLResult).A03;
                if (obj != null) {
                    2JX A0L = ((C3308Jq3) obj).A0L(2000857412, 2JX.class, 990870204);
                    if (A0L == null || !"SUCCESS".equals(A0L.A0t(GraphQLStringDefUtil.A00(), "GraphQLIABAutofillUpdateSettingsStatus", -892481550))) {
                        return;
                    }
                    C00i c00i3 = r013.A02;
                    50O r015 = (50O) c00i3.get();
                    50O.A00(r015, r015.A08, A0L.getIntValue(94851343));
                    50O r016 = (50O) c00i3.get();
                    50O.A01(r016, r016.A09, true);
                }
            }
        } catch (Exception unused) {
        }
    }
}
