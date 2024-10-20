package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: Llz.class */
public final class Llz implements Runnable {
    public static final String __redex_internal_original_name = "ViewUtils$1";
    public final /* synthetic */ View A00;

    public Llz(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = this.A00;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
