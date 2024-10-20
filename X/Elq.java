package X;

import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;

/* loaded from: Elq.class */
public final class Elq {
    public final ELQ A00;
    public final P2pPaymentConfig A01;
    public final P2pPaymentData A02;

    public Elq(ELQ elq, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        this.A02 = p2pPaymentData;
        this.A01 = p2pPaymentConfig;
        this.A00 = elq;
    }
}
