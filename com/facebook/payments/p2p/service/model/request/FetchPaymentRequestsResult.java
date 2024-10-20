package com.facebook.payments.p2p.service.model.request;

import X.4YV;
import X.FJ8;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;

/* loaded from: FetchPaymentRequestsResult.class */
public final class FetchPaymentRequestsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(22);
    public final ArrayList A00;

    public FetchPaymentRequestsResult(Parcel parcel) {
        this.A00 = FJ8.A06(parcel);
    }

    public FetchPaymentRequestsResult(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A00, "paymentRequests");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0B(parcel, this.A00);
    }
}
