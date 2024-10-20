package com.facebook.widget;

import X.C1oo;
import X.C47d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Preconditions;

/* loaded from: AdvancedVerticalLinearLayout.class */
public class AdvancedVerticalLinearLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public AdvancedVerticalLinearLayout(Context context) {
        super(context);
        this.A03 = false;
    }

    public AdvancedVerticalLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdvancedVerticalLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A01);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C47d;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, X.47d, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A02);
        layoutParams.A02 = obtainStyledAttributes.getBoolean(1, false);
        layoutParams.A00 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        layoutParams.A01 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = this.A00 & ActionId.MISSED_EVENT;
        int paddingTop = getPaddingTop();
        if (i5 == 16) {
            paddingTop += ((((i4 - i2) - this.A02) - getPaddingTop()) - getPaddingBottom()) / 2;
        }
        int paddingLeft = getPaddingLeft();
        int right = ((getRight() - getLeft()) - paddingLeft) - getPaddingRight();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= childCount) {
                return;
            }
            View childAt = getChildAt(i7);
            if (childAt != null && childAt.getVisibility() != 8) {
                C47d c47d = (C47d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((((right - measuredWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) c47d).leftMargin) - ((ViewGroup.MarginLayoutParams) c47d).rightMargin;
                if (this.A03 && c47d.A02) {
                    z2 = true;
                    measuredHeight = 0;
                } else {
                    z2 = false;
                    paddingTop += ((ViewGroup.MarginLayoutParams) c47d).topMargin - c47d.A00;
                    if (c47d.A01 && paddingTop + measuredHeight + ((ViewGroup.MarginLayoutParams) c47d).bottomMargin > i4) {
                        paddingTop = i4 - (((ViewGroup.MarginLayoutParams) c47d).bottomMargin + measuredHeight);
                    }
                }
                childAt.layout(i8, paddingTop, measuredWidth + i8, paddingTop + measuredHeight);
                if (!z2) {
                    paddingTop += measuredHeight + ((ViewGroup.MarginLayoutParams) c47d).bottomMargin;
                }
            }
            i6 = i7 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int measuredHeight;
        int childCount = getChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Preconditions.checkState(mode == 1073741824, "Expected widthMeasureSpec to have a mode of EXACTLY but got %s", View.MeasureSpec.toString(i));
        Preconditions.checkState(mode2 == 1073741824, "Expected heightMeasureSpec to have a mode of EXACTLY but got %s", View.MeasureSpec.toString(i2));
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        this.A03 = size <= this.A01;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                C47d c47d = (C47d) childAt.getLayoutParams();
                if (this.A03 && c47d.A02) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
                } else {
                    f += ((LinearLayout.LayoutParams) c47d).weight;
                    if (((ViewGroup.LayoutParams) c47d).height != 0 || ((LinearLayout.LayoutParams) c47d).weight <= 0.0f) {
                        measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? i3 - c47d.A00 : 0);
                        measuredHeight = (((childAt.getMeasuredHeight() + i3) + ((ViewGroup.MarginLayoutParams) c47d).topMargin) + ((ViewGroup.MarginLayoutParams) c47d).bottomMargin) - c47d.A00;
                    } else {
                        measuredHeight = ((ViewGroup.MarginLayoutParams) c47d).topMargin + i3 + ((ViewGroup.MarginLayoutParams) c47d).bottomMargin;
                    }
                    i3 = Math.max(i3, measuredHeight);
                }
            }
        }
        this.A02 = i3;
        int paddingTop = ((size - i3) - getPaddingTop()) - getPaddingBottom();
        if (paddingTop != 0 && f > 0.0f) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getVisibility() != 8) {
                    C47d c47d2 = (C47d) childAt2.getLayoutParams();
                    if (!this.A03 || !c47d2.A02) {
                        float f2 = ((LinearLayout.LayoutParams) c47d2).weight;
                        if (f2 > 0.0f) {
                            int i7 = (int) ((paddingTop * f2) / f);
                            f -= f2;
                            paddingTop -= i7;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c47d2).leftMargin + ((ViewGroup.MarginLayoutParams) c47d2).rightMargin, ((ViewGroup.LayoutParams) c47d2).width);
                            if (((ViewGroup.LayoutParams) c47d2).height != 0) {
                                int measuredHeight2 = childAt2.getMeasuredHeight() + i7;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            } else {
                                if (i7 <= 0) {
                                    i7 = 0;
                                }
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                            }
                            childAt2.measure(childMeasureSpec, makeMeasureSpec);
                            i5 += childAt2.getMeasuredHeight();
                        }
                    }
                }
            }
            this.A02 = i5;
        }
        setMeasuredDimension(size2, size);
    }
}
