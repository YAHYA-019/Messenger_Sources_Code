package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: AHc.class */
public final class AHc implements Executor {
    public static final AHc A00 = new AHc();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) C9ei.A00.getValue()).post(runnable);
    }
}
