package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: X.1je, reason: invalid class name */
/* loaded from: 1je.class */
public abstract class C1je {
    public static final Rect A00(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        11T.A0A(bounds);
        return bounds;
    }

    public static final 08D A01(Context context) {
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        11T.A0A(windowInsets);
        return 08D.A01((View) null, windowInsets);
    }

    public static final C1k1 A02(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        08D A01 = 08D.A01((View) null, windowManager.getCurrentWindowMetrics().getWindowInsets());
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        11T.A0A(bounds);
        11T.A0F(A01, 2);
        return new C1k1(A01, new C1k0(bounds));
    }
}
