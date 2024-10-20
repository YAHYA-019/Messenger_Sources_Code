package com.facebookpay.offsite.models.message;

import X.1BK;
import X.1BL;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentShippingOption.class */
public final class PaymentShippingOption {
    public final PaymentCurrencyAmount amount;
    public final String id;
    public final String label;
    public final String secondaryLabel;
    public final Boolean selected;

    public PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3) {
        1BL.A1H(str, str2, paymentCurrencyAmount);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.selected = bool;
        this.secondaryLabel = str3;
    }

    public /* synthetic */ PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, (i & 8) != 0 ? 1BK.A0d() : bool, (i & 16) != 0 ? null : str3);
    }

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final Boolean getSelected() {
        return this.selected;
    }
}
