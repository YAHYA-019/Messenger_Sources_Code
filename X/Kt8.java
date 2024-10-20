package X;

/* loaded from: Kt8.class */
public abstract class Kt8 {
    public int A00;
    public long[] A02 = Ky4.A00;
    public float[] A01 = KbT.A00;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0179, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kt8.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        float[] fArr = this.A01;
        long[] jArr = this.A02;
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
                            i = JQz.A07(i, fArr[(i3 << 3) + i5]);
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
        float[] fArr = this.A01;
        long[] jArr = this.A02;
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
                                float f = fArr[(i << 3) + i4];
                                if (i2 == -1) {
                                    A0k.append((CharSequence) "...");
                                    break loop0;
                                }
                                if (i2 != 0) {
                                    A0k.append((CharSequence) ", ");
                                }
                                A0k.append(f);
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
