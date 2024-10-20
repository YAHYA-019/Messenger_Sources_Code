package com.facebook.messaging.sharing.broadcastflow.model;

import X.7zN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BatchOperationState.class */
public enum BatchOperationState implements Parcelable {
    NONE,
    IN_PROGRESS;

    public static final Parcelable.Creator CREATOR = CSU.A00(58);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this);
    }
}
