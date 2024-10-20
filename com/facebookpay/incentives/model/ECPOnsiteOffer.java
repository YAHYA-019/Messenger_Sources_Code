package com.facebookpay.incentives.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zT;
import X.KOg;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: ECPOnsiteOffer.class */
public final class ECPOnsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = LGp.A00(95);
    public final CurrencyAmount A00;
    public final String A01;
    public final KOg A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ECPOnsiteOffer(CurrencyAmount currencyAmount, KOg kOg, String str, String str2, String str3, String str4, String str5, boolean z) {
        7zT.A1T(str, str2, kOg);
        4YV.A1M(str4, 6, str5);
        11T.A0F(currencyAmount, 8);
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = kOg;
        this.A07 = z;
        this.A01 = str4;
        this.A03 = str5;
        this.A00 = currencyAmount;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String Al8() {
        return this.A03;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public KOg AqS() {
        return this.A02;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String BDT() {
        return this.A05;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String BG6() {
        return this.A06;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public boolean BQs() {
        return this.A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public String getId() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        1BL.A12(parcel, this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }
}
