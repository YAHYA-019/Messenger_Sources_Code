package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Cft.class */
public final class Cft implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        Preconditions.checkArgument(this.A03);
        if (this.A00 != null) {
            0fH.A0o("MessengerPageRTCEntrypointV2QueryResponse", DKB.A00(7));
            return this.A00;
        }
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "MessengerPageRTCEntrypointV2Query", (String) null, "fbandroid", 2131976462, 0, 426957593L, 426957593L, false, true);
        r0.A01(this.A01);
        C3sa A00 = C3sa.A00(r0);
        this.A00 = A00;
        return A00;
    }
}
