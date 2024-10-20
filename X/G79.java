package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: G79.class */
public final class G79 implements Executor {
    public final Handler A00;

    public G79(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        11T.A0F(runnable, 0);
        this.A00.post(runnable);
    }
}
