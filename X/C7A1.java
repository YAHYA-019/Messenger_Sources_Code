package X;

import android.os.Handler;
import com.facebook.acra.constants.ActionId;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7A1, reason: invalid class name */
/* loaded from: 7A1.class */
public final class C7A1 {
    public static C7A5 A03;
    public static ThreadPoolExecutor A04;
    public static final BlockingQueue A05;
    public Handler A00;
    public final Set A02 = new HashSet();
    public final Set A01 = new HashSet();

    static {
        7A2 r0 = new 7A2();
        A05 = r0;
        final TimeUnit timeUnit = TimeUnit.SECONDS;
        7A4 r02 = new 7A4(r0, new 7A3(10, "WhatsApp Worker"), timeUnit);
        A03 = r02;
        r02.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: X.7A6
            public final AtomicBoolean A00 = new AtomicBoolean();

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                } catch (InterruptedException unused) {
                    AnonymousClass001.A13();
                }
                this.A00.getAndSet(true);
            }
        });
        final SynchronousQueue synchronousQueue = new SynchronousQueue();
        final 7A3 r03 = new 7A3(0, "High Pri Worker");
        final int i = 1;
        final int i2 = (-1) >>> 1;
        final long j = ActionId.VIDEO_SET_RENDERER_CONTEXT;
        A04 = new ThreadPoolExecutor(i, i2, j, timeUnit, synchronousQueue, r03) { // from class: X.7A5
        };
    }
}
