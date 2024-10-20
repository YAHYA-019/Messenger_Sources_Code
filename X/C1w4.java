package X;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.1w4, reason: invalid class name */
/* loaded from: 1w4.class */
public final class C1w4 {
    public final C00i A03 = new 1BQ(17093);
    public final C00i A02 = new 1BQ(33013);
    public C00813op A01 = null;
    public ViewTreeObserver.OnDrawListener A00 = null;

    public static void A00(Activity activity, C1w4 c1w4) {
        C00813op c00813op;
        ViewManager viewManager = (ViewManager) activity.getSystemService("window");
        if (viewManager != null && (c00813op = c1w4.A01) != null) {
            viewManager.removeView(c00813op);
        }
        c1w4.A01 = null;
        if (c1w4.A00 != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.getDecorView().getViewTreeObserver().removeOnDrawListener(c1w4.A00);
            }
            c1w4.A00 = null;
        }
    }
}
