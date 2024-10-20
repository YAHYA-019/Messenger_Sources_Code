package com.facebookpay.offsite.models.message;

import X.1BL;
import java.util.List;

/* loaded from: PaymentDetailsChangedContent.class */
public final class PaymentDetailsChangedContent {
    public final List changeTypes;
    public final PaymentDetails paymentDetails;

    public PaymentDetailsChangedContent(PaymentDetails paymentDetails, List list) {
        1BL.A1F(paymentDetails, list);
        this.paymentDetails = paymentDetails;
        this.changeTypes = list;
    }

    public final List getChangeTypes() {
        return this.changeTypes;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }
}
