package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fga.class */
public final class Fga implements GOC, GDe {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public 5Dh ACf() {
        Preconditions.checkArgument(this.A01);
        if (this.A02 != null) {
            DKC.A1W("InitLinkPaypalResponse");
            return this.A02;
        }
        5Dh A0M = DKD.A0M(this.A00, new C01643sd(JsP.class, C3429Mcm.class, "InitLinkPaypal", null, "input", "fbpay-android", -1219575772, 288, 3128216670L, 3128216670L, false, true));
        this.A02 = A0M;
        return A0M;
    }
}
