package com.facebook.payments.receipt.model;

import X.1BL;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;

/* loaded from: ReceiptCommonParams.class */
public final class ReceiptCommonParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(82);
    public final PaymentsDecoratorParams A00;
    public final ReceiptComponentControllerParams A01;
    public final String A02;

    public ReceiptCommonParams(Parcel parcel) {
        this.A01 = (ReceiptComponentControllerParams) 1BL.A0C(parcel, ReceiptComponentControllerParams.class);
        this.A00 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A02 = parcel.readString();
    }

    public ReceiptCommonParams(PaymentsDecoratorParams paymentsDecoratorParams, ReceiptComponentControllerParams receiptComponentControllerParams, String str) {
        this.A01 = receiptComponentControllerParams;
        this.A00 = paymentsDecoratorParams;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
