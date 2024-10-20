package X;

import java.util.Arrays;

/* loaded from: Ksl.class */
public final class Ksl {
    public final float[] A00;
    public final int[] A01;

    public Ksl(float[] fArr, int[] iArr) {
        this.A00 = fArr;
        this.A01 = iArr;
    }

    public Ksl A00(float[] fArr) {
        int A02;
        int length = fArr.length;
        int[] iArr = new int[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new Ksl(fArr, iArr);
            }
            float f = fArr[i2];
            float[] fArr2 = this.A00;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            if (binarySearch >= 0) {
                A02 = this.A01[binarySearch];
            } else {
                int i3 = -(binarySearch + 1);
                if (i3 == 0) {
                    A02 = JQx.A0M(this.A01);
                } else {
                    int[] iArr2 = this.A01;
                    int length2 = iArr2.length - 1;
                    if (i3 == length2) {
                        A02 = iArr2[length2];
                    } else {
                        int i4 = i3 - 1;
                        float f2 = fArr2[i4];
                        A02 = L5v.A02((f - f2) / (fArr2[i3] - f2), iArr2[i4], iArr2[i3]);
                    }
                }
            }
            iArr[i2] = A02;
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Ksl ksl = (Ksl) obj;
            if (!Arrays.equals(this.A00, ksl.A00) || !Arrays.equals(this.A01, ksl.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }
}
