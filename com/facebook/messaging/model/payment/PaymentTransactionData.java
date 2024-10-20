package com.facebook.messaging.model.payment;

import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentTransactionData.class */
public final class PaymentTransactionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(51);
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public PaymentTransactionData(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    public PaymentTransactionData(String str, String str2, int i, long j, long j2) {
        this.A04 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
