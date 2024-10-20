package com.facebook.payments.p2p.service.model.transactions;

import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SendCampaignPaymentMessageResult.class */
public final class SendCampaignPaymentMessageResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(35);
    public final ImmutableList A00;

    public SendCampaignPaymentMessageResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, String.class);
    }

    public SendCampaignPaymentMessageResult(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
