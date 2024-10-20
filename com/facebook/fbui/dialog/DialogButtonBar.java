package com.facebook.fbui.dialog;

import X.5B0;
import X.DKD;
import X.DKE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: DialogButtonBar.class */
public class DialogButtonBar extends LinearLayout {
    public static final int[] A03 = {2130968658};
    public boolean A00;
    public 5B0 A01;
    public Boolean A02;

    public DialogButtonBar(Context context) {
        super(context);
        this.A00 = false;
        this.A02 = null;
        this.A01 = DKD.A0L();
    }

    public DialogButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = false;
        this.A02 = null;
        this.A01 = DKD.A0L();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A03);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A02 = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof TextView) {
            ((TextView) view).setTransformationMethod(this.A01);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        setOrientation(0);
        super.onMeasure(i, i2);
        Boolean bool = this.A02;
        if (!(bool != null ? bool.booleanValue() : this.A00)) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    i3++;
                }
            }
            float measuredWidth2 = getMeasuredWidth() / i3;
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getMeasuredWidth() <= measuredWidth2) {
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        float measuredWidth3 = getMeasuredWidth();
        int A07 = DKE.A07(this);
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= childCount2) {
                return;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    int A032 = DKD.A03(textView);
                    int i8 = 0;
                    for (int i9 = 0; i9 < A032; i9++) {
                        i8 = (int) (i8 + textView.getLayout().getLineWidth(i9));
                    }
                    measuredWidth = i8 + (textView.getCompoundPaddingLeft() * A032) + (textView.getCompoundPaddingRight() * A032);
                } else {
                    measuredWidth = childAt.getMeasuredWidth();
                }
                A07 += measuredWidth;
                if (A07 > measuredWidth3) {
                    break;
                }
            }
            i6 = i7 + 1;
        }
        setOrientation(1);
        super.onMeasure(i, i2);
    }
}
