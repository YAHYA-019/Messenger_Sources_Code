package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: SummaryPaymentItem.class */
public final class SummaryPaymentItem {
    public final PaymentCurrencyAmount amount;
    public final String label;
    public final String summaryItemType;

    public SummaryPaymentItem(String str, PaymentCurrencyAmount paymentCurrencyAmount, String str2) {
        1BL.A1H(str, paymentCurrencyAmount, str2);
        this.label = str;
        this.amount = paymentCurrencyAmount;
        this.summaryItemType = str2;
    }

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSummaryItemType() {
        return this.summaryItemType;
    }
}
