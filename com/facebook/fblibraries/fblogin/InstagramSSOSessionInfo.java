package com.facebook.fblibraries.fblogin;

import X.4YW;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstagramSSOSessionInfo.class */
public final class InstagramSSOSessionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(74);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public InstagramSSOSessionInfo(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = 4YW.A0K(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
    }
}
