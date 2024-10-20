package X;

import android.graphics.Color;

/* loaded from: L9q.class */
public final class L9q {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public L9q(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A05 = f4;
        this.A00 = f5;
        this.A01 = f6;
    }

    public static int A00(L9q l9q, L0t l0t) {
        float f;
        float f2 = l9q.A02;
        if (f2 != 0.0d) {
            double d = l9q.A04;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, l0t.A04), 0.73d), 1.1111111111111112d);
                double d2 = (l9q.A03 * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
                float pow2 = l0t.A00 * ((float) Math.pow(l9q.A04 / 100.0d, (1.0d / l0t.A01) / l0t.A08));
                float f3 = cos * 3846.1538f * l0t.A06 * l0t.A07;
                float f4 = pow2 / l0t.A05;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f5 = (((0.305f + f4) * 23.0f) * pow) / (((f3 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f4 * 460.0f;
                float f9 = (((451.0f * f6) + f8) + (288.0f * f7)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                double abs = Math.abs(f9);
                float max = (float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs));
                float signum = Math.signum(f9);
                float f12 = 100.0f / l0t.A02;
                float pow3 = signum * f12 * ((float) Math.pow(max, 2.380952380952381d));
                double abs2 = Math.abs(f10);
                float signum2 = Math.signum(f10) * f12 * ((float) Math.pow((float) Math.max(0.0d, (abs2 * 27.13d) / (400.0d - abs2)), 2.380952380952381d));
                double abs3 = Math.abs(f11);
                float signum3 = Math.signum(f11) * f12 * ((float) Math.pow((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs3)), 2.380952380952381d));
                float[] fArr = l0t.A09;
                float f13 = pow3 / fArr[0];
                float f14 = signum2 / fArr[1];
                float f15 = signum3 / fArr[2];
                float[][] fArr2 = Kyl.A01;
                float[] fArr3 = fArr2[0];
                float A03 = JQz.A03(fArr3, f15, JR0.A02(fArr3, f13, f14, 0, 1), 2);
                float[] fArr4 = fArr2[1];
                float A032 = JQz.A03(fArr4, f15, JR0.A02(fArr4, f13, f14, 0, 1), 2);
                float[] fArr5 = fArr2[2];
                return 1tG.A02(A03, A032, (f13 * fArr5[0]) + (f14 * fArr5[1]) + (f15 * fArr5[2]));
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, l0t.A04), 0.73d), 1.1111111111111112d);
        double d22 = (l9q.A03 * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f;
        float pow22 = l0t.A00 * ((float) Math.pow(l9q.A04 / 100.0d, (1.0d / l0t.A01) / l0t.A08));
        float f32 = cos3 * 3846.1538f * l0t.A06 * l0t.A07;
        float f42 = pow22 / l0t.A05;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f52 = (((0.305f + f42) * 23.0f) * pow4) / (((f32 * 23.0f) + ((11.0f * pow4) * cos22)) + ((pow4 * 108.0f) * sin2));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f42 * 460.0f;
        float f92 = (((451.0f * f62) + f82) + (288.0f * f72)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        double abs4 = Math.abs(f92);
        float max2 = (float) Math.max(0.0d, (abs4 * 27.13d) / (400.0d - abs4));
        float signum4 = Math.signum(f92);
        float f122 = 100.0f / l0t.A02;
        float pow32 = signum4 * f122 * ((float) Math.pow(max2, 2.380952380952381d));
        double abs22 = Math.abs(f102);
        float signum22 = Math.signum(f102) * f122 * ((float) Math.pow((float) Math.max(0.0d, (abs22 * 27.13d) / (400.0d - abs22)), 2.380952380952381d));
        double abs32 = Math.abs(f112);
        float signum32 = Math.signum(f112) * f122 * ((float) Math.pow((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs32)), 2.380952380952381d));
        float[] fArr6 = l0t.A09;
        float f132 = pow32 / fArr6[0];
        float f142 = signum22 / fArr6[1];
        float f152 = signum32 / fArr6[2];
        float[][] fArr22 = Kyl.A01;
        float[] fArr32 = fArr22[0];
        float A033 = JQz.A03(fArr32, f152, JR0.A02(fArr32, f132, f142, 0, 1), 2);
        float[] fArr42 = fArr22[1];
        float A0322 = JQz.A03(fArr42, f152, JR0.A02(fArr42, f132, f142, 0, 1), 2);
        float[] fArr52 = fArr22[2];
        return 1tG.A02(A033, A0322, (f132 * fArr52[0]) + (f142 * fArr52[1]) + (f152 * fArr52[2]));
    }

    public static L9q A01(float f, float f2, float f3) {
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f2 * L0t.A0A.A03 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new L9q(f3, f2, f, f4, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public static L9q A02(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        L0t l0t = L0t.A0A;
        float A00 = Kyl.A00(Color.red(i));
        float A002 = Kyl.A00(Color.green(i));
        float A003 = Kyl.A00(Color.blue(i));
        float[][] fArr3 = Kyl.A02;
        float[] fArr4 = fArr3[0];
        JQz.A1T(fArr2, 0, fArr4[2], A003, JQz.A03(fArr4, A002, fArr4[0] * A00, 1));
        float[] fArr5 = fArr3[1];
        JQz.A1T(fArr2, 1, fArr5[2], A003, JR0.A02(fArr5, A00, A002, 0, 1));
        float[] fArr6 = fArr3[2];
        float f = (A00 * fArr6[0]) + (A002 * fArr6[1]) + (A003 * fArr6[2]);
        fArr2[2] = f;
        float[][] fArr7 = Kyl.A03;
        float f2 = fArr2[0];
        float[] fArr8 = fArr7[0];
        float f3 = fArr8[0] * f2;
        float f4 = fArr2[1];
        float A03 = JQz.A03(fArr8, f, JQz.A03(fArr8, f4, f3, 1), 2);
        float[] fArr9 = fArr7[1];
        float A032 = JQz.A03(fArr9, f, JR0.A02(fArr9, f2, f4, 0, 1), 2);
        float[] fArr10 = fArr7[2];
        float f5 = (f2 * fArr10[0]) + (f4 * fArr10[1]) + (f * fArr10[2]);
        float[] fArr11 = l0t.A09;
        float f6 = fArr11[0] * A03;
        float f7 = fArr11[1] * A032;
        float f8 = fArr11[2] * f5;
        float f9 = l0t.A02;
        float pow = (float) Math.pow((Math.abs(f6) * f9) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f7) * f9) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((f9 * Math.abs(f8)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (signum * 11.0d) + (signum2 * (-12.0d));
        double d2 = signum3;
        float f10 = ((float) (d + d2)) / 11.0f;
        float f11 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f12 = signum * 20.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((f12 + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f11, f10)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = (3.1415927f * atan2) / 180.0f;
        float f17 = f15 * l0t.A05;
        float f18 = l0t.A00;
        double d3 = f17 / f18;
        float f19 = l0t.A01;
        float pow4 = ((float) Math.pow(d3, f19 * l0t.A08)) * 100.0f;
        float sqrt = (4.0f / f19) * ((float) Math.sqrt(pow4 / 100.0f)) * (f18 + 4.0f);
        float f20 = l0t.A03;
        float f21 = sqrt * f20;
        float sqrt2 = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, l0t.A04), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(JQy.A00(((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * l0t.A06) * l0t.A07) * ((float) JQy.A01(f11, f10 * f10))) / (f14 + 0.305f), 0.9d));
        float f22 = f20 * sqrt2;
        float sqrt3 = ((float) Math.sqrt((r0 * f19) / r0)) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * f22) + 1.0f)) * 43.85965f;
        double d4 = f16;
        float cos = ((float) Math.cos(d4)) * log;
        float sin = log * ((float) Math.sin(d4));
        fArr2[0] = atan2;
        fArr2[1] = sqrt2;
        fArr[0] = pow4;
        fArr[1] = f21;
        fArr[2] = f22;
        fArr[3] = sqrt3;
        fArr[4] = f23;
        fArr[5] = cos;
        fArr[6] = sin;
        return new L9q(fArr2[0], fArr2[1], fArr[0], fArr[4], fArr[5], sin);
    }
}
