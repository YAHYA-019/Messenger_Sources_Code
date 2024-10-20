package com.facebook.locationsharing.core.models;

import X.11T;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Address.class */
public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(65);
    public final Location A00;
    public final String A01;
    public final boolean A02;

    public Address(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0e);
    }

    public Address(Location location, String str, boolean z) {
        this.A02 = z;
        C1pq.A08("localizedAddress", str);
        this.A01 = str;
        C1pq.A08("location", location);
        this.A00 = location;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            if (this.A02 != address.A02 || !11T.A0O(this.A01, address.A01) || !11T.A0O(this.A00, address.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A05(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
