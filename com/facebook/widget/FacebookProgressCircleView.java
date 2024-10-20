package com.facebook.widget;

import X.2MR;
import X.2Me;
import X.C1oo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* loaded from: FacebookProgressCircleView.class */
public class FacebookProgressCircleView extends View {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public LinearGradient A06;
    public Paint A07;
    public RectF A08;
    public int A09;
    public boolean A0A;

    public FacebookProgressCircleView(Context context) {
        super(context);
        this.A00 = 0.0d;
        A00(context, null);
    }

    public FacebookProgressCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0d;
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        int A03 = 2Me.A02.A03(getContext(), 2MR.A2K);
        this.A02 = A03;
        this.A04 = A03;
        this.A01 = 127;
        this.A03 = 255;
        this.A0A = false;
        Resources resources = getResources();
        this.A09 = (int) Math.ceil(TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        this.A05 = (int) Math.ceil(TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0y);
            int color = obtainStyledAttributes.getColor(1, this.A02);
            this.A02 = color;
            this.A04 = obtainStyledAttributes.getColor(3, color);
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
            this.A03 = obtainStyledAttributes.getInt(2, this.A03);
            this.A05 = (int) obtainStyledAttributes.getDimension(5, this.A05);
            this.A09 = (int) obtainStyledAttributes.getDimension(6, this.A09);
            this.A0A = obtainStyledAttributes.getBoolean(4, this.A0A);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A07.setAntiAlias(true);
        this.A07.setStrokeWidth(this.A05);
        this.A07.setColor(this.A02);
        float ceil = (int) Math.ceil(this.A05 / 2.0d);
        float f = this.A09;
        this.A08 = new RectF(ceil, ceil, f, f);
        A01(this);
    }

    public static void A01(FacebookProgressCircleView facebookProgressCircleView) {
        if (facebookProgressCircleView.A0A) {
            int i = facebookProgressCircleView.A02 & 16777215;
            int i2 = i | (-16777216);
            float f = facebookProgressCircleView.A09;
            float f2 = f / 3.0f;
            float f3 = f / 1.4f;
            facebookProgressCircleView.A06 = new LinearGradient(f2, f2, f3, f3, i2, i, Shader.TileMode.CLAMP);
        }
    }

    public void A02(int i) {
        this.A02 = i;
        this.A04 = i;
        this.A07.setColor(i);
        A01(this);
        invalidate();
    }

    public double getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        RectF rectF;
        float f2;
        Paint paint;
        super.onDraw(canvas);
        double d = this.A00;
        float f3 = (((float) d) * 360.0f) / 100.0f;
        if (d > 0.0d) {
            boolean z = this.A0A;
            Paint paint2 = this.A07;
            if (z) {
                paint2.setColor(this.A02);
                this.A07.setAlpha(255);
                this.A07.setShader(this.A06);
                canvas.drawArc(this.A08, 270.0f, 90.0f, false, this.A07);
                this.A07.setShader(null);
                if (this.A00 > 90.0d) {
                    this.A07.setAlpha(this.A03);
                    rectF = this.A08;
                    f = 0.0f;
                    f2 = f3 - 90.0f;
                    paint = this.A07;
                }
            } else {
                paint2.setColor(this.A04);
                this.A07.setAlpha(this.A03);
                f = 270.0f;
                rectF = this.A08;
                f2 = f3;
                paint = this.A07;
            }
            canvas.drawArc(rectF, f, f2, false, paint);
        }
        if (this.A00 < 100.0d) {
            this.A07.setColor(this.A02);
            this.A07.setAlpha(this.A01);
            canvas.drawArc(this.A08, f3 + 270.0f, 360.0f - f3, false, this.A07);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = (this.A05 / 2) + this.A09;
        setMeasuredDimension(i3, i3);
    }

    public void setProgress(double d) {
        if (d != this.A00) {
            this.A00 = Math.min(100.0d, Math.max(0.0d, d));
            invalidate();
        }
    }

    public void setProgress(long j) {
        setProgress(j);
    }

    public void setSize(int i) {
        this.A09 = i;
        float ceil = (int) Math.ceil(this.A05 / 2.0d);
        float f = i;
        this.A08 = new RectF(ceil, ceil, f, f);
    }
}
