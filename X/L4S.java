package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.NoSuchElementException;

/* loaded from: L4S.class */
public abstract class L4S {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03;
    public long[] A04 = Ky4.A00;

    public L4S() {
        int[] iArr = KbU.A00;
        this.A02 = iArr;
        this.A03 = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a5, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A02(X.L4S r301, int r302) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4S.A02(X.L4S, int):int");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof L4S)) {
                return false;
            }
            L4S l4s = (L4S) obj;
            if (l4s.A01 != this.A01) {
                return false;
            }
            int[] iArr = this.A02;
            int[] iArr2 = this.A03;
            long[] jArr = this.A04;
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
                                    int i7 = iArr2[i5];
                                    int A02 = A02(l4s, i6);
                                    if (A02 < 0) {
                                        throw new NoSuchElementException(0Pz.A0T("Cannot find value for key ", i6));
                                    }
                                    if (i7 != l4s.A03[A02]) {
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
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
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
                            i += iArr2[i6] ^ iArr[i6];
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
        int i = this.A01;
        if (i == 0) {
            return "{}";
        }
        StringBuilder A0z = JR1.A0z();
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i2, length);
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            int i8 = iArr2[i6];
                            A0z.append(i7);
                            A0z.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            A0z.append(i8);
                            i3++;
                            JR1.A1M(A0z, i3, i);
                        }
                        j >>= 8;
                        i4 = i5 + 1;
                    }
                    if (A08 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        String A0f = AnonymousClass001.A0f(A0z);
        11T.A0A(A0f);
        return A0f;
    }
}
