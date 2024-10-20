package X;

import android.os.Process;

/* renamed from: X.3vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vu.class */
public final /* synthetic */ class RunnableC02673vu implements Runnable {
    public static final String __redex_internal_original_name = "PeriodicThreadBooster$$ExternalSyntheticLambda0";
    public final /* synthetic */ 2LR A00;

    @Override // java.lang.Runnable
    public final void run() {
        2LR r0 = this.A00;
        if (r0.A04 == null) {
            r0.A04 = Integer.valueOf(Process.getThreadPriority(Process.myPid()));
        }
        Process.setThreadPriority(Process.myPid(), r0.A01);
    }
}
