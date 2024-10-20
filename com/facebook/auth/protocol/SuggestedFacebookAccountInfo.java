package com.facebook.auth.protocol;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SuggestedFacebookAccountInfo.class */
public final class SuggestedFacebookAccountInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(42);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SuggestedFacebookAccountInfo(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public SuggestedFacebookAccountInfo(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
