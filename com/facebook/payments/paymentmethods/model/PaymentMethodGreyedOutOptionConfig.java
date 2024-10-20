package com.facebook.payments.paymentmethods.model;

import X.11T;
import X.C1pq;
import X.DKF;
import X.DKI;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentMethodGreyedOutOptionConfig.class */
public final class PaymentMethodGreyedOutOptionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(64);
    public final Boolean A00;
    public final String A01;

    public PaymentMethodGreyedOutOptionConfig(Parcel parcel) {
        this.A00 = Boolean.valueOf(DKI.A0k(parcel, this));
        this.A01 = parcel.readString();
    }

    public PaymentMethodGreyedOutOptionConfig(String str, Boolean bool) {
        C1pq.A08("greyedOut", bool);
        this.A00 = bool;
        C1pq.A08("subtitle", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentMethodGreyedOutOptionConfig)) {
                return false;
            }
            PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig = (PaymentMethodGreyedOutOptionConfig) obj;
            if (!11T.A0O(this.A00, paymentMethodGreyedOutOptionConfig.A00) || !11T.A0O(this.A01, paymentMethodGreyedOutOptionConfig.A01)) {
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
        DKF.A1C(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
