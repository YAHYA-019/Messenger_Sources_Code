package X;

import android.os.Process;

/* renamed from: X.3vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vB.class */
public final class RunnableC02483vB implements Runnable {
    public static final String __redex_internal_original_name = "PeriodicThreadBooster$1";
    public final /* synthetic */ 2LR A00;

    public RunnableC02483vB(2LR r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        2LR r0 = this.A00;
        if (r0.A04 == null) {
            r0.A04 = Integer.valueOf(Process.getThreadPriority(Process.myPid()));
        }
        Process.setThreadPriority(r0.A01);
        r0.A0A.postDelayed(this, r0.A02);
    }
}
