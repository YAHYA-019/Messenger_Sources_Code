package com.facebook.widget.viewpageindicator;

import X.0FI;
import X.0PY;
import X.C1oo;
import X.DKC;
import X.FKb;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: CirclePageIndicator.class */
public class CirclePageIndicator extends View implements 0PY {
    public int A00;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;

    /* loaded from: CirclePageIndicator$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = FKb.A00(39);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130972231);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint A0A = DKC.A0A(1);
        this.A06 = A0A;
        Paint A0A2 = DKC.A0A(1);
        this.A07 = A0A2;
        Paint A0A3 = DKC.A0A(1);
        this.A05 = A0A3;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(2132213967);
        int color2 = resources.getColor(2132213791);
        int integer = resources.getInteger(2131427338);
        int color3 = resources.getColor(2132213995);
        float dimension = resources.getDimension(2132279351);
        float dimension2 = resources.getDimension(2132279379);
        boolean z = resources.getBoolean(2131034114);
        boolean z2 = resources.getBoolean(2131034115);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0M, i, 0);
        obtainStyledAttributes.getBoolean(2, z);
        this.A02 = obtainStyledAttributes.getInt(1, integer);
        Paint.Style style = Paint.Style.FILL;
        A0A.setStyle(style);
        A0A.setColor(obtainStyledAttributes.getColor(5, color));
        A0A2.setStyle(style);
        A0A2.setColor(obtainStyledAttributes.getColor(8, color3));
        A0A2.setStrokeWidth(obtainStyledAttributes.getDimension(9, dimension));
        A0A3.setStyle(style);
        A0A3.setColor(obtainStyledAttributes.getColor(4, color2));
        float dimension3 = obtainStyledAttributes.getDimension(6, dimension2);
        this.A01 = dimension3;
        obtainStyledAttributes.getDimension(3, dimension3);
        this.A04 = obtainStyledAttributes.getBoolean(7, z2);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    private int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int paddingTop = (int) ((this.A01 * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
            float f = -0.0f;
            if (mode != ((-1) << (-1))) {
                return paddingTop;
            }
            size = Math.min(paddingTop, size);
        }
        return size;
    }

    public void CAd(int i) {
        this.A03 = i;
    }

    public void CAe(int i, float f, int i2) {
        this.A00 = i;
        invalidate();
    }

    public void CAf(int i) {
        if (this.A04 || this.A03 == 0) {
            this.A00 = i;
            invalidate();
        }
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
        int A00;
        int size;
        if (this.A02 == 0) {
            View.MeasureSpec.getMode(i);
            A00 = View.MeasureSpec.getSize(i);
            size = A00(i2);
        } else {
            A00 = A00(i);
            View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(A00, size);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A00 = savedState.A00;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, com.facebook.widget.viewpageindicator.CirclePageIndicator$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = this.A00;
        return baseSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-93811567);
        boolean z = true;
        int i = 534738376;
        if (!super.onTouchEvent(motionEvent)) {
            z = false;
            i = 157610003;
        }
        0FI.A0B(i, A05);
        return z;
    }

    public void setStrokeWidth(float f) {
        this.A07.setStrokeWidth(f);
        invalidate();
    }
}
