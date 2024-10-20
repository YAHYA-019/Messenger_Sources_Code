package com.facebook.spherical.video.model;

import X.AbG;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: KeyframeParams.class */
public final class KeyframeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(33);
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public KeyframeParams(int i, long j, int i2) {
        this.A00 = 0.0f;
        this.A01 = i;
        this.A03 = j;
        this.A02 = i2;
    }

    public KeyframeParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof KeyframeParams)) {
                return false;
            }
            KeyframeParams keyframeParams = (KeyframeParams) obj;
            if (this.A00 != keyframeParams.A00 || this.A01 != keyframeParams.A01 || this.A03 != keyframeParams.A03 || this.A02 != keyframeParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A01(((Float.floatToIntBits(this.A00) + 31) * 31) + this.A01, this.A03) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
    }
}
