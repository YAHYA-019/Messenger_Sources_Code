package X;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.07e, reason: invalid class name */
/* loaded from: 07e.class */
public abstract class C07e {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.07f] */
    public static final C07f A00(final C00m c00m) {
        return new OnBackInvokedCallback() { // from class: X.07f
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                C07e.A03(C00m.this);
            }
        };
    }

    public static final void A01(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static final void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static /* synthetic */ void A03(C00m c00m) {
        11T.A0F(c00m, 0);
        c00m.invoke();
    }
}
