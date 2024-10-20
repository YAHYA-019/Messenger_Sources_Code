package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.2JX;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentsOrderDetails.class */
public final class PaymentsOrderDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(10);
    public final PaymentsSubscriptionOrderDetails A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final 2JX A05;
    public final String A06;
    public final String A07;

    public PaymentsOrderDetails(2JX r302, PaymentsSubscriptionOrderDetails paymentsSubscriptionOrderDetails, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A05 = r302;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A04 = str5;
        this.A00 = paymentsSubscriptionOrderDetails;
        this.A07 = str6;
    }

    public PaymentsOrderDetails(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PaymentsSubscriptionOrderDetails paymentsSubscriptionOrderDetails = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = FJ8.A01(parcel);
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
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (PaymentsSubscriptionOrderDetails) parcel.readParcelable(A0e) : paymentsSubscriptionOrderDetails;
        this.A07 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsOrderDetails)) {
                return false;
            }
            PaymentsOrderDetails paymentsOrderDetails = (PaymentsOrderDetails) obj;
            if (!11T.A0O(this.A01, paymentsOrderDetails.A01) || !11T.A0O(this.A05, paymentsOrderDetails.A05) || !11T.A0O(this.A02, paymentsOrderDetails.A02) || !11T.A0O(this.A03, paymentsOrderDetails.A03) || !11T.A0O(this.A06, paymentsOrderDetails.A06) || !11T.A0O(this.A04, paymentsOrderDetails.A04) || !11T.A0O(this.A00, paymentsOrderDetails.A00) || !11T.A0O(this.A07, paymentsOrderDetails.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A03(this.A01))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        DKH.A0y(parcel, this.A05);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A04);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A07);
    }
}
