package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3e6, reason: invalid class name */
/* loaded from: 3e6.class */
public abstract class C3e6 implements ListenableFuture {
    public Object A00;
    public Throwable A01;
    public boolean A02;
    public boolean A03;
    public final 1Ei A04 = new Object();

    public void A01(Object obj) {
        synchronized (this) {
            if (!this.A03) {
                this.A00 = obj;
                this.A03 = true;
                this.A04.A01();
                notifyAll();
            }
        }
    }

    public void A02(Throwable th) {
        synchronized (this) {
            if (!this.A03) {
                this.A01 = th;
                this.A03 = true;
                this.A04.A01();
                notifyAll();
            }
        }
    }

    public void A03() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.A04.A02(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (!this.A03) {
                z2 = true;
                this.A02 = true;
                this.A03 = true;
                if (z) {
                    A03();
                }
                notifyAll();
                this.A04.A01();
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        synchronized (this) {
            try {
                obj = get(0L, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                throw new ExecutionException(e);
            }
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        Throwable th;
        Object obj;
        synchronized (this) {
            if (Thread.interrupted()) {
                new InterruptedException();
            } else {
                if (!this.A03) {
                    if (j > 0) {
                        timeUnit.timedWait(this, j);
                    } else {
                        wait();
                    }
                }
                if (!this.A03) {
                    new TimeoutException();
                } else if (this.A02) {
                    new CancellationException();
                } else {
                    Throwable th2 = this.A01;
                    if (th2 == null) {
                        obj = this.A00;
                    } else {
                        new ExecutionException(th2);
                    }
                }
            }
            throw th;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.A02;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        synchronized (this) {
            z = this.A03;
        }
        return z;
    }
}
