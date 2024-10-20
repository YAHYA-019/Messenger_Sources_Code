package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* renamed from: X.Dgd, reason: case insensitive filesystem */
/* loaded from: Dgd.class */
public final class C2185Dgd extends AbstractC2188Dgg {
    public static final String __redex_internal_original_name = "FBPaymentsAddCreditCardMutationApiMethod";

    public C2185Dgd() {
        super(AbI.A0G(), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ GraphQlQueryParamSet A05(Object obj) {
        GraphQlCallInput graphQlCallInput = (GraphQlCallInput) obj;
        DKH.A1F(graphQlCallInput.A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(graphQlCallInput, "data");
        return A0M;
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        return new Q7B();
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        return obj2;
    }
}
