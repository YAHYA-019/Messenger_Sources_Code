package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Cfq.class */
public final class Cfq implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            0fH.A0o("MessengerAdDetailQueryResponse", DKB.A00(7));
            return this.A00;
        }
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "MessengerAdDetailQuery", (String) null, "fbandroid", -1335368093, 0, 1675659911L, 1675659911L, false, true);
        r0.A01(this.A01);
        C3sa A00 = C3sa.A00(r0);
        this.A00 = A00;
        return A00;
    }
}
