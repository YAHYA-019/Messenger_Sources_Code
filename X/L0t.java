package X;

/* loaded from: L0t.class */
public final class L0t {
    public static final L0t A0A;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float[] A09;

    static {
        float f;
        float f2;
        float f3;
        float[] fArr = Kyl.A00;
        float pow = ((float) Math.pow((50.0d + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        float f4 = (float) ((pow * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = Kyl.A03;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float A03 = JQz.A03(fArr3, f7, f6, 1);
        float f8 = fArr[2];
        float A032 = JQz.A03(fArr3, f8, A03, 2);
        float[] fArr4 = fArr2[1];
        float A033 = JQz.A03(fArr4, f8, JR0.A02(fArr4, f5, f7, 0, 1), 2);
        float[] fArr5 = fArr2[2];
        float f9 = (f5 * fArr5[0]) + (f7 * fArr5[1]) + (f8 * fArr5[2]);
        float f10 = (2.0f / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            f = (f10 - 0.9f) * 10.0f;
            f2 = 0.59f;
            f3 = 0.69f;
        } else {
            f = (f10 - 0.8f) * 10.0f;
            f2 = 0.525f;
            f3 = 0.59f;
        }
        float f11 = f2 + ((f3 - f2) * f);
        float exp = (1.0f - (((float) Math.exp(((-f4) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / A032) * exp) + 1.0f) - exp, (((100.0f / A033) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f4) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f4) + (0.1f * f14 * f14 * ((float) Math.cbrt(f4 * 5.0d)));
        float f15 = pow / fArr[1];
        double d2 = f15;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow2 = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow3 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * A032) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * A033) / 100.0d, 0.42d), pow3};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        A0A = new L0t(fArr6, f15, ((f17 * 2.0f) + ((f18 * 400.0f) / (f18 + 27.13f)) + (((400.0f * pow3) / (pow3 + 27.13f)) * 0.05f)) * pow2, pow2, pow2, f11, f10, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public L0t(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A04 = f;
        this.A00 = f2;
        this.A05 = f3;
        this.A07 = f4;
        this.A01 = f5;
        this.A06 = f6;
        this.A09 = fArr;
        this.A02 = f7;
        this.A03 = f8;
        this.A08 = f9;
    }
}
