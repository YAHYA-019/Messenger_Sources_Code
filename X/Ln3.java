package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: Ln3.class */
public final class Ln3 implements Runnable {
    public static final String __redex_internal_original_name = "OsKeyboardController$showKeyboardWithDelay$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;

    public Ln3(Context context, View view) {
        this.A01 = view;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        Context context = this.A00;
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        11T.A0I(systemService, 4YT.A00(42));
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }
}
