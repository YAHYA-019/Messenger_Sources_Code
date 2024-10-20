package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: Ltp.class */
public final class Ltp implements Executor {
    public final Handler A00;

    public Ltp(Looper looper) {
        this.A00 = new 2B6(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
