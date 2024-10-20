package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffw.class */
public final class Ffw implements GEs, GCV {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("NMLMLCapabilityLatestAimVersionQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlV.class, MXn.class, "NMLMLCapabilityLatestAimVersionQuery", (String) null, "ardelivery-android", 340073135, 0, 3892729145L, 3892729145L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
