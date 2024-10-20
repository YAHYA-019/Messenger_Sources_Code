package com.facebook.payments.auth.pin.model;

import X.AbM;
import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: DeletePaymentPinParams.class */
public final class DeletePaymentPinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(36);
    public final long A00;
    public final String A01;
    public final boolean A02;

    public DeletePaymentPinParams(long j, String str) {
        AbM.A1T(str);
        this.A01 = str;
        this.A00 = j;
        this.A02 = false;
    }

    public DeletePaymentPinParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A02 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("pinOrPassword", this.A01);
        stringHelper.add("pinId", this.A00);
        stringHelper.add("isPin", this.A02);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
