package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;

/* renamed from: X.81q, reason: invalid class name */
/* loaded from: 81q.class */
public abstract class C81q {
    public static final void A00(View view) {
        11T.A0F(view, 0);
        if (view instanceof LithoView) {
            ((BaseMountingView) view).Bgo();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                11T.A0D(childAt);
                A00(childAt);
            }
        }
    }
}
