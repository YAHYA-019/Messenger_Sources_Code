package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ewp.class */
public final class Ewp {
    public 1BY A00;
    public final C00i A01 = AbH.A0K();
    public final C00i A02 = 7zN.A0D(49829);

    public Ewp(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(GIT git, Eyl eyl, String str) {
        String str2 = eyl.A00;
        GraphQLInstantGameContextType A00 = eyl.A00();
        C03z c03z = GraphQlCallInput.A02;
        07S r308 = null;
        07S r309 = null;
        int ordinal = A00.ordinal();
        if (ordinal == 7) {
            r309 = c03z.A02();
            07S.A00(r309, str2, "thread_id");
        } else if (ordinal == 2) {
            r309 = c03z.A02();
            07S.A00(r309, str2, "group_id");
        } else if (ordinal == 6) {
            r309 = c03z.A02();
            07S.A00(r309, str2, "story_token");
        } else if (ordinal == 3) {
            r309 = c03z.A02();
            07S.A00(r309, str2, "link_fragment");
        }
        if (str2 != null) {
            r308 = c03z.A02();
            07S.A00(r308, str2, "context_source_id");
        }
        if (r308 == null) {
            r308 = c03z.A02();
        }
        if (r309 == null) {
            r309 = c03z.A02();
        }
        r308.A0H(r309, "key");
        GraphQlQueryParamSet A0N = 4YU.A0N(r308, str, "app_id");
        4YV.A1A(r308, A0N, "input");
        2Jf r0 = new 2Jf(C2321Dk5.class, (Class) null, "QuicksilverSdkContextInfoQuery", (String) null, "fbandroid", -667408802, 0, 4091794597L, 4091794597L, false, true);
        r0.A00 = A0N;
        C3sa A0O = DKH.A0O(r0);
        1Vd A02 = ((DKN) 1Bn.A0E((Context) null, this.A00, 68643)).A02();
        DKH.A1H(A0O);
        AbG.A0B(this.A01).Ciz(new G48(new C2069Dau(git, this, 28), this, A02.A09(A0O)));
    }

    public void A01(GIT git, String str) {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        11T.A0F(str, 0);
        A0M.A05("contextTokenId", str);
        2Jf r0 = new 2Jf(C2292Djc.class, (Class) null, "QuicksilverContextInfoQuery", (String) null, "fbandroid", -260727070, 0, 1857654831L, 1857654831L, false, true);
        r0.A00 = A0M;
        C3sa A0O = DKH.A0O(r0);
        1Vd A02 = ((DKN) 1Bn.A0E((Context) null, this.A00, 68643)).A02();
        DKH.A1H(A0O);
        1FV A09 = A02.A09(A0O);
        AbG.A0B(this.A01).Ciz(new G48(new C2069Dau(git, this, 27), this, A09));
    }
}
