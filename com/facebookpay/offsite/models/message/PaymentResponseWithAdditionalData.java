package com.facebookpay.offsite.models.message;

import X.11T;
import java.util.Map;

/* loaded from: PaymentResponseWithAdditionalData.class */
public final class PaymentResponseWithAdditionalData {
    public final Map additionalData;
    public final PaymentResponse paymentResponse;

    public PaymentResponseWithAdditionalData(PaymentResponse paymentResponse, Map map) {
        11T.A0F(paymentResponse, 1);
        this.paymentResponse = paymentResponse;
        this.additionalData = map;
    }

    public final Map getAdditionalData() {
        return this.additionalData;
    }

    public final PaymentResponse getPaymentResponse() {
        return this.paymentResponse;
    }
}
