package com.facebook.messaging.publicchats.memberlist.model;

import X.11T;
import X.1BL;
import X.7zK;
import X.AbF;
import X.AbG;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: Member.class */
public final class Member implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(32);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public Member(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = AbJ.A1W(parcel);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
    }

    public Member(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, boolean z, boolean z2) {
        this.A00 = j;
        C1pq.A08("firstName", str);
        this.A02 = str;
        this.A08 = z;
        this.A09 = z2;
        AbF.A1U(str2);
        this.A03 = str2;
        C1pq.A08("nickname", str3);
        this.A04 = str3;
        C1pq.A08("profilePictureUrl", str4);
        this.A05 = str4;
        this.A01 = j2;
        this.A06 = str5;
        C1pq.A08("subtitle", str6);
        this.A07 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Member)) {
                return false;
            }
            Member member = (Member) obj;
            if (this.A00 != member.A00 || !11T.A0O(this.A02, member.A02) || this.A08 != member.A08 || this.A09 != member.A09 || !11T.A0O(this.A03, member.A03) || !11T.A0O(this.A04, member.A04) || !11T.A0O(this.A05, member.A05) || this.A01 != member.A01 || !11T.A0O(this.A06, member.A06) || !11T.A0O(this.A07, member.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A01(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A04(this.A02, 1BL.A01(this.A00) + 31), this.A08), this.A09)))), this.A01)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Member{contactId=");
        A0k.append(this.A00);
        A0k.append(", firstName=");
        A0k.append(this.A02);
        A0k.append(", isAdmin=");
        A0k.append(this.A08);
        A0k.append(", isBlocked=");
        A0k.append(this.A09);
        A0k.append(", name=");
        A0k.append(this.A03);
        A0k.append(", nickname=");
        A0k.append(this.A04);
        A0k.append(7zK.A00(5));
        A0k.append(this.A05);
        A0k.append(7zK.A00(ActionId.APP_DID_FINISH_LAUNCHING));
        A0k.append(this.A01);
        A0k.append(", profilePictureUrlFallback=");
        A0k.append(this.A06);
        A0k.append(", subtitle=");
        A0k.append(this.A07);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }
}
