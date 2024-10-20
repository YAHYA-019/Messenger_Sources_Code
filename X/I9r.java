package X;

import android.graphics.RectF;
import android.opengl.Matrix;

/* loaded from: I9r.class */
public abstract class I9r {
    public static void A00(RectF rectF, float[] fArr) {
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width(), rectF.height(), 1.0f);
    }

    public static void A01(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void A02(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void A03(float[] fArr, float f) {
        if (f != 0.0f) {
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
    }
}
