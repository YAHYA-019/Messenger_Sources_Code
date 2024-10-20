package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;

/* loaded from: Fl7.class */
public final class Fl7 implements GI6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fl7(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.GI6
    public void Bms() {
        FHO fho;
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentsFlowStep paymentsFlowStep;
        switch (this.A00) {
            case 0:
                E5B e5b = (E5B) this.A01;
                fho = e5b.A02;
                paymentsLoggingSessionData = e5b.A00;
                paymentsFlowStep = PaymentsFlowStep.A0f;
                break;
            case 1:
                E58 e58 = (E58) this.A01;
                fho = e58.A02;
                paymentsLoggingSessionData = e58.A00;
                paymentsFlowStep = PaymentsFlowStep.A0i;
                break;
            case 2:
                E5A e5a = (E5A) this.A01;
                fho = e5a.A02;
                paymentsLoggingSessionData = e5a.A00;
                paymentsFlowStep = PaymentsFlowStep.A1f;
                break;
            default:
                E5C e5c = (E5C) this.A01;
                fho = e5c.A03;
                paymentsLoggingSessionData = e5c.A00;
                paymentsFlowStep = PaymentsFlowStep.A1f;
                break;
        }
        fho.A03(paymentsFlowStep, paymentsLoggingSessionData);
        ((GL5) this.A02).AGC(0, null);
    }

    @Override // X.GI6
    public void CS9() {
        ((GL5) this.A02).BzT();
    }
}
