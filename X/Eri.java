package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: Eri.class */
public final class Eri {
    public final /* synthetic */ FIU A00;

    public Eri(FIU fiu) {
        this.A00 = fiu;
    }

    public void A00() {
        FIU fiu = this.A00;
        if (fiu.A0Z) {
            if (FIU.A04()) {
                ViewGroup viewGroup = (ViewGroup) fiu.A0J.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(fiu.A0J);
                }
            } else {
                try {
                    fiu.A0H.removeViewImmediate(fiu.A0J);
                } catch (Exception unused) {
                }
            }
            fiu.A0Z = false;
            WeakReference weakReference = fiu.A0P;
            View A0G = weakReference == null ? null : DKC.A0G(weakReference);
            ViewTreeObserver viewTreeObserver = null;
            if (A0G != null) {
                A0G.removeCallbacks(fiu.A0c);
                viewTreeObserver = A0G.getViewTreeObserver();
                if (fiu.A0Q) {
                    C2cd.A02(A0G);
                }
            }
            FIU.A02(viewTreeObserver, fiu);
            GEc gEc = fiu.A0L;
            if (gEc != null) {
                gEc.Bu6(fiu);
            }
        }
    }
}
