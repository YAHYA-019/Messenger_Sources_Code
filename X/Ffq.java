package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffq.class */
public final class Ffq implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A03 = false;
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A03);
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("MetaAIWriteWithAiSuggestedPromptsQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dmc.class, (Class) null, "MetaAIWriteWithAiSuggestedPromptsQuery", (String) null, "genai-wwai-android", -2018857217, 0, 636100494L, 636100494L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
