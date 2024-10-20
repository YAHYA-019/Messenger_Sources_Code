package com.facebook.smartcapture.components;

import X.0FI;
import X.11T;
import X.DKC;
import X.G0x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.R;

/* loaded from: RectDetectionVisualizerView.class */
public final class RectDetectionVisualizerView extends View {
    public Handler A00;
    public int[] A01;
    public int[] A02;
    public final Paint A03;
    public final Path A04;
    public final Path A05;
    public final Paint A06;
    public final Paint A07;
    public final Runnable A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectDetectionVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A04 = DKC.A0B();
        this.A05 = DKC.A0B();
        Paint A09 = DKC.A09();
        DKC.A1M(A09);
        A00(A09);
        this.A07 = A09;
        Paint A092 = DKC.A09();
        DKC.A1L(A092);
        A092.setStrokeWidth(getResources().getDimension(2132279309));
        A00(A092);
        this.A06 = A092;
        Paint A093 = DKC.A09();
        DKC.A1M(A093);
        A00(A093);
        this.A03 = A093;
        this.A08 = new G0x(this);
    }

    private final void A00(Paint paint) {
        paint.setColor(0);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimension(R.dimen.mapbox_four_dp)));
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1497981615);
        super.onAttachedToWindow();
        Handler handler = new Handler();
        handler.post(this.A08);
        this.A00 = handler;
        0FI.A0C(-428774044, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-237318060);
        super.onDetachedFromWindow();
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A08);
        }
        this.A00 = null;
        0FI.A0C(-455829498, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
    }

    public final void setColor(int i, boolean z) {
        this.A02 = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
        postInvalidate();
    }

    public final void setProgress(int i) {
        postInvalidate();
    }
}
