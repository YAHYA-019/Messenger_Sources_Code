package com.facebook.messaging.communitymessaging.invitelink.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.7zN;
import X.7zO;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C1zu;
import X.C3o5;
import X.C96j;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;

/* loaded from: CommunityMessagingInviteLinkData.class */
public final class CommunityMessagingInviteLinkData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(78);
    public final int A00;
    public final Uri A01;
    public final Uri A02;
    public final C96j A03;
    public final CommunityMessagingFbGroupType A04;
    public final C1zu A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public CommunityMessagingInviteLinkData(Uri uri, Uri uri2, C96j c96j, CommunityMessagingFbGroupType communityMessagingFbGroupType, C1zu c1zu, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0I = z;
        this.A0J = z2;
        this.A0A = l;
        this.A01 = uri;
        this.A0B = l2;
        this.A02 = uri2;
        C1pq.A08("communityJoinRequestStatus", num);
        this.A06 = num;
        C1pq.A08("communityParticipationControlRequestStatus", num2);
        this.A07 = num2;
        this.A08 = num3;
        this.A0D = str;
        this.A0E = str2;
        this.A04 = communityMessagingFbGroupType;
        this.A0C = l3;
        this.A09 = num4;
        this.A0K = z3;
        this.A0L = z4;
        this.A0F = str3;
        C1pq.A08("linkHash", str4);
        this.A0G = str4;
        C1pq.A08("linkJoinType", c96j);
        this.A03 = c96j;
        this.A0M = z5;
        this.A00 = i;
        this.A05 = c1zu;
        C1pq.A08("title", str5);
        this.A0H = str5;
    }

    public CommunityMessagingInviteLinkData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        boolean z = false;
        this.A0I = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = 1BM.A07(parcel);
        C1zu c1zu = null;
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Uri) parcel.readParcelable(A0e);
        }
        this.A06 = 7zU.A0e(parcel, 3);
        this.A07 = 7zU.A0e(parcel, 3);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = 7zU.A0e(parcel, 3);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A04 = CommunityMessagingFbGroupType.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = 7zU.A0e(parcel, 6);
        }
        this.A0K = 1BM.A07(parcel);
        this.A0L = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A0G = parcel.readString();
        this.A03 = C96j.values()[parcel.readInt()];
        this.A0M = parcel.readInt() == 1 ? true : z;
        this.A00 = parcel.readInt();
        this.A05 = parcel.readInt() != 0 ? C1zu.values()[parcel.readInt()] : c1zu;
        this.A0H = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingInviteLinkData)) {
                return false;
            }
            CommunityMessagingInviteLinkData communityMessagingInviteLinkData = (CommunityMessagingInviteLinkData) obj;
            if (this.A0I != communityMessagingInviteLinkData.A0I || this.A0J != communityMessagingInviteLinkData.A0J || !11T.A0O(this.A0A, communityMessagingInviteLinkData.A0A) || !11T.A0O(this.A01, communityMessagingInviteLinkData.A01) || !11T.A0O(this.A0B, communityMessagingInviteLinkData.A0B) || !11T.A0O(this.A02, communityMessagingInviteLinkData.A02) || this.A06 != communityMessagingInviteLinkData.A06 || this.A07 != communityMessagingInviteLinkData.A07 || this.A08 != communityMessagingInviteLinkData.A08 || !11T.A0O(this.A0D, communityMessagingInviteLinkData.A0D) || !11T.A0O(this.A0E, communityMessagingInviteLinkData.A0E) || this.A04 != communityMessagingInviteLinkData.A04 || !11T.A0O(this.A0C, communityMessagingInviteLinkData.A0C) || this.A09 != communityMessagingInviteLinkData.A09 || this.A0K != communityMessagingInviteLinkData.A0K || this.A0L != communityMessagingInviteLinkData.A0L || !11T.A0O(this.A0F, communityMessagingInviteLinkData.A0F) || !11T.A0O(this.A0G, communityMessagingInviteLinkData.A0G) || this.A03 != communityMessagingInviteLinkData.A03 || this.A0M != communityMessagingInviteLinkData.A0M || this.A00 != communityMessagingInviteLinkData.A00 || this.A05 != communityMessagingInviteLinkData.A05 || !11T.A0O(this.A0H, communityMessagingInviteLinkData.A0H)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = (C1pq.A02((C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A02(C1pq.A02((C1pq.A04(this.A0C, (C1pq.A04(this.A0E, C1pq.A04(this.A0D, (((((C1pq.A04(this.A02, C1pq.A04(this.A0B, C1pq.A04(this.A01, C1pq.A04(this.A0A, C1pq.A02(C1pq.A05(this.A0I), this.A0J))))) * 31) + C3o5.A04(this.A06)) * 31) + C3o5.A04(this.A07)) * 31) + C3o5.A04(this.A08))) * 31) + C3o5.A03(this.A04)) * 31) + C3o5.A04(this.A09), this.A0K), this.A0L))) * 31) + C3o5.A03(this.A03), this.A0M) * 31) + this.A00;
        C1zu c1zu = this.A05;
        if (c1zu != null) {
            i = c1zu.ordinal();
        }
        return C1pq.A04(this.A0H, (A02 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        C3o5.A0g(parcel, this.A0A);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0g(parcel, this.A0B);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A06.intValue());
        parcel.writeInt(this.A07.intValue());
        C3o5.A0f(parcel, this.A08);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        7zN.A0z(parcel, this.A04);
        C3o5.A0g(parcel, this.A0C);
        C3o5.A0f(parcel, this.A09);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        1BL.A13(parcel, this.A0F);
        parcel.writeString(this.A0G);
        7zN.A0z(parcel, this.A03);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A00);
        C3o5.A0e(parcel, this.A05);
        parcel.writeString(this.A0H);
    }
}
