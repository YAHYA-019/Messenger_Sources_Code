package com.facebook.openidconnect.model;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OpenIDCredential.class */
public final class OpenIDCredential implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(13);
    public String A00 = null;
    public String A01 = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString("GOOGLE");
        parcel.writeString(this.A01);
    }
}
