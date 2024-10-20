package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.4Eq, reason: invalid class name */
/* loaded from: 4Eq.class */
public final class C4Eq implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public C4Eq(String str) {
        AbstractC00481b7.A03(str, "Name must not be null");
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new C4Er(runnable));
        newThread.setName(this.A00);
        return newThread;
    }
}
