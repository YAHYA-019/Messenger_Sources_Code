package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Ap9, reason: case insensitive filesystem */
/* loaded from: Ap9.class */
public final class C1667Ap9 extends ETZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ CreateGroupAggregatedLatencyLogger A02;
    public final /* synthetic */ BXj A03;
    public final /* synthetic */ DGQ A04;
    public final /* synthetic */ SettableFuture A05;

    public C1667Ap9(Context context, CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger, BXj bXj, DGQ dgq, SettableFuture settableFuture, long j) {
        this.A03 = bXj;
        this.A05 = settableFuture;
        this.A04 = dgq;
        this.A02 = createGroupAggregatedLatencyLogger;
        this.A00 = j;
        this.A01 = context;
    }

    public void A01(OperationResult operationResult) {
        ThreadSummary threadSummary;
        ThreadKey threadKey;
        FetchThreadResult A0c = AbM.A0c(operationResult);
        if (A0c == null || (threadSummary = A0c.A05) == null || (threadKey = threadSummary.A0n) == null) {
            this.A05.set((Object) null);
            return;
        }
        this.A04.C0o(threadKey);
        CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger = this.A02;
        long j = this.A00;
        createGroupAggregatedLatencyLogger.A00(j);
        CDK.A00(createGroupAggregatedLatencyLogger.A03, BLb.A08, j);
        this.A05.set(threadSummary);
    }

    public void A02(ServiceException serviceException) {
        Context context = this.A01;
        6HM r0 = (6HM) 1Hv.A02(context, 50020);
        6HM r02 = new 6HM(context, r0.A01, r0.A02, r0.A03, r0.A04);
        Resources resources = context.getResources();
        String A12 = AbK.A12(context);
        r02.A02(new COW((Activity) null, CSG.A00(this, ActionId.OFFLINE), serviceException, resources.getString(2131957396), A12, -1));
        this.A05.setException(serviceException);
    }
}
