package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fg5.class */
public final class Fg5 implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(Fg5 fg5) {
        Preconditions.checkArgument(fg5.A01);
        if (fg5.A02 != null) {
            DKC.A1W("FBPayAuthFactorLoggedOutVerificationResponse");
            return fg5.A02;
        }
        5Dh A0M = DKD.A0M(fg5.A00, new C01643sd(Dlq.class, "FBPayAuthFactorLoggedOutVerification", null, "data", "fbpay-android", 416603565, 32, 2817989002L, 2817989002L, false, true));
        fg5.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
