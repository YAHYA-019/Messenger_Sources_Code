package com.facebook.camerarollprocessor.model;

import X.AbG;
import X.AbM;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Dof.class */
public final class Dof implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(84);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public Dof(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
    }

    public Dof(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A05 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dof)) {
                return false;
            }
            Dof dof = (Dof) obj;
            if (this.A00 != dof.A00 || this.A01 != dof.A01 || this.A02 != dof.A02 || this.A03 != dof.A03 || this.A04 != dof.A04 || this.A05 != dof.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
    }
}
