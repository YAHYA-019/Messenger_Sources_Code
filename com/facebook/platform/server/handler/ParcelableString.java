package com.facebook.platform.server.handler;

import X.11T;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ParcelableString.class */
public final class ParcelableString implements Parcelable {
    public String A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
