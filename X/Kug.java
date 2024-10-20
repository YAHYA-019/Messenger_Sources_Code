package X;

/* loaded from: Kug.class */
public final class Kug {
    public final L4d A00;
    public final int[] A01;

    public Kug(L4d l4d, int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            throw JQx.A0n();
        }
        this.A00 = l4d;
        if (length <= 1 || iArr[0] != 0) {
            this.A01 = iArr;
            return;
        }
        int i = 1;
        while (iArr[i] == 0) {
            i++;
            if (i >= length) {
                break;
            }
        }
        if (i == length) {
            this.A01 = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.A01 = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public int A00(int i) {
        if (i == 0) {
            return this.A01[r0.length - 1];
        }
        int[] iArr = this.A01;
        if (i != 1) {
            int i2 = iArr[0];
            int length = iArr.length;
            for (int i3 = 1; i3 < length; i3++) {
                i2 = this.A00.A01(i, i2) ^ iArr[i3];
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 ^= i5;
        }
        return i4;
    }

    public Kug A01(int i) {
        if (i == 0) {
            return this.A00.A02;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return new Kug(this.A00, iArr2);
            }
            iArr2[i3] = this.A00.A01(iArr[i3], i);
            i2 = i3 + 1;
        }
    }

    public Kug A02(int i, int i2) {
        if (i < 0) {
            throw JQx.A0n();
        }
        if (i2 == 0) {
            return this.A00.A02;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                return new Kug(this.A00, iArr2);
            }
            iArr2[i4] = this.A00.A01(iArr[i4], i2);
            i3 = i4 + 1;
        }
    }

    public Kug A03(Kug kug) {
        L4d l4d = this.A00;
        if (!l4d.equals(kug.A00)) {
            throw AnonymousClass001.A0L("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.A01;
        if (iArr[0] != 0) {
            int[] iArr2 = kug.A01;
            if (iArr2[0] == 0) {
                return this;
            }
            int[] iArr3 = iArr;
            if (iArr.length <= iArr2.length) {
                iArr3 = iArr2;
                iArr2 = iArr;
            }
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int length2 = length - iArr2.length;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            int i = length2;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                iArr4[i2] = iArr2[i2 - length2] ^ iArr3[i2];
                i = i2 + 1;
            }
            kug = new Kug(l4d, iArr4);
        }
        return kug;
    }

    public Kug A04(Kug kug) {
        L4d l4d = this.A00;
        if (!l4d.equals(kug.A00)) {
            throw AnonymousClass001.A0L("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.A01;
        if (iArr[0] != 0) {
            int[] iArr2 = kug.A01;
            if (iArr2[0] != 0) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        return new Kug(l4d, iArr3);
                    }
                    int i3 = iArr[i2];
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 < length2) {
                            int i6 = i2 + i5;
                            iArr3[i6] = iArr3[i6] ^ l4d.A01(i3, iArr2[i5]);
                            i4 = i5 + 1;
                        }
                    }
                    i = i2 + 1;
                }
            }
        }
        return l4d.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0 A[EDGE_INSN: B:28:0x00f0->B:29:0x00f0 BREAK  A[LOOP:0: B:2:0x0018->B:17:0x008f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kug.toString():java.lang.String");
    }
}
