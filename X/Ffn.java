package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffn.class */
public final class Ffn implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        Preconditions.checkArgument(this.A03);
        if (this.A00 != null) {
            DKC.A1W("AmazonBwpAccessTokenResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dl5.class, (Class) null, "AmazonBwpAccessToken", (String) null, "fbpay-android", 1970615627, 0, 3918756000L, 3918756000L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
