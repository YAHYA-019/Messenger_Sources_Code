package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: G78.class */
public final class G78 implements Executor {
    public final Handler A00;

    public G78(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        11T.A0F(runnable, 0);
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
