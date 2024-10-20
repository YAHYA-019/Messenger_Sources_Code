package X;

import com.facebook.common.dextricks.DexStore;

/* renamed from: X.3Y3, reason: invalid class name */
/* loaded from: 3Y3.class */
public final class C3Y3 implements 1Wn {
    public int Azm(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            int i3 = i % 100;
            if (i3 != 11 && i3 != 71 && i3 != 91) {
                return 1;
            }
        } else if (i2 == 2) {
            int i4 = i % 100;
            if (i4 != 12 && i4 != 72 && i4 != 92) {
                return 2;
            }
        } else if (i2 >= 3 && (i2 <= 4 || i2 == 9)) {
            int i5 = i % 100;
            if (i5 < 10) {
                return 3;
            }
            if (i5 > 19) {
                if (i5 < 70) {
                    return 3;
                }
                if (i5 > 79 && (i5 < 90 || i5 > 99)) {
                    return 3;
                }
            }
        }
        return (i == 0 || i % DexStore.MS_IN_NS != 0) ? 5 : 4;
    }
}
