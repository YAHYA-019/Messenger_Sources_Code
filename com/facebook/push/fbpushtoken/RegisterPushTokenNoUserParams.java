package com.facebook.push.fbpushtoken;

import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RegisterPushTokenNoUserParams.class */
public final class RegisterPushTokenNoUserParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(68);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public RegisterPushTokenNoUserParams(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public RegisterPushTokenNoUserParams(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
