package X;

import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* loaded from: Lys.class */
public final class Lys extends FutureTask {
    public final /* synthetic */ Lyu A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lys(Lyu lyu, Object obj, Runnable runnable) {
        super(runnable, obj);
        this.A00 = lyu;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00.A00.A00;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (android.util.Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            android.util.Log.e("GAv4", 1BL.A0u("MeasurementExecutor: job failed with ", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 37)));
        }
        super.setException(th);
    }
}
