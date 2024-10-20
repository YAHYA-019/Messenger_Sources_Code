package X;

import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: D8o.class */
public final class D8o implements Runnable {
    public static final String __redex_internal_original_name = "PymbUiHelper$2";
    public final /* synthetic */ View A00;
    public final /* synthetic */ PopupWindow A01;
    public final /* synthetic */ C5I A02;

    public D8o(View view, PopupWindow popupWindow, C5I c5i) {
        this.A02 = c5i;
        this.A01 = popupWindow;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A01.showAsDropDown(this.A00);
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
