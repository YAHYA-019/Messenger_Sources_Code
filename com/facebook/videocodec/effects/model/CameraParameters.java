package com.facebook.videocodec.effects.model;

import X.11T;
import X.AbI;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CameraParameters.class */
public final class CameraParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(16);
    public final Integer A00;

    public CameraParameters(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : AbI.A0z(parcel);
    }

    public CameraParameters(Integer num) {
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CameraParameters) && 11T.A0O(this.A00, ((CameraParameters) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AbN.A01(parcel, this.A00));
    }
}
