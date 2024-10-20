package X;

import java.util.concurrent.CancellationException;

/* loaded from: Lym.class */
public final class Lym extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(KZh.A00);
        return this;
    }
}
