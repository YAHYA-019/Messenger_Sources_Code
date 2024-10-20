package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.5fi, reason: invalid class name */
/* loaded from: 5fi.class */
public abstract class C5fi {
    public static final void A00(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        A01(decorView);
    }

    public static final void A01(View view) {
        Context context;
        InputMethodManager inputMethodManager;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) systemService) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void A02(View view) {
        Context context;
        InputMethodManager inputMethodManager;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        context.getResources().getConfiguration();
        Object systemService = context.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) systemService) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }
}
