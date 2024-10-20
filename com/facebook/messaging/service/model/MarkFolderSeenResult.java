package com.facebook.messaging.service.model;

import X.1F9;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MarkFolderSeenResult.class */
public final class MarkFolderSeenResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(3);
    public final long A00;
    public final 1F9 A01;

    public MarkFolderSeenResult(1F9 r302, long j) {
        this.A00 = j;
        this.A01 = r302;
    }

    public MarkFolderSeenResult(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeSerializable(this.A01);
    }
}
