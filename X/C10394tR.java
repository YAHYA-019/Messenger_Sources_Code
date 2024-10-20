package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4tR.class */
public final class C10394tR implements 4cG, 2HW {
    public static final long A0F = TimeUnit.HOURS.toMillis(2);
    public static final long A0G = TimeUnit.MINUTES.toMillis(30);
    public long A01;
    public final long A02;
    public final long A03;
    public final 2HP A04;
    public final 2I3 A05;
    public final 4tO A06;
    public final CountDownLatch A0C;
    public final long A0D;
    public final 2HX A0E;
    public final Object A0A = new Object();
    public final C03h A08 = C03h.A01();
    public long A00 = -1;
    public final 4tS A07 = new 4tS();
    public final C0dp A09 = 0rI.A00;
    public final Set A0B = new HashSet();

    public C10394tR(2HP r302, 2HX r303, 2I3 r304, 4tO r305, 2HS r306, long j, long j2, long j3) {
        this.A03 = j3;
        this.A02 = j2;
        this.A01 = j2;
        this.A06 = r305;
        this.A05 = r304;
        this.A0E = r303;
        this.A0D = j;
        this.A04 = r302;
        if (r306 != null) {
            r306.CcG(this);
        }
        this.A0C = new CountDownLatch(0);
    }

    private void A00(Integer num, long j) {
        try {
            4tO r0 = this.A06;
            Collection<C7yj> Ak3 = r0.Ak3();
            long now = this.A09.now() + A0F;
            ArrayList arrayList = new ArrayList(Ak3.size());
            ArrayList arrayList2 = new ArrayList(Ak3.size());
            for (C7yj c7yj : Ak3) {
                if (c7yj.BFt() > now) {
                    arrayList.add(c7yj);
                } else {
                    arrayList2.add(c7yj);
                }
            }
            Collections.sort(arrayList2, new AHU(this.A05, 2));
            arrayList.addAll(arrayList2);
            4tS r02 = this.A07;
            long A00 = r02.A00() - j;
            int i = 0;
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C7yj c7yj2 = (C7yj) it.next();
                if (j2 > A00) {
                    break;
                }
                long Cdg = r0.Cdg(c7yj2);
                this.A0B.remove(c7yj2.getId());
                if (Cdg > 0) {
                    i++;
                    j2 += Cdg;
                    4cJ A002 = 4cJ.A00();
                    c7yj2.getId();
                    A002.A03 = num;
                    A002.A00 = Cdg;
                    2HX r03 = this.A0E;
                    if (r03 != null) {
                        r03.Bwo(A002);
                    }
                    A002.A01();
                }
            }
            r02.A02(-j2, -i);
            r0.CZr();
        } catch (IOException e) {
            this.A04.Ba1(C10394tR.class, 0S2.A06, 0Pz.A1B("evictAboveSize: ", e), e);
            throw e;
        }
    }

    public static boolean A01(C10394tR c10394tR) {
        boolean z;
        long j;
        C0dp c0dp = c10394tR.A09;
        long now = c0dp.now();
        4tS r0 = c10394tR.A07;
        synchronized (r0) {
            z = r0.A02;
        }
        if (z) {
            long j2 = c10394tR.A00;
            if (j2 != -1 && now - j2 <= A0G) {
                return false;
            }
        }
        long now2 = c0dp.now();
        long j3 = A0F + now2;
        try {
            long j4 = 0;
            long j5 = -1;
            int i = 0;
            boolean z2 = false;
            int i2 = 0;
            int i3 = 0;
            for (C7yj c7yj : c10394tR.A06.Ak3()) {
                i2++;
                j4 += c7yj.BB5();
                if (c7yj.BFt() > j3) {
                    i3++;
                    i = (int) (i + c7yj.BB5());
                    j5 = Math.max(c7yj.BFt() - now2, j5);
                    z2 = true;
                }
            }
            if (z2) {
                2HP r02 = c10394tR.A04;
                Integer num = 0S2.A0N;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Future timestamp found in ");
                A0k.append(i3);
                A0k.append(" files , with a total size of ");
                A0k.append(i);
                A0k.append(" bytes, and a maximum time delta of ");
                A0k.append(j5);
                r02.Ba1(C10394tR.class, num, AnonymousClass001.A0d("ms", A0k), (Throwable) null);
            }
            synchronized (r0) {
                j = r0.A00;
            }
            long j6 = i2;
            if (j != j6 || r0.A00() != j4) {
                synchronized (r0) {
                    r0.A00 = j6;
                    r0.A01 = j4;
                    r0.A02 = true;
                }
            }
            c10394tR.A00 = now2;
            return true;
        } catch (IOException e) {
            c10394tR.A04.Ba1(C10394tR.class, 0S2.A07, 0Pz.A1B("calcFileCacheSize: ", e), e);
            return false;
        }
    }

    public void AFF() {
        synchronized (this.A0A) {
            try {
                this.A06.AFF();
                this.A0B.clear();
                2HX r0 = this.A0E;
                if (r0 != null) {
                    r0.BoC();
                }
            } catch (IOException | NullPointerException e) {
                this.A04.Ba1(C10394tR.class, 0S2.A06, 0Pz.A1B("clearAll: ", e), e);
            }
            this.A07.A01();
        }
    }

    public long AFl(long j) {
        long j2;
        synchronized (this.A0A) {
            try {
                long now = this.A09.now();
                4tO r0 = this.A06;
                Collection<C7yj> Ak3 = r0.Ak3();
                4tS r02 = this.A07;
                synchronized (r02) {
                }
                int i = 0;
                long j3 = 0;
                j2 = 0;
                for (C7yj c7yj : Ak3) {
                    try {
                        long max = Math.max(1L, Math.abs(now - c7yj.BFt()));
                        if (max >= 5184000000L) {
                            long Cdg = r0.Cdg(c7yj);
                            this.A0B.remove(c7yj.getId());
                            if (Cdg > 0) {
                                i++;
                                j3 += Cdg;
                                4cJ A00 = 4cJ.A00();
                                c7yj.getId();
                                A00.A03 = 0S2.A01;
                                A00.A00 = Cdg;
                                2HX r03 = this.A0E;
                                if (r03 != null) {
                                    r03.Bwo(A00);
                                }
                                A00.A01();
                            }
                        } else {
                            j2 = Math.max(j2, max);
                        }
                    } catch (IOException e) {
                        e = e;
                        this.A04.Ba1(C10394tR.class, 0S2.A06, 0Pz.A1B("clearOldEntries: ", e), e);
                        return j2;
                    }
                }
                r0.CZr();
                if (i > 0) {
                    A01(this);
                    r02.A02(-j3, -i);
                }
            } catch (IOException e2) {
                e = e2;
                j2 = 0;
            }
        }
        return j2;
    }

    public 4cS B7g(InterfaceC04494b5 interfaceC04494b5) {
        4cS r309;
        4cJ A00 = 4cJ.A00();
        A00.A01 = interfaceC04494b5;
        try {
            try {
                synchronized (this.A0A) {
                    ArrayList A01 = 4cH.A01(interfaceC04494b5);
                    int i = 0;
                    String str = null;
                    r309 = null;
                    while (true) {
                        if (i < A01.size()) {
                            str = (String) A01.get(i);
                            r309 = this.A06.B7j(interfaceC04494b5, str);
                            if (r309 != null) {
                                str.getClass();
                                2HX r0 = this.A0E;
                                if (r0 != null) {
                                    r0.C17(A00);
                                }
                                this.A0B.add(str);
                            } else {
                                i++;
                            }
                        } else {
                            2HX r02 = this.A0E;
                            if (r02 != null) {
                                r02.C7G(A00);
                            }
                            this.A0B.remove(str);
                        }
                    }
                }
                A00.A01();
                return r309;
            } catch (IOException e) {
                this.A04.Ba1(C10394tR.class, 0S2.A07, "getResource", e);
                A00.A02 = e;
                2HX r03 = this.A0E;
                if (r03 != null) {
                    r03.CFZ(A00);
                }
                A00.A01();
                return null;
            }
        } catch (Throwable th) {
            A00.A01();
            throw th;
        }
    }

    public long BB5() {
        return this.A07.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r301.A0B.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BN7(X.InterfaceC04494b5 r302) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.A0A
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            r0 = r301
            r1 = r302
            boolean r0 = r0.BN8(r1)     // Catch: java.lang.Throwable -> L78
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L73
            r0 = r302
            java.util.ArrayList r0 = X.4cH.A01(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r306 = r0
            r0 = 0
            r307 = r0
        L1d:
            r0 = r306
            int r0 = r0.size()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 >= r1) goto L6a
            r0 = r306
            r1 = r307
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r308 = r0
            r0 = r308
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r308 = r0
            r0 = r301
            X.4tO r0 = r0.A06     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r309 = r0
            r0 = r309
            r1 = r302
            r2 = r308
            boolean r0 = r0.AHl(r1, r2)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L61
            r0 = r301
            java.util.Set r0 = r0.A0B     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            r309 = r0
            r0 = r309
            r1 = r308
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L78
            goto L73
        L61:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L1d
        L6a:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r0 = 0
            return r0
        L6e:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r0 = 0
            return r0
        L73:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r0 = r305
            return r0
        L78:
            r309 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r0 = r309
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10394tR.BN7(X.4b5):boolean");
    }

    public boolean BN8(InterfaceC04494b5 interfaceC04494b5) {
        synchronized (this.A0A) {
            ArrayList A01 = 4cH.A01(interfaceC04494b5);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= A01.size()) {
                    return false;
                }
                if (this.A0B.contains((String) A01.get(i2))) {
                    return true;
                }
                i = i2 + 1;
            }
        }
    }

    public 4cS BPb(InterfaceC04494b5 interfaceC04494b5, InterfaceC10634u2 interfaceC10634u2) {
        String A00;
        4tO r0;
        4tS r02;
        4cU AGk;
        File file;
        4cJ A002 = 4cJ.A00();
        A002.A01 = interfaceC04494b5;
        2HX r03 = this.A0E;
        if (r03 != null) {
            r03.CVF(A002);
        }
        Object obj = this.A0A;
        synchronized (obj) {
            A00 = 4cH.A00(interfaceC04494b5);
            try {
            } finally {
                A002.A01();
            }
        }
        try {
            synchronized (obj) {
                try {
                    boolean A01 = A01(this);
                    r0 = this.A06;
                    Integer num = r0.isExternal() ? 0S2.A01 : 0S2.A00;
                    C03h c03h = this.A08;
                    long j = this.A02;
                    r02 = this.A07;
                    if (c03h.A09(num, j - r02.A00())) {
                        this.A01 = this.A03;
                    } else {
                        this.A01 = j;
                    }
                    long A003 = r02.A00();
                    if (A003 > this.A01 && !A01) {
                        r02.A01();
                        A01(this);
                    }
                    long j2 = this.A01;
                    if (A003 > j2) {
                        A00(0S2.A00, (j2 * 9) / 10);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            C7yb BPc = r0.BPc(interfaceC04494b5, A00);
            try {
                BPc.DB3(interfaceC10634u2, interfaceC04494b5);
                synchronized (obj) {
                    AGk = BPc.AGk(interfaceC04494b5);
                    this.A0B.add(A00);
                    file = AGk.A00;
                    r02.A02(file.length(), 1L);
                }
                A002.A00 = file.length();
                synchronized (r02) {
                }
                if (r03 != null) {
                    r03.CVJ(A002);
                }
                if (!BPc.AF9()) {
                    C0d7.A00(C10394tR.class, "Failed to delete temp file");
                }
                return AGk;
            } catch (Throwable th2) {
                th = th2;
                if (!BPc.AF9()) {
                    C0d7.A00(C10394tR.class, "Failed to delete temp file");
                }
                throw th;
            }
        } catch (IOException e) {
            A002.A02 = e;
            if (r03 != null) {
                r03.CVG(A002);
            }
            C0d8 c0d8 = C0d7.A00;
            if (c0d8.BTv(6)) {
                c0d8.e(C10394tR.class.getSimpleName(), "Failed inserting a file into the cache", e);
            }
            throw e;
        }
    }

    public void Cdl(InterfaceC04494b5 interfaceC04494b5) {
        synchronized (this.A0A) {
            try {
                ArrayList A01 = 4cH.A01(interfaceC04494b5);
                int i = 0;
                while (true) {
                    if (i >= A01.size()) {
                        break;
                    }
                    String str = (String) A01.get(i);
                    this.A06.Cdh(str);
                    this.A0B.remove(str);
                    i++;
                }
            } catch (IOException e) {
                this.A04.Ba1(C10394tR.class, 0S2.A05, 0Pz.A1B("delete: ", e), e);
            }
        }
    }

    public void trimToMinimum() {
        synchronized (this.A0A) {
            A01(this);
            4tS r0 = this.A07;
            long A00 = r0.A00();
            long j = this.A0D;
            if (j > 0 && A00 > 0 && A00 >= j) {
                double d = 1.0d - (j / A00);
                if (d > 0.02d) {
                    try {
                        r0.A01();
                        A01(this);
                        long A002 = r0.A00();
                        A00(0S2.A0N, A002 - ((long) (d * A002)));
                    } catch (IOException e) {
                        this.A04.Ba1(C10394tR.class, 0S2.A06, 0Pz.A1B("trimBy: ", e), e);
                    }
                }
            }
        }
    }

    public void trimToNothing() {
        AFF();
    }
}
