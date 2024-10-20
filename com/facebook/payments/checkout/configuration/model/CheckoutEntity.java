package com.facebook.payments.checkout.configuration.model;

import X.1BL;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutEntity.class */
public final class CheckoutEntity implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(55);
    public final PaymentParticipant A00;
    public final String A01;

    public CheckoutEntity(Parcel parcel) {
        this.A00 = (PaymentParticipant) 1BL.A0C(parcel, PaymentParticipant.class);
        this.A01 = parcel.readString();
    }

    public CheckoutEntity(PaymentParticipant paymentParticipant, String str) {
        this.A00 = paymentParticipant;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
