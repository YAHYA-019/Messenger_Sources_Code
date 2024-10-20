package com.facebook.wearable.applinks;

import X.7zN;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AppLinkDeviceConnectionStatus.class */
public enum AppLinkDeviceConnectionStatus implements Parcelable {
    CONNECTED(0),
    CONNECTING(1),
    DISCONNECTED(2),
    UNPAIRED(3);

    public static final Parcelable.Creator CREATOR = FKb.A00(25);
    public final int value;

    AppLinkDeviceConnectionStatus(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this);
    }
}
