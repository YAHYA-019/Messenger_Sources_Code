package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: Kuh.class */
public abstract class Kuh {
    public int A00;
    public int A01;
    public long[] A03 = Ky4.A00;
    public int[] A02 = KbU.A00;
    public Object[] A04 = 0QP.A02;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A03(int r302) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuh.A03(int):java.lang.Object");
    }

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
    public final boolean A04(int r302) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuh.A04(int):boolean");
    }

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
    public final boolean A05(int r302) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuh.A05(int):boolean");
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (!(obj instanceof Kuh)) {
                return false;
            }
            Kuh kuh = (Kuh) obj;
            if (kuh.A01 != this.A01) {
                return false;
            }
            int[] iArr = this.A02;
            Object[] objArr = this.A04;
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
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    int i6 = iArr[i5];
                                    Object obj2 = objArr[i5];
                                    Object A03 = kuh.A03(i6);
                                    if (obj2 != null) {
                                        equals = obj2.equals(A03);
                                    } else {
                                        if (A03 != null) {
                                            return false;
                                        }
                                        equals = kuh.A05(i6);
                                    }
                                    if (!equals) {
                                        return false;
                                    }
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
        Object[] objArr = this.A04;
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
                            int i6 = (i3 << 3) + i5;
                            i += AnonymousClass002.A04(objArr[i6]) ^ iArr[i6];
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
        if (this.A01 == 0) {
            return "{}";
        }
        StringBuilder A0z = JR1.A0z();
        int[] iArr = this.A02;
        Object[] objArr = this.A04;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i, length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            A0z.append(i6);
                            A0z.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0z.append(obj);
                            i2++;
                            JR1.A1M(A0z, i2, this.A01);
                        }
                        j >>= 8;
                        i3 = i4 + 1;
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
        String A0f = AnonymousClass001.A0f(A0z);
        11T.A0A(A0f);
        return A0f;
    }
}
