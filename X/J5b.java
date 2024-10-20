package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: J5b.class */
public final class J5b implements ThreadFactory {
    public Object A00;
    public final int A01;

    public J5b(int i) {
        this.A01 = i;
        this.A00 = new AtomicInteger();
    }

    public J5b(I7F i7f) {
        this.A01 = 1;
        this.A00 = i7f;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        switch (this.A01) {
            case 0:
                return new Thread((Runnable) new IxO(this, runnable), 0Pz.A0T("Transcode", ((AtomicInteger) this.A00).getAndIncrement()));
            case 1:
                Thread thread = new Thread(runnable);
                thread.setUncaughtExceptionHandler(new J4d(this.A00, 1));
                return thread;
            default:
                return null;
        }
    }
}
