package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.1i8, reason: invalid class name */
/* loaded from: 1i8.class */
public abstract class C1i8 extends AtomicReference implements Runnable {
    public static final Runnable A00 = new Object();
    public static final Runnable A01 = new Object();
    public static final String __redex_internal_original_name = "InterruptibleTask";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(java.lang.Thread r302) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.get()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        Ld:
            r0 = r303
            boolean r0 = r0 instanceof X.C3k9
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L2d
            java.lang.Runnable r0 = X.C1i8.A01
            r308 = r0
            r0 = r303
            r1 = r308
            if (r0 == r1) goto L2f
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r302
            r0.interrupt()
        L2c:
            return
        L2d:
            r0 = r303
            r304 = r0
        L2f:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 <= r1) goto L7f
            java.lang.Runnable r0 = X.C1i8.A01
            r308 = r0
            r0 = r303
            r1 = r308
            if (r0 == r1) goto L5a
            r0 = r301
            r1 = r303
            r2 = r308
            boolean r0 = r0.compareAndSet(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L77
        L5a:
            boolean r0 = java.lang.Thread.interrupted()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L70
            r0 = r305
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = r307
            if (r0 == 0) goto L73
        L70:
            r0 = 1
            r305 = r0
        L73:
            r0 = r304
            java.util.concurrent.locks.LockSupport.park(r0)
        L77:
            r0 = r301
            java.lang.Object r0 = r0.get()
            r303 = r0
            goto Ld
        L7f:
            java.lang.Thread.yield()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1i8.A00(java.lang.Thread):void");
    }

    public abstract Object A01();

    public String A02() {
        return (this instanceof C1i5 ? ((C1i5) this).callable : ((2fU) this).callable).toString();
    }

    public final void A03() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            C3k9 c3k9 = new C3k9(this);
            C3k9.A00(c3k9, Thread.currentThread());
            if (compareAndSet(runnable, c3k9)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public abstract void A04(Object obj);

    public void A05(Throwable th) {
        if (!(this instanceof C1i6)) {
            ((2fU) this).this$0.setException(th);
            return;
        }
        C1hn c1hn = ((C1i6) this).this$0;
        1GE r0 = C1hp.A03;
        c1hn.A00 = null;
        if (th instanceof ExecutionException) {
            th = th.getCause();
        } else if (th instanceof CancellationException) {
            c1hn.cancel(false);
            return;
        }
        c1hn.setException(th);
    }

    public abstract boolean A06();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !A06();
            if (z) {
                try {
                    obj = A01();
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        try {
                            currentThread.interrupt();
                        } catch (Throwable th2) {
                            if (!compareAndSet(currentThread, A00)) {
                                A00(currentThread);
                            }
                            A04(null);
                            throw th2;
                        }
                    }
                    if (!compareAndSet(currentThread, A00)) {
                        A00(currentThread);
                    }
                    A05(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, A00)) {
                A00(currentThread);
            }
            if (z) {
                A04(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return 0Pz.A0j(runnable == A00 ? "running=[DONE]" : runnable instanceof C3k9 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? 0Pz.A0j("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", A02());
    }
}
