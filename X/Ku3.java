package X;

/* loaded from: Ku3.class */
public abstract class Ku3 {
    public int A00;
    public int A01;
    public long[] A03 = Ky4.A00;
    public int[] A02 = KbU.A00;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r0 < 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0091, code lost:
    
        r303 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(int r302) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ku3.A02(int):boolean");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Ku3)) {
                return false;
            }
            Ku3 ku3 = (Ku3) obj;
            if (ku3.A01 != this.A01) {
                return false;
            }
            int[] iArr = this.A02;
            long[] jArr = this.A03;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    long j = jArr[i2];
                    if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                        int A08 = 8 - JQx.A08(i2, length);
                        int i3 = 0;
                        while (true) {
                            int i4 = i3;
                            if (i4 >= A08) {
                                if (A08 != 8) {
                                    break;
                                }
                            } else {
                                if ((255 & j) < 128 && !ku3.A02(iArr[(i2 << 3) + i4])) {
                                    return false;
                                }
                                j >>= 8;
                                i3 = i4 + 1;
                            }
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i = i2 + 1;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                long j = jArr[i3];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i3, length);
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            i += iArr[(i3 << 3) + i5];
                        }
                        j >>= 8;
                        i4 = i5 + 1;
                    }
                    if (A08 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i2 = i3 + 1;
            }
        }
        return i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append((CharSequence) "[");
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A0G = JR0.A0G(i, length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= A0G) {
                            if (A0G != 8) {
                                break;
                            }
                        } else {
                            if ((j & 255) < 128) {
                                int i5 = iArr[(i << 3) + i4];
                                if (i2 == -1) {
                                    A0k.append((CharSequence) "...");
                                    break loop0;
                                }
                                if (i2 != 0) {
                                    A0k.append((CharSequence) ", ");
                                }
                                A0k.append(i5);
                                i2++;
                            }
                            j >>= 8;
                            i3 = i4 + 1;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        A0k.append((CharSequence) "]");
        return 11T.A02(A0k);
    }
}
