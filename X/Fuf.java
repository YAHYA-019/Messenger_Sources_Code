package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fuf.class */
public final class Fuf implements GOA {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public 5Dh ACf() {
        Preconditions.checkArgument(this.A01);
        if (this.A02 != null) {
            DKC.A1W("FBPayDeleteAuthTicketMutationResponse");
            return this.A02;
        }
        5Dh A0M = DKD.A0M(this.A00, new C01643sd(Do8.class, MZi.class, "FBPayDeleteAuthTicketMutation", null, "input", "fbpay-android", 853077371, 96, 4170711202L, 4170711202L, false, true));
        this.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ GOA Cpi(DgU dgU) {
        DKF.A1N(dgU, this.A00);
        this.A01 = true;
        return this;
    }
}
