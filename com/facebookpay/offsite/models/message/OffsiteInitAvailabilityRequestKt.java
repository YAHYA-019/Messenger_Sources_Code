package com.facebookpay.offsite.models.message;

import X.11T;

/* loaded from: OffsiteInitAvailabilityRequestKt.class */
public abstract class OffsiteInitAvailabilityRequestKt {
    public static final String DEFAULT_PARTNER_ID = "UNKNOWN";

    public static final String isIAWAvailabilityRequest(PaymentRequest paymentRequest) {
        11T.A0F(paymentRequest, 0);
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        return (11T.A0O(paymentConfiguration.partnerId, DEFAULT_PARTNER_ID) && 11T.A0O(paymentConfiguration.partnerMerchantId, DEFAULT_PARTNER_ID)) ? AvailabilityInitiator$Companion.INITIATOR_IAW : AvailabilityInitiator$Companion.INITIATOR_JS_SDK;
    }

    public static /* synthetic */ void isIAWAvailabilityRequest$annotations(PaymentRequest paymentRequest) {
    }
}
