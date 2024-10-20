package com.facebook.messaging.push.dedup.appjob;

import X.1BP;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1De;
import X.2Ph;
import X.2Pi;
import X.2yD;
import X.C0dp;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: MuteStatusUpdateAppJob.class */
public final class MuteStatusUpdateAppJob {
    public final 1Br A01;
    public final 1Br A02;
    public final 2Ph A03;
    public final 2Pi A04;
    public final boolean A05;
    public final 1De A07;
    public final 1BP A06 = FbInjector.A00;
    public final C0dp A00 = (C0dp) 1Bi.A03(99390);

    public MuteStatusUpdateAppJob(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A03 = (2Ph) 1Bn.A0E((Context) null, r0, 17010);
        this.A04 = (2Pi) 1Bn.A0E((Context) null, r0, 65920);
        this.A02 = 1Bq.A00(16477);
        1Br A00 = 1Bq.A00(16385);
        this.A01 = A00;
        this.A05 = ((2yD) A00.A00.get()).AZk(36324935014043866L);
    }
}
