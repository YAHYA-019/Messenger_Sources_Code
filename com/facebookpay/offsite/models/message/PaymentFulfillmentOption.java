package com.facebookpay.offsite.models.message;

import X.1BL;
import java.util.Date;

/* loaded from: PaymentFulfillmentOption.class */
public class PaymentFulfillmentOption {
    public final PaymentCurrencyAmount amount;
    public final Date dateTimeRangeEnd;
    public final Date dateTimeRangeStart;
    public final String id;
    public final String label;

    public PaymentFulfillmentOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2) {
        1BL.A1H(str, str2, paymentCurrencyAmount);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.dateTimeRangeStart = date;
        this.dateTimeRangeEnd = date2;
    }

    public PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public Date getDateTimeRangeEnd() {
        return this.dateTimeRangeEnd;
    }

    public Date getDateTimeRangeStart() {
        return this.dateTimeRangeStart;
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }
}
