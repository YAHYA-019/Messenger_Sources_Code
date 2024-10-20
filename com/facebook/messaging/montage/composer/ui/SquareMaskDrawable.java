package com.facebook.messaging.montage.composer.ui;

import X.0KF;
import X.11T;
import X.2Cb;
import X.2DX;
import X.2EU;
import X.7zL;
import X.7zR;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.GOo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SquareMaskDrawable.class */
public final class SquareMaskDrawable extends FrameLayout {
    public 2EU A00;
    public final 2DX A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareMaskDrawable(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareMaskDrawable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareMaskDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A01 = 2Cb.A01().A06();
    }

    public /* synthetic */ SquareMaskDrawable(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.dispatchDraw(canvas);
        2EU r304 = this.A00;
        if (r304 == null) {
            r304 = this.A01.A04(getWidth(), getHeight());
            Canvas A0B = 7zR.A0B(r304);
            RectF rectF = new RectF(0.0f, 0.0f, DKC.A02(this), DKC.A03(this));
            Paint A0A = DKC.A0A(1);
            A0A.setAlpha(60);
            A0B.drawRect(rectF, A0A);
            A0A.setColor(0);
            DKD.A19(A0A, PorterDuff.Mode.SRC_OUT);
            Paint A0A2 = DKC.A0A(1);
            A0A2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 225.0f, new int[]{Color.argb(0KF.A01(178.5f), 0, 0, 0), Color.argb(0, 0, 0, 0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            A0B.drawRect(rectF, A0A2);
            float width = getWidth() / 2;
            float height = getHeight() / 2;
            float A02 = DKC.A02(this) * 0.73f;
            float f = A02 / 2.0f;
            float f2 = width - f;
            float f3 = height - f;
            RectF rectF2 = new RectF(f2, f3, f2 + A02, f3 + A02);
            Paint A0A3 = DKC.A0A(1);
            A0A3.setColor(Color.argb(0KF.A01(127.5f), 0, 0, 0));
            DKC.A1L(A0A3);
            A0A3.setStrokeWidth(2.0f);
            float f4 = A02 * 0.1f;
            A0B.drawRoundRect(rectF2, f4, f4, A0A);
            A0B.drawRoundRect(rectF2, f4, f4, A0A3);
            this.A00 = r304;
        }
        r304.A09();
        Paint A0B2 = GOo.A0B();
        A0B2.setColor(Color.argb(0KF.A01(102.0f), 0, 0, 0));
        canvas.drawBitmap(7zL.A0C(r304), 0.0f, 0.0f, A0B2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A00 = null;
    }
}
