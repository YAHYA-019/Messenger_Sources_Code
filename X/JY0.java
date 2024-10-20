package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: JY0.class */
public class JY0 extends ViewGroup {
    public boolean A00;

    public final void A00(View view, MLE mle, long j) {
        super.drawChild(LOM.A00(mle, mle), view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = getChildAt(i2);
            11T.A0I(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((JXv) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
