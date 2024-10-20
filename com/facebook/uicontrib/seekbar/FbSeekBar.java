package com.facebook.uicontrib.seekbar;

import X.0FI;
import X.0S2;
import X.7zL;
import X.C0ed;
import X.C5eb;
import X.C5ec;
import X.C5ed;
import X.C5ee;
import X.DKC;
import X.GOn;
import X.GOo;
import X.GOp;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: FbSeekBar.class */
public class FbSeekBar extends FrameLayout implements C5eb, C5ec, C5ee {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Paint A08;
    public C5ed A09;

    public FbSeekBar(Context context) {
        this(context, null);
    }

    public FbSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FbSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5ed c5ed = new C5ed(getContext());
        this.A09 = c5ed;
        Integer[] numArr = {0S2.A0C, 0S2.A0N};
        c5ed.A04 = 0;
        c5ed.A05(numArr);
        c5ed.A07 = this;
        c5ed.A08 = this;
        c5ed.A09 = this;
        Resources resources = getResources();
        Paint A09 = DKC.A09();
        this.A04 = A09;
        GOo.A18(resources, A09, 2132214062);
        this.A04.setAntiAlias(true);
        this.A04.setStrokeWidth(7zL.A01(resources, 2132279379));
        Paint A092 = DKC.A09();
        this.A05 = A092;
        GOo.A18(resources, A092, 2132214114);
        this.A05.setStrokeWidth(7zL.A01(resources, 2132279379));
        Paint A093 = DKC.A09();
        this.A06 = A093;
        GOo.A18(resources, A093, 2132214062);
        this.A06.setAlpha(127);
        this.A06.setAntiAlias(true);
        Paint A094 = DKC.A09();
        this.A07 = A094;
        GOo.A18(resources, A094, 2132213766);
        this.A07.setAntiAlias(true);
        Paint A095 = DKC.A09();
        this.A08 = A095;
        GOo.A18(resources, A095, 2132214062);
        this.A08.setAntiAlias(true);
        this.A01 = resources.getDimensionPixelSize(2132279298);
        this.A02 = DKC.A04(resources);
        this.A03 = resources.getDimensionPixelSize(2132279379);
        this.A00 = 0.0f / 0.0f;
    }

    private void A00(float f) {
        float f2 = this.A01;
        this.A00 = C0ed.A00((((f - f2) / ((getWidth() - r0) - f2)) * (0.0f - 0.0f)) + 0.0f, 0.0f, 0.0f);
        invalidate();
    }

    @Override // X.C5ec
    public boolean BWn(float f, float f2) {
        return GOp.A1U((DKC.A01(f2, getMeasuredHeight() / 2) > (this.A01 * 2) ? 1 : (DKC.A01(f2, getMeasuredHeight() / 2) == (this.A01 * 2) ? 0 : -1)));
    }

    @Override // X.C5eb
    public void Bv0() {
    }

    @Override // X.C5eb
    public void Bv1(float f, float f2) {
    }

    @Override // X.C5eb
    public void Bv2(Integer num, float f, float f2, int i) {
    }

    @Override // X.C5ee
    public void Bv3(float f, float f2) {
        if (DKC.A01(f2, getMeasuredHeight() / 2) <= this.A01 * 2) {
            A00(f);
        }
    }

    @Override // X.C5eb
    public void Bv4(Integer num, float f, float f2) {
        float f3 = this.A00;
        float f4 = this.A01;
        A00((((f3 - 0.0f) / (0.0f - 0.0f)) * ((getWidth() - r0) - f4)) + f4 + f);
    }

    @Override // X.C5eb
    public boolean Bv5(Integer num, float f, float f2) {
        if (getParent() != null) {
            GOn.A1O(this, true);
        }
        return true;
    }

    @Override // X.C5ee
    public boolean CPp(float f, float f2) {
        if (DKC.A01(f2, getMeasuredHeight() / 2) > this.A01 * 2) {
            return false;
        }
        A00(f);
        return true;
    }

    @Override // X.C5ec
    public boolean Cxp(float f, float f2) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2;
        float f = this.A00;
        float f2 = this.A01;
        float width = (((f - 0.0f) / (0.0f - 0.0f)) * ((getWidth() - r0) - f2)) + f2;
        canvas.save();
        canvas.drawLine(f2, measuredHeight, getWidth() - r0, measuredHeight, this.A05);
        canvas.drawCircle(width, measuredHeight, f2, this.A06);
        canvas.drawLine(f2, measuredHeight, width, measuredHeight, this.A04);
        canvas.drawCircle(width, measuredHeight, this.A02, this.A07);
        canvas.drawCircle(width, measuredHeight, this.A03, this.A08);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C5ed.A02(motionEvent, this.A09);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1594900897);
        boolean A03 = C5ed.A03(motionEvent, this.A09);
        0FI.A0B(-594559955, A05);
        return A03;
    }
}
