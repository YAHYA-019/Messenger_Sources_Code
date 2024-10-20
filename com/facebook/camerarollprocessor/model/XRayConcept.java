package com.facebook.camerarollprocessor.model;

import X.11T;
import X.AbM;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: XRayConcept.class */
public final class XRayConcept implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(93);
    public final float A00;
    public final int A01;
    public final String A02;

    public XRayConcept(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readFloat();
    }

    public XRayConcept(String str, int i, float f) {
        this.A01 = i;
        C1pq.A08("conceptName", str);
        this.A02 = str;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof XRayConcept)) {
                return false;
            }
            XRayConcept xRayConcept = (XRayConcept) obj;
            if (this.A01 != xRayConcept.A01 || !11T.A0O(this.A02, xRayConcept.A02) || this.A00 != xRayConcept.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(C1pq.A04(this.A02, this.A01 + 31), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeFloat(this.A00);
    }
}
