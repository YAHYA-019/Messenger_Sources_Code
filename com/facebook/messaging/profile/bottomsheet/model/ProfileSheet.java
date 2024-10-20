package com.facebook.messaging.profile.bottomsheet.model;

import X.11T;
import X.1BL;
import X.7zK;
import X.7zU;
import X.AbF;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProfileSheet.class */
public final class ProfileSheet implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(24);
    public final long A00;
    public final Integer A01;
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

    public ProfileSheet(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public ProfileSheet(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j) {
        C1pq.A08("bio", str);
        this.A02 = str;
        this.A03 = str2;
        C1pq.A08("coverPhotoUrl", str3);
        this.A04 = str3;
        this.A01 = num;
        AbF.A1U(str4);
        this.A05 = str4;
        C1pq.A08("profilePhotoUrl", str5);
        this.A06 = str5;
        C1pq.A08("section1Icon1", str6);
        this.A07 = str6;
        C1pq.A08("section1Icon2", str7);
        this.A08 = str7;
        C1pq.A08("section1Icon3", str8);
        this.A09 = str8;
        C1pq.A08("section1SubText3", str9);
        this.A0A = str9;
        C1pq.A08("section1Text1", str10);
        this.A0B = str10;
        C1pq.A08("section1Text2", str11);
        this.A0C = str11;
        C1pq.A08("section1Text3", str12);
        this.A0D = str12;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProfileSheet)) {
                return false;
            }
            ProfileSheet profileSheet = (ProfileSheet) obj;
            if (!11T.A0O(this.A02, profileSheet.A02) || !11T.A0O(this.A03, profileSheet.A03) || !11T.A0O(this.A04, profileSheet.A04) || !11T.A0O(this.A01, profileSheet.A01) || !11T.A0O(this.A05, profileSheet.A05) || !11T.A0O(this.A06, profileSheet.A06) || !11T.A0O(this.A07, profileSheet.A07) || !11T.A0O(this.A08, profileSheet.A08) || !11T.A0O(this.A09, profileSheet.A09) || !11T.A0O(this.A0A, profileSheet.A0A) || !11T.A0O(this.A0B, profileSheet.A0B) || !11T.A0O(this.A0C, profileSheet.A0C) || !11T.A0O(this.A0D, profileSheet.A0D) || this.A00 != profileSheet.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02))))))))))))), this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProfileSheet{bio=");
        A0k.append(this.A02);
        A0k.append(", contextualProfilePhotoUrl=");
        A0k.append(this.A03);
        A0k.append(", coverPhotoUrl=");
        A0k.append(this.A04);
        A0k.append(7zK.A00(51));
        A0k.append(this.A01);
        A0k.append(", name=");
        A0k.append(this.A05);
        A0k.append(", profilePhotoUrl=");
        A0k.append(this.A06);
        A0k.append(", section1Icon1=");
        A0k.append(this.A07);
        A0k.append(", section1Icon2=");
        A0k.append(this.A08);
        A0k.append(", section1Icon3=");
        A0k.append(this.A09);
        A0k.append(", section1SubText3=");
        A0k.append(this.A0A);
        A0k.append(", section1Text1=");
        A0k.append(this.A0B);
        A0k.append(", section1Text2=");
        A0k.append(this.A0C);
        A0k.append(", section1Text3=");
        A0k.append(this.A0D);
        A0k.append(", userId=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        C3o5.A0f(parcel, this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A00);
    }
}
