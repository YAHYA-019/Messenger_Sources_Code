package com.facebook.widget.viewpageindicator;

import X.C1oo;
import X.DKC;
import X.DKE;
import X.FKb;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: HScrollCirclePageIndicator.class */
public class HScrollCirclePageIndicator extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;

    /* loaded from: HScrollCirclePageIndicator$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = FKb.A00(40);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public HScrollCirclePageIndicator(Context context) {
        this(context, null);
    }

    public HScrollCirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130972231);
    }

    public HScrollCirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint A0A = DKC.A0A(1);
        this.A06 = A0A;
        Paint A0A2 = DKC.A0A(1);
        this.A07 = A0A2;
        Paint A0A3 = DKC.A0A(1);
        this.A05 = A0A3;
        Paint A0A4 = DKC.A0A(1);
        this.A04 = A0A4;
        this.A02 = 5;
        Resources resources = getResources();
        int color = resources.getColor(2132213967);
        int color2 = resources.getColor(2132213791);
        int integer = resources.getInteger(2131427338);
        int color3 = resources.getColor(2132213995);
        float dimension = resources.getDimension(2132279351);
        float dimension2 = resources.getDimension(2132279379);
        boolean z = resources.getBoolean(2131034115);
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0M, i, 0);
        this.A03 = obtainStyledAttributes.getInt(1, integer);
        obtainStyledAttributes.getInt(0, 17);
        Paint.Style style = Paint.Style.FILL;
        A0A.setStyle(style);
        A0A.setColor(obtainStyledAttributes.getColor(5, color));
        A0A2.setStyle(style);
        A0A2.setColor(obtainStyledAttributes.getColor(8, color3));
        A0A2.setStrokeWidth(obtainStyledAttributes.getDimension(9, dimension));
        A0A3.setStyle(style);
        A0A3.setColor(obtainStyledAttributes.getColor(4, color2));
        this.A00 = obtainStyledAttributes.getDimension(6, dimension2);
        obtainStyledAttributes.getBoolean(7, z);
        DKC.A1L(A0A4);
        A0A4.setStrokeWidth(0.0f);
        obtainStyledAttributes.recycle();
    }

    private int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int A07 = DKE.A07(this);
            int i2 = this.A02;
            float f = this.A00;
            int min = Math.min(0, i2);
            int i3 = A07 + ((int) ((min * 2 * f) + ((min - 1) * f) + 1.0f));
            float f2 = -0.0f;
            if (mode != ((-1) << (-1))) {
                return i3;
            }
            size = Math.min(i3, size);
        }
        return size;
    }

    private int A01(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int paddingTop = ((int) ((this.A00 * 2.0f) + 1.0f)) + getPaddingTop() + getPaddingBottom();
            if (mode != ((-1) << (-1))) {
                return paddingTop;
            }
            size = Math.min(paddingTop, size);
        }
        return size;
    }

    public float getStrokeWidth() {
        return this.A07.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int A01;
        int A00;
        if (this.A03 == 0) {
            A01 = A00(i);
            A00 = A01(i2);
        } else {
            A01 = A01(i);
            A00 = A00(i2);
        }
        setMeasuredDimension(A01, A00);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A01 = savedState.A00;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.facebook.widget.viewpageindicator.HScrollCirclePageIndicator$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = this.A01;
        return baseSavedState;
    }

    public void setStrokeWidth(float f) {
        this.A07.setStrokeWidth(f);
        invalidate();
    }
}
