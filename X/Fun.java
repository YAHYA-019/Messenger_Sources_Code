package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fun.class */
public final class Fun implements GOB {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public boolean A02 = false;
    public 5Dh A03;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public 5Dh ACf() {
        Preconditions.checkArgument(this.A01);
        Preconditions.checkArgument(this.A02);
        if (this.A03 != null) {
            DKC.A1W("ComponentDataMutationResponse");
            return this.A03;
        }
        5Dh A0M = DKD.A0M(this.A00, new C01643sd(DoO.class, MaS.class, "ComponentDataMutation", null, "input", "fbpay-android", 1381678968, 384, 3060157276L, 3060157276L, false, true));
        this.A03 = A0M;
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ GGq Cpj(DgU dgU) {
        DKF.A1N(dgU, this.A00);
        this.A01 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ GOB CsQ(String str) {
        this.A00.A05("payment_product_id", str);
        this.A02 = true;
        return this;
    }
}
