package com.facebook.auth.protocol;

import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fblibraries.fblogin.InstagramSSOSessionInfo;

/* loaded from: InstagramSSOUserInfo.class */
public final class InstagramSSOUserInfo extends InstagramUserInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(38);
    public final InstagramSSOSessionInfo A00;

    public InstagramSSOUserInfo(Parcel parcel) {
        super(parcel);
        this.A00 = (InstagramSSOSessionInfo) 1BL.A0C(parcel, InstagramSSOSessionInfo.class);
    }

    @Override // com.facebook.auth.protocol.InstagramUserInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }
}
