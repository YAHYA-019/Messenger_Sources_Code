package com.facebook.quicksilver.views.loading.progress;

import X.0FI;
import X.0K6;
import X.11T;
import X.4YU;
import X.AnonymousClass001;
import X.C0A8;
import X.C1oo;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.FJX;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CircularProgressView.class */
public final class CircularProgressView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public List A07;
    public boolean A08;
    public int A09;
    public final float A0A;
    public final float A0B;
    public final long A0C;
    public final float A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final RectF A0H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0C = 1000L;
        this.A0D = 10.0f;
        float f = 10.0f * 2.0f;
        this.A0E = f;
        this.A0B = 180.0f;
        this.A0A = (360.0f - 180.0f) - f;
        this.A0H = DKC.A0D();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1oo.A0O, 0, 0);
        11T.A0A(obtainStyledAttributes);
        float f2 = 0.0f / 0.0f;
        try {
            int color = obtainStyledAttributes.getColor(6, -1);
            int color2 = obtainStyledAttributes.getColor(5, -16777216);
            float dimension = obtainStyledAttributes.getDimension(7, 5.0f);
            this.A09 = obtainStyledAttributes.getDimensionPixelSize(7, C0A8.A00(4YU.A08(this), 5.0f));
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            Paint A0A = DKC.A0A(1);
            A0A.setColor(color);
            Paint.Style style = Paint.Style.STROKE;
            A0A.setStyle(style);
            Paint.Cap cap = Paint.Cap.BUTT;
            A0A.setStrokeCap(cap);
            A0A.setStrokeWidth(dimension);
            this.A0F = A0A;
            Paint A0A2 = DKC.A0A(1);
            A0A2.setColor(color2);
            A0A2.setStyle(style);
            A0A2.setStrokeCap(cap);
            A0A2.setStrokeWidth(dimension);
            this.A0G = A0A2;
            this.A05 = 0;
            this.A04 = 100;
            this.A02 = 0.0f;
            this.A01 = 0.0f;
            this.A03 = 0.0f;
            this.A00 = 0.0f;
            if (z) {
                A00();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ CircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A00() {
        this.A08 = true;
        if (this.A07 == null) {
            this.A07 = AnonymousClass001.A0s();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.A0A);
            long j = this.A0C;
            ofFloat.setDuration(j);
            DKD.A17(ofFloat);
            ofFloat.setRepeatCount(-1);
            FJX.A00(ofFloat, this, 13);
            List list = this.A07;
            if (list != null) {
                list.add(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-1.0f, 1.0f);
            ofFloat2.setDuration(j);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat2.setRepeatCount(-1);
            FJX.A00(ofFloat2, this, 14);
            List list2 = this.A07;
            if (list2 != null) {
                list2.add(ofFloat2);
            }
        }
        boolean z = this.A08;
        List list3 = this.A07;
        if (list3 != null) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                Animator A07 = DKC.A07(it);
                if (z) {
                    0K6.A00(A07);
                } else {
                    A07.cancel();
                }
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-291789545);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        List list = this.A07;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DKC.A07(it).cancel();
            }
        }
        0FI.A0C(886869394, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        11T.A0F(canvas, 0);
        RectF rectF = this.A0H;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.A0F);
        if (!this.A08) {
            canvas.drawArc(rectF, 270.0f, this.A03, false, this.A0G);
            this.A00 = this.A03;
            return;
        }
        float f2 = this.A01;
        if (f2 > 0.0f) {
            f = this.A02 - this.A0D;
        } else {
            f2 = -f2;
            f = (this.A02 - this.A0D) - f2;
        }
        float f3 = f;
        canvas.drawArc(rectF, f3, f2 + this.A0E, false, this.A0G);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1307633685);
        super.onSizeChanged(i, i2, i3, i4);
        float A02 = DKC.A02(this) / 2.0f;
        float A03 = DKC.A03(this) / 2.0f;
        float min = (Math.min(getWidth(), getHeight()) / 2.0f) - this.A09;
        this.A0H.set(A02 - min, A03 - min, A02 + min, A03 + min);
        0FI.A0C(1158657599, A06);
    }

    public final void setProgress(int i, int i2) {
        int i3;
        int i4 = this.A05;
        if (i > i4) {
            int i5 = (i - i4) * i2;
            this.A05 = i;
            int i6 = this.A04;
            if (i > i6) {
                this.A05 = i6;
                i = i6;
            }
            if (i < 0) {
                this.A05 = 0;
            }
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.A03 = this.A00;
            invalidate();
            int i7 = this.A04;
            if (i7 > 0 && (i3 = this.A05) > 0) {
                this.A03 = (i3 * 360.0f) / i7;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A00, this.A03);
            this.A06 = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(i5);
            }
            ValueAnimator valueAnimator2 = this.A06;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(new DecelerateInterpolator());
            }
            ValueAnimator valueAnimator3 = this.A06;
            if (valueAnimator3 != null) {
                FJX.A00(valueAnimator3, this, 12);
            }
            ValueAnimator valueAnimator4 = this.A06;
            if (valueAnimator4 != null) {
                0K6.A00(valueAnimator4);
            }
        }
    }
}
