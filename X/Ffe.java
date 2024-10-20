package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffe.class */
public final class Ffe implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("FBPayAddressQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dom.class, McE.class, "FBPayAddressQuery", (String) null, "fbpay-android", 1962328744, 0, 1424838663L, 1424838663L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
