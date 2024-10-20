package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbG;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProductItemPlace.class */
public final class ProductItemPlace implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(7);
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;

    public ProductItemPlace(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readDouble();
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A01 = parcel.readDouble();
        this.A03 = C3o5.A0O(parcel);
    }

    public ProductItemPlace(String str, String str2, double d, double d2) {
        this.A00 = d;
        this.A02 = str;
        this.A01 = d2;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemPlace)) {
                return false;
            }
            ProductItemPlace productItemPlace = (ProductItemPlace) obj;
            if (this.A00 != productItemPlace.A00 || !11T.A0O(this.A02, productItemPlace.A02) || this.A01 != productItemPlace.A01 || !11T.A0O(this.A03, productItemPlace.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A00(this.A01, C1pq.A04(this.A02, C1pq.A00(this.A00, 1))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        1BL.A13(parcel, this.A02);
        parcel.writeDouble(this.A01);
        1BL.A13(parcel, this.A03);
    }
}
