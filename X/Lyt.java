package X;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: Lyt.class */
public final class Lyt extends ScheduledThreadPoolExecutor {
    public final /* synthetic */ LTR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lyt(LTR ltr, int i, int i2) {
        super(i, new Lu4(ltr));
        this.A00 = ltr;
        setRemoveOnCancelPolicy(true);
        setKeepAliveTime(i2, TimeUnit.SECONDS);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        LTR ltr = this.A00;
        synchronized (ltr) {
            ltr.A00.remove(runnable);
        }
    }
}
