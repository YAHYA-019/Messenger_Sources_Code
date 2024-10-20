package com.facebook.ipc.composer.model;

import X.AbG;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerLocation.class */
public final class ComposerLocation implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(38);
    public final double A00;
    public final double A01;
    public final float A02;
    public final long A03;

    public ComposerLocation(double d, double d2, float f, long j) {
        this.A02 = f;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = j;
    }

    public ComposerLocation(Parcel parcel) {
        AbG.A1X(this);
        this.A02 = parcel.readFloat();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A03 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerLocation)) {
                return false;
            }
            ComposerLocation composerLocation = (ComposerLocation) obj;
            if (this.A02 != composerLocation.A02 || this.A00 != composerLocation.A00 || this.A01 != composerLocation.A01 || this.A03 != composerLocation.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A00(this.A01, C1pq.A00(this.A00, Float.floatToIntBits(this.A02) + 31)), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeLong(this.A03);
    }
}
