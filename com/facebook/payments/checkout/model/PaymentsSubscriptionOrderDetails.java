package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentsSubscriptionOrderDetails.class */
public final class PaymentsSubscriptionOrderDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(15);
    public final C2203Dgv A00;
    public final C2203Dgv A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PaymentsSubscriptionOrderDetails(C2203Dgv c2203Dgv, C2203Dgv c2203Dgv2, String str, String str2, String str3) {
        this.A00 = c2203Dgv;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c2203Dgv2;
        this.A04 = str3;
    }

    public PaymentsSubscriptionOrderDetails(Parcel parcel) {
        C2203Dgv c2203Dgv = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (C2203Dgv) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? (C2203Dgv) FJ8.A01(parcel) : c2203Dgv;
        this.A04 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsSubscriptionOrderDetails)) {
                return false;
            }
            PaymentsSubscriptionOrderDetails paymentsSubscriptionOrderDetails = (PaymentsSubscriptionOrderDetails) obj;
            if (!11T.A0O(this.A00, paymentsSubscriptionOrderDetails.A00) || !11T.A0O(this.A02, paymentsSubscriptionOrderDetails.A02) || !11T.A0O(this.A03, paymentsSubscriptionOrderDetails.A03) || !11T.A0O(this.A01, paymentsSubscriptionOrderDetails.A01) || !11T.A0O(this.A04, paymentsSubscriptionOrderDetails.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        DKH.A0y(parcel, this.A01);
        1BL.A13(parcel, this.A04);
    }
}
