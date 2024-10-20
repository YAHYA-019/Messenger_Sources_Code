package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: IKv.class */
public final class IKv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IKv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float f;
        switch (this.A00) {
            case 0:
                View view = (View) this.A02;
                if (view.getHeight() > 0) {
                    int height = view.getHeight() - 4YU.A0C((Context) this.A01).getDimensionPixelSize(2131165205);
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = height;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Gr2 gr2 = (Gr2) ((C2400Gc2) this.A02).A0J.getValue();
                C00i c00i = gr2.A01;
                if (GOp.A0q(c00i).A0B != null) {
                    JOY.A00(c00i, I7M.A00(gr2.A07)).AGy("call_ui_shown");
                }
                ((View) this.A01).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            default:
                View view2 = (View) this.A02;
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(IKx.A00);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                Object parent = view2.getParent();
                GOn.A1X(parent);
                float A02 = DKC.A02((View) parent);
                switch (AnonymousClass001.A03(this.A01)) {
                    case 1:
                        f = 0.53f;
                        break;
                    case 2:
                        f = 0.75f;
                        break;
                    case 3:
                        f = 0.85f;
                        break;
                    case 4:
                        f = 0.9f;
                        break;
                    default:
                        f = 0.45f;
                        break;
                }
                layoutParams2.width = (int) (A02 * f);
                view2.setLayoutParams(layoutParams2);
                return;
        }
    }
}
