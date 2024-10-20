package fxcache.model;

import X.11T;
import X.1BL;
import X.7zK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: FxCalAccount.class */
public final class FxCalAccount implements Parcelable {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public FxCalAccount() {
        this("", "", "", "", "", "", "", "", 0, 0, 0);
    }

    public FxCalAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3) {
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A07 = str7;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FxCalAccount)) {
                return false;
            }
            FxCalAccount fxCalAccount = (FxCalAccount) obj;
            if (!11T.A0O(this.A03, fxCalAccount.A03) || !11T.A0O(this.A05, fxCalAccount.A05) || !11T.A0O(this.A04, fxCalAccount.A04) || !11T.A0O(this.A06, fxCalAccount.A06) || !11T.A0O(this.A08, fxCalAccount.A08) || !11T.A0O(this.A0A, fxCalAccount.A0A) || !11T.A0O(this.A07, fxCalAccount.A07) || this.A00 != fxCalAccount.A00 || this.A02 != fxCalAccount.A02 || this.A01 != fxCalAccount.A01 || !11T.A0O(this.A09, fxCalAccount.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (((((((((((((AnonymousClass002.A07(this.A04, ((this.A03.hashCode() * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A0A)) * 31) + 1BL.A05(this.A07)) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31;
        String str = this.A09;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FxCalAccount(accountId=");
        A0k.append(this.A03);
        A0k.append(", instagramId=");
        A0k.append(this.A05);
        A0k.append(DKB.A00(ActionId.FORMAT_ERROR));
        A0k.append(this.A04);
        A0k.append(", name=");
        A0k.append(this.A06);
        A0k.append(7zK.A00(5));
        A0k.append(this.A08);
        A0k.append(", username=");
        A0k.append(this.A0A);
        A0k.append(", obfuscatedId=");
        A0k.append(this.A07);
        A0k.append(", badgeCount=");
        A0k.append(this.A00);
        A0k.append(", unfilteredBadgeCount=");
        A0k.append(this.A02);
        A0k.append(", igL28=");
        A0k.append(this.A01);
        A0k.append(", unpackedNotifications=");
        A0k.append(this.A09);
        return AnonymousClass001.A0g(A0k, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
    }
}
