package com.facebook.wearable.applinks;

import X.7zN;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AppLinkDeviceMountState.class */
public enum AppLinkDeviceMountState implements Parcelable {
    MOUNTED(0),
    UNMOUNTED(1);

    public static final Parcelable.Creator CREATOR = FKb.A00(27);
    public final int value;

    AppLinkDeviceMountState(int i) {
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
