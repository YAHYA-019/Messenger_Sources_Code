package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.7x1, reason: invalid class name */
/* loaded from: 7x1.class */
public final class C7x1 extends TimeoutException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        synchronized (this) {
            setStackTrace(new StackTraceElement[0]);
        }
        return this;
    }
}
