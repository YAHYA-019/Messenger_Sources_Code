package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffp.class */
public final class Ffp implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A03 = false;
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A03);
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("FetchSingleMaskEffectQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlS.class, MXk.class, "FetchSingleMaskEffectQuery", (String) null, "ardelivery-android", 882327195, 0, 1989869809L, 1989869809L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
