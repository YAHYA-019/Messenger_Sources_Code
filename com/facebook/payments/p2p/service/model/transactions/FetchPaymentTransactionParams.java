package com.facebook.payments.p2p.service.model.transactions;

import X.1He;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FetchPaymentTransactionParams.class */
public final class FetchPaymentTransactionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(28);
    public final 1He A00;
    public final String A01;

    public FetchPaymentTransactionParams(1He r302, String str) {
        str.getClass();
        this.A01 = str;
        this.A00 = r302;
    }

    public FetchPaymentTransactionParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("transactionId", this.A01);
        return 4YV.A0s(stringHelper, this.A00.toString(), "dataFreshnessParam");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A00);
    }
}
