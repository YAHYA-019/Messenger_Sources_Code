package com.facebook.payments.p2p.service.model.transactions;

import X.EOe;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FetchTransactionListParams.class */
public final class FetchTransactionListParams implements Parcelable {
    public static final EOe A02 = EOe.A01;
    public static final Parcelable.Creator CREATOR = FKd.A00(29);
    public final int A00;
    public final EOe A01;

    public FetchTransactionListParams(EOe eOe, int i) {
        this.A01 = eOe;
        this.A00 = i;
    }

    public FetchTransactionListParams(Parcel parcel) {
        this.A01 = parcel.readSerializable();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("transactionsQueryType", this.A01);
        stringHelper.add("maxTransactionsToFetch", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A01);
        parcel.writeInt(this.A00);
    }
}
