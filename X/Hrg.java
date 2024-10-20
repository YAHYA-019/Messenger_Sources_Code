package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Hrg.class */
public final class Hrg {
    public final ReentrantLock A01 = new ReentrantLock();
    public int A00 = 0;

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            boolean z = true;
            if ((this.A00 & 1) != 1) {
                z = false;
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass001.A1O(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
