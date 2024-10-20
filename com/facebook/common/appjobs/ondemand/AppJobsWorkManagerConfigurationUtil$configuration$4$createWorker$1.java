package com.facebook.common.appjobs.ondemand;

import X.0fH;
import X.11T;
import X.C4Ky;
import X.SE1;
import X.SFX;
import android.content.Context;
import android.os.SystemClock;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: AppJobsWorkManagerConfigurationUtil$configuration$4$createWorker$1.class */
public final class AppJobsWorkManagerConfigurationUtil$configuration$4$createWorker$1 extends C4Ky {
    public final /* synthetic */ C4Ky A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppJobsWorkManagerConfigurationUtil$configuration$4$createWorker$1(Context context, C4Ky c4Ky, WorkerParameters workerParameters, String str) {
        super(context, workerParameters);
        this.A00 = c4Ky;
        this.A01 = str;
    }

    @Override // X.C4Ky
    public ListenableFuture startWork() {
        0fH.A0l("WM-", "startWork() called");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ListenableFuture startWork = this.A00.startWork();
        11T.A0A(startWork);
        startWork.addListener(new SE1(this, startWork, this.A01, elapsedRealtime), SFX.A00);
        0fH.A0l("WM-", "startWork() finished");
        return startWork;
    }
}
