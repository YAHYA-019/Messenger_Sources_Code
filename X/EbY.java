package X;

import android.content.Context;
import android.widget.PopupWindow;

/* loaded from: EbY.class */
public final class EbY {
    public final PopupWindow A00;

    public EbY(Context context) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.A00 = popupWindow;
        popupWindow.setBackgroundDrawable(7zL.A0D(0));
        popupWindow.setContentView(new E8e(context));
        popupWindow.setInputMethodMode(1);
    }
}
