package com.facebook.wearable.applinks;

import X.7zN;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AppLinkDeviceHardwareState.class */
public enum AppLinkDeviceHardwareState implements Parcelable {
    HINGE_OPEN(0),
    HINGE_CLOSED(1),
    IN_DEEP_SLEEP(2),
    OUT_OF_DEEP_SLEEP(3),
    STREAMING_ACTIVE(4),
    STREAMING_INACTIVE(5);

    public static final Parcelable.Creator CREATOR = FKb.A00(26);
    public final int value;

    AppLinkDeviceHardwareState(int i) {
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
