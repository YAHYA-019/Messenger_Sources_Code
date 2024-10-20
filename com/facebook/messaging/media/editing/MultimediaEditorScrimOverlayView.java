package com.facebook.messaging.media.editing;

import X.DKC;
import X.GOo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: MultimediaEditorScrimOverlayView.class */
public class MultimediaEditorScrimOverlayView extends View {
    public RectF A00;
    public Integer A01;
    public int A02;

    public MultimediaEditorScrimOverlayView(Context context) {
        super(context);
        this.A01 = null;
        A00();
    }

    public MultimediaEditorScrimOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = null;
        A00();
    }

    public MultimediaEditorScrimOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = null;
        A00();
    }

    private void A00() {
        this.A02 = getContext().getColor(2132213840);
        this.A00 = DKC.A0D();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.A01 != null) {
            Path A0B = DKC.A0B();
            float dimensionPixelSize = GOo.A0A(this).getDimensionPixelSize(this.A01.intValue());
            A0B.addRoundRect(this.A00, dimensionPixelSize, dimensionPixelSize, Path.Direction.CW);
            canvas.clipPath(A0B, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.A00, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.A02);
        canvas.restore();
    }
}
