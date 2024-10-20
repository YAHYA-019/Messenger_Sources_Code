package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fg2.class */
public final class Fg2 implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(Fg2 fg2) {
        Preconditions.checkArgument(fg2.A01);
        if (fg2.A02 != null) {
            DKC.A1W("AddMEmuProfilePhotosResponse");
            return fg2.A02;
        }
        5Dh A0M = DKD.A0M(fg2.A00, new C01643sd(Dlh.class, "AddMEmuProfilePhotos", null, null, "genai-imagine-android", 818114789, 0, 793005150L, 793005150L, false, true));
        fg2.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
