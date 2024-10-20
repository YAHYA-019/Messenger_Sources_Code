package X;

import java.util.concurrent.CancellationException;

/* loaded from: Lyp.class */
public final class Lyp extends CancellationException {
    public static final Lyp A00 = new CancellationException();

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(KZh.A00);
        return this;
    }
}
