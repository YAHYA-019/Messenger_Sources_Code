package X;

import java.util.concurrent.CancellationException;

/* loaded from: AIL.class */
public final class AIL extends CancellationException {
    public AIL() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
