package com.facebook.payments.paymentmethods.cardform.protocol.model;

import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ValidatePaymentCardBinResult.class */
public class ValidatePaymentCardBinResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(47);
    public final String mCardBinId;

    public ValidatePaymentCardBinResult() {
        this.mCardBinId = null;
    }

    public ValidatePaymentCardBinResult(Parcel parcel) {
        this.mCardBinId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardBinId);
    }
}
