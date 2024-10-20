package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.4F7, reason: invalid class name */
/* loaded from: 4F7.class */
public abstract class C4F7 {
    public static final Executor A00 = new Executor() { // from class: X.4F8
        public final Handler A00 = new C4F9(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.A00.post(runnable);
        }
    };
    public static final Executor A01 = new Object();
}
