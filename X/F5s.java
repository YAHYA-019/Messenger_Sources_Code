package X;

import com.facebook.payments.logging.PaymentsFlowName;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.google.common.collect.ImmutableMap;

/* loaded from: F5s.class */
public final class F5s {
    public ImmutableMap A00;
    public String A01;
    public String A02;
    public final PaymentsFlowName A03;

    public F5s(PaymentsFlowName paymentsFlowName) {
        this.A03 = paymentsFlowName;
    }

    public static PaymentsLoggingSessionData A00(PaymentsFlowName paymentsFlowName) {
        return new PaymentsLoggingSessionData(new F5s(paymentsFlowName));
    }
}
