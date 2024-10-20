package com.facebook.payments.p2p.service.model.transactions;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FetchTransactionPaymentCardParams.class */
public final class FetchTransactionPaymentCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(31);
    public final String A00;

    public FetchTransactionPaymentCardParams(Parcel parcel) {
        parcel.getClass();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "transactionId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
