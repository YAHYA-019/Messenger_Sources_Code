package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fff.class */
public final class Fff implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("GenAIImagineHasMEmuProfileResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DmK.class, (Class) null, "GenAIImagineHasMEmuProfile", (String) null, "genai-imagine-android", -706630709, 0, 1509650729L, 1509650729L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
