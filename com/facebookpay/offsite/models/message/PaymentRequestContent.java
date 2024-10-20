package com.facebookpay.offsite.models.message;

import X.1BL;
import X.7zT;

/* loaded from: PaymentRequestContent.class */
public final class PaymentRequestContent {
    public final PaymentConfiguration paymentConfiguration;
    public final PaymentDetails paymentDetails;
    public final PaymentOptions paymentOptions;

    public PaymentRequestContent(PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration) {
        1BL.A1H(paymentDetails, paymentOptions, paymentConfiguration);
        this.paymentDetails = paymentDetails;
        this.paymentOptions = paymentOptions;
        this.paymentConfiguration = paymentConfiguration;
    }

    public static /* synthetic */ PaymentRequestContent createCopy$default(PaymentRequestContent paymentRequestContent, PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentDetails = paymentRequestContent.paymentDetails;
        }
        if ((i & 2) != 0) {
            paymentOptions = paymentRequestContent.paymentOptions;
        }
        if ((i & 4) != 0) {
            paymentConfiguration = paymentRequestContent.paymentConfiguration;
        }
        return paymentRequestContent.createCopy(paymentDetails, paymentOptions, paymentConfiguration);
    }

    public final PaymentRequestContent createCopy(PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration) {
        7zT.A1S(paymentDetails, paymentOptions, paymentConfiguration);
        return new PaymentRequestContent(paymentDetails, paymentOptions, paymentConfiguration);
    }

    public final PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }
}
