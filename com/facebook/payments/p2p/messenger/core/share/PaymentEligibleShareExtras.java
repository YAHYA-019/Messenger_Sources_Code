package com.facebook.payments.p2p.messenger.core.share;

import X.1BL;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.Amount;
import com.google.common.base.MoreObjects;

/* loaded from: PaymentEligibleShareExtras.class */
public final class PaymentEligibleShareExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(82);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Amount A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PaymentEligibleShareExtras(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = (Amount) 1BL.A0C(parcel, Amount.class);
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readLong();
    }

    public PaymentEligibleShareExtras(Amount amount, String str, String str2, String str3, int i, int i2, long j) {
        this.A01 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = amount;
        this.A04 = str3;
        this.A00 = i2;
        this.A02 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("maxRecipients", this.A01);
        stringHelper.add("shareCamption", this.A06);
        stringHelper.add("qpEntryPoint", this.A05);
        stringHelper.add("amount", this.A03);
        stringHelper.add("campaignName", this.A04);
        stringHelper.add("addCardFlowType", this.A00);
        stringHelper.add("incentivesTransferId", this.A02);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
    }
}
