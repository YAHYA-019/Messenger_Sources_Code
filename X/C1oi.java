package X;

import android.app.Activity;

/* renamed from: X.1oi, reason: invalid class name */
/* loaded from: 1oi.class */
public abstract class C1oi {
    public static void A00(Activity activity, int i) {
        A01(activity, new 3gC(activity, i));
    }

    public static void A01(Activity activity, Runnable runnable) {
        if (activity != null) {
            try {
                runnable.run();
            } catch (IllegalStateException e) {
                if (!"Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    throw e;
                }
                0fH.A12("FixedOrientationCompat", "%s hit fixed orientation exception", e, new Object[]{C01e.A00(activity.getClass())});
            }
        }
    }
}
