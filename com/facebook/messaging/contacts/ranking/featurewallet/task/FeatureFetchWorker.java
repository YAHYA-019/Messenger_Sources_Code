package com.facebook.messaging.contacts.ranking.featurewallet.task;

import X.0CW;
import X.0fH;
import X.1BL;
import X.1Bn;
import X.1Fj;
import X.4YU;
import X.AnonymousClass001;
import X.C4Kq;
import X.C4Kr;
import X.C4P3;
import X.HvO;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: FeatureFetchWorker.class */
public final class FeatureFetchWorker extends Worker {
    public final Context A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
        this.A00 = context;
    }

    @Override // androidx.work.Worker
    public C4Kr doWork() {
        String[] strArr;
        0fH.A0j("OdmlTaskFeatureFetchWorker", "Running feature fetch task");
        Object obj = this.mWorkerParams.A02.A00.get("feature_set_id");
        int A03 = obj instanceof Integer ? AnonymousClass001.A03(obj) : 0;
        String A02 = this.mWorkerParams.A02.A02("viewer_id");
        if (A02 == null) {
            A02 = "";
        }
        if (0CW.A0f(A02) != null) {
            ImmutableList.Builder A0h = 4YU.A0h();
            Object obj2 = this.mWorkerParams.A02.A00.get("entity_ids");
            if ((obj2 instanceof String[]) && (strArr = (String[]) obj2) != null) {
                ArrayList A0t = AnonymousClass001.A0t(strArr.length);
                for (String str : strArr) {
                    1BL.A1E(str);
                    if (0CW.A0f(str) != null) {
                        A0h.m11011add((Object) str);
                        A0t.add(A0h);
                    }
                }
            }
            ImmutableList A01 = 1Fj.A01(A0h);
            1Bn.A0A(67481);
            HvO.A00(this.A00, A01, A02, A03);
            return new C4P3();
        }
        return new C4Kq();
    }
}
