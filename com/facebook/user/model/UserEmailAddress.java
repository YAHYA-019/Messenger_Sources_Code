package com.facebook.user.model;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserEmailAddress.class */
public final class UserEmailAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(55);
    public final String A00;
    public final int A01;

    public UserEmailAddress(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public UserEmailAddress(String str, int i) {
        this.A00 = str.toLowerCase();
        this.A01 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01);
    }
}
