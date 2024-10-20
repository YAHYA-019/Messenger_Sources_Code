package X;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: Kuy.class */
public abstract class Kuy {
    public static void A00(Rect rect, PopupWindow popupWindow) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void A01(PopupWindow popupWindow) {
        popupWindow.setIsClippedToScreen(true);
    }
}
