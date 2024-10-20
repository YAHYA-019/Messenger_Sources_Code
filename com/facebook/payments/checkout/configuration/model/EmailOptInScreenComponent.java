package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbN;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EmailOptInScreenComponent.class */
public final class EmailOptInScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(74);
    public final CheckoutEmailOptIn A00;
    public final String A01;
    public final boolean A02;

    public EmailOptInScreenComponent(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (CheckoutEmailOptIn) parcel.readParcelable(4YV.A0e(this));
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
    }

    public EmailOptInScreenComponent(CheckoutEmailOptIn checkoutEmailOptIn, String str, boolean z) {
        this.A00 = checkoutEmailOptIn;
        this.A02 = z;
        C1pq.A08("screenComponentType", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmailOptInScreenComponent)) {
                return false;
            }
            EmailOptInScreenComponent emailOptInScreenComponent = (EmailOptInScreenComponent) obj;
            if (!11T.A0O(this.A00, emailOptInScreenComponent.A00) || this.A02 != emailOptInScreenComponent.A02 || !11T.A0O(this.A01, emailOptInScreenComponent.A01)) {
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
