package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.0FI;
import X.1BK;
import X.C08o;
import X.C0T8;
import X.LG3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: IsManagedAppCacheJobService.class */
public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    @Override // android.app.Service
    public void onCreate() {
        HandlerThread handlerThread;
        int A00 = C08o.A00(this, 1923869393);
        int A04 = 0FI.A04(2020117912);
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread handlerThread2 = new HandlerThread("th-IsManagedAppCacheJobSvc");
                C0T8.A00(handlerThread2);
                A02 = handlerThread2;
                handlerThread2.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new LG3(this, 0));
        0FI.A0A(2016291307, A04);
        C08o.A02(-1268939796, A00);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        this.A01 = false;
        1BK.A1I(this.A00, jobParameters, 1);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        this.A01 = true;
        return true;
    }
}
