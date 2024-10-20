package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: GB0.class */
public final class GB0 extends C00q implements Function1 {
    public static final GB0 A00 = new GB0();

    public GB0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        View findViewWithTag;
        F5R f5r = (F5R) obj;
        F5R.A00(f5r);
        Object parent = f5r.A00.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null && (findViewWithTag = view.findViewWithTag("fds_bottom_add_on")) != null) {
            f5r.A02.A02.setTraversalAfter(findViewWithTag);
        }
        return 04S.A00;
    }
}
