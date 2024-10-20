package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.2af, reason: invalid class name */
/* loaded from: 2af.class */
public final class C2af extends C2ag implements Runnable {
    public static final C2af A00;
    public static final long A01;
    public static final String __redex_internal_original_name = "DefaultExecutor";
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2ai, X.2af, X.2ag] */
    static {
        Long l;
        ?? c2ag = new C2ag();
        A00 = c2ag;
        c2ag.A00++;
        c2ag.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    private final void A00() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                debugStatus = 3;
                C2ag.A02.set(this, null);
                C2ag.A01.set(this, null);
                notifyAll();
            }
        }
    }

    @Override // X.C2ag, X.C2ai
    public void A06() {
        debugStatus = 4;
        super.A06();
    }

    @Override // X.C2ag
    public void A09(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A09(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        44Y.A00.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (z) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A02 = A02();
                    if (A02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = A01 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else if (A02 > j2) {
                            A02 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (A02 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, A02);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            A00();
            if (!A0B()) {
                A07();
            }
        }
    }
}
