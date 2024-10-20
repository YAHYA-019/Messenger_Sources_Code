package com.facebook.iabbwpextension;

import X.11T;
import X.1BL;
import X.7zN;
import X.AnonymousClass001;
import X.C04v;
import X.C3o5;
import X.DKH;
import X.EW1;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABBwPExtension.class */
public final class IABBwPExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(13);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public IABBwPExtension(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        11T.A0F(num, 1);
        this.A01 = num;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = str4;
        this.A06 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABBwPExtension)) {
                return false;
            }
            IABBwPExtension iABBwPExtension = (IABBwPExtension) obj;
            if (this.A01 != iABBwPExtension.A01 || !11T.A0O(this.A05, iABBwPExtension.A05) || !11T.A0O(this.A03, iABBwPExtension.A03) || !11T.A0O(this.A02, iABBwPExtension.A02) || this.A00 != iABBwPExtension.A00 || !11T.A0O(this.A04, iABBwPExtension.A04) || !11T.A0O(this.A06, iABBwPExtension.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return ((((((((((C3o5.A05(num, EW1.A00(num)) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A02)) * 31) + this.A00) * 31) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A06);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IABBwPExtension(bwPType=");
        Integer num = this.A01;
        A0k.append(num != null ? EW1.A00(num) : "null");
        A0k.append(", loadingPageUrl=");
        A0k.append(this.A05);
        A0k.append(", apiKey=");
        A0k.append(this.A03);
        A0k.append(", accessToken=");
        A0k.append(this.A02);
        A0k.append(", accessTokenExpiryDateInSecs=");
        A0k.append(this.A00);
        A0k.append(", bauProductUrl=");
        A0k.append(this.A04);
        A0k.append(", pageName=");
        return DKH.A0o(this.A06, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(EW1.A00(this.A01));
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }
}
