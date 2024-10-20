package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Lts.class */
public final class Lts implements ThreadFactory {
    public int A00;
    public String A01;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new LxU(runnable, this.A01, this.A00);
    }
}
