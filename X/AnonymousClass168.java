package X;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.168, reason: invalid class name */
/* loaded from: 168.class */
public final class AnonymousClass168 {
    public static int A00 = 5;
    public static volatile Executor A03;
    public static final ThreadFactory A02 = new ThreadFactory() { // from class: X.167
        public final AtomicInteger A00 = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            final String A0T = 0Pz.A0T("RtiExecutor #", this.A00.getAndIncrement());
            return new Thread(runnable, A0T) { // from class: X.169
                public static final String __redex_internal_original_name = "RtiThread";
                public final int A00 = 9;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(this.A00);
                    super.run();
                }
            };
        }
    };
    public static final BlockingQueue A01 = new LinkedBlockingQueue(10);
}
