package com.facebook.contacts.server;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchDeltaContactsParams.class */
public final class FetchDeltaContactsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(48);
    public final int A00;
    public final String A01;

    public FetchDeltaContactsParams(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
