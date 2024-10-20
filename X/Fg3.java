package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fg3.class */
public final class Fg3 implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(Fg3 fg3) {
        Preconditions.checkArgument(fg3.A01);
        if (fg3.A02 != null) {
            DKC.A1W("CreateMEmuProfileResponse");
            return fg3.A02;
        }
        5Dh A0M = DKD.A0M(fg3.A00, new C01643sd(Dll.class, "CreateMEmuProfile", null, null, "genai-imagine-android", 1225979805, 0, 1941315421L, 1941315421L, false, true));
        fg3.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
