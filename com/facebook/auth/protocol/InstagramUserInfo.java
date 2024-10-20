package com.facebook.auth.protocol;

import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstagramUserInfo.class */
public class InstagramUserInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(39);
    public final UserTypeResult A00;

    public InstagramUserInfo(Parcel parcel) {
        this.A00 = (UserTypeResult) 1BL.A0C(parcel, UserTypeResult.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
