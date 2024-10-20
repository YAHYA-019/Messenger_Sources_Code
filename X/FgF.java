package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: FgF.class */
public final class FgF implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(FgF fgF) {
        Preconditions.checkArgument(fgF.A01);
        if (fgF.A02 != null) {
            DKC.A1W("GenAIImagineGenerateMutationResponse");
            return fgF.A02;
        }
        5Dh A0M = DKD.A0M(fgF.A00, new C01643sd(DmI.class, "GenAIImagineGenerateMutation", null, "params", "genai-imagine-android", 639309967, 384, 274134008L, 274134008L, false, true));
        fgF.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
