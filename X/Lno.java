package X;

import android.widget.PopupWindow;

/* loaded from: Lno.class */
public final class Lno implements Runnable {
    public static final String __redex_internal_original_name = "ClickableToastCoordinator$1";
    public final /* synthetic */ KuH A00;
    public final /* synthetic */ Kj9 A01;

    public Lno(KuH kuH, Kj9 kj9) {
        this.A01 = kj9;
        this.A00 = kuH;
    }

    @Override // java.lang.Runnable
    public void run() {
        KuH kuH = this.A00;
        PopupWindow popupWindow = kuH.A05;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (IllegalArgumentException e) {
                0fH.A0r("ClickableToast", "Exception while trying to dismiss the popup window.", e);
            }
        }
        kuH.A04.getViewTreeObserver().removeOnGlobalLayoutListener(kuH.A06);
        kuH.A05 = null;
    }
}
