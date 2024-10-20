package X;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: Ioi.class */
public final class Ioi implements Runnable {
    public static final String __redex_internal_original_name = "FrontFlashController$3";
    public final /* synthetic */ I3h A00;

    public Ioi(I3h i3h) {
        this.A00 = i3h;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view;
        I3h i3h = this.A00;
        LinearLayout.LayoutParams layoutParams = I3h.A05;
        if (i3h.A02 && (view = i3h.A01) != null && (view.getContext() instanceof Activity)) {
            i3h.A02 = false;
            view.animate().alpha(0.5f).setDuration(200L).setListener(new C2432Gct(view, i3h));
        }
    }
}
