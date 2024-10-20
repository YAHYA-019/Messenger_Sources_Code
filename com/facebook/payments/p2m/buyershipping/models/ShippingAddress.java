package com.facebook.payments.p2m.buyershipping.models;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ShippingAddress.class */
public final class ShippingAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(69);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ShippingAddress(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
    }

    public ShippingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C1pq.A08("district", str);
        this.A00 = str;
        C1pq.A08("invoiceId", str2);
        this.A01 = str2;
        AbF.A1U(str3);
        this.A02 = str3;
        C1pq.A08("phoneNumber", str4);
        this.A03 = str4;
        C1pq.A08("province", str5);
        this.A04 = str5;
        C1pq.A08("streetAddress", str6);
        this.A05 = str6;
        C1pq.A08("subDistrict", str7);
        this.A06 = str7;
        C1pq.A08("zipCode", str8);
        this.A07 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShippingAddress)) {
                return false;
            }
            ShippingAddress shippingAddress = (ShippingAddress) obj;
            if (!11T.A0O(this.A00, shippingAddress.A00) || !11T.A0O(this.A01, shippingAddress.A01) || !11T.A0O(this.A02, shippingAddress.A02) || !11T.A0O(this.A03, shippingAddress.A03) || !11T.A0O(this.A04, shippingAddress.A04) || !11T.A0O(this.A05, shippingAddress.A05) || !11T.A0O(this.A06, shippingAddress.A06) || !11T.A0O(this.A07, shippingAddress.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }
}
