package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffm.class */
public final class Ffm implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("MessageSearchThreadPaginableListResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(2JX.class, (Class) null, "MessageSearchThreadPaginableList", (String) null, "fbandroid", 353854633, 0, 1985576772L, 1985576772L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
