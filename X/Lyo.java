package X;

import java.util.concurrent.CancellationException;

/* loaded from: Lyo.class */
public final class Lyo extends CancellationException {
    public Lyo() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(KZh.A00);
        return this;
    }
}
