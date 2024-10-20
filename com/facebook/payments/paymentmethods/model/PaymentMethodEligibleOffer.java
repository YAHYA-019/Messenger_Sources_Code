package com.facebook.payments.paymentmethods.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentMethodEligibleOffer.class */
public final class PaymentMethodEligibleOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(63);
    public final String A00;
    public final String A01;

    public PaymentMethodEligibleOffer(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public PaymentMethodEligibleOffer(String str, String str2) {
        AbF.A1T(str);
        this.A00 = str;
        AbF.A1V(str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentMethodEligibleOffer)) {
                return false;
            }
            PaymentMethodEligibleOffer paymentMethodEligibleOffer = (PaymentMethodEligibleOffer) obj;
            if (!11T.A0O(this.A00, paymentMethodEligibleOffer.A00) || !11T.A0O(this.A01, paymentMethodEligibleOffer.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
