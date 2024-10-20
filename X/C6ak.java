package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.6ak, reason: invalid class name */
/* loaded from: 6ak.class */
public final class C6ak {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C6ah A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C6ak(C6ah c6ah, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2, int i, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = false;
        6DP.A03(length == length2);
        int length3 = jArr.length;
        6DP.A03(length3 == length2);
        int length4 = iArr2.length;
        6DP.A03(length4 == length2 ? true : z);
        this.A03 = c6ah;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public int A00(long j) {
        int i;
        long[] jArr = this.A07;
        int A06 = Util.A06(jArr, j, true);
        while (true) {
            i = A06;
            if (i >= jArr.length) {
                i = -1;
                break;
            }
            if ((this.A04[i] & 1) != 0) {
                break;
            }
            A06 = i + 1;
        }
        return i;
    }
}
