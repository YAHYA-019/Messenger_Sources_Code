package com.facebook.quicksilver.common.sharing;

import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstantGameImageShareMedia.class */
public final class InstantGameImageShareMedia extends InstantGameShareMedia {
    public static final Parcelable.Creator CREATOR = FKW.A00(80);
    public String A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
