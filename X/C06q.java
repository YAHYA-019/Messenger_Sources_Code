package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.06q, reason: invalid class name */
/* loaded from: 06q.class */
public final class C06q {
    public final 06V A00;

    public C06q(06V r302) {
        this.A00 = r302;
    }

    public Bundle A00() {
        06Z r0 = this.A00.A03;
        if (r0.A05 instanceof C05s) {
            06Z.A0J(r0, AnonymousClass001.A0N("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw 0Q8.createAndThrow();
        }
        Bundle A0V = r0.A0V();
        if (A0V.isEmpty()) {
            A0V = null;
        }
        return A0V;
    }

    public void A01() {
        06V r0 = this.A00;
        r0.A03.A1E((Fragment) null, r0, r0);
    }
}
