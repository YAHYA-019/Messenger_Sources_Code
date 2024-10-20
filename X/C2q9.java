package X;

/* renamed from: X.2q9, reason: invalid class name */
/* loaded from: 2q9.class */
public final class C2q9 extends C2d8 {
    public static int A00(int[] iArr, int i, int i2, int i3) {
        int i4;
        if (i3 <= 8264) {
            while (i < i2) {
                if (i3 > iArr[i]) {
                    i += 2;
                }
            }
            return -2;
        }
        int i5 = i2 - 1;
        while (i <= i5) {
            int i6 = ((i + i5) >>> 2) << 1;
            int i7 = iArr[i6];
            if (i7 >= i3) {
                if (i7 <= i3) {
                    i4 = i6 + 1;
                    break;
                }
                i5 = i6 - 2;
            } else {
                i = i6 + 2;
            }
        }
        if (i >= i2) {
            return -2;
        }
        i4 = i + 1;
        return iArr[i4];
    }

    @Override // X.C2d8
    public int A02(CharSequence charSequence, int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = -1;
        while (i3 < i4) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            int A00 = A00(iArr, i5, i2, codePointAt);
            if (A00 < 0) {
                if (codePointAt != 65038) {
                    return i6;
                }
                return -1;
            }
            i3 += Character.charCount(codePointAt);
            i5 = A00 >>> 16;
            i2 = A00 & ((char) (-1));
            if (iArr[i5] == 0 && i3 <= i4) {
                i6 = i3;
            }
        }
        return i6;
    }
}
