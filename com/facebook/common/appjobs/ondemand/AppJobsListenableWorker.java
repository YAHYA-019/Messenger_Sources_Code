package com.facebook.common.appjobs.ondemand;

import X.1Bi;
import X.1JU;
import X.2FP;
import X.4YU;
import X.5GF;
import X.C00g;
import X.C00i;
import X.C1vh;
import X.C4Ky;
import X.In5;
import X.SAo;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: AppJobsListenableWorker.class */
public class AppJobsListenableWorker extends C4Ky implements C00g {
    public C00i A00;
    public C00i A01;
    public final Context A02;

    public AppJobsListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = 1Bi.A02(5GF.class, (Class) null);
        this.A00 = 1Bi.A02(C1vh.class, (Class) null);
        this.A02 = context;
    }

    @Override // X.C00g
    public Context getContext() {
        return this.A02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C4Ky
    public ListenableFuture startWork() {
        ?? A0j = 4YU.A0j();
        new Thread((Runnable) new SAo(this, (SettableFuture) A0j)).start();
        return 2FP.A00(new In5(this, 0), (ListenableFuture) A0j, 1JU.A01);
    }
}
