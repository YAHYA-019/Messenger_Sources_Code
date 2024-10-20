package X;

import com.facebook.common.util.TriState;
import com.facebook.payments.auth.pin.model.PaymentPin;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsParams;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsResult;
import com.facebook.payments.p2p.service.model.sync.FetchIrisSequenceIdResult;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListParams;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListResult;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: Fs9.class */
public final class Fs9 implements GIg {
    public final /* synthetic */ BI0 A00;

    public Fs9(BI0 bi0) {
        this.A00 = bi0;
    }

    @Override // X.GIg
    public Ejf ARL() {
        try {
            FcM fcM = this.A00.A02;
            C09694qx c09694qx = fcM.A01;
            String str = ((FetchIrisSequenceIdResult) c09694qx.A00(fcM.A0A, null, null)).mIrisSequenceId;
            C4qz c4qz = new C4qz(c09694qx.A00);
            Fgt fgt = fcM.A03;
            TriState triState = TriState.UNSET;
            c4qz.A02(new C4r6(triState, fgt, null, null, "fetchPaymentPin"));
            c4qz.A02(new C4r6(triState, fcM.A0B, new FetchTransactionListParams(FetchTransactionListParams.A02, 50), null, "fetchTransactionListMethod"));
            c4qz.A02(new C4r6(triState, fcM.A09, new FetchPaymentRequestsParams(EKm.A01), null, "fetchPaymentRequestsMethod"));
            c4qz.A01(AbH.A0B(fcM), "fetchAllforSync");
            java.util.Map map = c4qz.A06;
            fcM.A02.A00((PaymentPin) map.get("fetchPaymentPin"));
            1Du it = ((FetchTransactionListResult) map.get("fetchTransactionListMethod")).A00.iterator();
            while (it.hasNext()) {
                fcM.A07.A01((PaymentTransaction) it.next());
            }
            FetchPaymentRequestsResult fetchPaymentRequestsResult = (FetchPaymentRequestsResult) map.get("fetchPaymentRequestsMethod");
            F93 f93 = fcM.A06;
            ArrayList arrayList = fetchPaymentRequestsResult.A00;
            f93.A02(ImmutableList.copyOf((Collection) arrayList));
            fcM.A04.A01(ImmutableList.copyOf((Collection) arrayList));
            fcM.A00();
            long j = -1;
            if (str != null) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException unused) {
                }
                if (j >= 0) {
                    return new Ejf(false, Long.valueOf(j));
                }
            }
        } catch (2L0 unused2) {
        }
        return new Ejf(true, null);
    }

    @Override // X.GIg
    public void BxQ(long j) {
        0fH.A0E(BI0.class, 0Pz.A0t("Failed to do initial payment fetch, backing off by ", " ms. viewerContextUserId=", this.A00.A03, j));
    }
}
