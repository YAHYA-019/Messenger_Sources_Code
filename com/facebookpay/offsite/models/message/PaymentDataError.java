package com.facebookpay.offsite.models.message;

import X.11T;

/* loaded from: PaymentDataError.class */
public final class PaymentDataError {
    public final PaymentDataErrorField field;
    public final String message;
    public final PaymentDataErrorReason reason;

    public PaymentDataError(PaymentDataErrorReason paymentDataErrorReason, PaymentDataErrorField paymentDataErrorField, String str) {
        11T.A0F(paymentDataErrorReason, 1);
        this.reason = paymentDataErrorReason;
        this.field = paymentDataErrorField;
        this.message = str;
    }

    public final PaymentDataErrorField getField() {
        return this.field;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PaymentDataErrorReason getReason() {
        return this.reason;
    }
}
