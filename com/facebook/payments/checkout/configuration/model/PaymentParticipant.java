package com.facebook.payments.checkout.configuration.model;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentParticipant.class */
public final class PaymentParticipant implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(82);
    public final String A00;
    public final String A01;
    public final String A02;

    public PaymentParticipant(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public PaymentParticipant(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
