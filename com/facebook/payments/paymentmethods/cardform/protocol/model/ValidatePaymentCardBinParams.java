package com.facebook.payments.paymentmethods.cardform.protocol.model;

import X.1JF;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: ValidatePaymentCardBinParams.class */
public final class ValidatePaymentCardBinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(46);
    public final String A00;

    public ValidatePaymentCardBinParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public ValidatePaymentCardBinParams(String str) {
        boolean z = true;
        Preconditions.checkArgument(!1JF.A0B(str));
        Preconditions.checkArgument(str.length() != 6 ? false : z);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "paymentCardBin");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
