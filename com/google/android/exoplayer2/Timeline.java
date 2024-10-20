package com.google.android.exoplayer2;

import X.1BK;
import X.6DP;
import X.6Xp;
import X.6YE;
import X.6YN;
import X.6Ym;
import X.6Yn;
import X.6Yo;
import X.JT5;
import android.util.Pair;
import java.util.Arrays;

/* loaded from: Timeline.class */
public abstract class Timeline {
    public static final Timeline A00 = new 6YN();

    private int A08(boolean z) {
        int i;
        int i2;
        if (this instanceof 6Yo) {
            i = ((6Yo) this).A00.A08(z);
        } else {
            if (!(this instanceof 6Ym)) {
                if (A0D()) {
                    return -1;
                }
                return A02() - 1;
            }
            6Ym r0 = (6Ym) this;
            int i3 = r0.A00;
            i = -1;
            if (i3 != 0) {
                if (z) {
                    int[] iArr = r0.A03.A02;
                    int length = iArr.length;
                    i2 = length > 0 ? iArr[length - 1] : -1;
                } else {
                    i2 = i3 - 1;
                }
                do {
                    Timeline timeline = r0.A07[i2];
                    if (!timeline.A0D()) {
                        return r0.A06[i2] + timeline.A08(z);
                    }
                    if (z) {
                        JT5 jt5 = r0.A03;
                        int i4 = jt5.A01[i2] - 1;
                        if (i4 >= 0) {
                            i2 = jt5.A02[i4];
                        }
                    } else if (i2 > 0) {
                        i2--;
                    }
                } while (i2 != -1);
                return -1;
            }
        }
        return i;
    }

    public int A01() {
        return this instanceof 6Ym ? ((6Ym) this).A01 : this instanceof 6Yo ? ((6Yo) this).A00.A01() : this instanceof 6Yn ? 1 : 0;
    }

    public int A02() {
        if (this instanceof 6Ym) {
            return ((6Ym) this).A02;
        }
        if (this instanceof 6Yn) {
            return 1;
        }
        if (this instanceof 6YN) {
            return 0;
        }
        return ((6Yo) this).A00.A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed A[EDGE_INSN: B:36:0x00ed->B:30:0x00ed BREAK  A[LOOP:0: B:19:0x00b0->B:34:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A03(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A03(int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd A[EDGE_INSN: B:33:0x00fd->B:28:0x00fd BREAK  A[LOOP:0: B:19:0x00bd->B:32:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A04(int r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A04(int, int, boolean):int");
    }

    public final int A05(6YE r302, 6Xp r303, int i, int i2, boolean z) {
        int i3 = A0E(r302, i, false).A00;
        if (A0F(r303, i3, 0L).A01 != i) {
            return i + 1;
        }
        int A04 = A04(i3, i2, z);
        int i4 = -1;
        if (A04 != -1) {
            i4 = A0F(r303, A04, 0L).A00;
        }
        return i4;
    }

    public int A06(Object obj) {
        int i;
        int intValue;
        int A06;
        if (this instanceof 6Ym) {
            6Ym r0 = (6Ym) this;
            i = -1;
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                Object obj2 = pair.first;
                Object obj3 = pair.second;
                Number number = (Number) r0.A04.get(obj2);
                if (number != null && (intValue = number.intValue()) != -1 && (A06 = r0.A07[intValue].A06(obj3)) != -1) {
                    i = r0.A05[intValue] + A06;
                }
            }
        } else {
            if (!(this instanceof 6Yn)) {
                if (this instanceof 6Yo) {
                    return ((6Yo) this).A00.A06(obj);
                }
                return -1;
            }
            i = -1;
            if (6Yn.A08.equals(obj)) {
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (A0D() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A07(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.6Ym
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L74
            r0 = r301
            r304 = r0
            r0 = r301
            X.6Ym r0 = (X.6Ym) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A00
            r303 = r0
            r0 = -1
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L68
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L41
            r0 = r304
            X.MFz r0 = r0.A03
            X.JT5 r0 = (X.JT5) r0
            r307 = r0
            r0 = r307
            int[] r0 = r0.A02
            r308 = r0
            r0 = r308
            int r0 = r0.length
            r303 = r0
            r0 = r303
            if (r0 <= 0) goto L6e
            r0 = r308
            r1 = 0
            r0 = r0[r1]
            r306 = r0
        L41:
            r0 = r304
            com.google.android.exoplayer2.Timeline[] r0 = r0.A07
            r307 = r0
            r0 = r307
            r1 = r306
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            boolean r0 = r0.A0D()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9b
            r0 = r304
            r1 = r306
            r2 = r302
            int r0 = X.6Ym.A00(r0, r1, r2)
            r306 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L41
        L68:
            r0 = -1
            r306 = r0
        L6b:
            r0 = r306
            return r0
        L6e:
            r0 = -1
            r306 = r0
            goto L41
        L74:
            r0 = r301
            boolean r0 = r0 instanceof X.6Yo
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8c
            r0 = r301
            r307 = r0
            r0 = r301
            X.6Yo r0 = (X.6Yo) r0
            com.google.android.exoplayer2.Timeline r0 = r0.A00
            r1 = r302
            int r0 = r0.A07(r1)
            return r0
        L8c:
            r0 = r301
            boolean r0 = r0.A0D()
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L6b
            goto L68
        L9b:
            r0 = r304
            int[] r0 = r0.A06
            r1 = r306
            r0 = r0[r1]
            r306 = r0
            r0 = r308
            r1 = r302
            int r0 = r0.A07(r1)
            r303 = r0
            r0 = r306
            r1 = r303
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A07(boolean):int");
    }

    public final Pair A09(6YE r302, 6Xp r303, int i, long j) {
        Pair A0A = A0A(r302, r303, i, j, 0L);
        A0A.getClass();
        return A0A;
    }

    public final Pair A0A(6YE r302, 6Xp r303, int i, long j, long j2) {
        6DP.A00(i, A02());
        A0F(r303, i, j2);
        if (j == -9223372036854775807L) {
            j = r303.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = r303.A00;
        A0E(r302, i2, false);
        while (i2 < r303.A01 && r302.A02 != j) {
            int i3 = i2 + 1;
            if (A0E(r302, i3, false).A02 > j) {
                break;
            }
            i2 = i3;
        }
        A0E(r302, i2, true);
        long j3 = j - r302.A02;
        long j4 = r302.A01;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = r302.A05;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public 6YE A0B(6YE r302, Object obj) {
        if (!(this instanceof 6Ym)) {
            return A0E(r302, A06(obj), true);
        }
        6Ym r0 = (6Ym) this;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Number number = (Number) r0.A04.get(obj2);
        int intValue = number == null ? -1 : number.intValue();
        int i = r0.A06[intValue];
        r0.A07[intValue].A0B(r302, obj3);
        r302.A00 += i;
        r302.A05 = obj;
        return r302;
    }

    public Object A0C(int i) {
        if (this instanceof 6Yn) {
            6DP.A00(i, 1);
            return 6Yn.A08;
        }
        if (this instanceof 6Yo) {
            return ((6Yo) this).A00.A0C(i);
        }
        if (this instanceof 6YN) {
            throw new IndexOutOfBoundsException();
        }
        6Ym r0 = (6Ym) this;
        int[] iArr = r0.A05;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
            return Pair.create(r0.A08[binarySearch], r0.A07[binarySearch].A0C(i - iArr[binarySearch]));
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i2);
        return Pair.create(r0.A08[binarySearch], r0.A07[binarySearch].A0C(i - iArr[binarySearch]));
    }

    public final boolean A0D() {
        boolean z = false;
        if (A02() == 0) {
            z = true;
        }
        return z;
    }

    public abstract 6YE A0E(6YE r1, int i, boolean z);

    public abstract 6Xp A0F(6Xp r1, int i, long j);

    public boolean equals(Object obj) {
        int A08;
        if (this != obj) {
            if (!(obj instanceof Timeline)) {
                return false;
            }
            Timeline timeline = (Timeline) obj;
            int A02 = timeline.A02();
            int A022 = A02();
            if (A02 != A022 || timeline.A01() != A01()) {
                return false;
            }
            6Xp r0 = new 6Xp();
            6YE r02 = new 6YE();
            6Xp r03 = new 6Xp();
            6YE r04 = new 6YE();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= A022) {
                    for (int i3 = 0; i3 < A01(); i3++) {
                        if (!A0E(r02, i3, true).equals(timeline.A0E(r04, i3, true))) {
                            return false;
                        }
                    }
                    int A07 = A07(true);
                    if (A07 != timeline.A07(true) || (A08 = A08(true)) != timeline.A08(true)) {
                        return false;
                    }
                    while (A07 != A08) {
                        int A04 = A04(A07, 0, true);
                        if (A04 != timeline.A04(A07, 0, true)) {
                            return false;
                        }
                        A07 = A04;
                    }
                } else {
                    if (!A0F(r0, i2, 0L).equals(timeline.A0F(r03, i2, 0L))) {
                        return false;
                    }
                    i = i2 + 1;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        6Xp r0 = new 6Xp();
        6YE r02 = new 6YE();
        int A02 = A02();
        int i2 = 217 + A02;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            i = i2 * 31;
            if (i4 >= A02) {
                break;
            }
            i2 = 1BK.A03(A0F(r0, i4, 0L), i);
            i3 = i4 + 1;
        }
        int A01 = i + A01();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= A01()) {
                break;
            }
            A01 = 1BK.A03(A0E(r02, i6, true), A01 * 31);
            i5 = i6 + 1;
        }
        int A07 = A07(true);
        while (true) {
            int i7 = A07;
            if (i7 == -1) {
                return A01;
            }
            A01 = (A01 * 31) + i7;
            A07 = A04(i7, 0, true);
        }
    }
}
