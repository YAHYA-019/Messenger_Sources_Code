package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Fft.class */
public final class Fft implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    public /* bridge */ /* synthetic */ Fft A00(ImmutableList immutableList) {
        this.A01.A06("capability_types", immutableList);
        this.A02 = AnonymousClass001.A1T(immutableList);
        return this;
    }

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("CapabilityLatestVersionQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(DlK.class, MXc.class, "CapabilityLatestVersionQuery", (String) null, "ardelivery-android", 2104207096, 0, 2125899053L, 2125899053L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
