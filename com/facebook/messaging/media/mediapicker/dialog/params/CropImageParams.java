package com.facebook.messaging.media.mediapicker.dialog.params;

import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CropImageParams.class */
public final class CropImageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(22);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public CropImageParams(int i, int i2, int i3, int i4) {
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A01 = i2;
    }

    public CropImageParams(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
