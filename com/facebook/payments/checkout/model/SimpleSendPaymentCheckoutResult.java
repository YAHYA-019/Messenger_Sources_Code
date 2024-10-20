package com.facebook.payments.checkout.model;

import X.1BL;
import X.24X;
import X.C53v;
import X.DKH;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SimpleSendPaymentCheckoutResult.class */
public final class SimpleSendPaymentCheckoutResult implements SendPaymentCheckoutResult {
    public static final Parcelable.Creator CREATOR = FKZ.A00(18);
    public final PaymentsOrderDetails A00;
    public final 24X A01;
    public final String A02;

    public SimpleSendPaymentCheckoutResult(Parcel parcel) {
        24X r303;
        this.A02 = parcel.readString();
        this.A00 = (PaymentsOrderDetails) 1BL.A0C(parcel, PaymentsOrderDetails.class);
        try {
            r303 = DKH.A0c(parcel);
        } catch (Exception unused) {
            r303 = null;
        }
        this.A01 = r303;
    }

    public SimpleSendPaymentCheckoutResult(PaymentsOrderDetails paymentsOrderDetails, 24X r303, String str) {
        this.A02 = str;
        this.A00 = paymentsOrderDetails;
        this.A01 = r303;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        C53v.A0A(parcel, this.A01);
    }
}
