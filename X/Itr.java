package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: Itr.class */
public final class Itr implements Runnable {
    public static final String __redex_internal_original_name = "FbGrootPlayer$GrootPlayerListenerImpl$maybePreventExcessiveLooping$1";
    public final /* synthetic */ GRS A00;

    public Itr(GRS grs) {
        this.A00 = grs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window;
        ViewGroup viewGroup = this.A00.A03;
        Activity A0I = DKE.A0I(viewGroup != null ? viewGroup.getContext() : null);
        if (A0I == null || A0I.isDestroyed() || A0I.isFinishing() || (window = A0I.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }
}
