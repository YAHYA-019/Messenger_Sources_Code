package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BlockUserParams.class */
public final class BlockUserParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(75);
    public final long A00;
    public final long A01;

    public BlockUserParams(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
