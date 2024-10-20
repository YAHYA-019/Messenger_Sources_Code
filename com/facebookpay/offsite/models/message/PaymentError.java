package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: PaymentError.class */
public final class PaymentError {
    public final String code;
    public final String message;

    public PaymentError(String str, String str2) {
        1BL.A1F(str, str2);
        this.code = str;
        this.message = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
