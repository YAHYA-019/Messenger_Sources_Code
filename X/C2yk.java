package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.2yk, reason: invalid class name */
/* loaded from: 2yk.class */
public abstract class C2yk {
    public static final void A00(Window window, int i) {
        View findViewById;
        11T.A0F(window, 0);
        1tS.A00(window, i);
        2yD A0L = 1BK.A0L(16387);
        Context context = window.getContext();
        11T.A0A(context);
        if (1tR.A00(context) && A0L.AZk(2378182280097563034L) && (findViewById = window.findViewById(2131367824)) != null) {
            findViewById.setBackgroundColor(i);
        }
    }

    public static final void A01(Window window, boolean z) {
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            int i = 16;
            if (z) {
                i = 0;
            }
            windowInsetsController.setSystemBarsAppearance(i, 16);
        }
    }
}
