package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: Ltn.class */
public final class Ltn implements Executor {
    public final Handler A00 = AnonymousClass001.A07();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
