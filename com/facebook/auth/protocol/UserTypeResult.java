package com.facebook.auth.protocol;

import X.4YW;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserTypeResult.class */
public final class UserTypeResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(43);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final String A09;

    public UserTypeResult(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A09 = parcel.readString();
        this.A04 = parcel.readString();
        this.A08 = 4YW.A0K(parcel);
    }

    public UserTypeResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.A00 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A01 = str7;
        this.A09 = str8 == null ? "ig_sso_two_button_pink" : str8;
        this.A04 = str9;
        this.A08 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
    }
}
