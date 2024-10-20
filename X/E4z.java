package X;

import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: E4z.class */
public final class E4z extends DeM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public E4z(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        if (this.A00 != 0) {
            E59 e59 = (E59) this.A01;
            e59.A02.A06(PaymentsFlowStep.A0f, e59.A00, e59.A01);
            ((GL5) this.A02).BfQ();
            return;
        }
        E57 e57 = (E57) this.A01;
        e57.A02.A06(PaymentsFlowStep.A0g, e57.A00, e57.A01);
        GL5 gl5 = (GL5) this.A02;
        gl5.D4Z(2131963082);
        gl5.AGC(-1, null);
    }

    public void A05(ServiceException serviceException) {
        FHO fho;
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentItemType paymentItemType;
        PaymentsFlowStep paymentsFlowStep;
        if (this.A00 != 0) {
            E59 e59 = (E59) this.A01;
            fho = e59.A02;
            paymentsLoggingSessionData = e59.A00;
            paymentItemType = e59.A01;
            paymentsFlowStep = PaymentsFlowStep.A0f;
        } else {
            E57 e57 = (E57) this.A01;
            fho = e57.A02;
            paymentsLoggingSessionData = e57.A00;
            paymentItemType = e57.A01;
            paymentsFlowStep = PaymentsFlowStep.A0g;
        }
        fho.A08(paymentsFlowStep, paymentsLoggingSessionData, paymentItemType, serviceException);
        GLi gLi = (GLi) this.A03;
        gLi.BOC();
        gLi.AFo();
        if (gLi.BdO(null, serviceException)) {
            return;
        }
        ((GL5) this.A02).D4Z(2131963048);
    }
}
