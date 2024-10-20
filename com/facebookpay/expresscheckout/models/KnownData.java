package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* loaded from: KnownData.class */
public final class KnownData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(50);
    public final ShippingAddress A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public KnownData(ShippingAddress shippingAddress, String str, String str2, String str3, String str4) {
        11T.A0F(str4, 5);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = shippingAddress;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
    }
}
