package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PriceSelectorPercentageAmountModel.class */
public final class PriceSelectorPercentageAmountModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(88);
    public final String A00;

    public PriceSelectorPercentageAmountModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public PriceSelectorPercentageAmountModel(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PriceSelectorPercentageAmountModel) && 11T.A0O(this.A00, ((PriceSelectorPercentageAmountModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
