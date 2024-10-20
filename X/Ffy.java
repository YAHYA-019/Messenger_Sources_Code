package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Ffy.class */
public final class Ffy implements GEs, GDf {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        if (this.A00 != null) {
            DKC.A1W("FBPayAuthTicketQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(MTN.class, C3441Mcy.class, "FBPayAuthTicketQuery", (String) null, "fbpay-android", 906546330, 0, 1432847858L, 1432847858L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
