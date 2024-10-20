package com.facebook.platform.server.protocol;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GetAppNameMethod$Params.class */
public final class GetAppNameMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(40);
    public final String A00;

    public GetAppNameMethod$Params(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public GetAppNameMethod$Params(String str) {
        this.A00 = str;
    }

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
