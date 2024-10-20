package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.44b, reason: invalid class name */
/* loaded from: 44b.class */
public final class C44b extends C2ak {
    public final C2ai A00;
    public final Thread A01;

    public C44b(Thread thread, 0DE r303, C2ai c2ai) {
        super(r303, true);
        this.A01 = thread;
        this.A00 = c2ai;
    }

    @Override // X.C2a1
    public void A0H(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.A01;
        if (11T.A0O(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // X.C2a1
    public boolean A0M() {
        return true;
    }
}
