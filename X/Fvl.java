package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.base.Supplier;

/* loaded from: Fvl.class */
public final class Fvl implements Supplier {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fvl(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == 0) {
            return ((1HM) this.A02).A00();
        }
        Object A05 = 1Lm.A05((Context) this.A01, (FbUserSession) this.A02, 115282);
        11T.A0I(A05, "null cannot be cast to non-null type com.facebook.rtc.fbwebrtc.delegates.DelegateInterface");
        return A05;
    }
}
