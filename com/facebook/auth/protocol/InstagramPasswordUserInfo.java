package com.facebook.auth.protocol;

import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstagramPasswordUserInfo.class */
public final class InstagramPasswordUserInfo extends InstagramUserInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(37);
    public final InstagramPasswordCredentials A00;

    public InstagramPasswordUserInfo(Parcel parcel) {
        super(parcel);
        this.A00 = (InstagramPasswordCredentials) 1BL.A0C(parcel, InstagramPasswordCredentials.class);
    }

    @Override // com.facebook.auth.protocol.InstagramUserInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }
}
