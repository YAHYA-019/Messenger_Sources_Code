package com.facebook.messaging.service.model;

import X.1F9;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UpdateFolderCountsParams.class */
public final class UpdateFolderCountsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(20);
    public final int A00;
    public final int A01;
    public final 1F9 A02;

    public UpdateFolderCountsParams(1F9 r302, int i, int i2) {
        this.A02 = r302;
        this.A00 = i;
        this.A01 = i2;
    }

    public UpdateFolderCountsParams(Parcel parcel) {
        this.A02 = parcel.readSerializable();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
