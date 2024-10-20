package com.facebookpay.offsite.models.message;

import X.11T;

/* loaded from: PaymentDistance.class */
public final class PaymentDistance {
    public final String unit;
    public final double value;

    public PaymentDistance(double d, String str) {
        11T.A0F(str, 2);
        this.value = d;
        this.unit = str;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }
}
