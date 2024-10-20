package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffs.class */
public final class Ffs implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        Preconditions.checkArgument(this.A03);
        Preconditions.checkArgument(this.A04);
        Preconditions.checkArgument(this.A05);
        if (this.A00 != null) {
            DKC.A1W("FetchBlockV5MetadataQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlD.class, MXV.class, "FetchBlockV5MetadataQuery", (String) null, "ardelivery-android", 686199007, 0, 2701266251L, 2701266251L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
