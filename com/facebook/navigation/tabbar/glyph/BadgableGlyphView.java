package com.facebook.navigation.tabbar.glyph;

import X.0FI;
import X.11T;
import X.1Br;
import X.7zM;
import X.7zS;
import X.C00j;
import X.DKC;
import X.FFe;
import X.Fkm;
import X.GL0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: BadgableGlyphView.class */
public class BadgableGlyphView extends View implements GL0 {
    public Drawable A00;
    public Looper A01;
    public int A02;
    public int A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FFe A06;
    public final Rect A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgableGlyphView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgableGlyphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgableGlyphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A07 = DKC.A0C();
        this.A05 = 7zM.A0Q();
        this.A04 = 7zM.A0N();
        C00j.A05("BadgableGlyphView#constructor", 6631078);
        try {
            7zS.A1H(this.A05);
            this.A01 = Looper.myLooper();
            Fkm fkm = new Fkm(this);
            boolean AZk = 1Br.A06(this.A04).AZk(72339292355428836L);
            boolean AZk2 = 1Br.A06(this.A04).AZk(72339292358377978L);
            1Br.A06(this.A04).AZk(72339292358705662L);
            this.A06 = new FFe(context, fkm, AZk, AZk2, 1Br.A06(this.A04).AZk(72339292358902272L));
            C00j.A01(-1326810446);
        } catch (Throwable th) {
            C00j.A01(1395042536);
            throw th;
        }
    }

    public void A00(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setVisible(false, false);
        }
        this.A00 = drawable;
        int i = this.A03;
        int i2 = this.A02;
        this.A03 = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.A02 = intrinsicHeight;
        if (this.A03 != i || intrinsicHeight != i2) {
            requestLayout();
        }
        drawable.setVisible(true, true);
        drawable.setCallback(this);
        Drawable drawable3 = this.A00;
        if (drawable3 != null) {
            drawable3.setState(isSelected() ? View.SELECTED_STATE_SET : View.EMPTY_STATE_SET);
        }
    }

    @Override // X.GL0
    public void CmE(String str) {
        this.A06.A02 = str;
    }

    @Override // X.GL0
    public void Cvr(int i) {
        7zS.A1H(this.A05);
        FFe fFe = this.A06;
        if (fFe.A01 != i) {
            fFe.A01 = i;
            float f = 0.0f;
            if (i > 0) {
                f = 1.0f;
            }
            fFe.A00 = f;
            fFe.A0B.CMT();
        }
        requestLayout();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        11T.A0F(drawable, 0);
        super.invalidateDrawable(drawable);
        7zS.A1H(this.A05);
        if (drawable == this.A00) {
            invalidate(drawable.getBounds());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1225631804);
        super.onDetachedFromWindow();
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        0FI.A0C(-467517081, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        FFe fFe = this.A06;
        if (fFe.A01 > 0 && !11T.A0O(fFe.A02, "num")) {
            canvas.clipPath(fFe.A07, Region.Op.DIFFERENCE);
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(this.A07);
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        canvas.restore();
        fFe.A02(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = size / 2;
        int i4 = size2 / 2;
        Rect rect = this.A07;
        int i5 = this.A03 / 2;
        rect.left = i3 - i5;
        rect.right = i3 + i5;
        int i6 = this.A02 / 2;
        rect.top = i4 - i6;
        rect.bottom = i4 + i6;
        this.A06.A03(rect);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        7zS.A1H(this.A05);
        super.setSelected(z);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setState(isSelected() ? View.SELECTED_STATE_SET : View.EMPTY_STATE_SET);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 == r1) goto L21
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L23
        L21:
            r0 = 1
            r303 = r0
        L23:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.navigation.tabbar.glyph.BadgableGlyphView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
