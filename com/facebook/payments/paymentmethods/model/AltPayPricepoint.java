package com.facebook.payments.paymentmethods.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbF;
import X.AbH;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.collect.ImmutableList;

/* loaded from: AltPayPricepoint.class */
public final class AltPayPricepoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(50);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final CurrencyAmount A08;
    public final String A09;

    public AltPayPricepoint(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A09 = parcel.readString();
        this.A02 = parcel.readString();
        this.A08 = (CurrencyAmount) parcel.readParcelable(A0e);
        this.A03 = DKH.A0l(parcel);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = AbN.A1U(parcel);
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        while (i < readInt2) {
            i = AbH.A00(parcel, strArr2, i);
        }
        this.A01 = ImmutableList.copyOf(strArr2);
        this.A06 = parcel.readString();
    }

    public AltPayPricepoint(CurrencyAmount currencyAmount, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C1pq.A08("altpayId", str);
        this.A09 = str;
        C1pq.A08("description", str2);
        this.A02 = str2;
        C1pq.A08("feeAmount", currencyAmount);
        this.A08 = currencyAmount;
        this.A03 = str3;
        C1pq.A08("logoUrls", immutableList);
        this.A00 = immutableList;
        C1pq.A08("paymentProvider", str4);
        this.A04 = str4;
        C1pq.A08("pricepointId", str5);
        this.A05 = str5;
        this.A07 = z;
        C1pq.A08("supportedCountries", immutableList2);
        this.A01 = immutableList2;
        AbF.A1V(str6);
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AltPayPricepoint)) {
                return false;
            }
            AltPayPricepoint altPayPricepoint = (AltPayPricepoint) obj;
            if (!11T.A0O(this.A09, altPayPricepoint.A09) || !11T.A0O(this.A02, altPayPricepoint.A02) || !11T.A0O(this.A08, altPayPricepoint.A08) || !11T.A0O(this.A03, altPayPricepoint.A03) || !11T.A0O(this.A00, altPayPricepoint.A00) || !11T.A0O(this.A04, altPayPricepoint.A04) || !11T.A0O(this.A05, altPayPricepoint.A05) || this.A07 != altPayPricepoint.A07 || !11T.A0O(this.A01, altPayPricepoint.A01) || !11T.A0O(this.A06, altPayPricepoint.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A08, C1pq.A04(this.A02, C1pq.A03(this.A09))))))), this.A07)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A08, i);
        4YW.A0E(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeString(this.A06);
    }
}
