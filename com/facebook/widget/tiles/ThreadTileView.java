package com.facebook.widget.tiles;

import X.0FI;
import X.1BY;
import X.1Bn;
import X.5YD;
import X.C1oo;
import X.C2fr;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.acra.constants.ActionId;

/* loaded from: ThreadTileView.class */
public class ThreadTileView extends View {
    public int A00;
    public Rect A01;
    public 5YD A02;

    public ThreadTileView(Context context) {
        super(context);
        A00(null, 0);
    }

    public ThreadTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0);
    }

    public ThreadTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A02 = (5YD) 1Bn.A0E(context, (1BY) null, 49774);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2m);
        this.A00 = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
        5YD r0 = this.A02;
        r0.getClass();
        r0.A08(context, attributeSet, i);
        5YD r02 = this.A02;
        r02.getClass();
        r02.A06.setCallback(this);
        setForeground(null);
    }

    public void A01(C2fr c2fr) {
        5YD r0 = this.A02;
        r0.getClass();
        r0.A0A = c2fr;
        5YD.A03(r0);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        5YD r0 = this.A02;
        r0.getClass();
        r0.A06.setState(getDrawableState());
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        5YD r0 = this.A02;
        r0.getClass();
        r0.A06.jumpToCurrentState();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(535262951);
        super.onAttachedToWindow();
        5YD r0 = this.A02;
        r0.getClass();
        if (r0.A0D) {
            r0.A0D = false;
            r0.A0I.A00();
            5YD.A03(r0);
        }
        0FI.A0C(360067833, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(818005512);
        5YD r0 = this.A02;
        r0.getClass();
        r0.A06();
        super.onDetachedFromWindow();
        0FI.A0C(-1335390307, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        5YD r0 = this.A02;
        r0.getClass();
        r0.A06.draw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.A01;
        if (rect == null) {
            rect = new Rect();
            this.A01 = rect;
        }
        5YD r0 = this.A02;
        r0.getClass();
        int i8 = r0.A03;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (height - getPaddingTop()) - getPaddingBottom();
        int i9 = this.A00;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 != 1) {
            i5 = paddingLeft - i8;
            i6 = 0;
            if (i10 != 5) {
                i6 = i5;
                i5 = 0;
            }
        } else {
            i5 = (paddingLeft - i8) / 2;
            i6 = i5;
        }
        int i12 = i9 & ActionId.MISSED_EVENT;
        if (i12 != 16) {
            i7 = paddingTop - i8;
            if (i12 == 80) {
                i11 = i7;
                i7 = 0;
            }
        } else {
            i11 = (paddingTop - i8) / 2;
            i7 = i11;
        }
        rect.set(getPaddingLeft() + i5, getPaddingTop() + i11, width - (getPaddingRight() + i6), height - (getPaddingBottom() + i7));
        Rect rect2 = this.A01;
        5YD r02 = this.A02;
        r02.getClass();
        int width2 = getWidth();
        int height2 = getHeight();
        r02.A06.setBounds(rect2);
        Drawable drawable = r02.A05;
        if (drawable != null) {
            drawable.setBounds(0, 0, width2, height2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        5YD r0 = this.A02;
        r0.getClass();
        int i3 = r0.A03;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    public void setOpacity(int i) {
        5YD r0 = this.A02;
        r0.getClass();
        r0.A06.setAlpha(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
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
            r0 = r301
            X.5YD r0 = r0.A02
            r303 = r0
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            r0 = r303
            android.graphics.drawable.Drawable r0 = r0.A06
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L23
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L26
        L23:
            r0 = 1
            r305 = r0
        L26:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.tiles.ThreadTileView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
