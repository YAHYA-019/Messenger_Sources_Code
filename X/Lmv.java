package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* loaded from: Lmv.class */
public final class Lmv implements Runnable {
    public static final String __redex_internal_original_name = "RelLithoMainThreadWaitingWatchdog$Companion$scheduleDumpStacktrace$1";
    public final /* synthetic */ Kks A00;
    public final /* synthetic */ WeakReference A01;

    public Lmv(Kks kks, WeakReference weakReference) {
        this.A00 = kks;
        this.A01 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread thread;
        Kks kks = this.A00;
        if (kks.A00 > 0 || (thread = (Thread) this.A01.get()) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        11T.A0A(stackTrace);
        kks.A01 = SystemClock.uptimeMillis();
        kks.A02 = stackTrace;
    }
}
