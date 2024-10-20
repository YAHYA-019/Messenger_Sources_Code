package com.facebook.auth.credentials;

import X.BLq;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DeviceBasedLoginCredentials.class */
public final class DeviceBasedLoginCredentials implements LoginCredentials {
    public static final Parcelable.Creator CREATOR = DKf.A00(15);
    public final BLq A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public DeviceBasedLoginCredentials(BLq bLq, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = "";
        this.A00 = bLq;
    }

    public DeviceBasedLoginCredentials(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A00);
    }
}
