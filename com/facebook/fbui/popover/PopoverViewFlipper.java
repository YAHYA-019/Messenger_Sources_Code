package com.facebook.fbui.popover;

import X.0FI;
import X.0S2;
import X.1BQ;
import X.1Bn;
import X.C00i;
import X.C62j;
import X.C66h;
import X.C66i;
import X.DKD;
import X.E9k;
import X.E9m;
import X.Fe0;
import X.GHn;
import X.GJo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: PopoverViewFlipper.class */
public class PopoverViewFlipper extends FrameLayout {
    public static final C66h A0B = C66h.A02(15.0d, 5.0d);
    public static final C66h A0C = C66h.A01();
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public GHn A03;
    public GJo A04;
    public C00i A05;
    public Integer A06;
    public Integer A07;
    public E9m A08;
    public C66i A09;
    public C62j A0A;

    public PopoverViewFlipper(Context context) {
        super(context);
        this.A00 = 0;
        A00();
    }

    public PopoverViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        A00();
    }

    public PopoverViewFlipper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        A00();
    }

    private void A00() {
        C62j c62j = (C62j) 1Bn.A0A(49939);
        1BQ A02 = 1BQ.A02(99807);
        this.A0A = c62j;
        this.A05 = A02;
        Integer num = 0S2.A00;
        this.A07 = num;
        C66i c66i = new C66i(c62j);
        c66i.A09(A0B);
        c66i.A0A(new E9k(this));
        c66i.A06(0.0d);
        c66i.A07(0.0d);
        c66i.A02();
        this.A04 = new Fe0(c66i);
        this.A08 = new E9m(this);
        C66i c66i2 = new C66i(this.A0A);
        c66i2.A09(A0C);
        c66i2.A06 = true;
        c66i2.A06(0.0d);
        c66i2.A07(0.0d);
        c66i2.A02();
        this.A09 = c66i2;
        c66i2.A0A(this.A08);
        this.A06 = num;
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(2130971349, typedValue, true);
        int i = typedValue.resourceId;
        if (i > 0) {
            this.A01 = context.getDrawable(i);
        } else {
            this.A01 = null;
        }
        theme.resolveAttribute(2130971350, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 > 0) {
            this.A02 = context.getDrawable(i2);
        } else {
            this.A02 = null;
        }
        setWillNotDraw(false);
    }

    public static void A01(View view, View view2, PopoverViewFlipper popoverViewFlipper) {
        if (popoverViewFlipper.A07 == 0S2.A00) {
            view.setVisibility(8);
            view2.setVisibility(0);
            popoverViewFlipper.requestLayout();
        } else {
            popoverViewFlipper.A09.A06(0.0d);
            E9m e9m = popoverViewFlipper.A08;
            e9m.A05 = view;
            e9m.A04 = view2;
            popoverViewFlipper.A09.A04();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (getChildCount() != 1) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1017053284);
        super.onAttachedToWindow();
        this.A04.CLM(this);
        0FI.A0C(-356898874, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1433774556);
        super.onDetachedFromWindow();
        this.A09.A04.A01();
        0FI.A0C(1317722678, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.A06 != 0S2.A00) {
            canvas.save();
            Integer num = this.A06;
            if (num != 0S2.A01) {
                if (num == 0S2.A0C) {
                    drawable = this.A02;
                }
                canvas.restore();
            }
            drawable = this.A01;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        View childAt;
        super.onMeasure(i, i2);
        if (!this.A09.A0C() || (childAt = getChildAt(this.A00)) == null) {
            return;
        }
        setMeasuredDimension(Math.min(childAt.getMeasuredWidth(), DKD.A09(this).widthPixels) + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingBottom() + getPaddingTop());
    }
}
