package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ProductItemProfileAudience.class */
public final class ProductItemProfileAudience implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(8);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public ProductItemProfileAudience(Parcel parcel) {
        int i = 0;
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            while (i < readInt2) {
                i = AbH.A00(parcel, strArr2, i);
            }
            immutableList = ImmutableList.copyOf(strArr2);
        }
        this.A01 = immutableList;
        this.A03 = C3o5.A0O(parcel);
    }

    public ProductItemProfileAudience(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        this.A00 = immutableList;
        this.A02 = str;
        this.A01 = immutableList2;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemProfileAudience)) {
                return false;
            }
            ProductItemProfileAudience productItemProfileAudience = (ProductItemProfileAudience) obj;
            if (!11T.A0O(this.A00, productItemProfileAudience.A00) || !11T.A0O(this.A02, productItemProfileAudience.A02) || !11T.A0O(this.A01, productItemProfileAudience.A01) || !11T.A0O(this.A03, productItemProfileAudience.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A02);
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A03);
    }
}
