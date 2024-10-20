package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: Kui.class */
public abstract class Kui {
    public int A00;
    public int A01;
    public long[] A02 = Ky4.A00;
    public Object[] A03;
    public Object[] A04;

    public Kui() {
        Object[] objArr = 0QP.A02;
        this.A03 = objArr;
        this.A04 = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kui.A02(java.lang.Object):java.lang.Object");
    }

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
    public final boolean A03(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kui.A03(java.lang.Object):boolean");
    }

    public final boolean A04(Object obj) {
        Object[] objArr = this.A04;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            long j = jArr[i2];
            if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int A08 = 8 - JQx.A08(i2, length);
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < A08) {
                        if ((255 & j) < 128 && 11T.A0O(obj, JQx.A0t(objArr, i2, i4))) {
                            return true;
                        }
                        j >>= 8;
                        i3 = i4 + 1;
                    } else if (A08 != 8) {
                        return false;
                    }
                }
            }
            if (i2 == length) {
                return false;
            }
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (!(obj instanceof Kui)) {
                return false;
            }
            Kui kui = (Kui) obj;
            if (kui.A01 != this.A01) {
                return false;
            }
            Object[] objArr = this.A03;
            Object[] objArr2 = this.A04;
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
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj2 = objArr[i5];
                                    Object obj3 = objArr2[i5];
                                    Object A02 = kui.A02(obj2);
                                    if (obj3 != null) {
                                        equals = obj3.equals(A02);
                                    } else {
                                        if (A02 != null) {
                                            return false;
                                        }
                                        equals = kui.A03(obj2);
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
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
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
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            i += AnonymousClass002.A04(objArr2[i6]) ^ AnonymousClass002.A04(obj);
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
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
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
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0z.append(obj);
                            A0z.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            A0z.append(obj2);
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
