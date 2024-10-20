package com.facebook.payments.checkout.model;

import X.1BL;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: CheckoutEntryPointType.class */
public enum CheckoutEntryPointType implements Parcelable {
    RETRY_PAYMENT("RETRY_PAYMENT"),
    PAYMENT_REQUEST_DETAILS("PAYMENT_REQUEST_DETAILS");

    public static final Map A00;
    public static final Parcelable.Creator CREATOR;
    public String mValue;

    static {
        CheckoutEntryPointType checkoutEntryPointType = RETRY_PAYMENT;
        EnumMap enumMap = new EnumMap(CheckoutEntryPointType.class);
        enumMap.put((EnumMap) checkoutEntryPointType, (CheckoutEntryPointType) "RETRY_PAYMENT");
        enumMap.put((EnumMap) PAYMENT_REQUEST_DETAILS, (CheckoutEntryPointType) "PAYMENT_REQUEST_DETAILS");
        A00 = enumMap;
        CREATOR = FKZ.A00(5);
    }

    CheckoutEntryPointType(String str) {
        this.mValue = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this);
    }
}
