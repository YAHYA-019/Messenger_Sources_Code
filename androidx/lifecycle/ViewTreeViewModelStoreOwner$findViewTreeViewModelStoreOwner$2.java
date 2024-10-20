package androidx.lifecycle;

import X.11T;
import X.C00q;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.class */
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends C00q implements Function1 {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        Object tag = view.getTag(2131368403);
        if (tag instanceof ViewModelStoreOwner) {
            return tag;
        }
        return null;
    }
}
