package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: PriceSelectorFixedAmountModel.class */
public final class PriceSelectorFixedAmountModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(87);
    public final CurrencyAmount A00;

    public PriceSelectorFixedAmountModel(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (CurrencyAmount) parcel.readParcelable(4YV.A0e(this));
    }

    public PriceSelectorFixedAmountModel(CurrencyAmount currencyAmount) {
        this.A00 = currencyAmount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PriceSelectorFixedAmountModel) && 11T.A0O(this.A00, ((PriceSelectorFixedAmountModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A00, i);
    }
}
