package X;

import android.opengl.GLES20;

/* loaded from: Il4.class */
public final class Il4 implements JJO {
    public float A00;
    public float[] A01;
    public int A02;
    public int A03;
    public static final float[] A06 = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
    public static final float[] A04 = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
    public static final float[] A05 = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

    public void C9H(RSL rsl) {
        this.A03 = rsl.A01("xUnit");
        this.A02 = rsl.A01("coeffs");
    }

    public void CDU(RSL rsl, float[] fArr, int i, int i2, int i3, int i4) {
        GLES20.glUniform4fv(this.A02, 1, this.A01, 0);
        int i5 = this.A03;
        float f = this.A00;
        float f2 = fArr[0] * f;
        float f3 = i;
        GLES20.glUniform2f(i5, f2 / f3, (f * fArr[1]) / f3);
    }
}
