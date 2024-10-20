package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: PaymentCurrencyAmount.class */
public final class PaymentCurrencyAmount {
    public final String currency;
    public final String value;

    public PaymentCurrencyAmount(String str, String str2) {
        1BL.A1F(str, str2);
        this.currency = str;
        this.value = str2;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }
}
