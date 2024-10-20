package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.2ag, reason: invalid class name */
/* loaded from: 2ag.class */
public abstract class C2ag extends C2ah implements 2Zt {
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(C2ag.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C2ag.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(C2ag.class, "_isCompleted$volatile");

    public static final boolean A01(Runnable runnable, C2ag c2ag) {
        boolean A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c2ag);
            boolean z = false;
            if (A00.get(c2ag) != 0) {
                z = true;
            }
            if (z) {
                return false;
            }
            if (obj == null) {
                A002 = C2am.A00(c2ag, null, runnable, atomicReferenceFieldUpdater);
            } else if (obj instanceof 2aX) {
                2aX r0 = (2aX) obj;
                int A022 = r0.A02(runnable);
                if (A022 == 0) {
                    break;
                }
                if (A022 != 1) {
                    return false;
                }
                C2am.A00(c2ag, obj, 2aX.A01(r0, 2aX.A00(r0)), atomicReferenceFieldUpdater);
            } else {
                if (obj == C44g.A00) {
                    return false;
                }
                2aX r02 = new 2aX(8, true);
                r02.A02(obj);
                r02.A02(runnable);
                A002 = C2am.A00(c2ag, obj, r02, atomicReferenceFieldUpdater);
            }
            if (A002) {
                break;
            }
        }
        return true;
    }

    @Override // X.C2ai
    public void A06() {
        boolean A002;
        Object A03;
        44Y.A00.set(null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof 2aX)) {
                    if (obj == C44g.A00) {
                        break;
                    }
                    2aX r0 = new 2aX(8, true);
                    r0.A02(obj);
                    A002 = C2am.A00(this, obj, r0, atomicReferenceFieldUpdater);
                } else {
                    ((2aX) obj).A04();
                    break;
                }
            } else {
                A002 = C2am.A00(this, null, C44g.A00, atomicReferenceFieldUpdater);
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A02() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C44f c44f = (C44f) A01.get(this);
            if (c44f == null) {
                return;
            }
            synchronized (c44f) {
                A03 = C44f.A01.get(c44f) > 0 ? c44f.A03(0) : null;
            }
            C44m c44m = (C44m) A03;
            if (c44m == null) {
                return;
            } else {
                A08(c44m, nanoTime);
            }
        }
    }

    public void A09(Runnable runnable) {
        if (!A01(runnable, this)) {
            C2af.A00.A09(runnable);
            return;
        }
        Thread A07 = A07();
        if (Thread.currentThread() != A07) {
            LockSupport.unpark(A07);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        if ((r315 - r328) > 0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [X.44n[]] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.44o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(X.C44m r302, long r303) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ag.A0A(X.44m, long):void");
    }

    public boolean A0B() {
        C07a c07a = this.A01;
        if (!(c07a != null ? c07a.isEmpty() : true)) {
            return false;
        }
        Object obj = A01.get(this);
        if (obj != null && C44f.A01.get(obj) != 0) {
            return false;
        }
        Object obj2 = A02.get(this);
        if (obj2 == null) {
            return true;
        }
        if (!(obj2 instanceof 2aX)) {
            return obj2 == C44g.A00;
        }
        long j = 2aX.A05.get(obj2);
        boolean z = false;
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r307 < 4611686018427387903L) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.2a7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C2a8 BQJ(final java.lang.Runnable r302, X.0DE r303, long r304) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.C2af
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L73
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L41
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            r307 = r0
            r0 = r304
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L6b
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r304
            long r0 = r0 * r1
            r307 = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L6b
        L41:
            long r0 = java.lang.System.nanoTime()
            r309 = r0
            r0 = r307
            r1 = r309
            long r0 = r0 + r1
            r307 = r0
            X.44l r0 = new X.44l
            r311 = r0
            r0 = r311
            r1 = r302
            r2 = r307
            r0.<init>(r1, r2)
            r0 = r301
            X.2ag r0 = (X.C2ag) r0
            r1 = r311
            r2 = r309
            r0.A0A(r1, r2)
        L65:
            r0 = r311
            X.2a8 r0 = (X.C2a8) r0
            return r0
        L6b:
            X.2a7 r0 = X.C2a7.A00
            r311 = r0
            goto L65
        L73:
            X.2Zt r0 = X.C2ae.A00
            r1 = r302
            r2 = r303
            r3 = r304
            X.2a8 r0 = r0.BQJ(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ag.BQJ(java.lang.Runnable, X.0DE, long):X.2a8");
    }

    public void Cjn(final C2s8 c2s8, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                return;
            }
            j2 = 1000000 * j;
            if (j2 >= 4611686018427387903L) {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        final long j3 = j2 + nanoTime;
        C44m c44m = new C44m(c2s8, this, j3) { // from class: X.3l0
            public static final String __redex_internal_original_name = "EventLoopImplBase$DelayedResumeTask";
            public final C2s8 A00;
            public final /* synthetic */ C2ag A01;

            {
                this.A01 = this;
                super.A01 = j3;
                super.A00 = -1;
                this.A00 = c2s8;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.A00.CiQ(04S.A00, this.A01);
            }

            @Override // X.C44m
            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(super.toString());
                return AnonymousClass001.A0a(this.A00, A0k);
            }
        };
        A0A(c44m, nanoTime);
        AnonymousClass459.A01(c2s8, c44m);
    }

    public final void dispatch(0DE r302, Runnable runnable) {
        A09(runnable);
    }
}
