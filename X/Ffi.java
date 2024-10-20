package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffi.class */
public final class Ffi implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("NativeMLModelBatchedQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlZ.class, MXr.class, "NativeMLModelBatchedQuery", (String) null, "ardelivery-android", 593385299, 0, 377611845L, 377611845L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
