package com.facebook.messaging.ui.facepile;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bn;
import X.AbL;
import X.AnonymousClass001;
import X.C1F6;
import X.C1oo;
import X.DND;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.inject.FbInjector;

/* loaded from: FaceView.class */
public final class FaceView extends View {
    public DND A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(attributeSet, i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(attributeSet, i, i2);
    }

    private final void A00(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0x, i, i2);
        11T.A0A(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize <= 0) {
            throw AnonymousClass001.A0N("Must have tile size attribute");
        }
        C1F6 c1f6 = (C1F6) 1Bn.A0A(598);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            DND dnd = new DND(context, z, dimensionPixelSize, dimensionPixelSize2);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = dnd;
            dnd.setCallback(this);
            setWillNotDraw(false);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-202495593);
        super.onAttachedToWindow();
        DND dnd = this.A00;
        if (dnd == null) {
            11T.A0L("facePileDrawable");
            throw 0Q8.createAndThrow();
        }
        dnd.BjV();
        0FI.A0C(758253473, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1349871734);
        super.onDetachedFromWindow();
        DND dnd = this.A00;
        if (dnd != null) {
            dnd.BtM();
            DND dnd2 = this.A00;
            if (dnd2 != null) {
                dnd2.A01(1BK.A0b());
                0FI.A0C(761841542, A06);
                return;
            }
        }
        11T.A0L("facePileDrawable");
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), 0.0f);
        DND dnd = this.A00;
        if (dnd == null) {
            11T.A0L("facePileDrawable");
            throw 0Q8.createAndThrow();
        }
        dnd.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        DND dnd = this.A00;
        if (dnd != null) {
            int resolveSize = View.resolveSize(dnd.getIntrinsicWidth() + paddingLeft + paddingRight, i);
            DND dnd2 = this.A00;
            if (dnd2 != null) {
                int resolveSize2 = View.resolveSize(dnd2.getIntrinsicHeight() + paddingTop + paddingBottom, i2);
                setMeasuredDimension(resolveSize, resolveSize2);
                DND dnd3 = this.A00;
                if (dnd3 != null) {
                    dnd3.setBounds(paddingLeft, paddingTop, resolveSize - paddingRight, resolveSize2 - paddingBottom);
                    return;
                }
            }
        }
        11T.A0L("facePileDrawable");
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
            X.DND r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L19
            java.lang.String r0 = "facePileDrawable"
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.ui.facepile.FaceView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
