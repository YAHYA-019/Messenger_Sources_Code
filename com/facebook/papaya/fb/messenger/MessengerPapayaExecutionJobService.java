package com.facebook.papaya.fb.messenger;

import X.0FI;
import X.0fH;
import X.1BY;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1Lo;
import X.1MV;
import X.2yD;
import X.5hT;
import X.AnonymousClass001;
import X.C00i;
import X.C01w;
import X.C08o;
import X.C5gw;
import X.C5gy;
import X.Lnh;
import X.N8G;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.platform.PlatformResourceChecker;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: MessengerPapayaExecutionJobService.class */
public class MessengerPapayaExecutionJobService extends JobService {
    public C00i A00;
    public 5hT A01;
    public C5gy A02;
    public ExecutorService A03;

    public MessengerPapayaExecutionJobService() {
    }

    public MessengerPapayaExecutionJobService(int i) {
    }

    public static ExecutorService A00(MessengerPapayaExecutionJobService messengerPapayaExecutionJobService) {
        ExecutorService executorService;
        synchronized (messengerPapayaExecutionJobService) {
            executorService = messengerPapayaExecutionJobService.A03;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
                messengerPapayaExecutionJobService.A03 = executorService;
            }
        }
        return executorService;
    }

    public static void A01(JobParameters jobParameters, MessengerPapayaExecutionJobService messengerPapayaExecutionJobService, Throwable th) {
        if (th != null) {
            0fH.A0N(MessengerPapayaExecutionJobService.class, "Failed to run papaya", th, AnonymousClass001.A1Z());
        }
        C5gy c5gy = messengerPapayaExecutionJobService.A02;
        if (c5gy != null) {
            c5gy.Byg(th);
        }
        messengerPapayaExecutionJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1915368007);
        int A04 = 0FI.A04(1575337986);
        int A002 = C08o.A00(this, -2038292478);
        int A042 = 0FI.A04(1604463720);
        super.onCreate();
        0fH.A0C(MessengerPapayaExecutionJobService.class, "Execution job created");
        C5gy c5gy = this.A02;
        if (c5gy != null) {
            c5gy.onLog("Execution job created");
        }
        0FI.A0A(1840481080, A042);
        C08o.A02(1635578595, A002);
        1MV A003 = 1Lo.A00(this, 1Fw.A04((1EZ) 1Bn.A0E(this, (1BY) null, 16428)), 49820);
        this.A00 = A003;
        if (((C5gw) A003.get()).A0B != null) {
            C00i c00i = this.A00;
            c00i.getClass();
            this.A02 = new N8G(((C5gw) c00i.get()).A0B, this);
        }
        0FI.A0A(2086325745, A04);
        C08o.A02(-933228609, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(724985562);
        super.onDestroy();
        0fH.A0C(MessengerPapayaExecutionJobService.class, "Execution job destroyed");
        C5gy c5gy = this.A02;
        if (c5gy != null) {
            c5gy.onLog("Execution job destroyed");
        }
        C5gy c5gy2 = this.A02;
        if (c5gy2 != null) {
            c5gy2.onDestroy();
        }
        0FI.A0A(-1091795650, A04);
        C01w.A00(this);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        synchronized (this) {
            0fH.A0C(MessengerPapayaExecutionJobService.class, "Started job service");
            C5gy c5gy = this.A02;
            if (c5gy != null) {
                c5gy.onLog("Started job service");
            }
            C00i c00i = this.A00;
            c00i.getClass();
            if (((2yD) ((C5gw) c00i.get()).A03.get()).AZk(36317753830485800L)) {
                A00(this).execute(new Lnh(jobParameters, this));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        synchronized (this) {
            0fH.A0C(MessengerPapayaExecutionJobService.class, "Execution job stopped");
            C5gy c5gy = this.A02;
            if (c5gy != null) {
                c5gy.onLog("Execution job stopped");
            }
            C5gy c5gy2 = this.A02;
            if (c5gy2 != null) {
                c5gy2.CNg(PlatformResourceChecker.hasUnmeteredConnectivity(this) ? "unmetered" : PlatformResourceChecker.hasNetworkConnectivity(this) ? "unknown" : "none", PlatformResourceChecker.isDeviceIdle(this), PlatformResourceChecker.hasExternalPower(this));
            }
            final 5hT r0 = this.A01;
            if (r0 != null) {
                final ?? obj = new Object();
                r0.A04.execute(new Runnable() { // from class: X.Lng
                    public static final String __redex_internal_original_name = "Papaya$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        5hT r02 = r0;
                        SettableFuture settableFuture = obj;
                        r02.A00.A00();
                        PapayaJNI.stop();
                        settableFuture.set((Object) null);
                    }
                });
            }
        }
        return false;
    }
}
