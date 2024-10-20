package com.facebook.messaging.business.commerce.model.retail;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RetailAddress.class */
public final class RetailAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(19);
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public RetailAddress(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public RetailAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, double d2) {
        this.A06 = str5;
        this.A07 = str6;
        this.A02 = str;
        this.A05 = str4;
        this.A04 = str3;
        this.A03 = str2;
        this.A08 = str7;
        this.A00 = d;
        this.A01 = d2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A08);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}
