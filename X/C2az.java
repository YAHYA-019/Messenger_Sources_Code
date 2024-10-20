package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.2az, reason: invalid class name */
/* loaded from: 2az.class */
public abstract class C2az extends CancellationException {
    public final C2b1 raise;
    public final Object raised;

    public C2az(C2b1 c2b1, Object obj) {
        super("kotlin.coroutines.cancellation.CancellationException should never get swallowed. Always re-throw it if captured.This swallows the exception of Arrow's Raise, and leads to unexpected behavior.When working with Arrow prefer Either.catch or arrow.core.raise.catch to automatically rethrow CancellationException.");
        this.raised = obj;
        this.raise = c2b1;
    }
}
