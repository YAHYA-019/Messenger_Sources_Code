package X;

import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Lz2.class */
public final class Lz2 extends ReentrantLock {
    public final /* synthetic */ LAD this$0;

    public Lz2(LAD lad) {
        this.this$0 = lad;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public void unlock() {
        if (getHoldCount() == 1 && !this.this$0.A0H.isEmpty()) {
            try {
                synchronized (this.this$0.A0A) {
                    LAD lad = this.this$0;
                    while (true) {
                        Queue queue = lad.A0H;
                        if (queue.isEmpty()) {
                            break;
                        } else {
                            ((Runnable) queue.remove()).run();
                        }
                    }
                }
            } finally {
                super.unlock();
            }
        }
    }
}
