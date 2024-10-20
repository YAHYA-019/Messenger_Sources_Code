package com.facebook.payments.paymentmethods.model;

import X.ERH;

/* loaded from: NewPaymentOption.class */
public abstract class NewPaymentOption implements PaymentOption {
    public ERH A01() {
        return ERH.A04;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String getId() {
        return A01().mValue;
    }
}
