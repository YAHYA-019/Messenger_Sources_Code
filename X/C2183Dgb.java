package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* renamed from: X.Dgb, reason: case insensitive filesystem */
/* loaded from: Dgb.class */
public final class C2183Dgb extends AbstractC2188Dgg {
    public static final String __redex_internal_original_name = "VerifyPaymentsPINMutationApiMethod";

    public C2183Dgb() {
        super(AbI.A0G(), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ GraphQlQueryParamSet A05(Object obj) {
        GraphQlCallInput graphQlCallInput = (GraphQlCallInput) obj;
        if (graphQlCallInput == null) {
            return null;
        }
        DKH.A1F(graphQlCallInput.A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        DKF.A1N(graphQlCallInput, A0M);
        return A0M;
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        return new Q74();
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        return obj2;
    }
}
