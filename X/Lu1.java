package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lu1.class */
public final class Lu1 implements ThreadFactory {
    public final AtomicInteger A01 = new AtomicInteger();
    public final ThreadFactory A00 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new C4Er(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A0n = AnonymousClass001.A0n("GAC_Executor");
        A0n.append("[");
        A0n.append(andIncrement);
        newThread.setName(AnonymousClass001.A0d("]", A0n));
        return newThread;
    }
}
