package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ltx.class */
public final class Ltx implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = GOn.A1K(1);

    public Ltx(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        11T.A0F(runnable, 0);
        return new Thread((Runnable) new LnR(this, runnable), 0Pz.A0M(this.A00, '-', this.A01.getAndIncrement()));
    }
}
