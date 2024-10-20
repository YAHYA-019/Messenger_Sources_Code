package com.google.android.material.appbar;

import X.08D;
import X.08J;
import X.5WH;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

/* loaded from: HeaderScrollingViewBehavior.class */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    public int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public abstract View findFirstDependency(List list);

    public final int getOverlapPixelsForOffset(View view) {
        int i = 0;
        if (this.overlayTop != 0) {
            float overlapRatioForOffset = getOverlapRatioForOffset(view);
            int i2 = this.overlayTop;
            int i3 = (int) (overlapRatioForOffset * i2);
            if (i3 >= 0) {
                i = i3;
                if (i3 > i2) {
                    return i2;
                }
            }
        }
        return i;
    }

    public abstract float getOverlapRatioForOffset(View view);

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public abstract int getScrollRange(View view);

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout findFirstDependency = ((AppBarLayout.ScrollingViewBehavior) this).findFirstDependency(coordinatorLayout.A0A(view));
        if (findFirstDependency != null) {
            5WH layoutParams = view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            08D r0 = coordinatorLayout.A02;
            if (r0 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                int i3 = rect.left;
                08J r02 = r0.A00;
                rect.left = i3 + r02.A0B().A01;
                rect.right -= r02.A0B().A02;
            }
            Rect rect2 = this.tempRect2;
            int i4 = layoutParams.A02;
            if (i4 == 0) {
                i4 = 8388659;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            i2 = rect2.top - findFirstDependency.getBottom();
        } else {
            coordinatorLayout.A0C(view, i);
            i2 = 0;
        }
        this.verticalLayoutGap = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        08D r0;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        AppBarLayout findFirstDependency = ((AppBarLayout.ScrollingViewBehavior) this).findFirstDependency(coordinatorLayout.A0A(view));
        if (findFirstDependency == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (findFirstDependency.getFitsSystemWindows() && (r0 = coordinatorLayout.A02) != null) {
            size += r0.A03() + r0.A02();
        }
        int scrollRange = (size + getScrollRange(findFirstDependency)) - findFirstDependency.getMeasuredHeight();
        int i6 = (-1) << (-1);
        if (i5 == -1) {
            i6 = 1073741824;
        }
        coordinatorLayout.A0D(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i6), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }
}
