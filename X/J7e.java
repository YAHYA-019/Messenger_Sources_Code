package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: J7e.class */
public final class J7e extends ReentrantLock implements AutoCloseable {
    public boolean mEnableThreadLockSync;

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.mEnableThreadLockSync) {
            unlock();
        }
    }
}
