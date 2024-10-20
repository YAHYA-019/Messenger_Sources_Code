package com.facebookpay.offsite.models.message;

import X.11T;

/* loaded from: PaymentOffer.class */
public final class PaymentOffer {
    public final String code;
    public final String label;

    public PaymentOffer(String str, String str2) {
        11T.A0F(str, 1);
        this.code = str;
        this.label = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLabel() {
        return this.label;
    }
}
