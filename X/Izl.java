package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

/* loaded from: Izl.class */
public final class Izl implements Runnable {
    public static final String __redex_internal_original_name = "FrontFlashController$2";
    public final /* synthetic */ long A00;
    public final /* synthetic */ I3h A01;
    public final /* synthetic */ HdA A02;

    public Izl(I3h i3h, HdA hdA, long j) {
        this.A01 = i3h;
        this.A00 = j;
        this.A02 = hdA;
    }

    @Override // java.lang.Runnable
    public void run() {
        Window window;
        I3h i3h = this.A01;
        long j = this.A00;
        HdA hdA = this.A02;
        LinearLayout.LayoutParams layoutParams = I3h.A05;
        View view = i3h.A01;
        if (view != null) {
            Context context = view.getContext();
            if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
                return;
            }
            i3h.A02 = true;
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
            window.addContentView(view, I3h.A05);
            view.setAlpha(0.5f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(200L).setListener(new C2431Gcs(i3h, hdA));
            i3h.A03.A00.postDelayed(i3h.A04, j);
        }
    }
}
