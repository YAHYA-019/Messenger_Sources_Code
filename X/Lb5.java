package X;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

/* loaded from: Lb5.class */
public final class Lb5 implements 6Zm, 6YX, C7xx {
    public static final Pattern A0Q = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A0R = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public int A00;
    public 6YW A01;
    public C6W0 A02;
    public List A03;
    public final int A07;
    public final long A08;
    public final 6XP A09;
    public final 6YT A0A;
    public final 6ZM A0B;
    public final 6WC A0C;
    public final 6ZL A0D;
    public final 6YO A0E;
    public final L87 A0F;
    public final MG2 A0G;
    public final LG5 A0H;
    public final 6XD A0I;
    public final 6ZG A0J;
    public final 6Zz A0K;
    public final 5M9 A0L;
    public final boolean A0N;
    public final Klt[] A0O;
    public final MCl A0P;
    public 6bR[] A04 = new 6bR[0];
    public LbE[] A06 = new LbE[0];
    public final IdentityHashMap A0M = new IdentityHashMap();
    public 6Zn A05 = new LbH(this.A04);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x020d, code lost:
    
        if (r342 != (-1)) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0609 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Lb5(X.6XP r302, X.6YT r303, X.6ZM r304, X.6WC r305, X.MCl r306, X.6ZL r307, X.L87 r308, X.MG2 r309, X.MCn r310, X.C6W0 r311, X.6XD r312, X.6ZG r313, X.6Zz r314, X.5M9 r315, int r316, int r317, long r318, boolean r320) {
        /*
            Method dump skipped, instructions count: 2588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lb5.<init>(X.6XP, X.6YT, X.6ZM, X.6WC, X.MCl, X.6ZL, X.L87, X.MG2, X.MCn, X.6W0, X.6XD, X.6ZG, X.6Zz, X.5M9, int, int, long, boolean):void");
    }

    public static Krd A00(String str, List list) {
        Krd krd;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                krd = null;
                break;
            }
            krd = (Krd) list.get(i2);
            if (str.equals(krd.A01)) {
                break;
            }
            i = i2 + 1;
        }
        return krd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0b69, code lost:
    
        throw r307;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.C6W0 r302, int r303) {
        /*
            Method dump skipped, instructions count: 3303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lb5.A01(X.6W0, int):void");
    }

    public void AEE(long j) {
        this.A05.AEE(j);
    }

    public boolean AHs(long j, long j2) {
        6VY r0;
        L5F l5f;
        long A00;
        long j3;
        boolean z;
        6Zn r02 = this.A05;
        long j4 = -9223372036854775807L;
        for (6bR r03 : this.A04) {
            boolean A04 = r03.A04();
            if (r03.A0I.A0r || !A04) {
                K15 k15 = null;
                if ((!5N4.A02(5N3.A0y) || !r03.A0P.isEmpty()) && !A04) {
                    ArrayList arrayList = r03.A0P;
                    k15 = (K15) arrayList.get(DKC.A06(arrayList));
                }
                LbO lbO = r03.A0M;
                long j5 = r03.A02;
                LbO lbO2 = lbO;
                if (lbO2.A0G.A0S && ((k15 != null || j5 != -9223372036854775807L) && (r0 = lbO2.A0C) != null)) {
                    long j6 = -1;
                    L5F[] l5fArr = lbO2.A0l;
                    if (k15 == null) {
                        l5f = l5fArr[0];
                        if (l5f.A02.B9Y(l5f.A00) != 0 && l5f.A02.B9Y(l5f.A00) != j6) {
                            A00 = l5fArr[lbO2.A0H.B9j()].A05(j5);
                        }
                    } else {
                        l5f = l5fArr[lbO2.A0H.B9j()];
                        j5 = k15.A02;
                        A00 = k15.A00();
                    }
                    l5f.A02.getClass();
                    Pair A01 = LbO.A01(l5f, lbO2);
                    long A002 = L5F.A00(l5f, AnonymousClass001.A05(A01.first));
                    long A042 = l5f.A04(JQx.A0Q(A01));
                    6XP r04 = lbO2.A0Z;
                    boolean z2 = r04.A0x && (r04.A00 > 0 || r04.A01 > 0 || r0.A04.get() != -9223372036854775807L || r0.A05.get() != -9223372036854775807L);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (!z2 && r04.A0g) {
                        6VX r05 = r0.A02;
                        synchronized (r05) {
                            6VX.A00(r05, elapsedRealtime);
                            z = r05.A00.size() < 1;
                        }
                        if (!z) {
                        }
                    }
                    6Y9 r06 = lbO2.A0H;
                    C6W0 c6w0 = lbO2.A0G;
                    long Axr = r06.Axr(lbO2.A0a, lbO2, j5, A00, A002, A042, AnonymousClass001.A05(A01.first), JQx.A0Q(A01), r0.A03.get(), r0.A04.get(), r0.A05.get(), c6w0.A0S, c6w0.A0T, lbO2.A0L);
                    if (Axr != -9223372036854775807L) {
                        long j7 = Axr / 1000;
                        long j8 = A042 / 1000;
                        if (k15 != null) {
                            6DO r07 = k15.A06.A07;
                            j3 = r07.A00 + r07.A07;
                        } else {
                            j3 = -1;
                        }
                        6Z2 r08 = r0.A00;
                        if (r08 != null) {
                            6Yv r09 = r08.A00;
                            r09.A0R.A05.add(Pair.create(6Yx.A03, Long.valueOf(elapsedRealtime)));
                            6Yv.A05(r09, "Discontinuity", j7, j8, j3);
                        }
                    }
                    if (!z2 && r04.A0g && Axr != -9223372036854775807L) {
                        6VX r010 = r0.A02;
                        synchronized (r010) {
                            6VX.A00(r010, elapsedRealtime);
                            Queue queue = r010.A00;
                            if (queue.size() < 1) {
                                queue.offer(Long.valueOf(elapsedRealtime));
                            } else {
                                android.util.Log.d("LiveJumpRateLimiter", GOo.A10("Jump is rate limited: maximum jump reached: %s, rate limiting period: %s", Arrays.copyOf(new Object[]{Integer.valueOf(queue.size()), 3600}, 2)));
                            }
                        }
                    }
                    if (Axr != -9223372036854775807L) {
                        j4 = Math.max(j4, Axr);
                    }
                }
            }
        }
        return r02.AHs(j, j4);
    }

    public boolean AHt(KjS kjS) {
        return this.A05.AHt(kjS);
    }

    public void ANV(long j, boolean z) {
        K14 k14;
        6bR[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            6bR r02 = r0[i2];
            if (!r02.A04()) {
                C6a4 c6a4 = r02.A0K;
                int i3 = c6a4.A00;
                c6a4.A0C(j, z, true);
                int i4 = c6a4.A00;
                if (i4 > i3) {
                    long A06 = c6a4.A06();
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        C6a4[] c6a4Arr = r02.A0W;
                        if (i6 >= c6a4Arr.length) {
                            break;
                        }
                        c6a4Arr[i6].A0C(A06, z, r02.A0X[i6]);
                        i5 = i6 + 1;
                    }
                }
                int A00 = 6bR.A00(r02, i4, 0);
                if (A00 > 0) {
                    ArrayList arrayList = r02.A0P;
                    int i7 = A00 - 1;
                    if (((Lbf) arrayList.get(i7)).A04 > j || j > ((Lbf) arrayList.get(i7)).A02) {
                        arrayList.get(i7);
                        k14 = null;
                    } else {
                        k14 = (K14) arrayList.get(i7);
                    }
                    r02.A05 = k14;
                    if (A00 > arrayList.size()) {
                        throw JQx.A0n();
                    }
                    arrayList.subList(0, A00).clear();
                } else {
                    continue;
                }
            }
            i = i2 + 1;
        }
    }

    public long AW2(6Vl r302, long j) {
        6bR[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            6bR r02 = r0[i2];
            if (r02.A0H == 2) {
                j = r02.A0M.AW2(r302, j);
                break;
            }
            i = i2 + 1;
        }
        return j;
    }

    public long AaC(long j) {
        return this.A05.AaC(j);
    }

    public long AaF() {
        return this.A05.AaF();
    }

    public long AzC() {
        return this.A05.AzC();
    }

    public 6YO BGj() {
        return this.A0E;
    }

    public boolean BTn() {
        return this.A05.BTn();
    }

    public void Bdl() {
        this.A0K.Bdk();
    }

    public /* bridge */ /* synthetic */ void Brb(6Zn r302) {
        6YW r0 = this.A01;
        if (r0 != null) {
            r0.Brb(this);
        }
    }

    public long CYF(long j) {
        6bR[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return j;
            }
            r0[i2].A03 = j;
            i = i2 + 1;
        }
    }

    public void CYa(6YW r302, long j) {
        this.A01 = r302;
        r302.CDa(this);
    }

    public long Cb0() {
        return -9223372036854775807L;
    }

    public void Cbp(long j) {
        this.A05.Cbp(j);
    }

    public long CkG(long j, boolean z) {
        ArrayList arrayList;
        boolean A0D;
        6bR[] r0 = this.A04;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            6bR r02 = r0[i2];
            r02.A03 = -1;
            r02.A01 = j;
            if (r02.A04()) {
                r02.A02 = j;
            } else {
                K14 k14 = null;
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    arrayList = r02.A0P;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    K14 k142 = (K14) arrayList.get(i4);
                    long j2 = ((Lbf) k142).A04;
                    if (j2 == j && k142.A03 == -9223372036854775807L) {
                        k14 = k142;
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    i3 = i4 + 1;
                }
                C6a4 c6a4 = r02.A0K;
                if (k14 != null) {
                    A0D = false;
                    int[] iArr = k14.A01;
                    6DP.A01(iArr);
                    int i5 = iArr[0];
                    synchronized (c6a4) {
                        c6a4.A03 = 0;
                        C6al c6al = c6a4.A0T;
                        c6al.A02 = c6al.A01;
                        int i6 = c6a4.A00;
                        if (i5 >= i6 && i5 <= c6a4.A02 + i6) {
                            c6a4.A08 = Long.MIN_VALUE;
                            c6a4.A03 = i5 - i6;
                            A0D = true;
                        }
                    }
                } else {
                    A0D = c6a4.A0D(j, DKD.A1U((j > r02.AzC() ? 1 : (j == r02.AzC() ? 0 : -1))));
                }
                if (!A0D || (r02.A0D && !z)) {
                    r02.A02 = j;
                    r02.A0C = false;
                    arrayList.clear();
                    6Zy r03 = r02.A0O;
                    if (r03.A01 != null) {
                        c6a4.A0A();
                        for (C6a4 c6a42 : r02.A0W) {
                            c6a42.A0A();
                        }
                        r03.A02();
                    } else {
                        r03.A02 = null;
                        C6a4.A03(c6a4, false);
                        for (C6a4 c6a43 : r02.A0W) {
                            C6a4.A03(c6a43, false);
                        }
                    }
                } else {
                    for (C6a4 c6a44 : r02.A0W) {
                        c6a44.A0D(j, true);
                    }
                }
            }
            r02.A0D = false;
            i = i2 + 1;
        }
        for (LbE lbE : this.A06) {
            lbE.A00(j);
        }
        return j;
    }

    public long CkN(6Zf[] r302, 6Y9[] r303, boolean[] zArr, boolean[] zArr2, long j) {
        Object obj;
        6bR lbE;
        6YP r314;
        int i;
        boolean z;
        6YP r313;
        int i2;
        int i3;
        int length = r303.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            6Y9 r0 = r303[i4];
            if (r0 != null) {
                i3 = this.A0E.A02.indexOf(r0.BGi());
                if (i3 >= 0) {
                    iArr[i4] = i3;
                }
            }
            i3 = -1;
            iArr[i4] = i3;
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (r303[i5] == null || !zArr[i5]) {
                6Zf r02 = r302[i5];
                if (r02 instanceof 6bR) {
                    6bR r03 = (6bR) r02;
                    r03.A07 = this;
                    r03.A0K.A08();
                    for (C6a4 c6a4 : r03.A0W) {
                        c6a4.A08();
                    }
                    r03.A0O.A03(r03);
                } else if (r02 instanceof LbG) {
                    LbG lbG = (LbG) r02;
                    boolean[] zArr3 = lbG.A04.A0X;
                    int i6 = lbG.A01;
                    6DP.A04(zArr3[i6]);
                    zArr3[i6] = false;
                }
                r302[i5] = null;
            }
        }
        for (int i7 = 0; i7 < length; i7++) {
            6Zf r04 = r302[i7];
            if ((r04 instanceof LbC) || (r04 instanceof LbG)) {
                int i8 = iArr[i7];
                if (i8 != -1) {
                    Klt[] kltArr = this.A0O;
                    int i9 = kltArr[i8].A03;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = iArr[i10];
                        if (i11 != i9 || kltArr[i11].A04 != 0) {
                            i10++;
                        } else if (i10 != -1) {
                            6Zf r05 = r302[i7];
                            if ((r05 instanceof LbG) && ((LbG) r05).A02 == r302[i10]) {
                            }
                        }
                    }
                }
                if (r302[i7] instanceof LbC) {
                }
                6Zf r06 = r302[i7];
                if (r06 instanceof LbG) {
                    LbG lbG2 = (LbG) r06;
                    boolean[] zArr4 = lbG2.A04.A0X;
                    int i12 = lbG2.A01;
                    6DP.A04(zArr4[i12]);
                    zArr4[i12] = false;
                }
                r302[i7] = null;
            }
        }
        for (int i13 = 0; i13 < length; i13++) {
            6Y9 r07 = r303[i13];
            if (r07 != null) {
                6Zf r08 = r302[i13];
                if (r08 == null) {
                    zArr2[i13] = true;
                    Klt klt = this.A0O[iArr[i13]];
                    if (klt.A04 == 0) {
                        int i14 = klt.A01;
                        boolean A1W = 4YV.A1W(i14, -1);
                        Lah lah = null;
                        if (A1W) {
                            r314 = (6YP) this.A0E.A02.get(i14);
                            i = 1;
                        } else {
                            r314 = null;
                            i = 0;
                        }
                        int i15 = klt.A00;
                        if (i15 != -1) {
                            z = true;
                            r313 = (6YP) this.A0E.A02.get(i15);
                            i += r313.A01;
                        } else {
                            z = false;
                            r313 = null;
                        }
                        6Yl[] r09 = new 6Yl[i];
                        int[] iArr2 = new int[i];
                        if (A1W) {
                            r09[0] = r314.A04[0];
                            iArr2[0] = 5;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (z) {
                            for (int i16 = 0; i16 < r313.A01; i16++) {
                                6Yl r010 = r313.A04[i16];
                                r09[i2] = r010;
                                iArr2[i2] = 3;
                                A0s.add(r010);
                                i2++;
                            }
                        }
                        if (this.A02.A0S && (A1W || this.A09.A0h)) {
                            LG5 lg5 = this.A0H;
                            lah = new Lah(lg5, lg5.A07);
                        }
                        MG2 mg2 = this.A0G;
                        6Zz r011 = this.A0K;
                        C6W0 c6w0 = this.A02;
                        L87 l87 = this.A0F;
                        int i17 = this.A00;
                        int[] iArr3 = klt.A06;
                        int i18 = klt.A05;
                        long j2 = this.A08;
                        5M9 r012 = this.A0L;
                        6YT r013 = this.A0A;
                        6XP r014 = this.A09;
                        LG5 lg52 = this.A0H;
                        6ZL r015 = this.A0D;
                        lbE = new 6bR(r014, this.A0B, this.A0C, r015, this, mg2.AJP(r014, r013, r015, l87, lah, lg52, c6w0, r07, r011, r012, A0s, iArr3, i17, i18, j2, A1W), this.A0I, this.A0J, iArr2, r09, i18, j);
                        synchronized (this) {
                            this.A0M.put(lbE, lah);
                        }
                    } else if (klt.A04 == 2) {
                        lbE = new LbE(r07.BGi().A04[0], (KkR) this.A03.get(klt.A02), this.A02.A0S);
                    }
                    r302[i13] = lbE;
                } else if (r08 instanceof 6bR) {
                    ((MQf) ((6bR) r08).A0M).A0H = r07;
                }
            }
        }
        for (int i19 = 0; i19 < length; i19++) {
            if (r302[i19] == null && r303[i19] != null) {
                int i20 = iArr[i19];
                Klt[] kltArr2 = this.A0O;
                Klt klt2 = kltArr2[i20];
                if (klt2.A04 != 1) {
                    continue;
                } else {
                    int i21 = iArr[i19];
                    if (i21 != -1) {
                        int i22 = kltArr2[i21].A03;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= length) {
                                break;
                            }
                            int i24 = iArr[i23];
                            if (i24 != i22 || kltArr2[i24].A04 != 0) {
                                i23++;
                            } else if (i23 != -1) {
                                6bR r016 = (6bR) r302[i23];
                                int i25 = klt2.A05;
                                int i26 = 0;
                                while (true) {
                                    C6a4[] c6a4Arr = r016.A0W;
                                    if (i26 >= c6a4Arr.length) {
                                        throw JQx.A0o();
                                    }
                                    if (r016.A0U[i26] == i25) {
                                        boolean[] zArr5 = r016.A0X;
                                        6DP.A04(!zArr5[i26]);
                                        zArr5[i26] = true;
                                        c6a4Arr[i26].A0D(j, true);
                                        obj = new LbG(c6a4Arr[i26], r016, r016, i26);
                                        break;
                                    }
                                    i26++;
                                }
                            }
                        }
                    }
                    obj = new Object();
                    r302[i19] = obj;
                }
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (6Zf r017 : r302) {
            if (r017 instanceof 6bR) {
                A0s2.add(r017);
            } else if (r017 instanceof LbE) {
                A0s3.add(r017);
            }
        }
        6bR[] r018 = new 6bR[A0s2.size()];
        this.A04 = r018;
        A0s2.toArray(r018);
        LbE[] lbEArr = new LbE[A0s3.size()];
        this.A06 = lbEArr;
        A0s3.toArray(lbEArr);
        this.A05 = new LbH(this.A04);
        return j;
    }

    public void Csi(boolean z) {
        this.A05.Csi(z);
    }

    public boolean D4i(long j) {
        return false;
    }

    public boolean D4j() {
        return false;
    }

    public boolean D4k(long j) {
        return false;
    }

    public void D4l() {
    }

    public void D7G(byte b, boolean z) {
        this.A05.D7G(b, z);
    }
}
