package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.7zO;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProductItemVariant.class */
public final class ProductItemVariant implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(9);
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    public ProductItemVariant(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = 7zO.A0j(parcel);
        }
        this.A00 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
    }

    public ProductItemVariant(Integer num, Long l, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = l;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemVariant)) {
                return false;
            }
            ProductItemVariant productItemVariant = (ProductItemVariant) obj;
            if (!11T.A0O(this.A02, productItemVariant.A02) || !11T.A0O(this.A03, productItemVariant.A03) || !11T.A0O(this.A01, productItemVariant.A01) || !11T.A0O(this.A00, productItemVariant.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A02))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C3o5.A0g(parcel, this.A01);
        C3o5.A0f(parcel, this.A00);
    }
}
