package com.facebook.messaging.fxcal.identity.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountProfileModel.class */
public final class AccountProfileModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(61);
    public final int A00;
    public final String A01;
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
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public AccountProfileModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = parcel.readString();
        this.A0E = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A0C = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0D = C3o5.A0O(parcel);
    }

    public AccountProfileModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = str8;
        AbF.A1T(str9);
        this.A09 = str9;
        this.A0E = z;
        this.A0A = str10;
        this.A0B = str11;
        this.A00 = i;
        this.A0C = str12;
        this.A0D = str13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AccountProfileModel)) {
                return false;
            }
            AccountProfileModel accountProfileModel = (AccountProfileModel) obj;
            if (!11T.A0O(this.A01, accountProfileModel.A01) || !11T.A0O(this.A02, accountProfileModel.A02) || !11T.A0O(this.A03, accountProfileModel.A03) || !11T.A0O(this.A04, accountProfileModel.A04) || !11T.A0O(this.A05, accountProfileModel.A05) || !11T.A0O(this.A06, accountProfileModel.A06) || !11T.A0O(this.A07, accountProfileModel.A07) || !11T.A0O(this.A08, accountProfileModel.A08) || !11T.A0O(this.A09, accountProfileModel.A09) || this.A0E != accountProfileModel.A0E || !11T.A0O(this.A0A, accountProfileModel.A0A) || !11T.A0O(this.A0B, accountProfileModel.A0B) || this.A00 != accountProfileModel.A00 || !11T.A0O(this.A0C, accountProfileModel.A0C) || !11T.A0O(this.A0D, accountProfileModel.A0D)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0D, C1pq.A04(this.A0C, (C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))))))), this.A0E))) * 31) + this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0E ? 1 : 0);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
    }
}
