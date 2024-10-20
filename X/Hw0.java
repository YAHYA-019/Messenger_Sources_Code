package X;

import android.graphics.RectF;
import android.opengl.Matrix;

/* loaded from: Hw0.class */
public abstract class Hw0 {
    public static HhA A00() {
        I2I A00 = I2I.A00();
        I7A.A01(A00, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 2);
        return I7A.A00(A00, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public static void A01(I8v i8v, float[] fArr, float[] fArr2) {
        int i;
        int i2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        C0k4.A00(i8v.A0E);
        RectF rectF = i8v.A0E;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, i8v.A0E.width(), i8v.A0E.height(), 1.0f);
        if (i8v.A0O) {
            if (i8v.A07 % 180 != 0) {
                i = i8v.A06;
                i2 = i8v.A08;
            } else {
                i = i8v.A08;
                i2 = i8v.A06;
            }
            RectF rectF2 = i8v.A0E;
            if (rectF2 == null) {
                rectF2 = I8v.A0P;
            }
            float width = (i * rectF2.width()) / (i2 * rectF2.height());
            if (i8v.A0B % 180 != 0) {
                width = 1.0f / width;
            }
            Matrix.scaleM(fArr2, 0, 1.0f, (i8v.A0C / width) / i8v.A0A, 1.0f);
        }
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        if (i8v.A0H == 0S2.A01) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr, 0, i8v.A0B, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }
}
