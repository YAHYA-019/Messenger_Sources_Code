package com.facebook.platform.server.protocol;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GetAppPermissionsMethod$Params.class */
public final class GetAppPermissionsMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(41);
    public final String A00;

    public GetAppPermissionsMethod$Params(Parcel parcel) {
        this.A00 = parcel.readString();
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
