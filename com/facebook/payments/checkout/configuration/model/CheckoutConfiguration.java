package com.facebook.payments.checkout.configuration.model;

import X.1BL;
import X.C53v;
import X.FKY;
import X.Qun;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutConfiguration.class */
public final class CheckoutConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(51);
    public final CheckoutContentConfiguration A00;
    public final CheckoutPaymentInfo A01;
    public final Qun A02;
    public final String A03;

    public CheckoutConfiguration(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = (CheckoutPaymentInfo) 1BL.A0C(parcel, CheckoutPaymentInfo.class);
        this.A02 = C53v.A07(parcel, Qun.class);
        this.A00 = (CheckoutContentConfiguration) 1BL.A0C(parcel, CheckoutContentConfiguration.class);
    }

    public CheckoutConfiguration(CheckoutContentConfiguration checkoutContentConfiguration, CheckoutPaymentInfo checkoutPaymentInfo, Qun qun, String str) {
        this.A03 = str;
        this.A01 = checkoutPaymentInfo;
        this.A02 = qun;
        this.A00 = checkoutContentConfiguration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        C53v.A0J(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
