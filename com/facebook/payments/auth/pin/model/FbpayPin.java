package com.facebook.payments.auth.pin.model;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbpayPin.class */
public final class FbpayPin implements Parcelable {
    public static final FbpayPin A01 = new FbpayPin();
    public static final Parcelable.Creator CREATOR = FKY.A00(37);
    public final String A00;

    public FbpayPin() {
        this.A00 = null;
    }

    public FbpayPin(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public FbpayPin(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
