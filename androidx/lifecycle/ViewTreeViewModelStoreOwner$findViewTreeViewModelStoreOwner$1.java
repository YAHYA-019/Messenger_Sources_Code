package androidx.lifecycle;

import X.11T;
import X.C00q;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* loaded from: ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.class */
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 extends C00q implements Function1 {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1();

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
