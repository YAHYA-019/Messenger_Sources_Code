package X;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* loaded from: G1p.class */
public final class G1p implements Runnable {
    public static final String __redex_internal_original_name = "AutofillBloksBottomSheet$openOnMainThread$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C00m A01;

    public G1p(Context context, C00m c00m) {
        this.A00 = context;
        this.A01 = c00m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        Activity A00 = FIA.A00(context);
        if (A00 != null && A00.getWindow() != null && inputMethodManager != null) {
            7zR.A12(DKD.A0B(A00), inputMethodManager);
        }
        this.A01.invoke();
    }
}
