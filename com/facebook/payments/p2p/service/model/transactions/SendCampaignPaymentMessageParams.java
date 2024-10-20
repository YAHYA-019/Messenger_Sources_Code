package com.facebook.payments.p2p.service.model.transactions;

import X.4YV;
import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;

/* loaded from: SendCampaignPaymentMessageParams.class */
public final class SendCampaignPaymentMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(34);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SendCampaignPaymentMessageParams(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, Long.class);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("recipientIds", this.A00);
        stringHelper.add("campaignName", this.A01);
        stringHelper.add("externalRequestId", this.A02);
        return 4YV.A0s(stringHelper, this.A03, "message");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
