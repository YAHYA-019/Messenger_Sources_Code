package com.facebook.payments.invoice.protocol;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zN;
import X.AbG;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.ER6;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InvoiceConfigParams.class */
public final class InvoiceConfigParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(60);
    public final long A00;
    public final ER6 A01;
    public final String A02;

    public InvoiceConfigParams(ER6 er6, long j) {
        this.A00 = j;
        C1pq.A08("paymentModulesClient", er6);
        this.A01 = er6;
        this.A02 = null;
    }

    public InvoiceConfigParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A01 = ER6.values()[parcel.readInt()];
        this.A02 = DKH.A0l(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InvoiceConfigParams)) {
                return false;
            }
            InvoiceConfigParams invoiceConfigParams = (InvoiceConfigParams) obj;
            if (this.A00 != invoiceConfigParams.A00 || this.A01 != invoiceConfigParams.A01 || !11T.A0O(this.A02, invoiceConfigParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A01 = 1BL.A01(this.A00) + 31;
        return C1pq.A04(this.A02, (A01 * 31) + C3o5.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        7zN.A0z(parcel, this.A01);
        4YW.A0E(parcel, this.A02);
    }
}
