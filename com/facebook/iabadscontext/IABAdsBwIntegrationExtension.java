package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.7zN;
import X.7zV;
import X.AnonymousClass001;
import X.C04v;
import X.C3o5;
import X.DKH;
import X.EVz;
import X.EW0;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABAdsBwIntegrationExtension.class */
public final class IABAdsBwIntegrationExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(98);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public IABAdsBwIntegrationExtension(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5) {
        1BL.A1F(num, num2);
        this.A01 = num;
        this.A02 = num2;
        this.A07 = str;
        this.A03 = l;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = num3;
        this.A06 = str4;
        this.A08 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABAdsBwIntegrationExtension)) {
                return false;
            }
            IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = (IABAdsBwIntegrationExtension) obj;
            if (this.A01 != iABAdsBwIntegrationExtension.A01 || this.A02 != iABAdsBwIntegrationExtension.A02 || !11T.A0O(this.A07, iABAdsBwIntegrationExtension.A07) || !11T.A0O(this.A03, iABAdsBwIntegrationExtension.A03) || !11T.A0O(this.A05, iABAdsBwIntegrationExtension.A05) || !11T.A0O(this.A04, iABAdsBwIntegrationExtension.A04) || !11T.A0O(this.A00, iABAdsBwIntegrationExtension.A00) || !11T.A0O(this.A06, iABAdsBwIntegrationExtension.A06) || !11T.A0O(this.A08, iABAdsBwIntegrationExtension.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        int A05 = C3o5.A05(num, EVz.A00(num));
        Integer num2 = this.A02;
        return ((((((((((((7zV.A03(num2, EW0.A00(num2), A05) + 1BL.A05(this.A07)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A06)) * 31) + 7zN.A05(this.A08);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IABAdsBwIntegrationExtension(bwIType=");
        Integer num = this.A01;
        A0k.append(num != null ? EVz.A00(num) : "null");
        A0k.append(", partnerType=");
        Integer num2 = this.A02;
        A0k.append(num2 != null ? EW0.A00(num2) : "null");
        A0k.append(", loadingPageUrl=");
        A0k.append(this.A07);
        A0k.append(", oauthIntegrationId=");
        A0k.append(this.A03);
        A0k.append(", apiKey=");
        A0k.append(this.A05);
        A0k.append(", accessToken=");
        A0k.append(this.A04);
        A0k.append(", accessTokenExpiryDateInSecs=");
        A0k.append(this.A00);
        A0k.append(", bauProductUrl=");
        A0k.append(this.A06);
        A0k.append(", pageName=");
        return DKH.A0o(this.A08, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(EVz.A00(this.A01));
        parcel.writeString(EW0.A00(this.A02));
        parcel.writeString(this.A07);
        C3o5.A0g(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        C3o5.A0f(parcel, this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
    }
}
