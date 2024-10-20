package X;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.54t, reason: invalid class name */
/* loaded from: 54t.class */
public final class C54t {
    public final void A00(Activity activity) {
        if (C54s.A00 || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        try {
            Object systemService = activity.getSystemService("input_method");
            11T.A0I(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            Field[] declaredFields = inputMethodManager.getClass().getDeclaredFields();
            11T.A0A(declaredFields);
            for (Field field : declaredFields) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManager);
                if (obj instanceof View) {
                    View view = (View) obj;
                    if (view != null) {
                        Object context = view.getContext();
                        if (context != null) {
                            Object obj2 = context;
                            while (true) {
                                if (obj2 instanceof Application) {
                                    break;
                                }
                                if (!(obj2 instanceof Activity)) {
                                    if (!(obj2 instanceof ContextWrapper)) {
                                        break;
                                    }
                                    obj2 = ((ContextWrapper) obj2).getBaseContext();
                                    if (obj2 == context) {
                                        break;
                                    } else {
                                        11T.A0D(obj2);
                                    }
                                } else if (((Activity) obj2) == activity) {
                                    field.set(inputMethodManager, null);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C54s.A00 = true;
            0fH.A0p("AndroidFrameworkLeakFixes", "applyInputMethodManagerViewLeakFix Failed to apply fix", th);
        }
    }
}
