package com.facebook.payments.p2p.service.model.transactions;

import X.EOe;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: FetchMoreTransactionsParams.class */
public final class FetchMoreTransactionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(26);
    public final long A00;
    public final EOe A01;

    public FetchMoreTransactionsParams(EOe eOe, long j) {
        boolean z = true;
        eOe.getClass();
        Preconditions.checkArgument(j <= 0 ? false : z);
        this.A01 = eOe;
        this.A00 = j;
    }

    public FetchMoreTransactionsParams(Parcel parcel) {
        this.A01 = parcel.readSerializable();
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("transactionsQueryType", this.A01);
        stringHelper.add("endTimeSeconds", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A01);
        parcel.writeLong(this.A00);
    }
}
