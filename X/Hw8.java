package X;

import android.graphics.Matrix;

/* loaded from: Hw8.class */
public abstract class Hw8 {
    public static Matrix A00(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix A0F = GOn.A0F();
        A0F.setValues(fArr2);
        return A0F;
    }

    public static float[] A01(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] A1a = GOn.A1a();
        A1a[0] = fArr[0];
        A1a[1] = fArr[3];
        A1a[2] = 0.0f;
        A1a[3] = fArr[6];
        A1a[4] = fArr[1];
        A1a[5] = fArr[4];
        A1a[6] = 0.0f;
        A1a[7] = fArr[7];
        A1a[8] = 0.0f;
        A1a[9] = 0.0f;
        A1a[10] = 1.0f;
        A1a[11] = 0.0f;
        A1a[12] = fArr[2];
        A1a[13] = fArr[5];
        A1a[14] = 0.0f;
        A1a[15] = fArr[8];
        return A1a;
    }
}
