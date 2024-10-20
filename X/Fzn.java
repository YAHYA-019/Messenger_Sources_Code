package X;

import android.view.ViewManager;
import java.lang.ref.WeakReference;

/* loaded from: Fzn.class */
public final class Fzn implements Runnable {
    public static final String __redex_internal_original_name = "SadDataOverlayController$disposeOverlay$1";
    public final /* synthetic */ F9K A00;

    public Fzn(F9K f9k) {
        this.A00 = f9k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F9K f9k = this.A00;
        WeakReference weakReference = f9k.A00;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ViewManager viewManager = (ViewManager) 1Br.A0B(f9k.A04);
        WeakReference weakReference2 = f9k.A00;
        viewManager.removeView(weakReference2 != null ? DKC.A0G(weakReference2) : null);
        f9k.A00 = null;
    }
}
