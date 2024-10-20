package com.facebook.auth.protocol;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmedMessengerOnlyUserCredentials.class */
public final class ConfirmedMessengerOnlyUserCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(33);
    public final String A00;
    public final String A01;
    public final String A02;

    public ConfirmedMessengerOnlyUserCredentials(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
