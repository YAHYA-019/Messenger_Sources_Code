package com.facebook.payments.checkout.configuration.model;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutItem.class */
public final class CheckoutItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(60);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public CheckoutItem(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public CheckoutItem(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str5;
        this.A03 = str4;
        this.A02 = str3;
        this.A01 = str2;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
