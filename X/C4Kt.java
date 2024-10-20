package X;

import com.facebook.smartcapture.logging.SCEventNames;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.4Kt, reason: invalid class name */
/* loaded from: 4Kt.class */
public abstract class C4Kt implements ListenableFuture {
    public static final C4Kx A00;
    public static final Object A02;
    public volatile C4Kv listeners;
    public volatile Object value;
    public volatile C4Ku waiters;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A03 = Logger.getLogger(C4Kt.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.4Kx] */
    static {
        Object obj;
        try {
            new C4Kw(AtomicReferenceFieldUpdater.newUpdater(C4Ku.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C4Ku.class, C4Ku.class, SCEventNames.Params.STEP_CHANGE_NEXT), AtomicReferenceFieldUpdater.newUpdater(C4Kt.class, C4Ku.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(C4Kt.class, C4Kv.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(C4Kt.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            obj = new Object();
        }
        A00 = obj;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A02 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r305 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A00(com.google.common.util.concurrent.ListenableFuture r301) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Kt.A00(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public static Object A01(Object obj) {
        if (obj instanceof C4Up) {
            Throwable th = ((C4Up) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C4Uk) {
            throw new ExecutionException(((C4Uk) obj).A00);
        }
        if (obj == A02) {
            obj = null;
        }
        return obj;
    }

    private void A02(C4Ku c4Ku) {
        c4Ku.thread = null;
        while (true) {
            C4Ku c4Ku2 = this.waiters;
            if (c4Ku2 != C4Ku.A00) {
                C4Ku c4Ku3 = null;
                while (c4Ku2 != null) {
                    C4Ku c4Ku4 = c4Ku2.next;
                    if (c4Ku2.thread != null) {
                        c4Ku3 = c4Ku2;
                    } else if (c4Ku3 != null) {
                        c4Ku3.next = c4Ku4;
                        if (c4Ku3.thread == null) {
                            break;
                        }
                    } else if (!A00.A01(c4Ku2, c4Ku4, this)) {
                        break;
                    }
                    c4Ku2 = c4Ku4;
                }
                return;
            }
            return;
        }
    }

    public static void A03(C4Kt c4Kt) {
        C4Kv c4Kv;
        C4Kv c4Kv2 = null;
        while (true) {
            C4Ku c4Ku = c4Kt.waiters;
            C4Kx c4Kx = A00;
            if (c4Kx.A01(c4Ku, C4Ku.A00, c4Kt)) {
                while (c4Ku != null) {
                    Thread thread = c4Ku.thread;
                    if (thread != null) {
                        c4Ku.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c4Ku = c4Ku.next;
                }
                do {
                    c4Kv = c4Kt.listeners;
                } while (!c4Kx.A00(c4Kv, C4Kv.A03, c4Kt));
                while (true) {
                    C4Kv c4Kv3 = c4Kv;
                    if (c4Kv == null) {
                        break;
                    }
                    c4Kv = c4Kv.A00;
                    c4Kv3.A00 = c4Kv2;
                    c4Kv2 = c4Kv3;
                }
                while (true) {
                    C4Kv c4Kv4 = c4Kv2;
                    if (c4Kv2 == null) {
                        return;
                    }
                    c4Kv2 = c4Kv2.A00;
                    Runnable runnable = c4Kv4.A01;
                    if (runnable instanceof C4X0) {
                        C4X0 c4x0 = (C4X0) runnable;
                        c4Kt = c4x0.A00;
                        if (c4Kt.value == c4x0 && c4Kx.A02(c4Kt, c4x0, A00(c4x0.A01))) {
                            break;
                        }
                    } else {
                        A04(runnable, c4Kv4.A02);
                    }
                }
            }
        }
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(AnonymousClass000.A00(235));
            A0k.append(runnable);
            logger.log(level, AnonymousClass001.A0Z(executor, AnonymousClass000.A00(233), A0k), (Throwable) e);
        }
    }

    public void A05(ListenableFuture listenableFuture) {
        C4Uk c4Uk;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (A00.A02(this, null, A00(listenableFuture))) {
                    A03(this);
                    return;
                }
                return;
            }
            C4X0 c4x0 = new C4X0(this, listenableFuture);
            C4Kx c4Kx = A00;
            if (c4Kx.A02(this, null, c4x0)) {
                try {
                    listenableFuture.addListener(c4x0, 3Ep.A01);
                    return;
                } catch (Throwable th) {
                    try {
                        new C4Uk(th);
                    } catch (Throwable unused) {
                        c4Uk = C4Uk.A01;
                    }
                    c4Kx.A02(this, c4x0, c4Uk);
                    return;
                }
            }
            obj = this.value;
        }
        if (obj instanceof C4Up) {
            listenableFuture.cancel(((C4Up) obj).A01);
        }
    }

    public void A06(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (A00.A02(this, null, obj)) {
            A03(this);
        }
    }

    public void A07(Throwable th) {
        C4Uk c4Uk = C4Uk.A01;
        th.getClass();
        if (A00.A02(this, null, new C4Uk(th))) {
            A03(this);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C4Kv c4Kv = this.listeners;
        C4Kv c4Kv2 = C4Kv.A03;
        if (c4Kv != c4Kv2) {
            C4Kv c4Kv3 = new C4Kv(runnable, executor);
            do {
                c4Kv3.A00 = c4Kv;
                if (A00.A00(c4Kv, c4Kv3, this)) {
                    return;
                } else {
                    c4Kv = this.listeners;
                }
            } while (c4Kv != c4Kv2);
        }
        A04(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r302) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Kt.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = false;
        if (obj != null) {
            z = true;
        }
        if (!(z & (!(obj instanceof C4X0)))) {
            C4Ku c4Ku = this.waiters;
            C4Ku c4Ku2 = C4Ku.A00;
            if (c4Ku != c4Ku2) {
                C4Ku c4Ku3 = new C4Ku();
                do {
                    C4Kx c4Kx = A00;
                    if (c4Kx instanceof C4P5) {
                        c4Ku3.next = c4Ku;
                    } else {
                        ((C4Kw) c4Kx).A02.lazySet(c4Ku3, c4Ku);
                    }
                    if (c4Kx.A01(c4Ku, c4Ku3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                A02(c4Ku3);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!(AnonymousClass001.A1T(obj) & (!(obj instanceof C4X0))));
                    } else {
                        c4Ku = this.waiters;
                    }
                } while (c4Ku != c4Ku2);
            }
            obj = this.value;
        }
        return A01(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x021a, code lost:
    
        if (r0 > 1000) goto L47;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r302, java.util.concurrent.TimeUnit r304) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Kt.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C4Up;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return (!(r0 instanceof C4X0)) & z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Kt.toString():java.lang.String");
    }
}
