package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.47e, reason: invalid class name */
/* loaded from: 47e.class */
public abstract class C47e {
    public static void A00(View view, View view2) {
        view.getParent().getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (view == view2 && indexOfChild == viewGroup.indexOfChild(view2)) {
            return;
        }
        if (view2.getParent() != null) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        viewGroup.addView(view2, indexOfChild);
        viewGroup.removeView(view);
    }
}
