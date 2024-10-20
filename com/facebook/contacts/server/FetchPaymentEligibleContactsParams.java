package com.facebook.contacts.server;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchPaymentEligibleContactsParams.class */
public final class FetchPaymentEligibleContactsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(51);
    public final int A00;
    public final String A01;

    public FetchPaymentEligibleContactsParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public FetchPaymentEligibleContactsParams(String str) {
        this.A01 = str;
        this.A00 = 100;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
