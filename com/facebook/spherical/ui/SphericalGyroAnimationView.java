package com.facebook.spherical.ui;

import X.2MR;
import X.2Me;
import X.2Mg;
import X.3yG;
import X.DKC;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: SphericalGyroAnimationView.class */
public class SphericalGyroAnimationView extends View {
    public Animator A00;
    public AnimatorSet A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public Paint A06;
    public RectF A07;
    public final ObjectAnimator A08;
    public static final int A09 = 3yG.A01(28.0f);
    public static final int A0B = 3yG.A01(2.0f);
    public static final int A0C = 3yG.A01(1.0f);
    public static final int A0A = 3yG.A01(3.0f);
    public static final int A0D = 3yG.A01(15.0f);
    public static final int A0F = 3yG.A01(13.0f);
    public static final int A0E = 3yG.A01(4.0f);

    public SphericalGyroAnimationView(Context context) {
        this(context, null);
    }

    public SphericalGyroAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SphericalGyroAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = 0;
        this.A06 = DKC.A09();
        this.A07 = DKC.A0D();
        this.A08 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("offset", this.A05, 100.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Paint paint = this.A06;
        DKC.A1M(paint);
        Context context = getContext();
        2MR r0 = 2MR.A0E;
        2Mg r02 = 2Me.A02;
        paint.setColor(r02.A03(context, r0));
        paint.setAntiAlias(true);
        paint.setAlpha(127);
        RectF rectF = this.A07;
        float f = this.A02;
        float f2 = A09;
        float f3 = f - f2;
        float f4 = A0A;
        float f5 = f3 - f4;
        float f6 = this.A03;
        rectF.set(f5, (f6 - f2) - f4, f + f2 + f4, f6 + f2 + f4);
        canvas.drawOval(rectF, paint);
        float f7 = this.A02;
        float f8 = this.A05;
        float f9 = f7 - f8;
        float f10 = f7 + f8;
        float min = Math.min(f9, f10);
        float max = Math.max(f9, f10);
        paint.setStrokeWidth(A0C);
        DKC.A1L(paint);
        DKC.A1H(context, paint, 2132214675);
        paint.setAlpha(150);
        float f11 = this.A03;
        rectF.set(min, f11 - f2, max, f11 + f2);
        canvas.drawOval(rectF, paint);
        canvas.rotate(3.0f, this.A02, this.A03);
        DKC.A1M(paint);
        2MR r03 = 2MR.A2K;
        paint.setColor(r02.A03(context, r03));
        paint.setAlpha(51);
        float f12 = this.A02;
        float f13 = f12 - f2;
        float f14 = this.A03;
        float f15 = A0D;
        float f16 = f14 - f15;
        float f17 = this.A04 / 6.0f;
        rectF.set(f13, f16 - f17, f12 + f2, f14 + f15 + f17);
        canvas.drawOval(rectF, paint);
        paint.setAlpha(255);
        DKC.A1H(context, paint, 2132214675);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.drawOval(rectF, paint);
        canvas.rotate(-3.0f, this.A02, this.A03);
        float f18 = this.A03;
        rectF.set(min, f18 - f2, max, f18 + f2);
        float f19 = -90.0f;
        if (this.A05 > 0) {
            f19 = 90.0f;
        }
        canvas.drawArc(rectF, f19, 360.0f, false, paint);
        paint.setStyle(style);
        DKC.A1H(context, paint, 2132214674);
        paint.setStrokeWidth(A0B);
        float f20 = this.A02;
        float f21 = f20 - f2;
        float f22 = this.A03;
        rectF.set(f21, f22 - f2, f20 + f2, f22 + f2);
        canvas.drawOval(rectF, paint);
        if (this.A05 >= 0) {
            float f23 = this.A03;
            rectF.set(min, f23 - f2, max, f23 + f2);
            canvas.clipRect(rectF);
            paint.setTextSize(A0F);
            paint.setColor(r02.A03(context, r03));
            DKC.A1M(paint);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(getResources().getString(2131966177), this.A02, this.A03 + A0E, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.A02 = r0 / 2;
        this.A03 = r0 / 2;
        super.onMeasure(i, i2);
    }

    public void setOffset(float f) {
        double d = (float) (((f * 4.537855971961473d) / 100.0d) + 0.8726646259971648d);
        double tan = Math.tan(d);
        float sqrt = (float) (0.75d / Math.sqrt(0.5625d + ((1.0d * tan) * tan)));
        double d2 = d % 6.283185307179586d;
        if (d2 > 1.5707963267948966d && d2 < 4.71238898038469d) {
            sqrt = -sqrt;
        }
        this.A05 = (int) (A09 * sqrt);
        this.A04 = (-r0) / 2;
        invalidate();
    }
}
