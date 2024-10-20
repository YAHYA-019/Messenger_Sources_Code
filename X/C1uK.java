package X;

import com.google.common.base.Preconditions;

/* renamed from: X.1uK, reason: invalid class name */
/* loaded from: 1uK.class */
public abstract class C1uK {
    public static long A00(byte[] bArr) {
        int length = bArr.length;
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        Preconditions.checkArgument(z, "array too small: %s < %s", length, 8);
        return ((bArr[1] & 255) << 48) | ((bArr[0] & 255) << 56) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public static Long A01(String str) {
        byte b;
        str.getClass();
        boolean isEmpty = str.isEmpty();
        Long l = null;
        if (!isEmpty) {
            int i = 0;
            if (str.charAt(0) == '-') {
                i = 1;
            }
            int length = str.length();
            if (i != length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                byte[] bArr = C1uL.A00;
                if (charAt < 128) {
                    byte[] bArr2 = C1uL.A00;
                    byte b2 = bArr[charAt];
                    if (b2 >= 0 && b2 < 10) {
                        long j = -b2;
                        long j2 = 10;
                        while (true) {
                            if (i2 < length) {
                                int i3 = i2 + 1;
                                char charAt2 = str.charAt(i2);
                                if (charAt2 >= 128 || (b = bArr2[charAt2]) < 0 || b >= 10 || j < -922337203685477580L) {
                                    break;
                                }
                                long j3 = j * j2;
                                long j4 = b;
                                if (j3 < j4 - Long.MIN_VALUE) {
                                    break;
                                }
                                j = j3 - j4;
                                i2 = i3;
                            } else {
                                if (i != 0) {
                                    return Long.valueOf(j);
                                }
                                if (j != Long.MIN_VALUE) {
                                    l = Long.valueOf(-j);
                                }
                            }
                        }
                    }
                }
            }
        }
        return l;
    }

    public static byte[] A02(long j) {
        byte[] bArr = new byte[8];
        int i = 7;
        do {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
            i--;
        } while (i >= 0);
        return bArr;
    }
}
