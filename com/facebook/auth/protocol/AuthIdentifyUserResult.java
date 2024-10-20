package com.facebook.auth.protocol;

import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AuthIdentifyUserResult.class */
public final class AuthIdentifyUserResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(30);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public AuthIdentifyUserResult(Parcel parcel) {
        boolean z = false;
        this.A05 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A04 = parcel.readByte() == 1 ? true : z;
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public AuthIdentifyUserResult(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = z2;
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
