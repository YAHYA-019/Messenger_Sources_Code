package com.facebook.camerarollprocessor.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FacePose.class */
public final class FacePose implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(88);
    public final float A00;
    public final Dof A01;
    public final EulerAngle A02;
    public final FaceBox A03;

    public FacePose(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readFloat();
        FaceBox faceBox = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Dof) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (EulerAngle) parcel.readParcelable(A0e);
        }
        this.A03 = parcel.readInt() != 0 ? (FaceBox) parcel.readParcelable(A0e) : faceBox;
    }

    public FacePose(Dof dof, EulerAngle eulerAngle, FaceBox faceBox, float f) {
        this.A00 = f;
        this.A01 = dof;
        this.A02 = eulerAngle;
        this.A03 = faceBox;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FacePose)) {
                return false;
            }
            FacePose facePose = (FacePose) obj;
            if (this.A00 != facePose.A00 || !11T.A0O(this.A01, facePose.A01) || !11T.A0O(this.A02, facePose.A02) || !11T.A0O(this.A03, facePose.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, Float.floatToIntBits(this.A00) + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A03, i);
    }
}
