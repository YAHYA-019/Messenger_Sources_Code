package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.service.model.FetchThreadParams;

/* loaded from: D7c.class */
public final class D7c implements Runnable {
    public static final String __redex_internal_original_name = "ThreadMessageBroadcastReceiver$actionReceiver$1$onReceive$1";
    public final /* synthetic */ CjN A00;
    public final /* synthetic */ ThreadKey A01;

    public D7c(CjN cjN, ThreadKey threadKey) {
        this.A00 = cjN;
        this.A01 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CjN cjN = this.A00;
        ThreadKey threadKey = this.A01;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("fetchThreadParams", new FetchThreadParams(1He.A04, null, ThreadCriteria.A02.A00(threadKey), null, 1, 0L, false, false, false, false, false));
        1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) 1Br.A0B(cjN.A03)).newInstance_DEPRECATED("fetch_thread", A05, 1, CallerContext.A0B("ThreadMessageBroadcastReceiver")), false);
        11T.A0A(A00);
        1Br.A0D(cjN.A07, D4q.A00(cjN, 31), A00);
    }
}
