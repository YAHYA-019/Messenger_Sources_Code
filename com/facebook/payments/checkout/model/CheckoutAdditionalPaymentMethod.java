package com.facebook.payments.checkout.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.paymentmethods.model.PaymentMethod;

/* loaded from: CheckoutAdditionalPaymentMethod.class */
public final class CheckoutAdditionalPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(1);
    public final CurrencyAmount A00;
    public final PaymentMethod A01;

    public CheckoutAdditionalPaymentMethod(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = (CurrencyAmount) parcel.readParcelable(A0e);
        this.A01 = (PaymentMethod) parcel.readParcelable(A0e);
    }

    public CheckoutAdditionalPaymentMethod(CurrencyAmount currencyAmount, PaymentMethod paymentMethod) {
        this.A00 = currencyAmount;
        C1pq.A08("paymentMethod", paymentMethod);
        this.A01 = paymentMethod;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutAdditionalPaymentMethod)) {
                return false;
            }
            CheckoutAdditionalPaymentMethod checkoutAdditionalPaymentMethod = (CheckoutAdditionalPaymentMethod) obj;
            if (!11T.A0O(this.A00, checkoutAdditionalPaymentMethod.A00) || !11T.A0O(this.A01, checkoutAdditionalPaymentMethod.A01)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
