package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.AbG;
import X.C1pq;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbPayBankAccount.class */
public final class FbPayBankAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(15);
    public final String A00;

    public FbPayBankAccount(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FbPayBankAccount) && 11T.A0O(this.A00, ((FbPayBankAccount) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
