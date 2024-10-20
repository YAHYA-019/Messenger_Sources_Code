package X;

import java.util.ArrayList;

/* loaded from: L99.class */
public abstract class L99 {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    public static final int A00(int i) {
        int i2 = 2;
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            default:
                i2 = 3;
            case 3:
            case 5:
            case 6:
                return i2;
        }
    }

    public static int A01(int i, int[] iArr) {
        return iArr[i + 4] + A00(iArr[i + 1] >> 28);
    }

    public static final int A02(ArrayList arrayList, int i, int i2) {
        int i3;
        int A06 = DKC.A06(arrayList);
        int i4 = 0;
        while (true) {
            if (i4 > A06) {
                i3 = -(i4 + 1);
                break;
            }
            i3 = (i4 + A06) >>> 1;
            int i5 = ((KTK) arrayList.get(i3)).A00;
            if (i5 < 0) {
                i5 += i2;
            }
            int A00 = 11T.A00(i5, i);
            if (A00 >= 0) {
                if (A00 <= 0) {
                    break;
                }
                A06 = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
        }
        return i3;
    }

    public static final boolean A03(int[] iArr, int i) {
        int i2 = i * 5;
        boolean z = true;
        if ((iArr[i2 + 1] & 1073741824) == 0) {
            z = false;
        }
        return z;
    }
}
