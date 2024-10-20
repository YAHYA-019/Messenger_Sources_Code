package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;

/* loaded from: Fg9.class */
public final class Fg9 implements GOC {
    public GraphQlQueryParamSet A00 = 7zL.A0M();
    public boolean A01 = false;
    public 5Dh A02;

    public static 5Dh A00(Fg9 fg9) {
        Preconditions.checkArgument(fg9.A01);
        if (fg9.A02 != null) {
            DKC.A1W("FBPayGetLoggedOutServerEncryptionKeyResponse");
            return fg9.A02;
        }
        5Dh A0M = DKD.A0M(fg9.A00, new C01643sd(Dm1.class, "FBPayGetLoggedOutServerEncryptionKey", null, "data", "fbpay-android", -945516514, 32, 3208907982L, 3208907982L, false, true));
        fg9.A02 = A0M;
        return A0M;
    }

    public /* bridge */ /* synthetic */ C3s4 ACe() {
        return A00(this);
    }

    public /* bridge */ /* synthetic */ C3s5 ACf() {
        return A00(this);
    }
}
