package X;

import java.lang.Thread;

/* loaded from: J4c.class */
public final class J4c implements Thread.UncaughtExceptionHandler {
    public ICM A00;
    public Thread.UncaughtExceptionHandler A01;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ICM icm = this.A00;
        if (icm != null) {
            icm.A02();
            this.A00 = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A01;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
