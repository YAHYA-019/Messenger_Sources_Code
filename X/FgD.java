package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: FgD.class */
public final class FgD implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(FgD fgD) {
        Preconditions.checkArgument(fgD.A01);
        if (fgD.A02 != null) {
            DKC.A1W("GenAIImagineEditMutationResponse");
            return fgD.A02;
        }
        5Dh A0M = DKD.A0M(fgD.A00, new C01643sd(DmG.class, "GenAIImagineEditMutation", null, "params", "genai-imagine-android", 625754525, 384, 3367155523L, 3367155523L, false, true));
        fgD.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
