package com.facebookpay.incentives.model;

import X.11T;
import X.1BL;
import X.KOg;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: ECPOffsiteOffer.class */
public final class ECPOffsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = LGp.A00(94);
    public final KOg A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final CurrencyAmount A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ECPOffsiteOffer(CurrencyAmount currencyAmount, KOg kOg, String str, String str2, String str3, String str4, String str5, boolean z) {
        1BL.A1F(str, str2);
        11T.A0F(kOg, 5);
        this.A01 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A00 = kOg;
        this.A03 = z;
        this.A05 = str5;
        this.A04 = currencyAmount;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String Al8() {
        return this.A05;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public KOg AqS() {
        return this.A00;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String BDT() {
        return this.A06;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String BG6() {
        return this.A07;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public boolean BQs() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String getId() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        1BL.A12(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
    }
}
