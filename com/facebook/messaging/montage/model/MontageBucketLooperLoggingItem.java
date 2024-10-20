package com.facebook.messaging.montage.model;

import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageBucketLooperLoggingItem.class */
public final class MontageBucketLooperLoggingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(99);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public MontageBucketLooperLoggingItem(Parcel parcel) {
        this.A03 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
