package com.fbpay.hub.paymentmethods.api;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayPaymentDefaultInfo.class */
public final class FbPayPaymentDefaultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(20);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public FbPayPaymentDefaultInfo(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = 1BM.A07(parcel);
        this.A03 = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayPaymentDefaultInfo)) {
                return false;
            }
            FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = (FbPayPaymentDefaultInfo) obj;
            if (this.A00 != fbPayPaymentDefaultInfo.A00 || this.A01 != fbPayPaymentDefaultInfo.A01 || this.A02 != fbPayPaymentDefaultInfo.A02 || this.A03 != fbPayPaymentDefaultInfo.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
