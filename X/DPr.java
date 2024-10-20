package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: DPr.class */
public final class DPr extends FrameLayout {
    public ViewGroup A00;
    public DQ2 A01;
    public EP2 A02;

    public final DQ2 A00() {
        DQ2 dq2 = this.A01;
        if (dq2 != null) {
            return dq2;
        }
        11T.A0L("contentPager");
        throw 0Q8.createAndThrow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A00().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int A00 = DKD.A00(View.MeasureSpec.getSize(getMeasuredWidth()));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), (-1) << (-1));
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.measure(A00, makeMeasureSpec);
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                int measuredWidth = viewGroup2.getMeasuredWidth();
                ViewGroup viewGroup3 = this.A00;
                if (viewGroup3 != null) {
                    viewGroup2.layout(0, 0, measuredWidth, viewGroup3.getMeasuredHeight());
                    return;
                }
            }
        }
        11T.A0L("headerContainer");
        throw 0Q8.createAndThrow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A02.wrapsContent) {
            i3 = (-1) << (-1);
        }
        A00().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        setMeasuredDimension(A00().getMeasuredWidth(), A00().getMeasuredHeight());
    }
}
