package com.facebook.auth.component;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReauthResult.class */
public final class ReauthResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(11);
    public long A00;
    public long A01;
    public String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
