package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayPayPal.class */
public final class FbPayPayPal implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(19);
    public final FbPayPaymentDefaultInfo A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public FbPayPayPal(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A09 = AbJ.A1W(parcel);
        this.A00 = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0e) : fbPayPaymentDefaultInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayPayPal)) {
                return false;
            }
            FbPayPayPal fbPayPayPal = (FbPayPayPal) obj;
            if (!11T.A0O(this.A01, fbPayPayPal.A01) || !11T.A0O(this.A02, fbPayPayPal.A02) || this.A08 != fbPayPayPal.A08 || !11T.A0O(this.A03, fbPayPayPal.A03) || !11T.A0O(this.A04, fbPayPayPal.A04) || !11T.A0O(this.A05, fbPayPayPal.A05) || !11T.A0O(this.A06, fbPayPayPal.A06) || !11T.A0O(this.A07, fbPayPayPal.A07) || this.A09 != fbPayPayPal.A09 || !11T.A0O(this.A00, fbPayPayPal.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A01)), this.A08)))))), this.A09));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        C3o5.A0d(parcel, this.A00, i);
    }
}
