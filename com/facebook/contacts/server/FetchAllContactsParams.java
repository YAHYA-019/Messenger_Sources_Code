package com.facebook.contacts.server;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchAllContactsParams.class */
public final class FetchAllContactsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(44);
    public final int A00;
    public final String A01;
    public final long A02;

    public FetchAllContactsParams(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A02);
    }
}
