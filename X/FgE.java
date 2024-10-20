package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: FgE.class */
public final class FgE implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(FgE fgE) {
        Preconditions.checkArgument(fgE.A01);
        if (fgE.A02 != null) {
            DKC.A1W("GenAIImagineGenerateFlashMutationResponse");
            return fgE.A02;
        }
        5Dh A0M = DKD.A0M(fgE.A00, new C01643sd(DmH.class, "GenAIImagineGenerateFlashMutation", null, "params", "genai-imagine-android", -1315291381, 384, 2717442276L, 2717442276L, false, true));
        fgE.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
