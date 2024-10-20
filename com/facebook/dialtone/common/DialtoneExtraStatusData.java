package com.facebook.dialtone.common;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.flatbuffers.Flattenable;

/* loaded from: DialtoneExtraStatusData.class */
public final class DialtoneExtraStatusData implements Parcelable, Flattenable {
    public static final Parcelable.Creator CREATOR = FKX.A00(60);
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
    }
}
