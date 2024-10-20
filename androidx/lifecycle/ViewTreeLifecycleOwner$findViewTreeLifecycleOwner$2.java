package androidx.lifecycle;

import X.11T;
import X.C00q;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.class */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends C00q implements Function1 {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        Object tag = view.getTag(2131368400);
        if (tag instanceof LifecycleOwner) {
            return tag;
        }
        return null;
    }
}
