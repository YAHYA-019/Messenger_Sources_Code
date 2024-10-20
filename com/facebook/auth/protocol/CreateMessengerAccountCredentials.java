package com.facebook.auth.protocol;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreateMessengerAccountCredentials.class */
public final class CreateMessengerAccountCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(34);
    public final String A00;
    public final String A01;
    public final String A02;

    public CreateMessengerAccountCredentials(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
