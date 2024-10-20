package com.facebook.payments.p2p.service.model.moneypenny;

import X.1BL;
import X.4YV;
import X.DKF;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.base.MoreObjects;

/* loaded from: MoneyPennyPlaceOrderParams.class */
public final class MoneyPennyPlaceOrderParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(13);
    public String A00;
    public final long A01;
    public final long A02;
    public final CurrencyAmount A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public MoneyPennyPlaceOrderParams(Parcel parcel) {
        this.A03 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A06 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("amount", DKF.A0t(this.A03));
        stringHelper.add("userCredential", this.A05);
        stringHelper.add("pin", this.A04);
        stringHelper.add("fingerprintNonce", this.A00);
        stringHelper.add("requestId", this.A02);
        stringHelper.add("itemId", this.A01);
        return 4YV.A0s(stringHelper, this.A06, "userId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A06);
    }
}
