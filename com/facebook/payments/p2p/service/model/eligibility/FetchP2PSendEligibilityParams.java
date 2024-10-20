package com.facebook.payments.p2p.service.model.eligibility;

import X.1He;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.google.common.base.MoreObjects;

/* loaded from: FetchP2PSendEligibilityParams.class */
public final class FetchP2PSendEligibilityParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(11);
    public final 1He A00;
    public final String A01;

    public FetchP2PSendEligibilityParams(Parcel parcel) {
        this.A00 = parcel.readSerializable();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("dataFreshnessParam", this.A00);
        return 4YV.A0s(stringHelper, this.A01, AsyncBroadcastReceiverObserver.RECEIVER);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A01);
    }
}
