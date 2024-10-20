package X;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: Kko.class */
public final class Kko {
    public float A00;
    public float A01;
    public final Matrix A02 = GOn.A0F();
    public final View A03;
    public final float[] A04;

    public Kko(View view, float[] fArr) {
        this.A03 = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.A04 = fArr2;
        float f = fArr2[2];
        this.A00 = f;
        float f2 = fArr2[5];
        this.A01 = f2;
        fArr2[2] = f;
        fArr2[5] = f2;
        Matrix matrix = this.A02;
        matrix.setValues(fArr2);
        KcV.A02.A01(matrix, this.A03);
    }
}
