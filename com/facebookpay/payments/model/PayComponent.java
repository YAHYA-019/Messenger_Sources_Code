package com.facebookpay.payments.model;

import X.7zR;

/* loaded from: PayComponent.class */
public final class PayComponent {
    public final int amount;
    public final String credentialId;
    public final String currency;

    public PayComponent(String str, int i, String str2) {
        7zR.A1N(str, str2);
        this.credentialId = str;
        this.amount = i;
        this.currency = str2;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final String getCurrency() {
        return this.currency;
    }
}
