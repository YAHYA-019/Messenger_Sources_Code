package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutGreyedOutBanner.class */
public final class CheckoutGreyedOutBanner implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(57);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CheckoutGreyedOutBanner(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public CheckoutGreyedOutBanner(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutGreyedOutBanner)) {
                return false;
            }
            CheckoutGreyedOutBanner checkoutGreyedOutBanner = (CheckoutGreyedOutBanner) obj;
            if (!11T.A0O(this.A00, checkoutGreyedOutBanner.A00) || !11T.A0O(this.A01, checkoutGreyedOutBanner.A01) || !11T.A0O(this.A02, checkoutGreyedOutBanner.A02) || !11T.A0O(this.A03, checkoutGreyedOutBanner.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
