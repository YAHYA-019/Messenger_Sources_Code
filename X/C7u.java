package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: C7u.class */
public final class C7u {
    public final I3Z A01 = (I3Z) 1Bi.A03(115641);
    public final 6No A00 = (6No) 1Bn.A0A(99982);
    public final C9V A02 = (C9V) 1Bi.A03(83005);
    public final BXl A03 = (BXl) 1Bn.A0A(83874);

    /* JADX WARN: Type inference failed for: r0v34, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public void A00(Context context, 06Z r303, ThreadKey threadKey, DGQ dgq, String str, List list, boolean z) {
        if (!threadKey.A1P()) {
            dgq.C0o(threadKey);
            A01(context, threadKey, null, null, str, null, z);
            return;
        }
        BXj bXj = (BXj) 1Bn.A0A(83875);
        CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger = (CreateGroupAggregatedReliabilityLogger) 1Bi.A03(84668);
        CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger = (CreateGroupAggregatedLatencyLogger) 1Bi.A03(84666);
        long A01 = AbJ.A0a().A01();
        COk cOk = createGroupAggregatedReliabilityLogger.A02;
        BLM blm = BLM.A05;
        String valueOf = String.valueOf(A01);
        cOk.A03(blm, new BuT((Integer) null, valueOf, 0, false, false));
        createGroupAggregatedLatencyLogger.A01(A01);
        createGroupAggregatedLatencyLogger.A03.A03(BLb.A01, new CDK(0L, valueOf, false));
        JgM A012 = JgM.A01(r303, "createGroupBeforeCall");
        ?? A0j = 4YU.A0j();
        A012.A02 = new C1667Ap9(context, createGroupAggregatedLatencyLogger, bXj, dgq, A0j, A01);
        A012.A1Q(((CHy) 1Bn.A0E(context, (1BY) null, 82650)).A01(context, 2131957395));
        Bundle A05 = 1BK.A05();
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        A05.putParcelable("CreateCustomizableGroupParams", new CreateCustomizableGroupParams(null, null, null, null, null, null, null, null, null, copyOf, null, null, null, null, null, null, null, C1pq.A07(copyOf, "participants", A0v, A0v), A01, false, false, false, false));
        A012.A1R("create_group", A05);
        1Kd.A0E(new D4U(context, threadKey, this, str, z), (ListenableFuture) A0j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x016f, code lost:
    
        if (X.1JF.A0B(r310) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.content.Context r302, com.facebook.messaging.model.threadkey.ThreadKey r303, com.facebook.messaging.model.threads.ThreadSummary r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7u.A01(android.content.Context, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
