package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffx.class */
public final class Ffx implements GEs, C11g {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("FetchMobileFBSignedURLPublicKeysQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dn8.class, (Class) null, "FetchMobileFBSignedURLPublicKeysQuery", (String) null, "urisigner-android", -695574343, 0, 3336599652L, 3336599652L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
