package X;

import android.os.Handler;

/* loaded from: I9z.class */
public final class I9z {
    public static final Handler A00 = AnonymousClass001.A07();

    public static void A00(Runnable runnable) {
        if (AnonymousClass001.A1W(DKD.A10(), Thread.currentThread())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        Thread A10 = DKD.A10();
        Thread currentThread = Thread.currentThread();
        if (AnonymousClass001.A1W(A10, currentThread)) {
            throw new IllegalThreadStateException(0Pz.A0j(str, " Current thread: ", currentThread.getName()));
        }
    }
}
