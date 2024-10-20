package com.facebook.locationsharing.core.models;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PointOfInterestViewModel.class */
public final class PointOfInterestViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(72);
    public final double A00;
    public final double A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PointOfInterestViewModel(Parcel parcel) {
        getClass().getClassLoader();
        this.A02 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public PointOfInterestViewModel(String str, String str2, String str3, String str4, double d, double d2, long j) {
        this.A02 = j;
        C1pq.A08("fullAddress", str);
        this.A03 = str;
        this.A00 = d;
        this.A01 = d2;
        this.A06 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PointOfInterestViewModel)) {
                return false;
            }
            PointOfInterestViewModel pointOfInterestViewModel = (PointOfInterestViewModel) obj;
            if (this.A02 != pointOfInterestViewModel.A02 || !11T.A0O(this.A03, pointOfInterestViewModel.A03) || this.A00 != pointOfInterestViewModel.A00 || this.A01 != pointOfInterestViewModel.A01 || !11T.A0O(this.A06, pointOfInterestViewModel.A06) || !11T.A0O(this.A04, pointOfInterestViewModel.A04) || !11T.A0O(this.A05, pointOfInterestViewModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A00(this.A01, C1pq.A00(this.A00, C1pq.A04(this.A03, 1BL.A01(this.A02) + 31))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeString(this.A03);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
