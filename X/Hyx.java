package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: Hyx.class */
public final class Hyx {
    public float A00;
    public float A01;
    public int A02 = -1;
    public final int A03;

    public Hyx(int i, float f) {
        this.A03 = i;
        this.A01 = f;
    }

    public static void A00(Canvas canvas, Paint paint, Paint paint2, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        float f4 = 360.0f / 30.0f;
        float f5 = (1.0f - f3) * f4;
        if (!z) {
            f5 = Math.max(f5, 0.1f);
        }
        float f6 = f2 + ((((i * f4) + 270.0f) - (f4 / 2.0f)) - (f5 / 2.0f));
        if (z) {
            float width = ((float) ((rectF.width() / 2.0f) * 6.283185307179586d)) * (f5 / 360.0f);
            if (width < f) {
                paint.setStrokeWidth(width);
            } else {
                paint.setStrokeWidth(f);
            }
        }
        canvas.drawArc(rectF, f6, f5, false, paint);
        if (paint2.getAlpha() > 0) {
            canvas.drawArc(rectF, f6, f5, false, paint2);
        }
    }
}
