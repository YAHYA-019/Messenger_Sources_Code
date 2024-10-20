package com.facebook.locationsharing.core.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PointOfInterest.class */
public final class PointOfInterest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(71);
    public final Location A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PointOfInterest(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0e);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
    }

    public PointOfInterest(Location location, String str, String str2, String str3, String str4) {
        C1pq.A08("fullAddress", str);
        this.A01 = str;
        C1pq.A08("location", location);
        this.A00 = location;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PointOfInterest)) {
                return false;
            }
            PointOfInterest pointOfInterest = (PointOfInterest) obj;
            if (!11T.A0O(this.A01, pointOfInterest.A01) || !11T.A0O(this.A00, pointOfInterest.A00) || !11T.A0O(this.A02, pointOfInterest.A02) || !11T.A0O(this.A03, pointOfInterest.A03) || !11T.A0O(this.A04, pointOfInterest.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
    }
}
