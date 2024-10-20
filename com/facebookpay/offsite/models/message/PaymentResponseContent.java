package com.facebookpay.offsite.models.message;

import X.1BL;
import java.util.ArrayList;

/* loaded from: PaymentResponseContent.class */
public final class PaymentResponseContent {
    public final W3CShippingAddress billingAddress;
    public final PaymentContainer container;
    public final String containerDescription;
    public final Boolean emailMarketingAllowed;
    public final String fulfillmentOptionId;
    public final ArrayList offerCodes;
    public final String payerEmail;
    public final String payerName;
    public final String payerPhone;
    public final String pickupEmail;
    public final String pickupName;
    public final String pickupPhone;
    public final String requestId;
    public final W3CShippingAddress shippingAddress;
    public final String shippingOptionId;

    public PaymentResponseContent(String str, PaymentContainer paymentContainer, String str2, String str3, String str4, String str5, W3CShippingAddress w3CShippingAddress, W3CShippingAddress w3CShippingAddress2, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, Boolean bool) {
        1BL.A1H(str, paymentContainer, str2);
        this.requestId = str;
        this.container = paymentContainer;
        this.containerDescription = str2;
        this.payerName = str3;
        this.payerEmail = str4;
        this.payerPhone = str5;
        this.shippingAddress = w3CShippingAddress;
        this.billingAddress = w3CShippingAddress2;
        this.shippingOptionId = str6;
        this.fulfillmentOptionId = str7;
        this.pickupName = str8;
        this.pickupEmail = str9;
        this.pickupPhone = str10;
        this.offerCodes = arrayList;
        this.emailMarketingAllowed = bool;
    }

    public final W3CShippingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final PaymentContainer getContainer() {
        return this.container;
    }

    public final String getContainerDescription() {
        return this.containerDescription;
    }

    public final Boolean getEmailMarketingAllowed() {
        return this.emailMarketingAllowed;
    }

    public final String getFulfillmentOptionId() {
        return this.fulfillmentOptionId;
    }

    public final ArrayList getOfferCodes() {
        return this.offerCodes;
    }

    public final String getPayerEmail() {
        return this.payerEmail;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPayerPhone() {
        return this.payerPhone;
    }

    public final String getPickupEmail() {
        return this.pickupEmail;
    }

    public final String getPickupName() {
        return this.pickupName;
    }

    public final String getPickupPhone() {
        return this.pickupPhone;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final W3CShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final String getShippingOptionId() {
        return this.shippingOptionId;
    }
}
