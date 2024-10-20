package com.facebook.messaging.sharing.broadcastflow.model;

import X.7zN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SendState.class */
public enum SendState implements Parcelable {
    NONE,
    DISABLED,
    SEND,
    CALL,
    CALLED,
    CANCEL,
    UNDO,
    SENT,
    OPEN,
    LIMIT,
    MR_LIMITED,
    FAILED,
    CHECKED,
    UNCHECKED,
    JOINED,
    GROUP_LIMIT;

    public static final Parcelable.Creator CREATOR = CSU.A00(65);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this);
    }
}
