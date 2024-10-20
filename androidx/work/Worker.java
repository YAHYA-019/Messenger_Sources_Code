package androidx.work;

import X.AnonymousClass001;
import X.C4Kr;
import X.C4Ks;
import X.C4Ky;
import X.KtB;
import X.Lk0;
import X.Lme;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Worker.class */
public abstract class Worker extends C4Ky {
    public C4Ks mFuture;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract C4Kr doWork();

    public KtB getForegroundInfo() {
        throw AnonymousClass001.A0N("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.4Ks] */
    @Override // X.C4Ky
    public ListenableFuture getForegroundInfoAsync() {
        ?? obj = new Object();
        this.mWorkerParams.A0A.execute(new Lme(this, obj));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4Ks] */
    @Override // X.C4Ky
    public final ListenableFuture startWork() {
        this.mFuture = new Object();
        this.mWorkerParams.A0A.execute(new Lk0(this));
        return this.mFuture;
    }
}
