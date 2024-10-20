package com.facebook.video.heroplayer.ipc;

import X.4YV;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SpatialAudioFocusParams.class */
public final class SpatialAudioFocusParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(12);
    public final double A00;
    public final double A01;
    public final boolean A02;

    public SpatialAudioFocusParams(Parcel parcel) {
        this.A02 = 4YV.A1U(parcel.readByte());
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
    }
}
