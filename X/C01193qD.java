package X;

import java.util.concurrent.Executor;

/* renamed from: X.3qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qD.class */
public final class C01193qD implements 2EQ {
    public final Executor A00;

    public C01193qD(Executor executor) {
        if (executor == null) {
            throw 1BK.A0h();
        }
        this.A00 = executor;
    }

    public void A7Z(Runnable runnable) {
        11T.A0F(runnable, 0);
        this.A00.execute(runnable);
    }

    public void Cdn(Runnable runnable) {
    }
}
