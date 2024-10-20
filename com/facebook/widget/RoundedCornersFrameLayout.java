package com.facebook.widget;

import X.0FI;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;

/* loaded from: RoundedCornersFrameLayout.class */
public class RoundedCornersFrameLayout extends CustomFrameLayout {
    public int A00;
    public Paint A01;
    public boolean A02;
    public boolean A03;
    public Paint A04;
    public final Path A05;
    public final RectF A06;
    public final float[] A07;

    public RoundedCornersFrameLayout(Context context) {
        super(context);
        this.A00 = 0;
        this.A07 = new float[8];
        this.A05 = new Path();
        this.A06 = new RectF();
        A04(context, null);
    }

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        this.A07 = new float[8];
        this.A05 = new Path();
        this.A06 = new RectF();
        A04(context, attributeSet);
    }

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        this.A07 = new float[8];
        this.A05 = new Path();
        this.A06 = new RectF();
        A04(context, attributeSet);
    }

    private void A04(Context context, AttributeSet attributeSet) {
        int i = 0;
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2N);
            int color = obtainStyledAttributes.getColor(11, 0);
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            if (this.A03 != z) {
                this.A03 = z;
                setLayerType(2, null);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            A0V(obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize));
            obtainStyledAttributes.recycle();
            i = color;
        }
        Paint paint = new Paint(3);
        this.A04 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.A01 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.A01.setColor(i);
    }

    public void A0V(float f, float f2, float f3, float f4) {
        float[] fArr = this.A07;
        boolean z = true;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            z = false;
        }
        this.A02 = z;
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.A02) {
            if (Color.alpha(this.A00) != 0) {
                canvas.drawColor(this.A00);
            }
            super.dispatchDraw(canvas);
        } else {
            canvas.save();
            canvas.clipPath(this.A05);
            if (Color.alpha(this.A00) != 0) {
                canvas.drawColor(this.A00);
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1752772007);
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.A05;
        path.reset();
        path.setFillType(Path.FillType.WINDING);
        RectF rectF = this.A06;
        rectF.set(0.0f, 0.0f, i, i2);
        path.addRoundRect(rectF, this.A07, Path.Direction.CW);
        0FI.A0C(1243157648, A06);
    }

    public void setCornerRadius(float f) {
        float[] fArr = this.A07;
        boolean z = true;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = f;
        fArr[4] = f;
        fArr[7] = f;
        fArr[6] = f;
        if (f == 0.0f) {
            z = false;
        }
        this.A02 = z;
    }
}
