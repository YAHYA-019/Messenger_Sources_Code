package X;

import android.app.ActivityManager;

/* renamed from: X.4mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mv.class */
public abstract class AbstractC08414mv {
    public static C08424mw A00;

    public static C08424mw A00(ActivityManager activityManager) {
        C08424mw c08424mw = A00;
        if (c08424mw == null) {
            c08424mw = new C08424mw(activityManager);
            A00 = c08424mw;
        }
        return c08424mw;
    }
}
