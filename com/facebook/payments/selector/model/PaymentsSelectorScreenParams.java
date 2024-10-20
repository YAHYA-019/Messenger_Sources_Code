package com.facebook.payments.selector.model;

import X.1BL;
import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentsSelectorScreenParams.class */
public final class PaymentsSelectorScreenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(87);
    public final PaymentsDecoratorParams A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public PaymentsSelectorScreenParams(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = AbN.A0e(parcel, SelectorRow.class);
        this.A00 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A02 = parcel.readString();
    }

    public PaymentsSelectorScreenParams(PaymentsDecoratorParams paymentsDecoratorParams, ImmutableList immutableList, String str, String str2) {
        this.A03 = str;
        this.A01 = immutableList;
        this.A00 = paymentsDecoratorParams;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
