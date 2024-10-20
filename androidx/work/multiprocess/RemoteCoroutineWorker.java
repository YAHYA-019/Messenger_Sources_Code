package androidx.work.multiprocess;

import X.1BL;
import X.C2a0;
import X.C2a3;
import X.C4Ih;
import X.C4Ks;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteCoroutineWorker;

/* loaded from: RemoteCoroutineWorker.class */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    public final C4Ks A00;
    public final C2a3 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.4Kt, X.4Ks] */
    public RemoteCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
        this.A01 = new C2a0(null);
        ?? obj = new Object();
        this.A00 = obj;
        obj.addListener(new Runnable() { // from class: X.Lk7
            public static final String __redex_internal_original_name = "RemoteCoroutineWorker$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                RemoteCoroutineWorker remoteCoroutineWorker = RemoteCoroutineWorker.this;
                if (remoteCoroutineWorker.A00.isCancelled()) {
                    remoteCoroutineWorker.A01.AE0(null);
                }
            }
        }, ((C4Ih) this.mWorkerParams.A07).A01);
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker, X.C4Ky
    public final void onStopped() {
        super.onStopped();
        this.A00.cancel(true);
    }
}
