package com.facebookpay.offsite.models.message;

import X.11T;
import X.1BL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: PaymentDetails.class */
public final class PaymentDetails {
    public W3CShippingAddress billingAddress;
    public final ArrayList displayItems;
    public final String emailId;
    public final String fulfillmentOptionId;
    public final ArrayList fulfillmentOptions;
    public final List offers;
    public final String phoneId;
    public final PaymentPickupInfo pickupInfo;
    public W3CShippingAddress shippingAddress;
    public final String shippingOptionId;
    public final ArrayList shippingOptions;
    public final ArrayList summaryItems;
    public final PaymentItem total;

    public PaymentDetails(PaymentItem paymentItem, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str, String str2, W3CShippingAddress w3CShippingAddress, W3CShippingAddress w3CShippingAddress2, List list, PaymentPickupInfo paymentPickupInfo, String str3, String str4) {
        1BL.A11(2, arrayList, arrayList2, arrayList3);
        11T.A0F(arrayList4, 5);
        this.total = paymentItem;
        this.displayItems = arrayList;
        this.summaryItems = arrayList2;
        this.shippingOptions = arrayList3;
        this.fulfillmentOptions = arrayList4;
        this.shippingOptionId = str;
        this.fulfillmentOptionId = str2;
        this.shippingAddress = w3CShippingAddress;
        this.billingAddress = w3CShippingAddress2;
        this.offers = list;
        this.pickupInfo = paymentPickupInfo;
        this.emailId = str3;
        this.phoneId = str4;
    }

    public final W3CShippingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final ArrayList getDisplayItems() {
        return this.displayItems;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getFulfillmentOptionId() {
        return this.fulfillmentOptionId;
    }

    public final ArrayList getFulfillmentOptions() {
        return this.fulfillmentOptions;
    }

    public final List getOffers() {
        return this.offers;
    }

    public final String getPhoneId() {
        return this.phoneId;
    }

    public final PaymentPickupInfo getPickupInfo() {
        return this.pickupInfo;
    }

    public final W3CShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final String getShippingOptionId() {
        return this.shippingOptionId;
    }

    public final ArrayList getShippingOptions() {
        return this.shippingOptions;
    }

    public final ArrayList getSummaryItems() {
        return this.summaryItems;
    }

    public final PaymentItem getTotal() {
        return this.total;
    }

    public final void setBillingAddress(W3CShippingAddress w3CShippingAddress) {
        this.billingAddress = w3CShippingAddress;
    }

    public final void setShippingAddress(W3CShippingAddress w3CShippingAddress) {
        this.shippingAddress = w3CShippingAddress;
    }
}
