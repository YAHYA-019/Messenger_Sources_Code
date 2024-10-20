package com.facebook.messaging.media.editing;

import X.0FI;
import X.DKC;
import X.GOo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ContentFramingLayout.class */
public class ContentFramingLayout extends CustomFrameLayout {
    public float A00;
    public int A01;
    public final Paint A02;
    public final Path A03;
    public final RectF A04;

    public ContentFramingLayout(Context context) {
        this(context, null);
    }

    public ContentFramingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFramingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Path A0B = DKC.A0B();
        this.A03 = A0B;
        this.A04 = DKC.A0D();
        this.A01 = 0;
        this.A00 = 1.0f;
        Paint A0B2 = GOo.A0B();
        this.A02 = A0B2;
        A0B2.setStyle(Paint.Style.FILL);
        A0B2.setColor(-16777216);
        A0B.setFillType(Path.FillType.EVEN_ODD);
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(2132279610);
        resources.getDimensionPixelSize(2132279609);
        resources.getDimensionPixelSize(2132279608);
        resources.getDimensionPixelSize(2132279298);
    }

    public static void A04(ContentFramingLayout contentFramingLayout, int i, int i2) {
        int height = contentFramingLayout.getHeight();
        int width = contentFramingLayout.getWidth();
        if (height > 0) {
            RectF rectF = contentFramingLayout.A04;
            float f = i;
            float f2 = i2;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = width;
            float f4 = height;
            float f5 = f3 / f4;
            float f6 = contentFramingLayout.A00;
            if (f5 < f6) {
                rectF.inset(0.0f, (f4 - (f3 / f6)) / 2.0f);
            } else {
                rectF.inset((f3 - (f4 * f6)) / 2.0f, 0.0f);
            }
            Path path = contentFramingLayout.A03;
            path.reset();
            path.addRect(0.0f, 0.0f, f, f2, Path.Direction.CW);
            path.addRoundRect(rectF, 0.0f, 0.0f, Path.Direction.CCW);
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A01 != 0) {
            canvas.drawPath(this.A03, this.A02);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-356770798);
        super.onSizeChanged(i, i2, i3, i4);
        A04(this, i, i2);
        0FI.A0C(-14983448, A06);
    }
}
