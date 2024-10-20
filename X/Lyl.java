package X;

import java.util.concurrent.CancellationException;

/* loaded from: Lyl.class */
public abstract class Lyl extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
