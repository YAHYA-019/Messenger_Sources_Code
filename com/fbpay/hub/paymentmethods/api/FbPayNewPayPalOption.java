package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayNewPayPalOption.class */
public final class FbPayNewPayPalOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(18);
    public final String A00;
    public final String A01;

    public FbPayNewPayPalOption() {
        this.A00 = null;
        this.A01 = null;
    }

    public FbPayNewPayPalOption(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayNewPayPalOption)) {
                return false;
            }
            FbPayNewPayPalOption fbPayNewPayPalOption = (FbPayNewPayPalOption) obj;
            if (!11T.A0O(this.A00, fbPayNewPayPalOption.A00) || !11T.A0O(this.A01, fbPayNewPayPalOption.A01)) {
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
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
