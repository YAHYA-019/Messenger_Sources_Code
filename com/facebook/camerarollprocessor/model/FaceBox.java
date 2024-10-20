package com.facebook.camerarollprocessor.model;

import X.AbG;
import X.AbM;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FaceBox.class */
public final class FaceBox implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(87);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public FaceBox(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public FaceBox(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FaceBox)) {
                return false;
            }
            FaceBox faceBox = (FaceBox) obj;
            if (this.A00 != faceBox.A00 || this.A01 != faceBox.A01 || this.A02 != faceBox.A02 || this.A03 != faceBox.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }
}
