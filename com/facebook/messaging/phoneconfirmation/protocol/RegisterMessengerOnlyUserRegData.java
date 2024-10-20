package com.facebook.messaging.phoneconfirmation.protocol;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RegisterMessengerOnlyUserRegData.class */
public final class RegisterMessengerOnlyUserRegData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(4);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public RegisterMessengerOnlyUserRegData(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public RegisterMessengerOnlyUserRegData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A01 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
