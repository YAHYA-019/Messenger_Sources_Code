package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutTermsAndPolicies.class */
public final class CheckoutTermsAndPolicies implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(66);
    public final C2203Dgv A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public CheckoutTermsAndPolicies(C2203Dgv c2203Dgv, ImmutableList immutableList, String str, String str2) {
        this.A01 = immutableList;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = c2203Dgv;
    }

    public CheckoutTermsAndPolicies(Parcel parcel) {
        C2203Dgv c2203Dgv = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = FJ8.A02(parcel);
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
        this.A00 = parcel.readInt() != 0 ? (C2203Dgv) FJ8.A01(parcel) : c2203Dgv;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutTermsAndPolicies)) {
                return false;
            }
            CheckoutTermsAndPolicies checkoutTermsAndPolicies = (CheckoutTermsAndPolicies) obj;
            if (!11T.A0O(this.A01, checkoutTermsAndPolicies.A01) || !11T.A0O(this.A02, checkoutTermsAndPolicies.A02) || !11T.A0O(this.A03, checkoutTermsAndPolicies.A03) || !11T.A0O(this.A00, checkoutTermsAndPolicies.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0B(parcel, immutableList);
        }
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        DKH.A0y(parcel, this.A00);
    }
}
