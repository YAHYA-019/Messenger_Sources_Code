package X;

import android.os.Process;

/* renamed from: X.5du, reason: invalid class name */
/* loaded from: 5du.class */
public final /* synthetic */ class C5du implements Runnable {
    public static final String __redex_internal_original_name = "PeriodicThreadBooster$$ExternalSyntheticLambda1";
    public final /* synthetic */ 2LR A00;

    @Override // java.lang.Runnable
    public final void run() {
        2LR r0 = this.A00;
        Integer num = r0.A04;
        if (num != null) {
            Process.setThreadPriority(num.intValue());
            r0.A04 = null;
        }
    }
}
