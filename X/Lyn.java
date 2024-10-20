package X;

import java.util.concurrent.CancellationException;

/* loaded from: Lyn.class */
public final class Lyn extends CancellationException {
    public Lyn() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(KZY.A00);
        return this;
    }
}
