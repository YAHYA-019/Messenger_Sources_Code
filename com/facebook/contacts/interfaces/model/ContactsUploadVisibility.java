package com.facebook.contacts.interfaces.model;

import X.7zN;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ContactsUploadVisibility.class */
public enum ContactsUploadVisibility implements Parcelable {
    SHOW,
    HIDE;

    public static final Parcelable.Creator CREATOR = FKX.A00(25);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this);
    }
}
