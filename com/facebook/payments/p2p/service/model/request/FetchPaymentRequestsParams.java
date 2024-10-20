package com.facebook.payments.p2p.service.model.request;

import X.4YV;
import X.EKm;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FetchPaymentRequestsParams.class */
public final class FetchPaymentRequestsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(21);
    public final EKm A00;

    public FetchPaymentRequestsParams(EKm eKm) {
        this.A00 = eKm;
    }

    public FetchPaymentRequestsParams(Parcel parcel) {
        this.A00 = parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "queryType");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }
}
