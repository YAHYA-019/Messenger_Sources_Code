package com.facebook.payments.p2p.service.model.request;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: DeclinePaymentRequestParams.class */
public final class DeclinePaymentRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(19);
    public final String A00;

    public DeclinePaymentRequestParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public DeclinePaymentRequestParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "requestId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
