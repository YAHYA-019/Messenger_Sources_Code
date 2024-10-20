package com.facebook.payments.invoice.protocol;

import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InvoiceCartScreenConfigFetchParams.class */
public final class InvoiceCartScreenConfigFetchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(59);
    public final long A00;

    public InvoiceCartScreenConfigFetchParams(long j) {
        this.A00 = j;
    }

    public InvoiceCartScreenConfigFetchParams(Parcel parcel) {
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }
}
