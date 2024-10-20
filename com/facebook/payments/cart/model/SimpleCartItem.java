package com.facebook.payments.cart.model;

import X.1BL;
import X.C53v;
import X.EMq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import java.math.BigDecimal;

/* loaded from: SimpleCartItem.class */
public final class SimpleCartItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(48);
    public final int A00;
    public final int A01;
    public final EMq A02;
    public final CurrencyAmount A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public SimpleCartItem(EMq eMq, CurrencyAmount currencyAmount, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.A04 = str;
        this.A02 = eMq;
        this.A08 = str5;
        this.A07 = str4;
        this.A06 = str3;
        this.A03 = currencyAmount;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str2;
    }

    public SimpleCartItem(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = C53v.A07(parcel, EMq.class);
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = parcel.readString();
    }

    public CurrencyAmount A00() {
        CurrencyAmount currencyAmount = this.A03;
        return new CurrencyAmount(currencyAmount.A00, currencyAmount.A01.multiply(new BigDecimal(this.A00)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        C53v.A0J(parcel, this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A05);
    }
}
