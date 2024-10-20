package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProductItemNearbyLocations.class */
public final class ProductItemNearbyLocations implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(6);
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ProductItemNearbyLocations(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A03 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = parcel.readDouble();
        this.A06 = parcel.readString();
    }

    public ProductItemNearbyLocations(String str, String str2, String str3, String str4, String str5, double d, double d2) {
        C1pq.A08("address", str);
        this.A02 = str;
        C1pq.A08("imageURL", str2);
        this.A03 = str2;
        this.A00 = d;
        C1pq.A08("locationPageId", str3);
        this.A04 = str3;
        C1pq.A08("locationType", str4);
        this.A05 = str4;
        this.A01 = d2;
        AbF.A1U(str5);
        this.A06 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemNearbyLocations)) {
                return false;
            }
            ProductItemNearbyLocations productItemNearbyLocations = (ProductItemNearbyLocations) obj;
            if (!11T.A0O(this.A02, productItemNearbyLocations.A02) || !11T.A0O(this.A03, productItemNearbyLocations.A03) || this.A00 != productItemNearbyLocations.A00 || !11T.A0O(this.A04, productItemNearbyLocations.A04) || !11T.A0O(this.A05, productItemNearbyLocations.A05) || this.A01 != productItemNearbyLocations.A01 || !11T.A0O(this.A06, productItemNearbyLocations.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A00(this.A01, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A00(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A01);
        parcel.writeString(this.A06);
    }
}
