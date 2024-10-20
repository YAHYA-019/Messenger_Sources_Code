package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ffb.class */
public final class Ffb implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        if (this.A00 != null) {
            DKC.A1W("FetchMobileFBSignedURLPublicKeysListQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(Dn6.class, (Class) null, "FetchMobileFBSignedURLPublicKeysListQuery", (String) null, "urisigner-android", 450327125, 0, 2713717604L, 2713717604L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
