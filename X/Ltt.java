package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Ltt.class */
public final class Ltt implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
