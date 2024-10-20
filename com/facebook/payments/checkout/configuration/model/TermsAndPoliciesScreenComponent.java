package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbN;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TermsAndPoliciesScreenComponent.class */
public final class TermsAndPoliciesScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(94);
    public final CheckoutTermsAndPolicies A00;
    public final String A01;
    public final boolean A02;

    public TermsAndPoliciesScreenComponent(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (CheckoutTermsAndPolicies) parcel.readParcelable(4YV.A0e(this));
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
    }

    public TermsAndPoliciesScreenComponent(CheckoutTermsAndPolicies checkoutTermsAndPolicies, String str, boolean z) {
        this.A00 = checkoutTermsAndPolicies;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TermsAndPoliciesScreenComponent)) {
                return false;
            }
            TermsAndPoliciesScreenComponent termsAndPoliciesScreenComponent = (TermsAndPoliciesScreenComponent) obj;
            if (!11T.A0O(this.A00, termsAndPoliciesScreenComponent.A00) || this.A02 != termsAndPoliciesScreenComponent.A02 || !11T.A0O(this.A01, termsAndPoliciesScreenComponent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
