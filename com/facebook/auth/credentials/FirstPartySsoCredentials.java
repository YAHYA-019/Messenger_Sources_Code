package com.facebook.auth.credentials;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FirstPartySsoCredentials.class */
public final class FirstPartySsoCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(17);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
