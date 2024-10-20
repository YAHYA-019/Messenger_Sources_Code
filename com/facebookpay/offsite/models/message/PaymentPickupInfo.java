package com.facebookpay.offsite.models.message;

/* loaded from: PaymentPickupInfo.class */
public final class PaymentPickupInfo {
    public final String pickupEmail;
    public final String pickupName;
    public final String pickupNotes;
    public final String pickupPhone;
    public final String pickupRadiusZipCode;

    public PaymentPickupInfo(String str, String str2, String str3, String str4, String str5) {
        this.pickupRadiusZipCode = str;
        this.pickupName = str2;
        this.pickupEmail = str3;
        this.pickupPhone = str4;
        this.pickupNotes = str5;
    }

    public final String getPickupEmail() {
        return this.pickupEmail;
    }

    public final String getPickupName() {
        return this.pickupName;
    }

    public final String getPickupNotes() {
        return this.pickupNotes;
    }

    public final String getPickupPhone() {
        return this.pickupPhone;
    }

    public final String getPickupRadiusZipCode() {
        return this.pickupRadiusZipCode;
    }
}
