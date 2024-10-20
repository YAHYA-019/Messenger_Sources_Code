package com.facebook.payments.checkout.model;

import X.11T;
import X.4YW;
import X.7zU;
import X.C1pq;
import X.DKH;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SelectedPaymentMethodInput.class */
public final class SelectedPaymentMethodInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(16);
    public final String A00;
    public final String A01;

    public SelectedPaymentMethodInput(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = DKH.A0l(parcel);
    }

    public SelectedPaymentMethodInput(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SelectedPaymentMethodInput)) {
                return false;
            }
            SelectedPaymentMethodInput selectedPaymentMethodInput = (SelectedPaymentMethodInput) obj;
            if (!11T.A0O(this.A00, selectedPaymentMethodInput.A00) || !11T.A0O(this.A01, selectedPaymentMethodInput.A01)) {
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
        4YW.A0E(parcel, this.A01);
    }
}
