package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.5pV;
import X.7zK;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Member.class */
public final class Member implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(89);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final 5pV A05;
    public final Integer A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public Member(5pV r302, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A07 = l;
        this.A08 = str;
        this.A06 = num;
        this.A0F = z;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        C1pq.A08("firstName", str2);
        this.A09 = str2;
        this.A0G = z2;
        this.A0H = z3;
        this.A0I = z4;
        this.A0J = z5;
        this.A0K = z6;
        this.A0L = z7;
        this.A0M = z8;
        this.A0N = z9;
        this.A0O = z10;
        this.A04 = j4;
        AbF.A1U(str3);
        this.A0A = str3;
        C1pq.A08("nickname", str4);
        this.A0B = str4;
        C1pq.A08("profilePicUrl", str5);
        this.A0C = str5;
        this.A0D = str6;
        this.A00 = i;
        this.A0E = str7;
        this.A05 = r302;
    }

    public Member(Parcel parcel) {
        5pV r304 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A07 = null;
        } else {
            this.A07 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = AbI.A0z(parcel);
        }
        this.A0F = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A0G = 1BM.A07(parcel);
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A0L = 1BM.A07(parcel);
        this.A0M = 1BM.A07(parcel);
        this.A0N = 1BM.A07(parcel);
        this.A0O = AbJ.A1W(parcel);
        this.A04 = parcel.readLong();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A05 = parcel.readInt() != 0 ? 5pV.values()[parcel.readInt()] : r304;
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
            if (!11T.A0O(this.A07, member.A07) || !11T.A0O(this.A08, member.A08) || !11T.A0O(this.A06, member.A06) || this.A0F != member.A0F || this.A01 != member.A01 || this.A02 != member.A02 || this.A03 != member.A03 || !11T.A0O(this.A09, member.A09) || this.A0G != member.A0G || this.A0H != member.A0H || this.A0I != member.A0I || this.A0J != member.A0J || this.A0K != member.A0K || this.A0L != member.A0L || this.A0M != member.A0M || this.A0N != member.A0N || this.A0O != member.A0O || this.A04 != member.A04 || !11T.A0O(this.A0A, member.A0A) || !11T.A0O(this.A0B, member.A0B) || !11T.A0O(this.A0C, member.A0C) || !11T.A0O(this.A0D, member.A0D) || this.A00 != member.A00 || !11T.A0O(this.A0E, member.A0E) || this.A05 != member.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0E, (C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A02(C1pq.A04(this.A06, C1pq.A04(this.A08, C1pq.A03(this.A07))), this.A0F), this.A01), this.A02), this.A03)), this.A0G), this.A0H), this.A0I), this.A0J), this.A0K), this.A0L), this.A0M), this.A0N), this.A0O), this.A04))))) * 31) + this.A00);
        return (A04 * 31) + C3o5.A03(this.A05);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Member{badgeId=");
        A0k.append(this.A07);
        A0k.append(", badgeTitle=");
        A0k.append(this.A08);
        A0k.append(", badgeType=");
        A0k.append(this.A06);
        A0k.append(", canAddDirectlyToCommunity=");
        A0k.append(this.A0F);
        A0k.append(", channelBadge=");
        A0k.append(this.A01);
        A0k.append(", communityId=");
        A0k.append(this.A02);
        A0k.append(", contactId=");
        A0k.append(this.A03);
        A0k.append(", firstName=");
        A0k.append(this.A09);
        A0k.append(AbstractC00603o4.A00(321));
        A0k.append(this.A0G);
        A0k.append(", isAdmin=");
        A0k.append(this.A0H);
        A0k.append(", isBlocked=");
        A0k.append(this.A0I);
        A0k.append(", isBlockedFromCommunity=");
        A0k.append(this.A0J);
        A0k.append(", isCommunityMember=");
        A0k.append(this.A0K);
        A0k.append(", isEligibleForCMInvite=");
        A0k.append(this.A0L);
        A0k.append(", isModerator=");
        A0k.append(this.A0M);
        A0k.append(", isMuted=");
        A0k.append(this.A0N);
        A0k.append(", isPage=");
        A0k.append(this.A0O);
        A0k.append(", memberActionsCapability=");
        A0k.append(this.A04);
        A0k.append(", name=");
        A0k.append(this.A0A);
        A0k.append(", nickname=");
        A0k.append(this.A0B);
        A0k.append(7zK.A00(53));
        A0k.append(this.A0C);
        A0k.append(", serverDataSourceType=");
        A0k.append(this.A0D);
        A0k.append(", source=");
        A0k.append(this.A00);
        A0k.append(", subtitle=");
        A0k.append(this.A0E);
        A0k.append(", visibleThreadRole=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0g(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0f(parcel, this.A06);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        1BL.A13(parcel, this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0E);
        C3o5.A0e(parcel, this.A05);
    }
}
