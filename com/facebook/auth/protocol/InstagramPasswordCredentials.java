package com.facebook.auth.protocol;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstagramPasswordCredentials.class */
public final class InstagramPasswordCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(36);
    public String A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
