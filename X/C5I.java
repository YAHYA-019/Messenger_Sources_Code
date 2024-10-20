package X;

import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;

/* loaded from: C5I.class */
public final class C5I {
    public 1BY A00;
    public final Bbl A05 = new Bbl(this);
    public final C2kx A04 = new C2kx();
    public final C00i A03 = 1BV.A01((1BY) null, 85273);
    public final C00i A01 = 1BQ.A02(67196);
    public final C00i A02 = 1BV.A01((1BY) null, 16979);

    public C5I(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(View view, PopupWindow popupWindow) {
        if ((view instanceof EditText) && popupWindow.getContentView() != null) {
            view.setImportantForAutofill(2);
        }
        popupWindow.setWidth(view.getWidth());
        view.postDelayed(new D8o(view, popupWindow, this), 750L);
    }
}
