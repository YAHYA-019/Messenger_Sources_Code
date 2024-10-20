package com.facebook.payments.confirmation;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKZ;
import X.ROT;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SubscriptionConfirmationViewParam.class */
public final class SubscriptionConfirmationViewParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(31);
    public final C2203Dgv A00;
    public final C2203Dgv A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public SubscriptionConfirmationViewParam(ROT rot) {
        this.A02 = rot.A02;
        this.A03 = rot.A03;
        this.A00 = rot.A00;
        this.A01 = rot.A01;
        this.A04 = rot.A04;
        this.A05 = rot.A05;
        this.A06 = rot.A06;
    }

    public SubscriptionConfirmationViewParam(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
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
            this.A00 = null;
        } else {
            this.A00 = (C2203Dgv) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (C2203Dgv) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SubscriptionConfirmationViewParam)) {
                return false;
            }
            SubscriptionConfirmationViewParam subscriptionConfirmationViewParam = (SubscriptionConfirmationViewParam) obj;
            if (!11T.A0O(this.A02, subscriptionConfirmationViewParam.A02) || !11T.A0O(this.A03, subscriptionConfirmationViewParam.A03) || !11T.A0O(this.A00, subscriptionConfirmationViewParam.A00) || !11T.A0O(this.A01, subscriptionConfirmationViewParam.A01) || !11T.A0O(this.A04, subscriptionConfirmationViewParam.A04) || !11T.A0O(this.A05, subscriptionConfirmationViewParam.A05) || !11T.A0O(this.A06, subscriptionConfirmationViewParam.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        DKH.A0y(parcel, this.A00);
        DKH.A0y(parcel, this.A01);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
    }
}
