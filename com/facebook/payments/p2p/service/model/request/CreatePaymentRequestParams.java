package com.facebook.payments.p2p.service.model.request;

import X.1BL;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.MoreObjects;

/* loaded from: CreatePaymentRequestParams.class */
public final class CreatePaymentRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(18);
    public final MediaResource A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public CreatePaymentRequestParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("amount", this.A01);
        stringHelper.add("offlineThreadingId", this.A05);
        stringHelper.add("requesteeId", this.A06);
        stringHelper.add("memoText", this.A04);
        stringHelper.add("groupThreadId", this.A03);
        stringHelper.add("themeId", this.A07);
        stringHelper.add("themeKey", this.A08);
        stringHelper.add("giftWrapName", this.A02);
        return 4YV.A0s(stringHelper, this.A00, "mediaResource");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
