package com.facebook.user.tiles;

import X.0FI;
import X.1BV;
import X.2KQ;
import X.2qN;
import X.2qZ;
import X.4YU;
import X.7zL;
import X.AbstractC05644eg;
import X.AnonymousClass001;
import X.C00i;
import X.C1oo;
import X.C2fd;
import X.C2qa;
import X.C2qg;
import X.C2qh;
import X.C2qz;
import X.C98U;
import X.DKC;
import X.DKE;
import X.ES2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: UserTileView.class */
public class UserTileView extends View {
    public C00i A00;
    public boolean A01;

    public UserTileView(Context context) {
        super(context);
        A00(null, 0);
    }

    public UserTileView(Context context, ES2 es2) {
        super(context);
        1BV A0R = 7zL.A0R(context, 17095);
        this.A00 = A0R;
        A0R.get();
        throw AnonymousClass001.A0Q("asCircle");
    }

    public UserTileView(Context context, Drawable drawable, C2qg c2qg, int i) {
        super(context);
        1BV A0R = 7zL.A0R(context, 17095);
        this.A00 = A0R;
        ((2qN) A0R.get()).A0B(getContext(), (Path) null, drawable, c2qg, (C2qz) null, 0.0f, 0, i, true, false);
        DKE.A0g(this).A04.setCallback(this);
    }

    public UserTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0);
    }

    public UserTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A00 = 7zL.A0R(context, 17095);
        C2qz c2qz = new C2qz(context, attributeSet, i);
        c2qz.A02 = C2qa.TWO_LETTER;
        int i2 = C98U.TERTIARY.colorInt;
        Paint paint = c2qz.A07;
        paint.setColor(i2);
        paint.setTypeface(2KQ.A02.A00(context));
        C2qz.A01(c2qz);
        2qN r0 = (2qN) 4YU.A0p(this.A00);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A09, i, 0);
        C2qh A00 = AbstractC05644eg.A00(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        A00.A00(C2fd.A0c, 2132345647);
        r0.A0C(context, attributeSet, new C2qg(A00), c2qz, i);
        DKE.A0g(this).A04.setCallback(this);
        setForeground(null);
    }

    public void A01(int i) {
        DKE.A0g(this).A08(i);
    }

    public void A02(Canvas canvas, Drawable drawable) {
        if (this.A01) {
            2qN r0 = (2qN) 4YU.A0p(this.A00);
            int width = getWidth();
            int height = getHeight();
            r0.A04.setBounds(getPaddingLeft(), getPaddingTop(), width - getPaddingRight(), height - getPaddingBottom());
            Drawable drawable2 = r0.A03;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, width, height);
            }
            this.A01 = false;
        }
        drawable.draw(canvas);
    }

    public void A03(2qZ r302) {
        DKE.A0g(this).A0D(r302);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        DKC.A1O(DKE.A0g(this).A04, this);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        DKE.A0g(this).A04.jumpToCurrentState();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1191906781);
        super.onAttachedToWindow();
        DKE.A0g(this).A06();
        0FI.A0C(-2047012735, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-968442284);
        DKE.A0g(this).A07();
        super.onDetachedFromWindow();
        0FI.A0C(-2096068858, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        A02(canvas, DKE.A0g(this).A04);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L8;
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
            X.00i r0 = r0.A00
            java.lang.Object r0 = X.4YU.A0p(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r301
            X.2qN r0 = X.DKE.A0g(r0)
            android.graphics.drawable.Drawable r0 = r0.A04
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L28
        L19:
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L2b
        L28:
            r0 = 1
            r305 = r0
        L2b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.tiles.UserTileView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
