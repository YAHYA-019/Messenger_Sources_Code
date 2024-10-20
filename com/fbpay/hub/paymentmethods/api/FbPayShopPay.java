package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.AbG;
import X.AbN;
import X.C1pq;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayShopPay.class */
public final class FbPayShopPay implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(22);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public FbPayShopPay(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readString();
        this.A04 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayShopPay)) {
                return false;
            }
            FbPayShopPay fbPayShopPay = (FbPayShopPay) obj;
            if (this.A00 != fbPayShopPay.A00 || !11T.A0O(this.A01, fbPayShopPay.A01) || this.A04 != fbPayShopPay.A04 || !11T.A0O(this.A02, fbPayShopPay.A02) || !11T.A0O(this.A03, fbPayShopPay.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, 1BL.A01(this.A00) + 31), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
