package com.facebook.browserextensions.ipc;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CardCredentialInfo.class */
public final class CardCredentialInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(57);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public CardCredentialInfo(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
    }
}
