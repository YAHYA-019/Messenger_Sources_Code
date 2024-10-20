package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: PriceListItem.class */
public final class PriceListItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(85);
    public final CheckoutItem A00;
    public final CurrencyAmount A01;
    public final String A02;
    public final String A03;

    public PriceListItem(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt() == 0 ? null : (CheckoutItem) CheckoutItem.CREATOR.createFromParcel(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (CurrencyAmount) parcel.readParcelable(A0e);
    }

    public PriceListItem(CheckoutItem checkoutItem, CurrencyAmount currencyAmount, String str, String str2) {
        this.A00 = checkoutItem;
        C1pq.A08("displayPrice", str);
        this.A02 = str;
        this.A03 = str2;
        C1pq.A08("price", currencyAmount);
        this.A01 = currencyAmount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PriceListItem)) {
                return false;
            }
            PriceListItem priceListItem = (PriceListItem) obj;
            if (!11T.A0O(this.A00, priceListItem.A00) || !11T.A0O(this.A02, priceListItem.A02) || !11T.A0O(this.A03, priceListItem.A03) || !11T.A0O(this.A01, priceListItem.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        CheckoutItem checkoutItem = this.A00;
        if (checkoutItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }
}
