package com.facebook.device.resourcemonitor;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DataUsageBytes.class */
public final class DataUsageBytes implements Parcelable {
    public static final DataUsageBytes A02 = new DataUsageBytes(0, 0);
    public long A00;
    public long A01;

    public DataUsageBytes(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
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
