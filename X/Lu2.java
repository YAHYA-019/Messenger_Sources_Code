package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Lu2.class */
public final class Lu2 implements ThreadFactory {
    public static final Lu2 A00 = new Lu2();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
