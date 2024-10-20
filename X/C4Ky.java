package X;

import android.content.Context;
import android.net.Network;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.4Ky, reason: invalid class name */
/* loaded from: 4Ky.class */
public abstract class C4Ky {
    public Context mAppContext;
    public volatile int mStopReason = -256;
    public boolean mUsed;
    public WorkerParameters mWorkerParams;

    public C4Ky(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw AnonymousClass001.A0L("Application Context is null");
        }
        if (workerParameters == null) {
            throw AnonymousClass001.A0L("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.A0A;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.4Kt] */
    public ListenableFuture getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.A07(AnonymousClass001.A0N("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.A09;
    }

    public final C4Kc getInputData() {
        return this.mWorkerParams.A02;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.A06.A00;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.A01;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set getTags() {
        return this.mWorkerParams.A08;
    }

    public C4Ii getTaskExecutor() {
        return this.mWorkerParams.A07;
    }

    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.A06.A01;
    }

    public final List getTriggeredContentUris() {
        return this.mWorkerParams.A06.A02;
    }

    public C4Ic getWorkerFactory() {
        return this.mWorkerParams.A05;
    }

    public final boolean isStopped() {
        boolean z = false;
        if (this.mStopReason != -256) {
            z = true;
        }
        return z;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ListenableFuture setForegroundAsync(KtB ktB) {
        WorkerParameters workerParameters = this.mWorkerParams;
        return workerParameters.A03.Cp2(this.mAppContext, ktB, workerParameters.A09);
    }

    public ListenableFuture setProgressAsync(C4Kc c4Kc) {
        WorkerParameters workerParameters = this.mWorkerParams;
        return workerParameters.A04.D7f(this.mAppContext, c4Kc, workerParameters.A09);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop(int i) {
        this.mStopReason = i;
        onStopped();
    }
}
