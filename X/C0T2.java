package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.0T2, reason: invalid class name */
/* loaded from: 0T2.class */
public final class C0T2 {
    public final C0T0 A00;

    public C0T2(View view, Window window) {
        0SN r0 = new 0SN(view);
        this.A00 = Build.VERSION.SDK_INT >= 30 ? new 0xO(window, r0, this) : new 0xP(window, r0);
    }

    public C0T2(WindowInsetsController windowInsetsController) {
        this.A00 = new 0xO(windowInsetsController, new 0SN(windowInsetsController), this);
    }

    public static C0T2 A00(WindowInsetsController windowInsetsController) {
        return new C0T2(windowInsetsController);
    }
}
