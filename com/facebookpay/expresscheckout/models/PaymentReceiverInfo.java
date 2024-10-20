package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentReceiverInfo.class */
public final class PaymentReceiverInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(51);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PaymentReceiverInfo() {
        this(null, null, null, null);
    }

    public PaymentReceiverInfo(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
