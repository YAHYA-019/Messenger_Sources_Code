package X;

/* loaded from: Ku5.class */
public abstract class Ku5 {
    public int A00;
    public int A01;
    public long[] A02 = Ky4.A00;
    public Object[] A03 = 0QP.A02;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        if (r0 < 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0094, code lost:
    
        r303 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ku5.A05(java.lang.Object):boolean");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Ku5)) {
                return false;
            }
            Ku5 ku5 = (Ku5) obj;
            if (ku5.A01 != this.A01) {
                return false;
            }
            Object[] objArr = this.A03;
            long[] jArr = this.A02;
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
                                if ((255 & j) < 128 && !ku5.A05(JQx.A0t(objArr, i2, i4))) {
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
        Object[] objArr = this.A03;
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
                            i += AnonymousClass002.A04(JQx.A0t(objArr, i3, i5));
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
        M6n A00 = M6n.A00(this, 1);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append((CharSequence) "[");
        Object[] objArr = this.A03;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i, length);
                    for (int i3 = 0; i3 < A08; i3++) {
                        if ((j & 255) < 128) {
                            Object A0t = JQx.A0t(objArr, i, i3);
                            if (i2 == -1) {
                                A0k.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A0k.append((CharSequence) ", ");
                            }
                            A0k.append((CharSequence) A00.invoke(A0t));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (A08 != 8) {
                        break;
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
