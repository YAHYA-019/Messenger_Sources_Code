package X;

import java.util.concurrent.Callable;

/* loaded from: J4s.class */
public final class J4s implements Callable {
    public final int A00;

    public J4s(int i) {
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            return null;
        }
        return 1BK.A0t();
    }
}
