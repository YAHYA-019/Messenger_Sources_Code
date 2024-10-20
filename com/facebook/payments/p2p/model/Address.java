package com.facebook.payments.p2p.model;

import X.4YV;
import X.DKD;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: Address.class */
public class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(84);
    public final String mPostalCode;

    public Address() {
        this.mPostalCode = null;
    }

    public Address(Parcel parcel) {
        this.mPostalCode = parcel.readString();
    }

    public Address(String str) {
        this.mPostalCode = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mPostalCode.equals(((Address) obj).mPostalCode);
    }

    public int hashCode() {
        return DKD.A04(this.mPostalCode);
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.mPostalCode, "postal_code");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPostalCode);
    }
}
