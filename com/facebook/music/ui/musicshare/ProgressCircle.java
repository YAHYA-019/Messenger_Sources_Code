package com.facebook.music.ui.musicshare;

import X.11T;
import X.DKC;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: ProgressCircle.class */
public final class ProgressCircle extends View {
    public float A00;
    public Paint A01;
    public RectF A02;

    public ProgressCircle(Context context) {
        super(context);
        A00();
    }

    public ProgressCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ProgressCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private final void A00() {
        Resources resources = getResources();
        A01(-1, resources.getDimension(2132279379), resources.getDimension(2132279342));
    }

    public final void A01(int i, float f, float f2) {
        Paint A09 = DKC.A09();
        this.A01 = A09;
        A09.setAntiAlias(true);
        Paint paint = this.A01;
        11T.A0D(paint);
        DKC.A1L(paint);
        Paint paint2 = this.A01;
        11T.A0D(paint2);
        paint2.setStrokeWidth(f);
        Paint paint3 = this.A01;
        11T.A0D(paint3);
        paint3.setColor(i);
        float f3 = f / 2.0f;
        float f4 = (f2 - (f * 2.0f)) + ((3.0f * f) / 2.0f);
        this.A02 = new RectF(f3, f3, f4, f4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        if (this.A00 != 360.0f) {
            RectF rectF = this.A02;
            11T.A0D(rectF);
            float f = this.A00;
            Paint paint = this.A01;
            11T.A0D(paint);
            canvas.drawArc(rectF, 270.0f, f, false, paint);
        }
    }
}
