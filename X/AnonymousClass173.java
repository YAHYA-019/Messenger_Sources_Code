package X;

import java.util.concurrent.Executor;

/* renamed from: X.173, reason: invalid class name */
/* loaded from: 173.class */
public final class AnonymousClass173 {
    public final Runnable A00;
    public final Executor A01;

    public AnonymousClass173(Runnable runnable, Executor executor) {
        this.A00 = runnable;
        this.A01 = executor;
    }

    public void A00() {
        try {
            this.A01.execute(this.A00);
        } catch (RuntimeException e) {
            0fH.A12("ExecutionList", "RuntimeException while executing runnable=%s with executor=%s", e, new Object[]{this.A00, this.A01});
        }
    }
}
