package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffv.class */
public final class Ffv implements GEs, GCU {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("ArEffectsFlmCapabilityQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlI.class, MXa.class, "ArEffectsFlmCapabilityQuery", (String) null, "ardelivery-android", 1850377239, 0, 2696014042L, 2696014042L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
