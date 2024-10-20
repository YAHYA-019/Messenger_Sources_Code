package X;

import android.graphics.PointF;

/* loaded from: Kvz.class */
public abstract class Kvz {
    public static final float A00(float f) {
        while (true) {
            float A01 = ((float) C07y.A01.A01(-0.2d, 0.2d)) + f;
            if (Float.valueOf(A01) != null && A01 >= 0.15f && A01 <= 0.65f) {
                return A01;
            }
        }
    }

    public static final PointF A01(PointF pointF) {
        while (true) {
            float f = pointF.x;
            C07y c07y = C07y.A01;
            PointF pointF2 = new PointF(f + ((float) c07y.A01(-0.3d, 0.3d)), pointF.y + ((float) c07y.A01(-0.3d, 0.3d)));
            float f2 = pointF2.x;
            if (0.1f <= f2 && f2 <= 0.9f) {
                float f3 = pointF2.y;
                if (0.2f <= f3 && f3 <= 0.8f) {
                    return pointF2;
                }
            }
        }
    }
}
