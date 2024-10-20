package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffj.class */
public final class Ffj implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("ScriptingPackagesLatestVersionQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dlb.class, MXt.class, "ScriptingPackagesLatestVersionQuery", (String) null, "ardelivery-android", 444851089, 0, 2682018283L, 2682018283L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
