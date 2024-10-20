package X;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.0xc, reason: invalid class name */
/* loaded from: 0xc.class */
public class C0xc extends 0SM {
    public final View A00;

    public C0xc(View view) {
        this.A00 = view;
    }

    public void A01() {
        View view = this.A00;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void A02() {
        View view = this.A00;
        if (view != null) {
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
                if (view == null) {
                    view = view.getRootView().findViewById(R.id.content);
                    if (view == null) {
                        return;
                    }
                }
            }
            if (view.hasWindowFocus()) {
                view.post(new 0SK(view));
            }
        }
    }
}
