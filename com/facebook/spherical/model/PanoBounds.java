package com.facebook.spherical.model;

import X.AbG;
import X.AbM;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PanoBounds.class */
public final class PanoBounds implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(28);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public PanoBounds() {
        this.A02 = -85.0f;
        this.A00 = -85.0f;
        this.A01 = 85.0f;
        this.A03 = 85.0f;
    }

    public PanoBounds(Parcel parcel) {
        AbG.A1X(this);
        this.A02 = parcel.readFloat();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A03 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PanoBounds)) {
                return false;
            }
            PanoBounds panoBounds = (PanoBounds) obj;
            if (this.A02 != panoBounds.A02 || this.A00 != panoBounds.A00 || this.A01 != panoBounds.A01 || this.A03 != panoBounds.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A02) + 31, this.A00), this.A01), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
    }
}
