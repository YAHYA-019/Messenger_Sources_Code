package X;

import com.facebook.acra.constants.ActionId;
import java.util.Arrays;

/* loaded from: L2i.class */
public final class L2i {
    public static float[] A0I;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final float[] A0H;

    /* JADX WARN: Multi-variable type inference failed */
    public L2i(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float f7;
        float f8 = f3;
        this.A09 = f;
        this.A0A = f2;
        this.A0B = f3;
        this.A0D = f4;
        this.A0C = f5;
        this.A0E = f6;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        byte b = false;
        boolean z = true;
        boolean z2 = i == 1 || (i == 4 ? f10 > 0.0f : !(i != 5 || f10 >= 0.0f));
        this.A0G = z2;
        float f11 = f2 - f;
        float f12 = 1.0f / f11;
        this.A08 = f12;
        if ((3 == i ? true : b) == true || Math.abs(f9) < 0.001f || Math.abs(f10) < 0.001f) {
            float hypot = (float) Math.hypot(f10, f9);
            this.A00 = hypot;
            this.A03 = hypot * f12;
            this.A06 = f9 / f11;
            this.A07 = f10 / f11;
            this.A0H = new float[ActionId.ON_VIEW_CREATED_END];
            float f13 = 0.0f / 0.0f;
            this.A04 = f13;
            this.A05 = f13;
        } else {
            this.A0H = new float[ActionId.ON_VIEW_CREATED_END];
            int i2 = 1;
            if (z2) {
                i2 = -1;
                float f14 = 0.0f / 0.0f;
            }
            this.A04 = i2 * f9;
            if (!z2) {
                z = -1;
                float f15 = 0.0f / 0.0f;
            }
            this.A05 = f10 * (z ? 1.0f : 0.0f);
            this.A06 = z2 ? f5 : f8;
            this.A07 = z2 ? f4 : f6;
            float f16 = f4 - f6;
            int length = A00().length;
            int i3 = 0;
            int i4 = 0;
            float f17 = 0.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            while (i4 < length) {
                double radians = (float) Math.toRadians((i4 * 90.0d) / (A00().length - 1));
                float sin = (float) Math.sin(radians);
                float cos = (float) Math.cos(radians);
                float f20 = sin * f9;
                float f21 = cos * f16;
                if (i4 > 0) {
                    f17 += (float) Math.hypot(f20 - f18, f21 - f19);
                    A00()[i4] = f17;
                }
                i4++;
                f19 = f21;
                f18 = f20;
            }
            this.A00 = f17;
            int length2 = A00().length;
            for (int i5 = 0; i5 < length2; i5++) {
                float[] A00 = A00();
                A00[i5] = A00[i5] / f17;
            }
            float[] fArr = this.A0H;
            do {
                float f22 = i3 / 100.0f;
                float[] A002 = A00();
                int binarySearch = Arrays.binarySearch(A002, 0, A002.length, f22);
                if (binarySearch >= 0) {
                    f7 = binarySearch;
                } else {
                    float f23 = 0.0f / 0.0f;
                    if (binarySearch == -1) {
                        fArr[i3] = 0.0f;
                        i3++;
                    } else {
                        int i6 = -binarySearch;
                        int i7 = i6 - 2;
                        f7 = i7 + ((f22 - A00()[i7]) / (A00()[i6 - 1] - A00()[i7]));
                    }
                }
                fArr[i3] = f7 / (A00().length - 1);
                i3++;
            } while (i3 < 101);
            this.A03 = this.A00 * f12;
            z = false;
        }
        this.A0F = z;
    }

    public static final float[] A00() {
        float[] fArr = A0I;
        if (fArr == null) {
            fArr = new float[91];
            A0I = fArr;
        }
        11T.A0D(fArr);
        return fArr;
    }

    public final void A01(float f) {
        float f2 = (this.A0G ? this.A0A - f : f - this.A09) * this.A08;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float[] fArr = this.A0H;
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                f3 = JQx.A02(fArr[i + 1], fArr[i], f4 - i);
            }
        }
        double d = f3 * 1.5707964f;
        this.A02 = (float) Math.sin(d);
        this.A01 = (float) Math.cos(d);
    }
}
