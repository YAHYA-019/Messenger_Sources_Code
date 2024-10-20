package com.facebook.payments.p2p.service.model.moneypenny;

import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MoneyPennyPlaceOrderResult.class */
public class MoneyPennyPlaceOrderResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(14);
    public final String mTransactionId;

    public MoneyPennyPlaceOrderResult() {
        this.mTransactionId = null;
    }

    public MoneyPennyPlaceOrderResult(Parcel parcel) {
        this.mTransactionId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTransactionId);
    }
}
