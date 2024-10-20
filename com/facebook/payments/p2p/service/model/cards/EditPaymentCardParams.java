package com.facebook.payments.p2p.service.model.cards;

import X.0Pz;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: EditPaymentCardParams.class */
public final class EditPaymentCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(8);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public EditPaymentCardParams(Parcel parcel) {
        String readString = parcel.readString();
        Preconditions.checkNotNull(readString, 0Pz.A0j("null ", "credentialId", " when attempting to edit a card"));
        this.A03 = readString;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String readString2 = parcel.readString();
        Preconditions.checkNotNull(readString2, 0Pz.A0j("null ", "securityCode", " when attempting to edit a card"));
        this.A05 = readString2;
        this.A02 = parcel.readString();
        String readString3 = parcel.readString();
        Preconditions.checkNotNull(readString3, 0Pz.A0j("null ", "platformTrustToken", " when attempting to edit a card"));
        this.A04 = readString3;
    }

    public EditPaymentCardParams(String str, String str2, String str3, int i, int i2) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = "$e2ee";
        this.A02 = str2;
        this.A04 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("credentialId", this.A03);
        stringHelper.add("month", this.A00);
        stringHelper.add("year", this.A01);
        stringHelper.add("csc", this.A05);
        stringHelper.add(ServerW3CShippingAddressConstants.POSTAL_CODE, this.A02);
        return 4YV.A0s(stringHelper, this.A04, "platformTrustToken");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
