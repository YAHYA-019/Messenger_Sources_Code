package X;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;

/* loaded from: J5a.class */
public final class J5a implements ThreadFactory {
    public final String A00;
    public final Thread.UncaughtExceptionHandler A01;
    public final boolean A02;

    public J5a(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.A00 = str;
        this.A01 = uncaughtExceptionHandler;
        this.A02 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        if (this.A02) {
            thread.setPriority(10);
        }
        thread.setName(this.A00);
        thread.setUncaughtExceptionHandler(this.A01);
        return thread;
    }
}
