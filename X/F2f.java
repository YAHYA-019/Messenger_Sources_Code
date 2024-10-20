package X;

import android.graphics.Canvas;

/* loaded from: F2f.class */
public abstract class F2f {
    public static final float A00(float f, float f2, float f3, long j) {
        float f4 = f - f2;
        if (Math.abs(f4) >= 0.001f) {
            float f5 = (f3 * ((float) j)) / 1.6666667E7f;
            f = f2 + Math.max(Math.min(f4, f5), -f5);
        }
        return f;
    }

    public static final void A01(Canvas canvas, C00m c00m) {
        11T.A0F(canvas, 0);
        canvas.save();
        c00m.invoke();
        canvas.restore();
    }
}
