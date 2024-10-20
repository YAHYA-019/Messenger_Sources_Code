package X;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

/* renamed from: X.6a4, reason: invalid class name */
/* loaded from: 6a4.class */
public final class C6a4 implements C6a5 {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public long A07;
    public Uri A09;
    public 6Yl A0A;
    public 6Yl A0B;
    public C7ys A0C;
    public 6Zq A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public 6Yl A0P;
    public final 6ZM A0R;
    public final 6WC A0S;
    public final C6al A0T;
    public final C6an A0V = new Object();
    public int A01 = 1000;
    public int[] A0L = new int[1000];
    public long[] A0M = new long[1000];
    public long[] A0N = new long[1000];
    public int[] A0J = new int[1000];
    public int[] A0K = new int[1000];
    public C6ao[] A0O = new C6ao[1000];
    public final C6ar A0U = new C6ar(new C6aq() { // from class: X.6ap
        @Override // X.C6aq
        public final void accept(Object obj) {
            ((C6av) obj).A01.release();
        }
    });
    public long A08 = Long.MIN_VALUE;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public boolean A0I = true;
    public boolean A0Q = true;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.6an, java.lang.Object] */
    public C6a4(6ZM r302, 6WC r303, 6XD r304) {
        this.A0S = r303;
        this.A0R = r302;
        this.A0T = new C6al(r304);
    }

    private int A00(int i, int i2, long j, boolean z) {
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i2) {
                break;
            }
            long j2 = this.A0N[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0J[i] & 1) != 0) {
                i3 = i5;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.A01) {
                i = 0;
            }
            i4 = i5 + 1;
        }
        return i3;
    }

    public static long A01(C6a4 c6a4, int i) {
        c6a4.A05 = Math.max(c6a4.A05, A02(c6a4, i));
        c6a4.A02 -= i;
        int i2 = c6a4.A00 + i;
        c6a4.A00 = i2;
        int i3 = c6a4.A04 + i;
        c6a4.A04 = i3;
        int i4 = c6a4.A01;
        if (i3 >= i4) {
            c6a4.A04 = i3 - i4;
        }
        int i5 = c6a4.A03 - i;
        c6a4.A03 = i5;
        if (i5 < 0) {
            c6a4.A03 = 0;
        }
        C6ar c6ar = c6a4.A0U;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            SparseArray sparseArray = c6ar.A01;
            if (i7 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i7 + 1;
            if (i2 < sparseArray.keyAt(i8)) {
                break;
            }
            c6ar.A02.accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = c6ar.A00;
            if (i9 > 0) {
                c6ar.A00 = i9 - 1;
            }
            i6 = i8;
        }
        if (c6a4.A02 != 0) {
            return c6a4.A0M[c6a4.A04];
        }
        int i10 = c6a4.A04;
        if (i10 == 0) {
            i10 = c6a4.A01;
        }
        return c6a4.A0M[i10 - 1] + c6a4.A0K[r0];
    }

    public static long A02(C6a4 c6a4, int i) {
        long j = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = c6a4.A04 + (i - 1);
            int i3 = c6a4.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= i) {
                    break;
                }
                j = Math.max(j, c6a4.A0N[i2]);
                if ((c6a4.A0J[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
                i4 = i5 + 1;
            }
        }
        return j;
    }

    public static void A03(C6a4 c6a4, boolean z) {
        SparseArray sparseArray;
        C6al c6al = c6a4.A0T;
        C6al.A04(c6al.A01, c6al);
        C6am c6am = c6al.A01;
        boolean z2 = false;
        if (c6am.A03 == null) {
            z2 = true;
        }
        6DP.A04(z2);
        c6am.A01 = 0L;
        c6am.A00 = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        c6al.A02 = c6am;
        c6al.A03 = c6am;
        c6al.A00 = 0L;
        c6al.A04.D5E();
        c6a4.A02 = 0;
        c6a4.A00 = 0;
        c6a4.A04 = 0;
        c6a4.A03 = 0;
        c6a4.A0Q = true;
        c6a4.A08 = Long.MIN_VALUE;
        c6a4.A05 = Long.MIN_VALUE;
        c6a4.A06 = Long.MIN_VALUE;
        c6a4.A0E = false;
        C6ar c6ar = c6a4.A0U;
        int i = 0;
        while (true) {
            int i2 = i;
            sparseArray = c6ar.A01;
            if (i2 >= sparseArray.size()) {
                break;
            }
            c6ar.A02.accept(sparseArray.valueAt(i2));
            i = i2 + 1;
        }
        c6ar.A00 = -1;
        sparseArray.clear();
        if (z) {
            c6a4.A0P = null;
            c6a4.A0B = null;
            c6a4.A0I = true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v4 int, still in use, count: 2, list:
          (r309v4 int) from 0x00a3: PHI (r309v2 int) = (r309v1 int), (r309v4 int) binds: [B:37:0x009c, B:28:0x0092] A[DONT_GENERATE, DONT_INLINE]
          (r309v4 int) from 0x0092: IF  (r309v4 int) == (-1 int)  -> B:38:0x00a9 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final int A04(long r302, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            r305 = r0
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            int r0 = r0.A03     // Catch: java.lang.Throwable -> Lae
            r306 = r0
            r0 = r301
            int r0 = r0.A04     // Catch: java.lang.Throwable -> Lae
            r1 = r306
            int r0 = r0 + r1
            r307 = r0
            r0 = r301
            int r0 = r0.A01     // Catch: java.lang.Throwable -> Lae
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto L28
            r0 = r307
            r1 = r308
            int r0 = r0 - r1
            r307 = r0
        L28:
            r0 = r301
            int r0 = r0.A02     // Catch: java.lang.Throwable -> Lae
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r306
            r1 = r309
            if (r0 == r1) goto L3e
            r0 = 1
            r308 = r0
        L3e:
            r0 = r308
            if (r0 == 0) goto La9
            r0 = r301
            long[] r0 = r0.A0N     // Catch: java.lang.Throwable -> Lae
            r310 = r0
            r0 = r310
            r1 = r307
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lae
            r311 = r0
            r0 = r302
            r313 = r0
            r0 = r302
            r1 = r311
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 < 0) goto La9
            r0 = r301
            long r0 = r0.A06     // Catch: java.lang.Throwable -> Lae
            r315 = r0
            r0 = r302
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r317 = r0
            r0 = r317
            if (r0 <= 0) goto L72
            goto L98
        L72:
            r0 = r309
            r1 = r306
            int r0 = r0 - r1
            r309 = r0
            r0 = 1
            r318 = r0
            r0 = r305
            r1 = r307
            r2 = r309
            r3 = r313
            r4 = r318
            int r0 = r0.A00(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r309 = r0
            r0 = -1
            r308 = r0
            r0 = r309
            r1 = r308
            if (r0 != r1) goto La3
            goto La9
        L98:
            r0 = r304
            if (r0 == 0) goto L72
            r0 = r309
            r1 = r306
            int r0 = r0 - r1
            r309 = r0
        La3:
            r0 = r305
            monitor-exit(r0)
            r0 = r309
            return r0
        La9:
            r0 = r305
            monitor-exit(r0)
            r0 = 0
            return r0
        Lae:
            r310 = move-exception
            r0 = r305
            monitor-exit(r0)
            r0 = r310
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a4.A04(long, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02da, code lost:
    
        if (r307 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0198, code lost:
    
        if (r315 != r301.A0A) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01af A[Catch: all -> 0x0304, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0022, B:10:0x0027, B:11:0x002c, B:14:0x0039, B:15:0x003f, B:17:0x004a, B:18:0x0051, B:19:0x0058, B:22:0x0064, B:25:0x0071, B:26:0x0077, B:28:0x0080, B:32:0x0094, B:35:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00cf, B:44:0x00d5, B:47:0x00e1, B:52:0x00e9, B:54:0x00f1, B:56:0x00f7, B:58:0x00fd, B:60:0x0104, B:62:0x010a, B:64:0x0110, B:68:0x012a, B:70:0x0130, B:72:0x0137, B:74:0x013e, B:76:0x0144, B:78:0x014b, B:80:0x0152, B:82:0x0158, B:84:0x015f, B:86:0x0166, B:106:0x019b, B:111:0x01b7, B:113:0x01be, B:114:0x01c3, B:118:0x01d0, B:119:0x01d9, B:121:0x01e0, B:122:0x01e7, B:123:0x01ec, B:123:0x01ec, B:126:0x01f3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:138:0x0220, B:141:0x022f, B:144:0x0239, B:145:0x023f, B:147:0x0249, B:149:0x0253, B:150:0x0259, B:153:0x0265, B:158:0x01af, B:161:0x0173, B:164:0x017e, B:169:0x018e, B:173:0x027c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A05(X.6WB r302, X.6WD r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a4.A05(X.6WB, X.6WD, int, boolean):int");
    }

    public final long A06() {
        long j;
        synchronized (this) {
            j = this.A02 == 0 ? Long.MIN_VALUE : this.A0N[this.A04];
        }
        return j;
    }

    public final long A07() {
        long j;
        synchronized (this) {
            j = this.A06;
        }
        return j;
    }

    public void A08() {
        A0A();
        C7ys c7ys = this.A0C;
        if (c7ys != null) {
            c7ys.Cch(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    public void A09() {
        A03(this, true);
        C7ys c7ys = this.A0C;
        if (c7ys != null) {
            c7ys.Cch(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    public final void A0A() {
        long A01;
        C6al c6al = this.A0T;
        synchronized (this) {
            int i = this.A02;
            A01 = i == 0 ? -1 : A01(this, i);
        }
        c6al.A05(A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r301.A03 + r302) > r301.A02) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(int r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r302
            if (r0 < 0) goto L1a
            r0 = r301
            int r0 = r0.A03     // Catch: java.lang.Throwable -> L36
            r1 = r302
            int r0 = r0 + r1
            r303 = r0
            r0 = r301
            int r0 = r0.A02     // Catch: java.lang.Throwable -> L36
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 <= r1) goto L20
        L1a:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L20:
            r0 = r305
            X.6DP.A03(r0)     // Catch: java.lang.Throwable -> L36
            r0 = r301
            int r0 = r0.A03     // Catch: java.lang.Throwable -> L36
            r1 = r302
            int r0 = r0 + r1
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A03 = r1     // Catch: java.lang.Throwable -> L36
            r0 = r301
            monitor-exit(r0)
            return
        L36:
            r306 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a4.A0B(int):void");
    }

    public final void A0C(long j, boolean z, boolean z2) {
        long j2;
        C6al c6al = this.A0T;
        synchronized (this) {
            int i = this.A02;
            if (i != 0) {
                long[] jArr = this.A0N;
                int i2 = this.A04;
                if (j >= jArr[i2]) {
                    if (z2) {
                        int i3 = this.A03;
                        if (i3 != i) {
                            i = i3 + 1;
                        }
                    }
                    int A00 = A00(i2, i, j, z);
                    if (A00 != -1) {
                        j2 = A01(this, A00);
                    }
                }
            }
            j2 = -1;
        }
        c6al.A05(j2);
    }

    public final boolean A0D(long j, boolean z) {
        synchronized (this) {
            this.A03 = 0;
            C6al c6al = this.A0T;
            c6al.A02 = c6al.A01;
            int i = this.A04;
            int i2 = this.A01;
            if (i >= i2) {
                i -= i2;
            }
            int i3 = this.A02;
            if (0 != i3 && j >= this.A0N[i] && (j <= this.A06 || z)) {
                int A00 = A00(i, i3, j, true);
                if (A00 != -1) {
                    this.A08 = j;
                    this.A03 = A00;
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r0 != r301.A0A) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E(boolean r302) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a4.A0E(boolean):boolean");
    }

    @Override // X.C6a5
    public final void ATn(6Yl r302) {
        boolean z;
        6Yl r303 = r302;
        long j = this.A07;
        if (j != 0) {
            long j2 = r302.A0M;
            if (j2 != Long.MAX_VALUE) {
                6Zr r0 = new 6Zr(r302);
                r0.A0K = j2 + j;
                r303 = new 6Yl(r0);
            }
        }
        this.A0H = false;
        this.A0P = r302;
        synchronized (this) {
            this.A0I = false;
            if (Util.A0P(r303, this.A0B)) {
                z = false;
            } else {
                SparseArray sparseArray = this.A0U.A01;
                if (sparseArray.size() != 0 && ((C6av) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(r303)) {
                    r303 = ((C6av) sparseArray.valueAt(sparseArray.size() - 1)).A00;
                }
                this.A0B = r303;
                this.A0G = C6ac.A06(r303.A0W, r303.A0R);
                this.A0F = false;
                z = true;
            }
        }
        6Zl r02 = this.A0D;
        if (r02 == null || !z) {
            return;
        }
        6Zl r03 = r02;
        r03.A0M.post(r03.A0U);
    }

    @Override // X.C6a5
    public /* synthetic */ void Cj9(6aO r302, int i) {
        CjA(r302, i, 0);
    }

    @Override // X.C6a5
    public final void CjA(6aO r302, int i, int i2) {
        C6al c6al = this.A0T;
        while (i > 0) {
            int A00 = C6al.A00(c6al, i);
            C6am c6am = c6al.A03;
            r302.A0S(c6am.A03.A00, (int) (c6al.A00 - c6am.A01), A00);
            i -= A00;
            long j = c6al.A00 + A00;
            c6al.A00 = j;
            C6am c6am2 = c6al.A03;
            if (j == c6am2.A00) {
                c6al.A03 = c6am2.A02;
            }
        }
    }

    @Override // X.C6a5
    public final int CjE(6D8 r302, int i, int i2, boolean z) {
        C6al c6al = this.A0T;
        int A00 = C6al.A00(c6al, i);
        C6am c6am = c6al.A03;
        int read = r302.read(c6am.A03.A00, (int) (c6al.A00 - c6am.A01), A00);
        if (read != -1) {
            long j = c6al.A00 + read;
            c6al.A00 = j;
            C6am c6am2 = c6al.A03;
            if (j == c6am2.A00) {
                c6al.A03 = c6am2.A02;
                return read;
            }
        } else {
            if (!z) {
                throw new EOFException();
            }
            read = -1;
        }
        return read;
    }

    @Override // X.C6a5
    public void CjG(C6ao c6ao, int i, int i2, int i3, long j) {
        C6at c6at;
        if (this.A0H) {
            6Yl r0 = this.A0P;
            6DP.A01(r0);
            ATn(r0);
        }
        int i4 = i & 1;
        boolean z = false;
        if (i4 != 0) {
            z = true;
        }
        if (this.A0Q) {
            if (!z) {
                return;
            } else {
                this.A0Q = false;
            }
        }
        long j2 = this.A07 + j;
        if (this.A0G) {
            if (j2 < this.A08) {
                return;
            }
            if (i4 == 0) {
                if (!this.A0F) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Overriding unexpected non-sync sample for format: ");
                    5My.A04("SampleQueue", AnonymousClass001.A0a(this.A0B, A0k));
                    this.A0F = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.A0T.A00 - i2) - i3;
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                boolean z2 = false;
                if (this.A0M[i6] + this.A0K[i6] <= j3) {
                    z2 = true;
                }
                6DP.A03(z2);
            }
            boolean z3 = false;
            if ((536870912 & i) != 0) {
                z3 = true;
            }
            this.A0E = z3;
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0N[i8] = j2;
            this.A0M[i8] = j3;
            this.A0K[i8] = i2;
            this.A0J[i8] = i;
            this.A0O[i8] = c6ao;
            this.A0L[i8] = 0;
            C6ar c6ar = this.A0U;
            SparseArray sparseArray = c6ar.A01;
            if (sparseArray.size() == 0 || !((C6av) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(this.A0B)) {
                6WC r02 = this.A0S;
                if (r02 != null) {
                    c6at = r02.CYI(this.A0B, this.A0R);
                } else {
                    c6at = C6at.A00;
                }
                int i10 = this.A00 + this.A02;
                6Yl r03 = this.A0B;
                r03.getClass();
                C6av c6av = new C6av(r03, c6at);
                boolean z4 = false;
                if (c6ar.A00 == -1) {
                    boolean z5 = false;
                    if (sparseArray.size() == 0) {
                        z5 = true;
                    }
                    6DP.A04(z5);
                    c6ar.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i10 >= keyAt) {
                        z4 = true;
                    }
                    6DP.A03(z4);
                    if (keyAt == i10) {
                        c6ar.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, c6av);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                int[] iArr = new int[i13];
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                int[] iArr2 = new int[i13];
                int[] iArr3 = new int[i13];
                C6ao[] c6aoArr = new C6ao[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0M, i14, jArr, 0, i15);
                System.arraycopy(this.A0N, this.A04, jArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0K, this.A04, iArr3, 0, i15);
                System.arraycopy(this.A0O, this.A04, c6aoArr, 0, i15);
                System.arraycopy(this.A0L, this.A04, iArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0M, 0, jArr, i15, i16);
                System.arraycopy(this.A0N, 0, jArr2, i15, i16);
                System.arraycopy(this.A0J, 0, iArr2, i15, i16);
                System.arraycopy(this.A0K, 0, iArr3, i15, i16);
                System.arraycopy(this.A0O, 0, c6aoArr, i15, i16);
                System.arraycopy(this.A0L, 0, iArr, i15, i16);
                this.A0M = jArr;
                this.A0N = jArr2;
                this.A0J = iArr2;
                this.A0K = iArr3;
                this.A0O = c6aoArr;
                this.A0L = iArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    @Override // X.C6a5
    public void D8Y(Uri uri) {
        this.A09 = uri;
    }
}
