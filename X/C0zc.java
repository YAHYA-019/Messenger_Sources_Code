package X;

/* renamed from: X.0zc, reason: invalid class name */
/* loaded from: 0zc.class */
public final class C0zc implements Comparable {
    public static final long A01 = (4611686018427387903L << 1) + 1;
    public static final long A02 = ((-4611686018427387903L) << 1) + 1;
    public final long A00;

    public static final int A00(long j) {
        if (A05(j)) {
            return 0;
        }
        boolean z = true;
        if ((((int) j) & 1) != 1) {
            z = false;
        }
        long j2 = j >> 1;
        return (int) (z ? (j2 % 1000) * 1000000 : j2 % 1000000000);
    }

    public static final int A01(long j) {
        if (A05(j)) {
            return 0;
        }
        return (int) (A03(0zY.A08, j) % 60);
    }

    public static final long A02(long j, long j2) {
        long j3;
        long j4;
        long A04;
        if (A05(j)) {
            if (!(!A05(j2)) && (j2 ^ j) < 0) {
                throw AnonymousClass001.A0L("Summing infinite durations of different signs yields an undefined result.");
            }
        } else {
            if (A05(j2)) {
                return j2;
            }
            int i = ((int) j) & 1;
            if (i == (((int) j2) & 1)) {
                long j5 = (j >> 1) + (j2 >> 1);
                if (i != 0) {
                    return C0za.A00(j5);
                }
                if (-4611686018426999999L <= j5 && j5 < 4611686018427000000L) {
                    return j5 << 1;
                }
                A04 = j5 / 1000000;
            } else {
                if (i == 1) {
                    j3 = j >> 1;
                    j4 = j2 >> 1;
                } else {
                    j3 = j2 >> 1;
                    j4 = j >> 1;
                }
                long j6 = j4 / 1000000;
                long j7 = j3 + j6;
                if (-4611686018426L <= j7 && j7 < 4611686018427L) {
                    return ((j7 * 1000000) + (j4 - (j6 * 1000000))) << 1;
                }
                A04 = 07C.A04(j7, -4611686018427387903L, 4611686018427387903L);
            }
            j = (A04 << 1) + 1;
        }
        return j;
    }

    public static final long A03(0zY r301, long j) {
        if (j == A01) {
            return Long.MAX_VALUE;
        }
        if (j == A02) {
            return Long.MIN_VALUE;
        }
        return r301.timeUnit.convert(j >> 1, ((((int) j) & 1) == 0 ? 0zY.A07 : 0zY.A05).timeUnit);
    }

    public static final void A04(String str, StringBuilder sb, int i, int i2, int i3, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String A0C = 0CU.A0C(String.valueOf(i2), i3);
            int i4 = -1;
            int length = A0C.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (A0C.charAt(length) == '0') {
                        if (i5 < 0) {
                            break;
                        } else {
                            length = i5;
                        }
                    } else {
                        i4 = length;
                        break;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                i6 = ((i6 + 2) / 3) * 3;
            }
            sb.append((CharSequence) A0C, 0, i6);
        }
        sb.append(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r301 == X.C0zc.A02) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A05(long r301) {
        /*
            long r0 = X.C0zc.A01
            r303 = r0
            r0 = r301
            r1 = r303
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L21
            long r0 = X.C0zc.A02
            r306 = r0
            r0 = r301
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = r308
            if (r0 != 0) goto L24
        L21:
            r0 = 1
            r305 = r0
        L24:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0zc.A05(long):boolean");
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = ((C0zc) obj).A00;
        long j2 = this.A00;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return 11T.A01(j2, j);
        }
        int i = (((int) j2) & 1) - (((int) j) & 1);
        if (j2 < 0) {
            i = -i;
        }
        return i;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof C0zc) && j == ((C0zc) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
    
        if (r320 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r322 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015a, code lost:
    
        if (r0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        r0 = r307 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0191, code lost:
    
        if (r307 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0194, code lost:
    
        r0.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019e, code lost:
    
        if (r319 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a3, code lost:
    
        if (r0 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a8, code lost:
    
        if (r0 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ad, code lost:
    
        if (r0 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b8, code lost:
    
        if (r320 < 1000000) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bb, code lost:
    
        r319 = r320 / com.facebook.common.dextricks.DexStore.MS_IN_NS;
        r320 = r320 % com.facebook.common.dextricks.DexStore.MS_IN_NS;
        r327 = 6;
        r328 = "ms";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d1, code lost:
    
        A04(r328, r0, r319, r320, r327, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01df, code lost:
    
        r307 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0214, code lost:
    
        if (r320 < 1000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0217, code lost:
    
        r319 = r320 / 1000;
        r320 = r320 % 1000;
        r327 = 3;
        r328 = "us";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0231, code lost:
    
        r0.append(r320);
        r0.append("ns");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        r327 = 9;
        r328 = X.K93.__redex_internal_original_name;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0186, code lost:
    
        if (r322 == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0zc.toString():java.lang.String");
    }
}
