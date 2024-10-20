package com.facebook.messaging.ui.facepile;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.2qF;
import X.2qN;
import X.2qZ;
import X.7zN;
import X.AnonymousClass001;
import X.C00i;
import X.C1oo;
import X.C2qg;
import X.C2qz;
import X.DNE;
import X.DNL;
import X.FsF;
import X.GFA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.collect.ImmutableList;

/* loaded from: UriCrescentPileView.class */
public final class UriCrescentPileView extends View implements GFA {
    public DNE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriCrescentPileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriCrescentPileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(attributeSet, i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriCrescentPileView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(attributeSet, i, i2);
    }

    private final void A00(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0V, i, i2);
        11T.A0A(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, (-dimensionPixelSize) / 2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize / 8);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize <= 0) {
            throw AnonymousClass001.A0N("Must have tile size attribute");
        }
        if (dimensionPixelSize2 >= 0) {
            throw AnonymousClass001.A0N("Crescent offset has to be negative.");
        }
        DNE A0y = 7zN.A0C(597).A0y(context, this, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        this.A00 = A0y;
        A0y.setCallback(this);
        setWillNotDraw(false);
    }

    public final void A01(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        DNE dne = this.A00;
        if (dne == null) {
            11T.A0L("crescentPileDrawable");
            throw 0Q8.createAndThrow();
        }
        dne.A02(immutableList);
        requestLayout();
    }

    public /* bridge */ /* synthetic */ Drawable BFh(Context context, Object obj, int i, int i2, int i3) {
        Uri uri = (Uri) obj;
        11T.A0H(context, uri);
        DNL dnl = (DNL) 1Bn.A0E(context, (1BY) null, 99788);
        dnl.A00 = i;
        dnl.A01 = uri;
        C00i c00i = dnl.A02.A00;
        float f = i;
        ((2qN) c00i.get()).A0B(context, 2qF.A00((i2 + i) / f, i3 / f, 180.0f, i), (Drawable) null, C2qg.A0C, (C2qz) null, 0.0f, i, 2qN.A0W, false, false);
        ((2qN) c00i.get()).A0D(2qZ.A07(new PicSquare(new PicSquareUrlWithSize(i, uri.toString()), null, null)));
        ((2qN) c00i.get()).A0A = new FsF(dnl, 3);
        return dnl;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(722080547);
        super.onAttachedToWindow();
        DNE dne = this.A00;
        if (dne == null) {
            11T.A0L("crescentPileDrawable");
            throw 0Q8.createAndThrow();
        }
        dne.BjV();
        0FI.A0C(-2004409983, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1263918147);
        super.onDetachedFromWindow();
        DNE dne = this.A00;
        if (dne != null) {
            DNE.A01(dne);
            DNE dne2 = this.A00;
            if (dne2 != null) {
                dne2.A02(1BK.A0b());
                0FI.A0C(768635645, A06);
                return;
            }
        }
        11T.A0L("crescentPileDrawable");
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), 0.0f);
        DNE dne = this.A00;
        if (dne == null) {
            11T.A0L("crescentPileDrawable");
            throw 0Q8.createAndThrow();
        }
        dne.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        DNE dne = this.A00;
        if (dne != null) {
            int resolveSize = View.resolveSize(dne.getIntrinsicWidth() + paddingLeft + paddingRight, i);
            DNE dne2 = this.A00;
            if (dne2 != null) {
                int resolveSize2 = View.resolveSize(dne2.getIntrinsicHeight() + paddingTop + paddingBottom, i2);
                setMeasuredDimension(resolveSize, resolveSize2);
                DNE dne3 = this.A00;
                if (dne3 != null) {
                    dne3.setBounds(paddingLeft, paddingTop, resolveSize - paddingRight, resolveSize2 - paddingBottom);
                    return;
                }
            }
        }
        11T.A0L("crescentPileDrawable");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L10;
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
            X.DNE r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L19
            java.lang.String r0 = "crescentPileDrawable"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L19:
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L2e
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L30
        L2e:
            r0 = 1
            r303 = r0
        L30:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.ui.facepile.UriCrescentPileView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
