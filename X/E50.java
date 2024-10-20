package X;

import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: E50.class */
public final class E50 extends DeM {
    public final /* synthetic */ GKX A00;
    public final /* synthetic */ GL5 A01;
    public final /* synthetic */ E5G A02;
    public final /* synthetic */ String A03;

    public E50(GKX gkx, GL5 gl5, E5G e5g, String str) {
        this.A02 = e5g;
        this.A01 = gl5;
        this.A00 = gkx;
        this.A03 = str;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        E5G e5g = this.A02;
        e5g.A02.A06(PaymentsFlowStep.A0d, e5g.A00, e5g.A01);
        GL5 gl5 = this.A01;
        GKX gkx = this.A00;
        String str = this.A03;
        PaymentsFlowStep paymentsFlowStep = e5g.A07.A07() ? PaymentsFlowStep.A1l : PaymentsFlowStep.A0U;
        F9H f9h = e5g.A05;
        f9h.A00 = F9H.A00(F5g.A03, new E51(gkx, gl5, e5g, paymentsFlowStep, str), f9h, new Fvi(f9h, str), f9h.A00);
    }

    public void A05(ServiceException serviceException) {
        E5G e5g = this.A02;
        e5g.A02.A08(PaymentsFlowStep.A0d, e5g.A00, e5g.A01, serviceException);
        0fH.A0r("ChangePinActionController", "Failed to disable nonce", serviceException);
        E5G.A00(this.A00, this.A01, this.A03);
    }
}
