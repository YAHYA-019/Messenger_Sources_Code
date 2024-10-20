package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Htl.class */
public class Htl {
    public JGI A00;
    public Condition A02;
    public long A01 = 5000;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            try {
                Condition condition = this.A02;
                if (condition != null) {
                    condition.await(this.A01, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Operation blocker interrupted. ", e);
            }
        } finally {
            if (this.A02 != null) {
                this.A02 = null;
                JGI jgi = this.A00;
                if (jgi != null) {
                    jgi.CQd();
                }
            }
            reentrantLock.unlock();
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 != null) {
            throw AnonymousClass001.A0N("There is already a block condition being used.");
        }
        this.A02 = reentrantLock.newCondition();
        if (j <= 0) {
            j = 5000;
        }
        this.A01 = j;
        reentrantLock.unlock();
    }
}
