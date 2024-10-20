package X;

import android.widget.AutoCompleteTextView;

/* loaded from: Lou.class */
public final class Lou implements Runnable {
    public static final String __redex_internal_original_name = "DropdownMenuEndIconDelegate$1$1";
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ K8A A01;

    public Lou(AutoCompleteTextView autoCompleteTextView, K8A k8a) {
        this.A01 = k8a;
        this.A00 = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isPopupShowing = this.A00.isPopupShowing();
        K8T k8t = this.A01.A00;
        K8T.A02(k8t, isPopupShowing);
        k8t.A06 = isPopupShowing;
    }
}
