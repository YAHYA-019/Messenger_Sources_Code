package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tp.class */
public final class C02013tp extends AbstractC02023tq {
    public final Object A02 = new Object();
    public int A00 = 0;
    public boolean A01 = false;

    private void A00() {
        Object obj = this.A02;
        synchronized (obj) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        Object obj = this.A02;
        synchronized (obj) {
            while (true) {
                if (this.A01 && this.A00 == 0) {
                    z = true;
                    break;
                }
                if (nanos <= 0) {
                    z = false;
                    break;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(obj, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.A02) {
            if (this.A01) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.A00++;
        }
        try {
            runnable.run();
        } finally {
            A00();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z;
        synchronized (this.A02) {
            z = this.A01;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r301.A00 != 0) goto L10;
     */
    @Override // java.util.concurrent.ExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isTerminated() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.A02
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.A01     // Catch: java.lang.Throwable -> L24
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r301
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L24
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L20
        L1b:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L20:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r303
            return r0
        L24:
            r305 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02013tp.isTerminated():boolean");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        Object obj = this.A02;
        synchronized (obj) {
            this.A01 = true;
            if (this.A00 == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
