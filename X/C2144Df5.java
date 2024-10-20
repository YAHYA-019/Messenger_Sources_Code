package X;

import android.view.View;

/* renamed from: X.Df5, reason: case insensitive filesystem */
/* loaded from: Df5.class */
public final class C2144Df5 extends FeC {
    public final int A00;

    public C2144Df5(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int B3v(View view, int i) {
        int measuredHeight;
        View view2;
        switch (this.A00) {
            case 0:
                View view3 = view.getParent() instanceof View ? (View) view.getParent() : view;
                return Math.min(view.getMeasuredHeight(), i - ((int) (Math.min(view3.getWidth(), view3.getHeight()) / 1.7777778f)));
            case 1:
                11T.A0F(view, 0);
                if (view.getParent() instanceof View) {
                    Object parent = view.getParent();
                    11T.A0I(parent, "null cannot be cast to non-null type android.view.View");
                    view2 = (View) parent;
                } else {
                    view2 = view;
                }
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (width > height) {
                    width = height;
                }
                int i2 = i - ((int) (width / 1.7777778f));
                measuredHeight = view.getMeasuredHeight();
                if (measuredHeight > i2) {
                    return i2;
                }
                return measuredHeight;
            case 2:
                int measuredHeight2 = view.getMeasuredHeight();
                measuredHeight = view.getMeasuredHeight();
                if (measuredHeight2 >= i) {
                    return Math.min(measuredHeight, i / 2);
                }
                return measuredHeight;
            default:
                measuredHeight = 0;
                return measuredHeight;
        }
    }
}
