package X;

/* renamed from: X.0zh, reason: invalid class name */
/* loaded from: 0zh.class */
public abstract class C0zh {
    public static final AnonymousClass147 A00(String str, int i) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = 1;
        if (11T.A00(charAt, 48) >= 0) {
            i3 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int i4 = 119304647;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), i);
            if (digit < 0) {
                return null;
            }
            int i5 = (-1) << (-1);
            int i6 = i2 ^ i5;
            int i7 = i4 ^ i5;
            if (i6 != i7 && i6 >= i7) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = (int) (4294967295L / (i & 4294967295L));
                int i8 = i2 ^ i5;
                int i9 = i4 ^ i5;
                if (i8 != i9 && i8 >= i9) {
                    return null;
                }
            }
            int i10 = i2 * i;
            int i11 = digit + i10;
            int i12 = i11 ^ i5;
            int i13 = i10 ^ i5;
            if (i12 != i13 && i12 < i13) {
                return null;
            }
            i3++;
            i2 = i11;
        }
        return new AnonymousClass147(i2);
    }

    public static final AnonymousClass141 A01(String str) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (11T.A00(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i = 1;
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE)) {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                long j4 = -1;
                int i2 = 1;
                long j5 = ((j4 >>> 1) / j) << 1;
                if (((j4 - (j5 * j)) ^ Long.MIN_VALUE) < -9223372036854775798L) {
                    i2 = 0;
                }
                j3 = j5 + i2;
                if ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE)) {
                    return null;
                }
            }
            long j6 = j2 * j;
            long j7 = (digit & 4294967295L) + j6;
            if ((j7 ^ Long.MIN_VALUE) < (j6 ^ Long.MIN_VALUE)) {
                return null;
            }
            i++;
            j2 = j7;
        }
        return new AnonymousClass141(j2);
    }
}
