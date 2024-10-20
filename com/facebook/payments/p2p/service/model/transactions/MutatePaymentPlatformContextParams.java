package com.facebook.payments.p2p.service.model.transactions;

import X.4YV;
import X.FKd;
import X.Qpl;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: MutatePaymentPlatformContextParams.class */
public final class MutatePaymentPlatformContextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(32);
    public final Qpl A00;
    public final String A01;

    public MutatePaymentPlatformContextParams(Parcel parcel) {
        this.A00 = parcel.readSerializable();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mutation", this.A00);
        return 4YV.A0s(stringHelper, this.A01, "platformContextId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A01);
    }
}
