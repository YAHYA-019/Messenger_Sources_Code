package X;

import com.facebook.mobileboost.apps.messenger.appjob.PeriodThreadBoosterAppJob;

/* renamed from: X.3fc, reason: invalid class name */
/* loaded from: 3fc.class */
public final class C3fc implements Runnable {
    public static final String __redex_internal_original_name = "PeriodThreadBoosterAppJob$disablePeriodicThreadBooster$runnable$1";
    public final /* synthetic */ PeriodThreadBoosterAppJob A00;

    public C3fc(PeriodThreadBoosterAppJob periodThreadBoosterAppJob) {
        this.A00 = periodThreadBoosterAppJob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PeriodThreadBoosterAppJob periodThreadBoosterAppJob = this.A00;
        if (periodThreadBoosterAppJob.A00) {
            2LR r304 = 2LR.A0B;
            if (r304 == null) {
                r304 = new 2LR();
                2LR.A0B = r304;
            }
            r304.A01();
            periodThreadBoosterAppJob.A00 = false;
        }
    }
}
