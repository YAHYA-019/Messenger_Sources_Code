package com.facebook.xapp.messaging.audio.waveforms;

import X.03Y;
import X.0FI;
import X.0K6;
import X.0KF;
import X.11T;
import X.1BK;
import X.4YW;
import X.7zN;
import X.AnonymousClass001;
import X.C1oo;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.IG6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VoiceVisualizer.class */
public class VoiceVisualizer extends View {
    public static final List A0J;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public final float A08;
    public final Paint A09;
    public final AttributeSet A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final RectF A0I;

    static {
        Float valueOf = Float.valueOf(0.5f);
        Float valueOf2 = Float.valueOf(0.1875f);
        Float valueOf3 = Float.valueOf(0.375f);
        Float valueOf4 = Float.valueOf(0.75f);
        Float A0g = 7zN.A0g();
        Float valueOf5 = Float.valueOf(0.25f);
        ImmutableList of = ImmutableList.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf, A0g, A0g, valueOf4, valueOf5, valueOf3, valueOf4, A0g, A0g, valueOf, valueOf4, A0g, valueOf4, valueOf4, valueOf, valueOf5, valueOf5, valueOf3, valueOf, A0g, valueOf4, valueOf, valueOf, valueOf4, valueOf5, valueOf, valueOf4, A0g, valueOf, valueOf5, valueOf4);
        11T.A0A(of);
        A0J = of;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0A = attributeSet;
        this.A07 = 100;
        this.A0C = AnonymousClass001.A0s();
        this.A0D = AnonymousClass001.A0s();
        this.A0B = AnonymousClass001.A0s();
        Paint A0A = DKC.A0A(5);
        this.A0G = A0A;
        Paint A0A2 = DKC.A0A(5);
        this.A0H = A0A2;
        Paint A0A3 = DKC.A0A(5);
        this.A09 = A0A3;
        Paint A0A4 = DKC.A0A(5);
        this.A0F = A0A4;
        this.A0I = DKC.A0D();
        Paint.Cap cap = Paint.Cap.ROUND;
        A0A.setStrokeCap(cap);
        A0A2.setStrokeCap(cap);
        A0A3.setStrokeCap(cap);
        int[] iArr = C1oo.A2w;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        11T.A0A(obtainStyledAttributes);
        try {
            A03(obtainStyledAttributes.getInt(2, -1));
            Context context2 = getContext();
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(this.A0A, iArr, 0, 0);
            11T.A0A(obtainStyledAttributes2);
            try {
                this.A01 = obtainStyledAttributes2.getDimensionPixelOffset(4, (int) 4YW.A00(context2, 6.0f, 1));
                obtainStyledAttributes2.recycle();
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(this.A0A, iArr, 0, 0);
                11T.A0A(obtainStyledAttributes3);
                try {
                    this.A02 = obtainStyledAttributes3.getDimensionPixelOffset(5, (int) 4YW.A00(context2, 3.0f, 1));
                    obtainStyledAttributes3.recycle();
                    this.A0E = obtainStyledAttributes.getDimensionPixelOffset(3, (int) 4YW.A00(context, 2.0f, 1));
                    this.A08 = obtainStyledAttributes.getDimensionPixelOffset(1, (int) 4YW.A00(context, 4.0f, 1));
                    A0A4.setColor(obtainStyledAttributes.getInt(0, -1));
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    th = th;
                    obtainStyledAttributes3.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public /* synthetic */ VoiceVisualizer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(Canvas canvas, Paint paint, float f, int i) {
        float f2 = this.A0E;
        float f3 = this.A02 / 2.0f;
        float f4 = f2 + f3;
        float A03 = (DKC.A03(this) - f2) - f3;
        float paddingLeft = getPaddingLeft();
        int i2 = i - 1;
        float f5 = this.A01;
        float f6 = paddingLeft + (i2 * f5) + f3;
        int width = getWidth() - getPaddingRight();
        List list = this.A0C;
        boolean A1Y = 1BK.A1Y(list);
        float f7 = width;
        float min = Math.min(f6, A1Y ? (f7 + f3) - (f5 * f) : f7 - f3);
        int i3 = 0;
        if (1BK.A1Y(this.A0D)) {
            while (-1 < i2) {
                A01(canvas, paint, 1.0f, ((Number) this.A0B.get(i2)).floatValue(), f4, A03, min, i3);
                i3++;
                i2--;
            }
            return;
        }
        while (-1 < i2) {
            Object animatedValue = ((ValueAnimator) ((03Y) list.get(i2)).second).getAnimatedValue();
            11T.A0I(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (!A01(canvas, paint, ((Number) animatedValue).floatValue(), ((Number) ((03Y) list.get(i2)).first).floatValue(), f4, A03, min, i3)) {
                return;
            }
            i3++;
            i2--;
        }
    }

    private final boolean A01(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, int i) {
        float f6 = f4 - f3;
        float max = Math.max(0.01f, f2) * f6 * f;
        float f7 = (f6 - max) / 2.0f;
        float f8 = f5 - (this.A01 * i);
        float f9 = f3 + f7;
        float paddingLeft = getPaddingLeft();
        float f10 = this.A02;
        if (f8 < paddingLeft - f10) {
            return false;
        }
        paint.setStrokeWidth(f10 * f);
        canvas.drawLine(f8, f9, f8, f9 + max, paint);
        return true;
    }

    public final void A02(float f) {
        if (!this.A0D.isEmpty()) {
            throw 1BK.A0g();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        DKD.A17(ofFloat);
        ofFloat.setDuration(this.A07);
        IG6.A00(ofFloat, this, 17);
        this.A0C.add(1BK.A1G(Float.valueOf(f), ofFloat));
        0K6.A00(ofFloat);
    }

    public final void A03(int i) {
        Paint paint = this.A0H;
        paint.setColor(i);
        paint.setAlpha(77);
        this.A0G.setColor(i);
        this.A09.setColor(-1);
        invalidate();
    }

    public final void A04(List list, float f) {
        11T.A0F(list, 0);
        if (!this.A0C.isEmpty()) {
            throw 1BK.A0g();
        }
        List list2 = this.A0D;
        list2.clear();
        this.A0B.clear();
        this.A04 = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(Float.valueOf(((Number) it.next()).floatValue()));
        }
        this.A00 = f;
        postInvalidateOnAnimation();
        requestLayout();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1740579540);
        super.onDetachedFromWindow();
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((Animator) ((03Y) it.next()).second).end();
        }
        0FI.A0C(-1418895160, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0268, code lost:
    
        if (r319.size() == r301.A03) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.A0I;
        if (rectF.isEmpty()) {
            rectF.set(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int min;
        List list = this.A0D;
        if (list.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        float f = -0.0f;
        if (mode == ((-1) << (-1))) {
            float paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            float f2 = this.A01;
            min = Math.min(list.size(), (int) Math.floor((paddingLeft + (f2 - this.A02)) / f2));
        } else {
            if (mode != 0 && mode == 1073741824) {
                float paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
                float f3 = this.A01;
                int floor = (int) Math.floor((paddingLeft2 + (f3 - this.A02)) / f3);
                if (!this.A05) {
                    floor = Math.min(list.size(), floor);
                }
                this.A03 = floor;
                setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
            }
            min = list.size();
        }
        this.A03 = min;
        float f4 = this.A01;
        size = 0KF.A01((min * f4) - (f4 - this.A02)) + getPaddingLeft() + getPaddingRight();
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
    }
}
