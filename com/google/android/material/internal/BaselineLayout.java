package com.google.android.material.internal;

import X.JQx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: BaselineLayout.class */
public class BaselineLayout extends ViewGroup {
    public int A00;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.A00 = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A00 = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int A0I = JQx.A0I(this, i3 - i) - paddingLeft;
        int paddingTop = getPaddingTop();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= childCount) {
                return;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((A0I - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.A00 == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.A00 + paddingTop) - childAt.getBaseline();
                childAt.layout(i7, baseline, measuredWidth + i7, measuredHeight + baseline);
            }
            i5 = i6 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i6 = Math.max(i6, baseline);
                    i7 = JQx.A0C(childAt.getMeasuredHeight(), baseline, i7);
                }
                i4 = Math.max(i4, childAt.getMeasuredWidth());
                i3 = Math.max(i3, childAt.getMeasuredHeight());
                i5 = JQx.A0G(childAt, i5);
            }
        }
        if (i6 != -1) {
            i3 = JQx.A0B(Math.max(i7, getPaddingBottom()), i6, i3);
            this.A00 = i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4, getSuggestedMinimumWidth()), i, i5), View.resolveSizeAndState(Math.max(i3, getSuggestedMinimumHeight()), i2, i5 << 16));
    }
}
