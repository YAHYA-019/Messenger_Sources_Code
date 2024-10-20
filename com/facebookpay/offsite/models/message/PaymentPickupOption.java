package com.facebookpay.offsite.models.message;

import X.11T;
import X.1BL;
import java.util.Date;

/* loaded from: PaymentPickupOption.class */
public final class PaymentPickupOption extends PaymentFulfillmentOption {
    public final W3CShippingAddress pickupLocationAddress;
    public final boolean pickupStoreAvailability;
    public final PaymentDistance pickupStoreDistance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPickupOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, W3CShippingAddress w3CShippingAddress, boolean z, PaymentDistance paymentDistance) {
        super(str, str2, paymentCurrencyAmount, date, date2);
        1BL.A1H(str, str2, paymentCurrencyAmount);
        11T.A0F(w3CShippingAddress, 6);
        this.pickupLocationAddress = w3CShippingAddress;
        this.pickupStoreAvailability = z;
        this.pickupStoreDistance = paymentDistance;
    }

    public final W3CShippingAddress getPickupLocationAddress() {
        return this.pickupLocationAddress;
    }

    public final boolean getPickupStoreAvailability() {
        return this.pickupStoreAvailability;
    }

    public final PaymentDistance getPickupStoreDistance() {
        return this.pickupStoreDistance;
    }
}
