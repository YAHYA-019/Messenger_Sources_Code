package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.NoSuchElementException;

/* loaded from: L4t.class */
public abstract class L4t {
    public int A00;
    public int A01;
    public long[] A02 = Ky4.A00;
    public Object[] A04 = 0QP.A02;
    public long[] A03 = KbV.A00;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A02(X.L4t r301, java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4t.A02(X.L4t, java.lang.Object):int");
    }

    public final long A03(Object obj) {
        int A02 = A02(this, obj);
        if (A02 >= 0) {
            return this.A03[A02];
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("There is no key ");
        A0k.append(obj);
        throw new NoSuchElementException(AnonymousClass001.A0d(" in the map", A0k));
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof L4t)) {
                return false;
            }
            L4t l4t = (L4t) obj;
            if (l4t.A01 != this.A01) {
                return false;
            }
            Object[] objArr = this.A04;
            long[] jArr = this.A03;
            long[] jArr2 = this.A02;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    long j = jArr2[i2];
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
                                    if (jArr[i5] != l4t.A03(objArr[i5])) {
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
        Object[] objArr = this.A04;
        long[] jArr = this.A03;
        long[] jArr2 = this.A02;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                long j = jArr2[i3];
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
                            i += AnonymousClass002.A04(objArr[i6]) ^ 1BL.A01(jArr[i6]);
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
        Object[] objArr = this.A04;
        long[] jArr = this.A03;
        long[] jArr2 = this.A02;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr2[i];
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
                            long j2 = jArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0z.append(obj);
                            A0z.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            A0z.append(j2);
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
