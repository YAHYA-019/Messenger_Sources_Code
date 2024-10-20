package com.facebook.auth.login.ui;

import X.DKf;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AuthFragmentConfig.class */
public final class AuthFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(25);
    public final Bundle A00;
    public final Class A01;

    public AuthFragmentConfig(Parcel parcel) {
        this.A01 = Class.forName(parcel.readString());
        this.A00 = (Bundle) parcel.readParcelable(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.getCanonicalName());
        parcel.writeParcelable(this.A00, i);
    }
}
