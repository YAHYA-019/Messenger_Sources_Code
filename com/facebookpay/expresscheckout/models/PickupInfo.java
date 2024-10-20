package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PickupInfo.class */
public final class PickupInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(53);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PickupInfo() {
        this(null, null, null, null, null);
    }

    public PickupInfo(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }
}
