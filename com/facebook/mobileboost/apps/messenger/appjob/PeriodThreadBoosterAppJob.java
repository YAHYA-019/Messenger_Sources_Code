package com.facebook.mobileboost.apps.messenger.appjob;

import X.0lQ;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1QB;
import X.1Qc;
import X.3bL;
import com.facebook.mobileboost.apps.messenger.appjob.PeriodThreadBoosterAppJob;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: PeriodThreadBoosterAppJob.class */
public final class PeriodThreadBoosterAppJob {
    public boolean A00;
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A01 = 1Bq.A00(65837);
    public final 1Br A02 = 1Bq.A00(16465);
    public final 0lQ A04 = new 3bL(this);

    public static final void A00(final PeriodThreadBoosterAppJob periodThreadBoosterAppJob) {
        synchronized (periodThreadBoosterAppJob) {
            Runnable runnable = new Runnable() { // from class: X.3fd
                public static final String __redex_internal_original_name = "PeriodThreadBoosterAppJob$enablePeriodicThreadBooster$runnable$1";

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    PeriodThreadBoosterAppJob periodThreadBoosterAppJob2 = PeriodThreadBoosterAppJob.this;
                    if (periodThreadBoosterAppJob2.A00) {
                        return;
                    }
                    2LR r304 = 2LR.A0B;
                    if (r304 == null) {
                        r304 = new 2LR();
                        2LR.A0B = r304;
                    }
                    C00i c00i = periodThreadBoosterAppJob2.A03.A00;
                    int A00 = 2yD.A00(1BK.A0M(c00i), 36607595401781029L);
                    int A002 = 2yD.A00(1BK.A0M(c00i), 36607595401846566L);
                    if (1BK.A0M(c00i).AZk(36326120425411875L)) {
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Br.A0B(periodThreadBoosterAppJob2.A02);
                        int A003 = 2yD.A00(1BK.A0M(c00i), 36607595402305321L);
                        z = true;
                        r304.A09 = true;
                        r304.A01 = A00;
                        r304.A02 = A002;
                        r304.A06 = scheduledExecutorService;
                        r304.A00 = A003;
                    } else {
                        z = true;
                        r304.A09 = true;
                        r304.A01 = A00;
                        r304.A02 = A002;
                        r304.A06 = null;
                    }
                    r304.A00();
                    periodThreadBoosterAppJob2.A00 = z;
                }
            };
            if (1Br.A06(periodThreadBoosterAppJob.A03).AZk(36326120425674022L)) {
                A01(periodThreadBoosterAppJob, runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static final void A01(PeriodThreadBoosterAppJob periodThreadBoosterAppJob, Runnable runnable) {
        1QB r0 = (1QB) 1Bn.A0A(65841);
        1Qc r02 = (1Qc) 1Br.A0B(periodThreadBoosterAppJob.A01);
        r0.A01 = runnable;
        r0.A04("PeriodicThreadBoost");
        r02.A03(1QB.A00(r0, "ForUiThread"), "ReplaceExisting");
    }
}
