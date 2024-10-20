package com.facebook.payments.p2p.service.model.cards;

import X.0Pz;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* loaded from: AddPaymentCardParams.class */
public final class AddPaymentCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(5);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public AddPaymentCardParams(Parcel parcel) {
        String readString = parcel.readString();
        A00(readString, "cardNumber");
        this.A04 = readString;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String readString2 = parcel.readString();
        A00(readString2, "securityCode");
        this.A0A = readString2;
        String readString3 = parcel.readString();
        A00(readString3, "billingZip");
        this.A03 = readString3;
        String readString4 = parcel.readString();
        A00(readString4, "billingCountry");
        this.A02 = readString4;
        String readString5 = parcel.readString();
        A00(readString5, "userId");
        this.A0B = readString5;
        String readString6 = parcel.readString();
        A00(readString6, "productType");
        this.A09 = readString6;
        this.A08 = parcel.readString();
        String readString7 = parcel.readString();
        A00(readString7, "platFormTrustToken");
        this.A07 = readString7;
        String readString8 = parcel.readString();
        A00(readString8, "creditCardNumberFirst6");
        this.A05 = readString8;
        String readString9 = parcel.readString();
        A00(readString9, "creditCardNumberLast4");
        this.A06 = readString9;
    }

    public AddPaymentCardParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2) {
        this.A04 = "$e2ee";
        this.A00 = i;
        this.A01 = i2;
        this.A0A = "$e2ee";
        this.A03 = str;
        this.A02 = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A08 = str5;
        this.A07 = str6;
        this.A05 = str7;
        this.A06 = str8;
    }

    public static void A00(String str, String str2) {
        Preconditions.checkNotNull(str, 0Pz.A0j("null ", str2, " when attempting to add a card"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("creditCardNumber", this.A04);
        stringHelper.add("month", this.A00);
        stringHelper.add("year", this.A01);
        stringHelper.add("csc", this.A0A);
        stringHelper.add(ServerW3CShippingAddressConstants.POSTAL_CODE, this.A03);
        stringHelper.add("country", this.A02);
        stringHelper.add("userid", this.A0B);
        stringHelper.add("productType", this.A09);
        stringHelper.add("productId", this.A08);
        stringHelper.add("platformTrustToken", this.A07);
        stringHelper.add("creditCardNumberFirst6", this.A05);
        return 4YV.A0s(stringHelper, this.A06, "creditCardNumberLast4");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }
}
