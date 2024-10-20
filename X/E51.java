package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: E51.class */
public final class E51 extends DeM {
    public final /* synthetic */ GKX A00;
    public final /* synthetic */ GL5 A01;
    public final /* synthetic */ E5G A02;
    public final /* synthetic */ PaymentsFlowStep A03;
    public final /* synthetic */ String A04;

    public E51(GKX gkx, GL5 gl5, E5G e5g, PaymentsFlowStep paymentsFlowStep, String str) {
        this.A02 = e5g;
        this.A03 = paymentsFlowStep;
        this.A01 = gl5;
        this.A00 = gkx;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        if (!operationResult.success) {
            A05(new ServiceException(operationResult));
            return;
        }
        E5G e5g = this.A02;
        e5g.A02.A06(this.A03, e5g.A00, e5g.A01);
        if (!1JF.A0B(operationResult.resultDataString)) {
            e5g.A04.A00(operationResult.resultDataString);
        }
        E5G.A00(this.A00, this.A01, this.A04);
    }

    public void A05(ServiceException serviceException) {
        E5G e5g = this.A02;
        e5g.A02.A08(this.A03, e5g.A00, e5g.A01, serviceException);
        0fH.A0r("ChangePinActionController", "Failed to create nonce", serviceException);
        E5G.A00(this.A00, this.A01, this.A04);
    }
}
