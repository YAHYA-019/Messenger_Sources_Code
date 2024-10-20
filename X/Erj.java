package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meta.foa.widgets.AnimatableView;

/* loaded from: Erj.class */
public final class Erj {
    public View A00;

    public final void A00(Window window) {
        window.clearFlags(16);
        View decorView = window.getDecorView();
        11T.A0I(decorView, 7zK.A00(0));
        ViewGroup viewGroup = (ViewGroup) decorView;
        View view = this.A00;
        if (view != null) {
            ((AnimatableView) view).A01();
            viewGroup.removeView(this.A00);
            View childAt = viewGroup.getChildAt(0);
            11T.A0A(childAt);
            childAt.setAlpha(1.0f);
        }
        this.A00 = null;
    }
}
