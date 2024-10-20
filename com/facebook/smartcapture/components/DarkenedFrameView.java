package com.facebook.smartcapture.components;

import X.11T;
import X.DKC;
import X.Kw8;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: DarkenedFrameView.class */
public final class DarkenedFrameView extends View {
    public final float A00;
    public final float A01;
    public final Path A02;
    public final RectF A03;
    public final RectF A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkenedFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A02 = DKC.A0B();
        this.A04 = DKC.A0D();
        this.A03 = DKC.A0D();
        this.A05 = Kw8.A00(context, 2130971536);
        Resources resources = getResources();
        this.A01 = resources.getDimension(2132279298);
        this.A00 = resources.getDimension(2132279314);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        canvas.clipOutPath(this.A02);
        canvas.drawColor(this.A05);
    }
}
