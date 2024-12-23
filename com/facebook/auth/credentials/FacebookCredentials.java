package com.facebook.auth.credentials;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FacebookCredentials.class */
public final class FacebookCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(16);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public FacebookCredentials(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = parcel.readString();
        this.A09 = parcel.readInt() != 1 ? false : true;
    }

    public FacebookCredentials(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.A07 = str;
        this.A06 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A03 = str5;
        this.A05 = str6;
        this.A04 = str7;
        this.A08 = str8;
        this.A02 = str9;
        this.A09 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A09 ? 1 : 0);
    }
}
