package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* loaded from: Kmo.class */
public final class Kmo {
    public final JnL A00(Intent intent, JgX jgX, JgX jgX2) {
        LUW luw = new LUW(intent, jgX, jgX2);
        L36 l36 = L36.A04;
        String valueOf = String.valueOf(l36 != null ? l36.A01.A02 : null);
        FragmentActivity activity = jgX.getActivity();
        if (activity == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        luw.A00 = new KlS(intent, luw.A02, new LLQ(luw, 1), activity, valueOf);
        JnL.A00 = luw;
        return luw;
    }
}
