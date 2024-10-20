package com.facebook.payments.cart.model;

import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: InvoiceConfirmationCreationConfig.class */
public final class InvoiceConfirmationCreationConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(46);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;

    public InvoiceConfirmationCreationConfig(CurrencyAmount currencyAmount, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = currencyAmount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
