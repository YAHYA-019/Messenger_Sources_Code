package com.facebook.payments.p2p.service.model.transactions;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: DeclinePaymentParams.class */
public final class DeclinePaymentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(25);
    public final String A00;
    public final String A01;

    public DeclinePaymentParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public DeclinePaymentParams(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("recipientId", this.A01);
        return 4YV.A0s(stringHelper, this.A00, "mPaymentTransactionId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
