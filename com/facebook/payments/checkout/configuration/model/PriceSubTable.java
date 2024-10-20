package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PriceSubTable.class */
public final class PriceSubTable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(89);
    public final ImmutableList A00;

    public PriceSubTable(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        PriceListItem[] priceListItemArr = new PriceListItem[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, priceListItemArr, i);
        }
        this.A00 = ImmutableList.copyOf(priceListItemArr);
    }

    public PriceSubTable(ImmutableList immutableList) {
        C1pq.A08("priceListItems", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PriceSubTable) && 11T.A0O(this.A00, ((PriceSubTable) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((PriceListItem) A0b.next(), i);
        }
    }
}
