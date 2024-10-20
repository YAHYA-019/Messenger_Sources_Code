package com.facebook.payments.p2p.messenger.common.contactselector;

import X.11T;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentContactSelectorConfiguration.class */
public final class PaymentContactSelectorConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(79);
    public final String A00;
    public final boolean A01;

    public PaymentContactSelectorConfiguration(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = AbN.A1U(parcel);
    }

    public PaymentContactSelectorConfiguration(String str) {
        C1pq.A08("activityTitle", str);
        this.A00 = str;
        this.A01 = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentContactSelectorConfiguration)) {
                return false;
            }
            PaymentContactSelectorConfiguration paymentContactSelectorConfiguration = (PaymentContactSelectorConfiguration) obj;
            if (!11T.A0O(this.A00, paymentContactSelectorConfiguration.A00) || this.A01 != paymentContactSelectorConfiguration.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A03(this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
