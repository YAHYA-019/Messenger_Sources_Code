package com.facebook.messaging.montage.composer.cameracore.view;

import X.11T;
import X.AnonymousClass001;
import X.C1oo;
import X.DKC;
import X.DKF;
import X.DKG;
import X.GOn;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CameraRingView.class */
public final class CameraRingView extends View {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraRingView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraRingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraRingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0I, i, 0);
        11T.A0A(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        Paint A09 = DKC.A09();
        this.A02 = A09;
        DKC.A1L(A09);
        A09.setStrokeCap(Paint.Cap.BUTT);
        A09.setStrokeWidth(dimensionPixelSize);
        A09.setColor(color);
        obtainStyledAttributes.recycle();
        this.A03 = DKC.A0D();
        Resources resources = getResources();
        this.A01 = DKC.A04(resources);
        this.A00 = resources.getDimensionPixelSize(2132279351);
    }

    public /* synthetic */ CameraRingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        canvas.drawOval(this.A03, this.A02);
    }

    public final void setProgress(float f) {
        float f2 = ((1.0f - 1.2f) * f) + 1.2f;
        setScaleX(f2);
        setScaleY(f2);
        setAlpha(0.5f * f);
        float A03 = GOn.A03(this.A00 - r0, f) + this.A01;
        if (A03 <= 0.0f) {
            throw AnonymousClass001.A0N("Please set a positive thickness");
        }
        this.A02.setStrokeWidth(A03);
        float f3 = A03 / 2.0f;
        this.A03.set(getLeft() + f3, getTop() + f3, getRight() - f3, getBottom() - f3);
        invalidate();
    }
}
