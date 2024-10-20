package X;

import java.util.concurrent.CancellationException;

/* loaded from: AIM.class */
public final class AIM extends CancellationException {
    public AIM() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
