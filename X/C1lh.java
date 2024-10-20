package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1lh, reason: invalid class name */
/* loaded from: 1lh.class */
public final class C1lh {
    public long A00;
    public HandlerThread A01;
    public Handler A02;
    public final AtomicLong A03 = new AtomicLong(0);

    public static final Handler A00(C1lh c1lh) {
        Handler handler;
        synchronized (c1lh) {
            if (c1lh.A01 == null) {
                HandlerThread handlerThread = new HandlerThread("XplatClientDispatchThread");
                C0T8.A00(handlerThread);
                c1lh.A01 = handlerThread;
                handlerThread.start();
                c1lh.A02 = new Handler(handlerThread.getLooper());
            }
            handler = c1lh.A02;
        }
        return handler;
    }

    public final boolean A01(final Runnable runnable) {
        this.A03.incrementAndGet();
        Handler A00 = A00(this);
        if (A00 != null) {
            return A00.post(new Runnable() { // from class: X.1ls
                public static final String __redex_internal_original_name = "GatewayClientHandler$post$1";

                @Override // java.lang.Runnable
                public final void run() {
                    C1lh.this.A00++;
                    runnable.run();
                }
            });
        }
        return false;
    }
}
