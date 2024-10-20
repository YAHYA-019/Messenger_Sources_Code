package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6b8, reason: invalid class name */
/* loaded from: 6b8.class */
public abstract class C6b8 implements 6Y9 {
    public int A00;
    public final int A01;
    public final 6Yl[] A02;
    public final long[] A03;
    public final 6YP A04;
    public final int[] A05;

    public C6b8(6YP r302, int[] iArr) {
        int i;
        int i2;
        int length = iArr.length;
        6DP.A04(length > 0);
        this.A04 = r302;
        this.A01 = length;
        6Yl[] r0 = new 6Yl[length];
        this.A02 = r0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                break;
            }
            r0[i4] = r302.A04[iArr[i4]];
            i3 = i4 + 1;
        }
        Arrays.sort(r0, new Ls7(4));
        int i5 = this.A01;
        int[] iArr2 = new int[i5];
        this.A05 = iArr2;
        for (int i6 = 0; i6 < i5; i6++) {
            6Yl r02 = this.A02[i6];
            while (true) {
                i2 = i;
                6Yl[] r03 = r302.A04;
                if (i2 >= r03.length) {
                    i2 = -1;
                    break;
                }
                i = r02 != r03[i2] ? i2 + 1 : 0;
            }
            iArr2[i6] = i2;
        }
        this.A03 = new long[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r0 = r301.A03;
        r0 = r0[r302];
        r314 = r0 + r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (((r0 ^ r314) & (r303 ^ r314)) >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r314 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r0[r302] = java.lang.Math.max(r0, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ACP(int r302, long r303) {
        /*
            r301 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = r305
            boolean r0 = r0.BQv(r1, r2)
            r307 = r0
            r0 = 0
            r308 = r0
        L11:
            r0 = r301
            int r0 = r0.A01
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r308
            r1 = r309
            if (r0 >= r1) goto L4a
            r0 = r307
            if (r0 != 0) goto L51
            r0 = r308
            r1 = r302
            if (r0 == r1) goto L3e
            r0 = r301
            r1 = r308
            r2 = r305
            boolean r0 = r0.BQv(r1, r2)
            r309 = r0
            r0 = 1
            r307 = r0
            r0 = r309
            if (r0 == 0) goto L41
        L3e:
            r0 = 0
            r307 = r0
        L41:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L11
        L4a:
            r0 = r307
            if (r0 != 0) goto L51
            r0 = 0
            return r0
        L51:
            r0 = r301
            long[] r0 = r0.A03
            r311 = r0
            r0 = r311
            r1 = r302
            r0 = r0[r1]
            r312 = r0
            r0 = r305
            r1 = r303
            long r0 = r0 + r1
            r314 = r0
            r0 = r305
            r1 = r314
            long r0 = r0 ^ r1
            r305 = r0
            r0 = r303
            r1 = r314
            long r0 = r0 ^ r1
            r303 = r0
            r0 = r305
            r1 = r303
            long r0 = r0 & r1
            r305 = r0
            r0 = 0
            r316 = r0
            r0 = r305
            r1 = r316
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r318 = r0
            r0 = r318
            if (r0 >= 0) goto L89
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r314 = r0
        L89:
            r0 = r312
            r1 = r314
            long r0 = java.lang.Math.max(r0, r1)
            r314 = r0
            r0 = r311
            r1 = r302
            r2 = r314
            r0[r1] = r2
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b8.ACP(int, long):boolean");
    }

    public int AR0(List list, long j) {
        if (this instanceof C6b9) {
            C6b9 c6b9 = (C6b9) this;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = c6b9.A03;
            if (j2 == -9223372036854775807L || elapsedRealtime - j2 >= 2000 || (!list.isEmpty() && !2Ri.A08(list).equals(c6b9.A04))) {
                c6b9.A03 = elapsedRealtime;
                c6b9.A04 = list.isEmpty() ? null : (K15) 2Ri.A08(list);
                int i = 0;
                if (!list.isEmpty()) {
                    int size = list.size();
                    if (Util.A09(c6b9.A00, ((Lbf) list.get(size - 1)).A04 - j) >= 25000000) {
                        if (!list.isEmpty()) {
                            2Ri.A08(list);
                        }
                        6Yl r0 = ((C6b8) c6b9).A02[C6b9.A00(c6b9, elapsedRealtime)];
                        while (i < size) {
                            Lbf lbf = (Lbf) list.get(i);
                            6Yl r02 = lbf.A05;
                            if (Util.A09(c6b9.A00, lbf.A04 - j) >= 25000000 && r02.A05 < r0.A05) {
                                int i2 = r02.A0A;
                                float f = 0.0f / 0.0f;
                                if (i2 != -1 && r02.A0A <= 719 && r02.A0L != -1 && r02.A0L <= 1279 && r02.A0A < r0.A0A) {
                                }
                            }
                            i++;
                        }
                    }
                    return size;
                }
                return i;
            }
        }
        return list.size();
    }

    public final 6Yl AnC(int i) {
        return this.A02[i];
    }

    public final int AqW(int i) {
        return this.A05[i];
    }

    public long Axr(6VU r302, C7yn c7yn, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3) {
        if (this instanceof C6b7) {
            return ((C6b7) this).A01.Axr(r302, c7yn, j, j2, j3, j4, j5, j6, j7, j8, j9, z, z2, z3);
        }
        return -9223372036854775807L;
    }

    public final 6Yl B9i() {
        return this.A02[B9j()];
    }

    public final 6YP BGi() {
        return this.A04;
    }

    public final int BOZ(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3;
            if (i2 >= this.A01) {
                i2 = -1;
                break;
            }
            if (this.A05[i2] == i) {
                break;
            }
            i3 = i2 + 1;
        }
        return i2;
    }

    public final int BOa(6Yl r302) {
        int i;
        boolean equals;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.A01) {
                return -1;
            }
            6Yl[] r0 = this.A02;
            6Yl r02 = r0[i];
            if (r02 == r302) {
                break;
            }
            if (r02.A0T != null) {
                equals = r0[i].A0T.equals(r302.A0T);
            } else if (r302.A0T == null) {
                equals = r0[i].equals(r302);
            } else {
                continue;
                i2 = i + 1;
            }
            if (equals) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    public boolean BQv(int i, long j) {
        boolean z = false;
        if (this.A03[i] > j) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.A04 != r302) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void CC2(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.C6b7
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L33
            r0 = r301
            r304 = r0
            r0 = r301
            X.6b7 r0 = (X.C6b7) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
            r0 = r304
            boolean r0 = r0.A04
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            r1 = r302
            if (r0 == r1) goto L29
        L27:
            r0 = 1
            r303 = r0
        L29:
            r0 = r304
            r1 = r303
            r0.A03 = r1
            r0 = r304
            r1 = r302
            r0.A04 = r1
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b8.CC2(boolean):void");
    }

    public void CCL(float f) {
        if (this instanceof C6b7) {
            ((C6b7) this).A00 = f;
        } else if (this instanceof C6b9) {
            ((C6b9) this).A00 = f;
        }
    }

    public /* synthetic */ boolean CxG(Lbf lbf, List list, long j) {
        if (!(this instanceof C6b7)) {
            return false;
        }
        C6b7 c6b7 = (C6b7) this;
        if (!c6b7.A03) {
            return false;
        }
        c6b7.A03 = false;
        return !c6b7.A04;
    }

    public void D7r(C7yn c7yn, K15 k15, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        D7q(j, j2, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r317.BfO() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void D7s(java.util.List r302, X.MLn[] r303, long r304, long r306, long r308) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b8.D7s(java.util.List, X.MLn[], long, long, long):void");
    }

    public void disable() {
        if (this instanceof C6b9) {
            ((C6b9) this).A04 = null;
        }
    }

    public void enable() {
        if (this instanceof C6b9) {
            C6b9 c6b9 = (C6b9) this;
            c6b9.A03 = -9223372036854775807L;
            c6b9.A04 = null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6b8 c6b8 = (C6b8) obj;
            if (this.A04 != c6b8.A04 || !Arrays.equals(this.A05, c6b8.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
            this.A00 = i;
        }
        return i;
    }

    public final int length() {
        return this.A05.length;
    }
}
