package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* renamed from: X.Dga, reason: case insensitive filesystem */
/* loaded from: Dga.class */
public final class C2182Dga extends AbstractC2188Dgg {
    public static final String __redex_internal_original_name = "UpdatePaymentsPINMutationApiMethod";

    public C2182Dga() {
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
        return new Q73();
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        return obj2;
    }
}
