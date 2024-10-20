package androidx.lifecycle;

import X.11T;
import android.view.View;

/* loaded from: ViewTreeViewModelStoreOwner.class */
public abstract class ViewTreeViewModelStoreOwner {
    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        11T.A0F(view, 0);
        view.setTag(2131368403, viewModelStoreOwner);
    }
}
