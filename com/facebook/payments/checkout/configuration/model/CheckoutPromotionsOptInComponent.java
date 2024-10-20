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

/* loaded from: CheckoutPromotionsOptInComponent.class */
public final class CheckoutPromotionsOptInComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(65);
    public final C2203Dgv A00;
    public final String A01;

    public CheckoutPromotionsOptInComponent(C2203Dgv c2203Dgv, String str) {
        this.A00 = c2203Dgv;
        this.A01 = str;
    }

    public CheckoutPromotionsOptInComponent(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? (C2203Dgv) FJ8.A01(parcel) : null;
        this.A01 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutPromotionsOptInComponent)) {
                return false;
            }
            CheckoutPromotionsOptInComponent checkoutPromotionsOptInComponent = (CheckoutPromotionsOptInComponent) obj;
            if (!11T.A0O(this.A00, checkoutPromotionsOptInComponent.A00) || !11T.A0O(this.A01, checkoutPromotionsOptInComponent.A01)) {
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
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
