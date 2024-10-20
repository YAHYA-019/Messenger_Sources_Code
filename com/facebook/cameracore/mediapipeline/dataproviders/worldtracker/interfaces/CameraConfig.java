package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CameraConfig.class */
public final class CameraConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(81);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public CameraConfig(double d, double d2, double d3, double d4, double d5) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        this.A03 = d4;
        this.A04 = d5;
    }

    public CameraConfig(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
    }
}
