package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutEntityScreenComponent.class */
public final class CheckoutEntityScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(56);
    public final CheckoutGreyedOutBanner A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C2203Dgv A05;
    public final String A06;

    public CheckoutEntityScreenComponent(C2203Dgv c2203Dgv, CheckoutGreyedOutBanner checkoutGreyedOutBanner, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A05 = c2203Dgv;
        this.A00 = checkoutGreyedOutBanner;
        this.A02 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public CheckoutEntityScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (C2203Dgv) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CheckoutGreyedOutBanner) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = parcel.readString();
        this.A03 = C3o5.A0O(parcel);
        this.A04 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutEntityScreenComponent)) {
                return false;
            }
            CheckoutEntityScreenComponent checkoutEntityScreenComponent = (CheckoutEntityScreenComponent) obj;
            if (!11T.A0O(this.A01, checkoutEntityScreenComponent.A01) || !11T.A0O(this.A05, checkoutEntityScreenComponent.A05) || !11T.A0O(this.A00, checkoutEntityScreenComponent.A00) || !11T.A0O(this.A02, checkoutEntityScreenComponent.A02) || !11T.A0O(this.A06, checkoutEntityScreenComponent.A06) || !11T.A0O(this.A03, checkoutEntityScreenComponent.A03) || !11T.A0O(this.A04, checkoutEntityScreenComponent.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A03(this.A01)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        DKH.A0y(parcel, this.A05);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
    }
}
