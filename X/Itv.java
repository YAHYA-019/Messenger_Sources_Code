package X;

import android.view.View;
import android.view.ViewParent;

/* loaded from: Itv.class */
public final class Itv implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$checkParentViewVisibilityRunnable$1";
    public final /* synthetic */ IhE A00;

    public Itv(IhE ihE) {
        this.A00 = ihE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IhE ihE = this.A00;
        View view = ihE.A05;
        if (view == null || ihE.A0C.AoF() != null) {
            return;
        }
        ViewParent viewParent = null;
        ViewParent parent = view.getParent();
        int i = ihE.A0P.depthTocheckSurfaceInvisibleParent;
        while (true) {
            int i2 = i;
            if (parent == null || i2 <= 0 || !(parent instanceof View)) {
                break;
            }
            View view2 = (View) parent;
            if (view2.getVisibility() != 0) {
                view2.setVisibility(0);
                C51f.A02("GrootPlayer", AnonymousClass001.A0Z(parent, "Fix parent view visibility ", AnonymousClass001.A0k()), new Object[0]);
                viewParent = parent;
            }
            parent = parent.getParent();
            i = i2 - 1;
        }
        if (viewParent != null) {
            viewParent.toString();
        }
    }
}
