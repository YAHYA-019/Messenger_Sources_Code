package com.facebook.camerarollprocessor.model;

import X.AbG;
import X.AbM;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Face.class */
public final class Face implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(86);
    public final float A00;
    public final float A01;
    public final float A02;

    public Face(float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public Face(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Face)) {
                return false;
            }
            Face face = (Face) obj;
            if (this.A00 != face.A00 || this.A01 != face.A01 || this.A02 != face.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
    }
}
