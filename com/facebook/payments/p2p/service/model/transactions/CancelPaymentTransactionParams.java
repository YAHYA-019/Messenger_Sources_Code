package com.facebook.payments.p2p.service.model.transactions;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: CancelPaymentTransactionParams.class */
public final class CancelPaymentTransactionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(24);
    public final String A00;

    public CancelPaymentTransactionParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public CancelPaymentTransactionParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "paymentTransactionId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
