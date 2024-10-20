package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.messaging.service.model.FetchThreadListParams;
import com.facebook.messaging.service.model.FetchThreadListResult;

/* loaded from: D8c.class */
public final class D8c implements Runnable {
    public static final String __redex_internal_original_name = "MessagesSyncConnectionHandler$1";
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C54q A01;

    public D8c(CallerContext callerContext, C54q c54q) {
        this.A01 = c54q;
        this.A00 = callerContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Cbg cbg = (Cbg) this.A01.A08.get();
            CallerContext callerContext = this.A00;
            AbM.A0J(cbg.A09).A04(C2rg.A08, "fetchThreadList - Message Requests");
            1Hb r0 = 1Hb.A02;
            int A01 = 1GC.A01();
            FetchThreadListResult A0A = ((CQW) cbg.A0D.get()).A0A(callerContext, new FetchThreadListParams(null, RequestPriority.A00, 1F9.A0Q, r0, null, null, 0S2.A00, null, A01, 0));
            D4w BZK = ((1To) cbg.A0F.get()).BZK(callerContext, "fetchMessageRequestsThreadList");
            try {
                AbM.A0X(cbg.A08).A0U(A0A);
                AbG.A0h(cbg.A03).A09(A0A);
                BZK.close();
            } finally {
            }
        } catch (Exception e) {
            0fH.A0u("MessagesSyncConnectionHandler", "doInitialPendingMessageRequestsFetch", e);
            this.A01.A03.D0v("messages_sync_message_requests_fetch_error", "Message requests fetch failed");
        }
    }
}
