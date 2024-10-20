package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutEmailOptIn.class */
public final class CheckoutEmailOptIn implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(54);
    public final C2203Dgv A00;
    public final String A01;
    public final boolean A02;

    public CheckoutEmailOptIn(C2203Dgv c2203Dgv, String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = c2203Dgv;
    }

    public CheckoutEmailOptIn(Parcel parcel) {
        C2203Dgv c2203Dgv = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = AbN.A1U(parcel);
        this.A00 = parcel.readInt() != 0 ? (C2203Dgv) FJ8.A01(parcel) : c2203Dgv;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutEmailOptIn)) {
                return false;
            }
            CheckoutEmailOptIn checkoutEmailOptIn = (CheckoutEmailOptIn) obj;
            if (!11T.A0O(this.A01, checkoutEmailOptIn.A01) || this.A02 != checkoutEmailOptIn.A02 || !11T.A0O(this.A00, checkoutEmailOptIn.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A03(this.A01), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        DKH.A0y(parcel, this.A00);
    }
}
