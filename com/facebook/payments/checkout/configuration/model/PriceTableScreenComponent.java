package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C2204Dgw;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKY;
import X.GMA;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PriceTableScreenComponent.class */
public final class PriceTableScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(90);
    public final GMA A00;
    public final C2204Dgw A01;
    public final PriceListItem A02;
    public final ImmutableList A03;
    public final boolean A04;
    public final String A05;

    public PriceTableScreenComponent(GMA gma, C2204Dgw c2204Dgw, PriceListItem priceListItem, ImmutableList immutableList, String str, boolean z) {
        this.A00 = gma;
        this.A01 = c2204Dgw;
        this.A03 = immutableList;
        this.A05 = str;
        this.A04 = z;
        this.A02 = priceListItem;
    }

    public PriceTableScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PriceListItem priceListItem = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (C2204Dgw) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt = parcel.readInt();
            PriceSubTable[] priceSubTableArr = new PriceSubTable[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, priceSubTableArr, i);
            }
            this.A03 = ImmutableList.copyOf(priceSubTableArr);
        }
        this.A05 = parcel.readString();
        this.A04 = DKH.A1W(parcel);
        this.A02 = parcel.readInt() != 0 ? (PriceListItem) parcel.readParcelable(A0e) : priceListItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PriceTableScreenComponent)) {
                return false;
            }
            PriceTableScreenComponent priceTableScreenComponent = (PriceTableScreenComponent) obj;
            if (!11T.A0O(this.A00, priceTableScreenComponent.A00) || !11T.A0O(this.A01, priceTableScreenComponent.A01) || !11T.A0O(this.A03, priceTableScreenComponent.A03) || !11T.A0O(this.A05, priceTableScreenComponent.A05) || this.A04 != priceTableScreenComponent.A04 || !11T.A0O(this.A02, priceTableScreenComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A00);
        DKH.A0y(parcel, this.A01);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((PriceSubTable) A0Y.next(), i);
            }
        }
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04 ? 1 : 0);
        C3o5.A0d(parcel, this.A02, i);
    }
}
