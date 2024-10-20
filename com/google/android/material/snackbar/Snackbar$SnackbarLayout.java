package com.google.android.material.snackbar;

import X.JQx;
import X.JQy;
import X.JYg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: Snackbar$SnackbarLayout.class */
public final class Snackbar$SnackbarLayout extends JYg {
    public Snackbar$SnackbarLayout(Context context) {
        super(context, (AttributeSet) null);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.widget.FrameLayout*/.onMeasure(i, i2);
        int childCount = getChildCount();
        int A09 = JQy.A09(this, getMeasuredWidth());
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= childCount) {
                return;
            }
            View childAt = getChildAt(i4);
            if (childAt.getLayoutParams().width == -1) {
                JQx.A1A(childAt, childAt.getMeasuredHeight(), 1073741824, View.MeasureSpec.makeMeasureSpec(A09, 1073741824));
            }
            i3 = i4 + 1;
        }
    }
}
