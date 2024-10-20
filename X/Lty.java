package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lty.class */
public final class Lty implements ThreadFactory {
    public AtomicInteger A00 = new AtomicInteger();
    public final /* synthetic */ int A01;

    public Lty(int i) {
        this.A01 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new Lnd(this, runnable), 0Pz.A0T("TigonStreamUpload", this.A00.getAndIncrement()));
    }
}
