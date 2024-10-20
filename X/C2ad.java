package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2ad, reason: invalid class name */
/* loaded from: 2ad.class */
public final class C2ad extends 2Zs implements 2Zt {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A05 = AtomicIntegerFieldUpdater.newUpdater(C2ad.class, "runningWorkers$volatile");
    public final int A00;
    public final Object A01;
    public final 2Zs A02;
    public final 2aW A03;
    public final /* synthetic */ 2Zt A04;
    public volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.2aW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2ad(X.2Zs r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r302
            boolean r0 = r0 instanceof X.2Zt
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L20
            r0 = r302
            X.2Zt r0 = (X.2Zt) r0
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L24
        L20:
            X.2Zt r0 = X.C2ae.A00
            r302 = r0
        L24:
            r0 = r301
            r1 = r302
            r0.A04 = r1
            X.2aW r0 = new X.2aW
            r305 = r0
            r0 = r305
            r0.<init>()
            X.2aX r0 = new X.2aX
            r306 = r0
            r0 = r306
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r0 = r305
            r1 = r306
            r0._cur$volatile = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            java.lang.Object r0 = new java.lang.Object
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r301
            r1 = r306
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ad.<init>(X.2Zs, int):void");
    }

    public static final Runnable A00(C2ad c2ad) {
        Runnable runnable;
        while (true) {
            2aW r0 = c2ad.A03;
            runnable = (Runnable) r0.A01();
            if (runnable != null) {
                break;
            }
            synchronized (c2ad.A01) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
                atomicIntegerFieldUpdater.decrementAndGet(c2ad);
                if (r0.A00() == 0) {
                    runnable = null;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(c2ad);
                }
            }
            break;
        }
        return runnable;
    }

    public C2a8 BQJ(Runnable runnable, 0DE r303, long j) {
        return this.A04.BQJ(runnable, r303, j);
    }

    public void Cjn(C2s8 c2s8, long j) {
        this.A04.Cjn(c2s8, j);
    }

    public void dispatch(0DE r302, Runnable runnable) {
        boolean z;
        Runnable A00;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) >= i2) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (A00 = A00(this)) == null) {
                return;
            }
            this.A02.dispatch(this, new 4zN(A00, this));
        }
    }

    public void dispatchYield(0DE r302, Runnable runnable) {
        boolean z;
        Runnable A00;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) >= i2) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (A00 = A00(this)) == null) {
                return;
            }
            this.A02.dispatchYield(this, new 4zN(A00, this));
        }
    }

    public 2Zs limitedParallelism(int i) {
        C2ac.A00(i);
        if (i >= this.A00) {
            return this;
        }
        C2ac.A00(i);
        return new C2ad(this, i);
    }
}
