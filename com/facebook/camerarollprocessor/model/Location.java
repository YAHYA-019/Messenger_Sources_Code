package com.facebook.camerarollprocessor.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Location.class */
public final class Location implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(91);
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public Location(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readDouble();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A01 = parcel.readDouble();
        this.A04 = C3o5.A0O(parcel);
    }

    public Location(String str, String str2, String str3, double d, double d2) {
        this.A02 = str;
        this.A00 = d;
        this.A03 = str2;
        this.A01 = d2;
        this.A04 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            if (!11T.A0O(this.A02, location.A02) || this.A00 != location.A00 || !11T.A0O(this.A03, location.A03) || this.A01 != location.A01 || !11T.A0O(this.A04, location.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A00(this.A01, C1pq.A04(this.A03, C1pq.A00(this.A00, C1pq.A03(this.A02)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        parcel.writeDouble(this.A00);
        1BL.A13(parcel, this.A03);
        parcel.writeDouble(this.A01);
        1BL.A13(parcel, this.A04);
    }
}
