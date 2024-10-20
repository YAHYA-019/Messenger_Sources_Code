package com.facebook.shimmer;

import X.0FI;
import X.0K6;
import X.DKC;
import X.DKD;
import X.GSf;
import X.GzW;
import X.GzX;
import X.HNU;
import X.Hkb;
import X.HuR;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: ShimmerFrameLayout.class */
public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00;
    public boolean A01;
    public final GSf A02;
    public final Paint A03;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.A03 = DKC.A09();
        this.A02 = new GSf();
        this.A00 = true;
        this.A01 = false;
        A01(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = DKC.A09();
        this.A02 = new GSf();
        this.A00 = true;
        this.A01 = false;
        A01(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = DKC.A09();
        this.A02 = new GSf();
        this.A00 = true;
        this.A01 = false;
        A01(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A03 = DKC.A09();
        this.A02 = new GSf();
        this.A00 = true;
        this.A01 = false;
        A01(context, attributeSet);
    }

    private void A00() {
        this.A01 = false;
        GSf gSf = this.A02;
        ValueAnimator valueAnimator = gSf.A00;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        gSf.A00.cancel();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        HuR huR;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A03(new GzW().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HNU.A00, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                new GzX();
            } else {
                new GzW();
            }
            huR.A00(obtainStyledAttributes);
            A03(huR.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A02() {
        A00();
        this.A00 = false;
        invalidate();
    }

    public void A03(Hkb hkb) {
        int i;
        Paint paint;
        boolean z;
        GSf gSf = this.A02;
        gSf.A01 = hkb;
        if (hkb != null) {
            DKD.A19(gSf.A03, hkb.A0G ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN);
        }
        GSf.A00(gSf);
        if (gSf.A01 != null) {
            ValueAnimator valueAnimator = gSf.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                gSf.A00.cancel();
                gSf.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            Hkb hkb2 = gSf.A01;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (hkb2.A0E / hkb2.A0D)) + 1.0f);
            gSf.A00 = ofFloat;
            DKD.A17(ofFloat);
            gSf.A00.setRepeatMode(gSf.A01.A0B);
            gSf.A00.setStartDelay(gSf.A01.A0F);
            gSf.A00.setRepeatCount(gSf.A01.A0A);
            ValueAnimator valueAnimator2 = gSf.A00;
            Hkb hkb3 = gSf.A01;
            valueAnimator2.setDuration(hkb3.A0D + hkb3.A0E);
            gSf.A00.addUpdateListener(gSf.A02);
            if (z) {
                0K6.A00(gSf.A00);
            }
        }
        gSf.invalidateSelf();
        if (hkb == null || !hkb.A0I) {
            i = 0;
            paint = null;
        } else {
            i = 2;
            paint = this.A03;
        }
        setLayerType(i, paint);
    }

    public void A04(boolean z) {
        GSf gSf;
        ValueAnimator valueAnimator;
        this.A00 = true;
        if (isAttachedToWindow() && (valueAnimator = (gSf = this.A02).A00) != null && !valueAnimator.isStarted() && gSf.getCallback() != null) {
            0K6.A00(gSf.A00);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1571718851);
        super.onAttachedToWindow();
        if (this.A00) {
            this.A02.A01();
        }
        0FI.A0C(542711130, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1986135573);
        super.onDetachedFromWindow();
        A00();
        0FI.A0C(1362900648, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        GSf gSf = this.A02;
        if (gSf != null) {
            if (i != 0) {
                ValueAnimator valueAnimator = gSf.A00;
                if (valueAnimator == null || !valueAnimator.isStarted()) {
                    return;
                }
                A00();
                z = true;
            } else {
                if (!this.A01) {
                    return;
                }
                gSf.A01();
                z = false;
            }
            this.A01 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r302 == r301.A02) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            X.GSf r0 = r0.A02
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
