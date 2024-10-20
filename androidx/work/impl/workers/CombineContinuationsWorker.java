package androidx.work.impl.workers;

import X.1BL;
import X.C4Kr;
import X.C4P3;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: CombineContinuationsWorker.class */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public C4Kr doWork() {
        return new C4P3(this.mWorkerParams.A02);
    }
}
