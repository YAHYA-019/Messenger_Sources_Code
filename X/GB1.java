package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: GB1.class */
public final class GB1 extends C00q implements Function1 {
    public static final GB1 A00 = new GB1();

    public GB1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        F5R f5r = (F5R) obj;
        F5R.A00(f5r);
        if (f5r.A00.getParent() != null && (f5r.A00.getParent() instanceof View)) {
            Object parent = f5r.A00.getParent();
            11T.A0I(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            if (view2 != null) {
                view = view2.findViewWithTag("fds_headline_text_component");
                f5r.A02.A02.setTraversalAfter(view);
                return null;
            }
        }
        view = null;
        f5r.A02.A02.setTraversalAfter(view);
        return null;
    }
}
