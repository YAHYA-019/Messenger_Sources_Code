package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.C3o5;
import X.KNj;
import X.KO7;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: PriceInfo.class */
public final class PriceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(54);
    public final CurrencyAmount A00;
    public final KO7 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final KNj A06;
    public final String A07;

    public PriceInfo(CurrencyAmount currencyAmount, KNj kNj, KO7 ko7, Integer num, String str, String str2, String str3, String str4) {
        1BL.A1F(currencyAmount, str);
        this.A00 = currencyAmount;
        this.A04 = str;
        this.A01 = ko7;
        this.A06 = kNj;
        this.A02 = num;
        this.A07 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        KO7 ko7 = this.A01;
        if (ko7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, ko7);
        }
        KNj kNj = this.A06;
        if (kNj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, kNj);
        }
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }
}
