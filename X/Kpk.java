package X;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: Kpk.class */
public final class Kpk {
    public final float[] A00;
    public final float[] A01;
    public final float[] A02;

    public Kpk(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 1.0f)) + 1;
        this.A01 = new float[i];
        this.A02 = new float[i];
        this.A00 = new float[i];
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return;
            }
            pathMeasure.getPosTan((i3 * length) / (i - 1), fArr, fArr2);
            this.A01[i3] = fArr[0];
            this.A02[i3] = fArr[1];
            this.A00[i3] = ((((float) Math.atan2(fArr2[1], fArr2[0])) / 3.1415927f) * 180.0f) + 90.0f;
            i2 = i3 + 1;
        }
    }

    public final float A00(float f) {
        float[] fArr = this.A00;
        int length = fArr.length;
        if (length == 1) {
            return fArr[0];
        }
        float A01 = 07C.A01(f, 0.0f, 1.0f) * (length - 1);
        int A02 = 07C.A02((int) A01, 0, length - 2);
        int i = A02 + 1;
        float f2 = A01 - A02;
        float f3 = fArr[A02];
        return ((fArr[i] - f3) * f2) + f3;
    }
}
