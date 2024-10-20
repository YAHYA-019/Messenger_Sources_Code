package com.facebook.payments.p2p.service.model.transactions;

import X.AbN;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchMoreTransactionsResult.class */
public final class FetchMoreTransactionsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(27);
    public final ImmutableList A00;
    public final boolean A01;

    public FetchMoreTransactionsResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, PaymentTransaction.class);
        this.A01 = C53v.A0S(parcel);
    }

    public FetchMoreTransactionsResult(ImmutableList immutableList, boolean z) {
        this.A00 = immutableList;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
