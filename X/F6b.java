package X;

import android.content.Context;
import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;

/* loaded from: F6b.class */
public final class F6b {
    public 1BY A00;
    public final C00i A05 = AbH.A0T();
    public final C00i A06 = 1BV.A01((1BY) null, 32811);
    public final C00i A04 = 1BV.A01((1BY) null, 98672);
    public final C00i A07 = 1BQ.A02(16650);
    public final C00i A03 = 1BQ.A02(49257);
    public final C00i A02 = AbH.A0S();
    public final C00i A01 = 1BQ.A01();

    public F6b(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static boolean A00(F6b f6b) {
        2yD A0N;
        long j;
        3oH r0 = ((ZeroSDKServiceProvider) f6b.A07.get()).A00;
        boolean z = false;
        if (r0 != null && !DKE.A0s(f6b.A06).contains("mobile") && !DKE.A1Z(1BK.A0R(f6b.A02), ((1Ky) 1Bn.A0E((Context) null, f6b.A00, 98565)).A01)) {
            C08554nH c08554nH = (C08554nH) f6b.A03.get();
            if (DKE.A1Y(c08554nH.A00)) {
                A0N = 1BK.A0N(c08554nH.A01);
                j = 36316413798983627L;
            } else {
                A0N = 1BK.A0N(c08554nH.A02);
                j = 18302019584468945L;
            }
            A0N.AZk(j);
            z = AnonymousClass001.A1V(EbK.A08.get(r0.getState()));
        }
        return z;
    }
}
