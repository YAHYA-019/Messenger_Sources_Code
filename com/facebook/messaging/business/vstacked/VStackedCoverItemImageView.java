package com.facebook.messaging.business.vstacked;

import X.DKC;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: VStackedCoverItemImageView.class */
public class VStackedCoverItemImageView extends ImageView {
    public final Paint A00;

    public VStackedCoverItemImageView(Context context) {
        super(context);
        this.A00 = DKC.A09();
    }

    public VStackedCoverItemImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = DKC.A09();
    }

    public VStackedCoverItemImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = DKC.A09();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A00;
        paint.setColor(getContext().getColor(2132213826));
        canvas.drawPaint(paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) (size / 1.9d));
    }
}
