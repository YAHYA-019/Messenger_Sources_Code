package com.facebook.spherical.ui;

import X.2MR;
import X.2Me;
import X.2Mg;
import X.3yG;
import X.DKC;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: SphericalPhoneAnimationView.class */
public class SphericalPhoneAnimationView extends View {
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final CornerPathEffect A0R;
    public static final CornerPathEffect A0S;
    public static final CornerPathEffect A0T;
    public static final CornerPathEffect A0U;
    public float A00;
    public float A01;
    public float A02;
    public AnimatorSet A03;
    public int A04;
    public Typeface A05;
    public String A06;
    public boolean A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;
    public final Path A0B;
    public final Path A0C;
    public final Path A0D;
    public final TextPaint A0E;

    static {
        int A01 = 3yG.A01(5.0f);
        int A012 = 3yG.A01(4.0f);
        int A013 = 3yG.A01(1.0f);
        int A014 = 3yG.A01(2.0f);
        A0G = A014;
        A0J = 3yG.A01(25.0f);
        A0Q = 3yG.A01(14.0f);
        A0F = 3yG.A01(2.0f);
        A0M = 3yG.A01(4.0f);
        A0K = 3yG.A01(36.0f);
        A0L = 3yG.A01(24.0f);
        A0H = 3yG.A01(25.0f);
        A0I = 3yG.A01(16.0f);
        A0N = 3yG.A01(16.0f);
        A0P = 3yG.A01(5.0f);
        A0O = 3yG.A01(1.0f);
        A0U = new CornerPathEffect(A01);
        A0T = new CornerPathEffect(A012);
        A0S = new CornerPathEffect(A013);
        A0R = new CornerPathEffect(A014);
    }

    public SphericalPhoneAnimationView(Context context) {
        this(context, null);
    }

    public SphericalPhoneAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SphericalPhoneAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint A09 = DKC.A09();
        this.A08 = A09;
        this.A0E = new TextPaint();
        this.A09 = DKC.A09();
        this.A0A = DKC.A0B();
        this.A0C = DKC.A0B();
        this.A0D = DKC.A0B();
        this.A0B = DKC.A0B();
        this.A04 = 12;
        A09.setAntiAlias(true);
        this.A06 = getResources().getString(2131966176);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.A07) {
            this.A05 = Typeface.create("roboto-medium", 0);
            this.A07 = true;
        }
        Typeface typeface = this.A05;
        if (typeface != null) {
            this.A0E.setTypeface(typeface);
        }
        TextPaint textPaint = this.A0E;
        int i = A0Q;
        textPaint.setTextSize(i);
        textPaint.setAlpha(255);
        Context context = getContext();
        2MR r0 = 2MR.A1m;
        2Mg r02 = 2Me.A02;
        textPaint.setColor(r02.A03(context, r0));
        float f = A0P;
        float f2 = A0O;
        textPaint.setShadowLayer(f, f2, f2, r02.A02(context));
        StaticLayout staticLayout = new StaticLayout(this.A06, textPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        canvas.save();
        float f3 = this.A02;
        float f4 = this.A04;
        float A01 = f3 - 3yG.A01(f4);
        float f5 = A0H;
        canvas.translate(0.0f, A01 - f5);
        staticLayout.draw(canvas);
        canvas.restore();
        int i2 = A0F;
        int i3 = A0K;
        int A012 = i2 + i3 + A0N + i + 3yG.A01(f4);
        Paint paint = this.A09;
        paint.setColor(r02.A01(context));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setPathEffect(A0U);
        paint.setAntiAlias(true);
        paint.setAlpha(68);
        float f6 = this.A00;
        float f7 = f6 / 10.0f;
        float f8 = this.A01;
        float f9 = f8 + f6;
        float f10 = f6 / 20.0f;
        float f11 = f9 + f10;
        float abs = Math.abs(f7);
        float f12 = f11 + abs;
        float f13 = A0L;
        float f14 = (((f8 + f13) + f6) + f10) - abs;
        float f15 = this.A02;
        float f16 = A012;
        float f17 = f15 - f16;
        float f18 = i3;
        float f19 = (f15 + f18) - f16;
        float f20 = (f14 - f12) / 2.0f;
        float f21 = f12 - f20;
        float f22 = f14 - f20;
        float f23 = i2;
        Path path = this.A0A;
        path.rewind();
        float f24 = f21 - f23;
        path.moveTo(f24, (f17 + f7) - f23);
        float f25 = f22 + f23;
        path.lineTo(f25, (f17 - f7) - f23);
        path.lineTo(f25, f19 + f7 + f23);
        path.lineTo(f24, (f19 - f7) + f23);
        path.close();
        canvas.drawPath(path, paint);
        paint.setColor(r02.A03(context, 2MR.A2K));
        paint.setStyle(style);
        paint.setPathEffect(A0T);
        paint.setAntiAlias(true);
        float f26 = this.A00;
        float f27 = f26 / 10.0f;
        float f28 = this.A01;
        float f29 = f28 + f26;
        float f30 = f26 / 20.0f;
        float f31 = f29 + f30;
        float abs2 = Math.abs(f27);
        float f32 = f31 + abs2;
        float f33 = (((f28 + f13) + f26) + f30) - abs2;
        float f34 = this.A02;
        float f35 = f34 - f16;
        float f36 = (f34 + f18) - f16;
        float f37 = (f33 - f32) / 2.0f;
        float f38 = f32 - f37;
        float f39 = f33 - f37;
        Path path2 = this.A0C;
        path2.rewind();
        path2.moveTo(f38, f35 + f27);
        path2.lineTo(f39, f35 - f27);
        path2.lineTo(f39, f36 + f27);
        path2.lineTo(f38, f36 - f27);
        path2.close();
        canvas.drawPath(path2, paint);
        Paint paint2 = this.A08;
        paint2.setStyle(style);
        DKC.A1H(context, paint2, 2132214676);
        paint2.setAlpha(216);
        paint2.setPathEffect(A0S);
        float f40 = 0.77f * f27 * 0.75f;
        float f41 = 0.61f * f27 * 0.75f;
        float f42 = this.A01;
        float f43 = this.A00;
        float f44 = f42 + f43;
        float f45 = f43 / 20.0f;
        float f46 = f44 + f45;
        float f47 = A0M;
        float f48 = f46 + f47;
        float abs3 = Math.abs(f43 / 10.0f);
        float f49 = f48 + abs3;
        float f50 = ((((f42 + A0I) + f43) + f45) + f47) - abs3;
        float f51 = this.A02;
        float f52 = (f51 - f16) + f47;
        float f53 = ((f51 + f5) - f16) + f47;
        float f54 = f49 - f37;
        float f55 = f50 - f37;
        Path path3 = this.A0D;
        path3.rewind();
        path3.moveTo(f54, f52 + f40);
        path3.lineTo(f55, f52 - f40);
        path3.lineTo(f55, f53 + f41);
        path3.lineTo(f54, f53 - f41);
        path3.close();
        canvas.drawPath(path3, paint2);
        paint2.setPathEffect(A0R);
        float f56 = f27 * 0.11f;
        float f57 = (f54 + f55) / 2.0f;
        float f58 = f53 + (((i3 - r0) - r0) / 2);
        float f59 = A0G;
        float abs4 = f59 - Math.abs(this.A00 / 30.0f);
        float f60 = f57 - abs4;
        float f61 = f57 + abs4;
        float f62 = f58 - f59;
        float f63 = f58 + f59;
        Path path4 = this.A0B;
        path4.rewind();
        path4.moveTo(f60, f62 + f56);
        path4.lineTo(f61, f62 - f56);
        path4.lineTo(f61, f63 + f56);
        path4.lineTo(f60, f63 - f56);
        path4.close();
        canvas.drawPath(path4, paint2);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.A01 = size / 2;
        this.A02 = size2;
        super.onMeasure(i, i2);
    }

    public void setOffset(float f) {
        float f2;
        float f3;
        int i;
        if (f > 25.0f) {
            if (f <= 50.0f) {
                float f4 = A0J;
                f2 = (((f - 25.0f) / 25.0f) * f4) - f4;
            } else if (f <= 75.0f) {
                f3 = (f - 50.0f) / 25.0f;
                i = A0J;
            } else {
                f2 = (((f - 75.0f) / 25.0f) * (-r0)) + A0J;
            }
            this.A00 = f2;
            invalidate();
        }
        f3 = f / 25.0f;
        i = -A0J;
        f2 = f3 * i;
        this.A00 = f2;
        invalidate();
    }
}
