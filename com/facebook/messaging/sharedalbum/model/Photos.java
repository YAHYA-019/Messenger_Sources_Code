package com.facebook.messaging.sharedalbum.model;

import X.11T;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: Photos.class */
public final class Photos extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(34);
    public final ImmutableList A00;

    public Photos(ImmutableList immutableList) {
        11T.A0F(immutableList, 1);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A00);
    }
}
