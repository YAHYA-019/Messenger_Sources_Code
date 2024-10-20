package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffg.class */
public final class Ffg implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("MetaAIIntentCardNuxImpresionQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DmX.class, (Class) null, "MetaAIIntentCardNuxImpresionQuery", (String) null, "genai-intents-android", -822360946, 0, 1201750237L, 1201750237L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
