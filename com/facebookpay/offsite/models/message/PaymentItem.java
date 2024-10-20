package com.facebookpay.offsite.models.message;

import X.7zR;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentItem.class */
public final class PaymentItem {
    public final PaymentCurrencyAmount amount;
    public final String contentCategory;
    public final String contentId;
    public final String contentType;
    public final String imageURI;
    public final String label;
    public final String quantity;
    public final String secondaryLabel;

    public PaymentItem(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, String str3, String str4, String str5, String str6, String str7) {
        7zR.A1N(str, paymentCurrencyAmount);
        this.label = str;
        this.quantity = str2;
        this.amount = paymentCurrencyAmount;
        this.imageURI = str3;
        this.secondaryLabel = str4;
        this.contentId = str5;
        this.contentType = str6;
        this.contentCategory = str7;
    }

    public /* synthetic */ PaymentItem(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, paymentCurrencyAmount, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getContentCategory() {
        return this.contentCategory;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getImageURI() {
        return this.imageURI;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }
}
