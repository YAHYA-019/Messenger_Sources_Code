package com.facebook.contacts.server;

import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AddContactParams.class */
public final class AddContactParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(41);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AddContactParams(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A04 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
