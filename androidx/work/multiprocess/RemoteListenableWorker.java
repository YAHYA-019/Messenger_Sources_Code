package androidx.work.multiprocess;

import X.4IS;
import X.4IU;
import X.4YT;
import X.AnonymousClass001;
import X.C4Kc;
import X.C4Ks;
import X.C4Ky;
import X.L2M;
import X.LLj;
import X.LRt;
import X.LRw;
import X.LpB;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: RemoteListenableWorker.class */
public abstract class RemoteListenableWorker extends C4Ky {
    public static final String A03 = 4IS.A01("RemoteListenableWorker");
    public ComponentName A00;
    public final WorkerParameters A01;
    public final L2M A02;

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = workerParameters;
        this.A02 = new L2M(context, this.mWorkerParams.A0A);
    }

    @Override // X.C4Ky
    public void onStopped() {
        int stopReason = getStopReason();
        ComponentName componentName = this.A00;
        if (componentName != null) {
            this.A02.A00(componentName, new LRt(this, stopReason));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.4Kt] */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.4Ks] */
    @Override // X.C4Ky
    public final ListenableFuture startWork() {
        ?? obj = new Object();
        C4Kc c4Kc = this.mWorkerParams.A02;
        String obj2 = this.A01.A09.toString();
        String A02 = c4Kc.A02(4YT.A00(863));
        String A022 = c4Kc.A02(4YT.A00(862));
        if (TextUtils.isEmpty(A02)) {
            4IS.A00();
            Log.e(A03, "Need to specify a package name for the Remote Service.");
            obj.A07(AnonymousClass001.A0L("Need to specify a package name for the Remote Service."));
            return obj;
        }
        if (TextUtils.isEmpty(A022)) {
            4IS.A00();
            Log.e(A03, "Need to specify a class name for the Remote Service.");
            obj.A07(AnonymousClass001.A0L("Need to specify a class name for the Remote Service."));
            return obj;
        }
        this.A00 = new ComponentName(A02, A022);
        C4Ks A00 = this.A02.A00(this.A00, new LRw(4IU.A00(this.mAppContext), this, obj2, 0));
        LLj lLj = new LLj(this, 1);
        Executor executor = this.mWorkerParams.A0A;
        ?? obj3 = new Object();
        A00.addListener(new LpB(lLj, (C4Ks) obj3, A00), executor);
        return obj3;
    }
}
