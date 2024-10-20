package com.facebook.locationsharing.core.models;

import X.11T;
import X.4YV;
import X.AbF;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Place.class */
public final class Place implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(70);
    public final Location A00;
    public final String A01;
    public final String A02;

    public Place(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0e);
        this.A02 = parcel.readString();
    }

    public Place(Location location, String str, String str2) {
        AbF.A1T(str);
        this.A01 = str;
        C1pq.A08("location", location);
        this.A00 = location;
        AbF.A1U(str2);
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Place)) {
                return false;
            }
            Place place = (Place) obj;
            if (!11T.A0O(this.A01, place.A01) || !11T.A0O(this.A00, place.A00) || !11T.A0O(this.A02, place.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
