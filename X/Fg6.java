package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fg6.class */
public final class Fg6 implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public 5Dh ACf() {
        Preconditions.checkArgument(this.A01);
        if (this.A02 != null) {
            DKC.A1W("FBPayCreatePINMutationResponse");
            return this.A02;
        }
        5Dh A0M = DKD.A0M(this.A00, new C01643sd(Do4.class, MZe.class, "FBPayCreatePINMutation", null, "input", "fbpay-android", -1835852397, 96, 1254940969L, 1254940969L, false, true));
        this.A02 = A0M;
        return A0M;
    }
}
