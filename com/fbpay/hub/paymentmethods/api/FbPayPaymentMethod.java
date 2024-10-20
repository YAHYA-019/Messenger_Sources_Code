package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayPaymentMethod.class */
public final class FbPayPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(21);
    public final Uri A00;
    public final FbPayCreditCard A01;
    public final int A02;
    public final FbPayBankAccount A03;
    public final FbPayNewCreditCardOption A04;
    public final FbPayNewPayPalOption A05;
    public final FbPayPayPal A06;
    public final FbPayShopPay A07;
    public final String A08;
    public final String A09;

    public FbPayPaymentMethod(Uri uri, FbPayCreditCard fbPayCreditCard, String str, String str2) {
        this.A03 = null;
        this.A01 = fbPayCreditCard;
        this.A06 = null;
        this.A07 = null;
        this.A00 = uri;
        this.A04 = null;
        this.A05 = null;
        this.A08 = str;
        this.A09 = str2;
        this.A02 = 0;
    }

    public FbPayPaymentMethod(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (FbPayBankAccount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (FbPayCreditCard) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (FbPayPayPal) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (FbPayShopPay) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FbPayNewCreditCardOption) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbPayNewPayPalOption) parcel.readParcelable(A0e);
        }
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A09 = C3o5.A0O(parcel);
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayPaymentMethod)) {
                return false;
            }
            FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) obj;
            if (!11T.A0O(this.A03, fbPayPaymentMethod.A03) || !11T.A0O(this.A01, fbPayPaymentMethod.A01) || !11T.A0O(this.A06, fbPayPaymentMethod.A06) || !11T.A0O(this.A07, fbPayPaymentMethod.A07) || !11T.A0O(this.A00, fbPayPaymentMethod.A00) || !11T.A0O(this.A04, fbPayPaymentMethod.A04) || !11T.A0O(this.A05, fbPayPaymentMethod.A05) || !11T.A0O(this.A08, fbPayPaymentMethod.A08) || !11T.A0O(this.A09, fbPayPaymentMethod.A09) || this.A02 != fbPayPaymentMethod.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A03(this.A03))))))))) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A06, i);
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeInt(this.A02);
    }
}
