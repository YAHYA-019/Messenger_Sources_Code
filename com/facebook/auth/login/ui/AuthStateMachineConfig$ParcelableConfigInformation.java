package com.facebook.auth.login.ui;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: AuthStateMachineConfig$ParcelableConfigInformation.class */
public final class AuthStateMachineConfig$ParcelableConfigInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(26);
    public ImmutableMap A00;
    public Class A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
        parcel.writeString(this.A01.getName());
    }
}
