package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.1e8, reason: invalid class name */
/* loaded from: 1e8.class */
public final /* synthetic */ class C1e8 implements ThreadFactory {
    public static final ThreadFactory A00 = new Object();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
