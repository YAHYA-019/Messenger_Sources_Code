package com.facebook.media.model.features;

import X.11T;
import X.AbF;
import X.AbG;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: XRayConcept.class */
public final class XRayConcept implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(77);
    public final float A00;
    public final String A01;

    public XRayConcept(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readString();
    }

    public XRayConcept(String str, float f) {
        this.A00 = f;
        AbF.A1U(str);
        this.A01 = str;
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
            if (this.A00 != xRayConcept.A00 || !11T.A0O(this.A01, xRayConcept.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, Float.floatToIntBits(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A01);
    }
}
