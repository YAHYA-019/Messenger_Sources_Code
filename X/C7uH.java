package X;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.7uH, reason: invalid class name */
/* loaded from: 7uH.class */
public abstract class C7uH {
    public static OnBackInvokedDispatcher A00(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static LLL A01(6QN r301, Object obj) {
        OnBackInvokedCallback lll = new LLL(r301);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DexStore.MS_IN_NS, lll);
        return lll;
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
