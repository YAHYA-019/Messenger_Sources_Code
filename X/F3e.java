package X;

import android.os.Handler;

/* loaded from: F3e.class */
public abstract class F3e {
    public static final C01i A00 = C01g.A01(GA3.A00);

    public static final void A00(Runnable runnable) {
        if (DKE.A1V()) {
            runnable.run();
        } else {
            ((Handler) A00.getValue()).post(runnable);
        }
    }
}
