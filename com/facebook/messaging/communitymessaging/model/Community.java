package com.facebook.messaging.communitymessaging.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.7zK;
import X.AbE;
import X.AdF;
import X.AnonymousClass001;
import X.C1pq;
import X.C20E;
import X.C20M;
import X.C3o5;
import X.C4Ny;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Community.class */
public final class Community implements Parcelable {
    public static volatile AdF A0j;
    public static volatile CommunityNewBadgeStatus A0k;
    public static volatile MemberRequestApprovalSetting A0l;
    public static volatile Integer A0m;
    public static volatile Integer A0n;
    public static volatile Integer A0o;
    public static final Parcelable.Creator CREATOR = new C4Ny(5);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final CommunityMessagingCommunityType A0J;
    public final C20E A0K;
    public final CommunityMessagingFbGroupType A0L;
    public final C20M A0M;
    public final Boolean A0N;
    public final Boolean A0O;
    public final Long A0P;
    public final Long A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final AdF A0c;
    public final CommunityNewBadgeStatus A0d;
    public final MemberRequestApprovalSetting A0e;
    public final Integer A0f;
    public final Integer A0g;
    public final Integer A0h;
    public final Set A0i;

    public Community(AdF adF, CommunityMessagingCommunityType communityMessagingCommunityType, C20E c20e, CommunityMessagingFbGroupType communityMessagingFbGroupType, C20M c20m, CommunityNewBadgeStatus communityNewBadgeStatus, MemberRequestApprovalSetting memberRequestApprovalSetting, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A0f = num;
        this.A02 = i3;
        this.A0c = adF;
        this.A0d = communityNewBadgeStatus;
        this.A0J = communityMessagingCommunityType;
        C1pq.A08("description", str);
        this.A0R = str;
        this.A03 = i4;
        this.A0S = str2;
        this.A0P = l;
        this.A0K = c20e;
        this.A0L = communityMessagingFbGroupType;
        C1pq.A08("groupId", str3);
        this.A0T = str3;
        this.A0g = num2;
        this.A0N = bool;
        this.A0O = bool2;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
        this.A0U = str4;
        this.A04 = i5;
        this.A0V = str5;
        this.A05 = i6;
        this.A0D = j;
        this.A0a = z;
        this.A0b = z2;
        this.A0E = 0L;
        this.A06 = i7;
        this.A07 = i8;
        this.A0e = memberRequestApprovalSetting;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
        this.A0W = str6;
        this.A0F = j2;
        this.A08 = i9;
        this.A0h = num3;
        this.A09 = i10;
        this.A0A = i11;
        this.A0B = i12;
        C1pq.A08("profilePicUrl", str7);
        this.A0X = str7;
        this.A0G = j3;
        this.A0Q = l2;
        this.A0Y = "";
        this.A0Z = str8;
        this.A0M = c20m;
        this.A0H = j4;
        this.A0I = j5;
        this.A0C = i13;
        this.A0i = Collections.unmodifiableSet(set);
    }

    public Community(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        C20M c20m = null;
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = 0S2.A00(2)[parcel.readInt()];
        }
        this.A02 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = AdF.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = CommunityNewBadgeStatus.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = CommunityMessagingCommunityType.values()[parcel.readInt()];
        }
        this.A0R = parcel.readString();
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = C20E.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = CommunityMessagingFbGroupType.values()[parcel.readInt()];
        }
        this.A0T = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = 0S2.A00(3)[parcel.readInt()];
        }
        int i = 0;
        boolean z = true;
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0U = parcel.readString();
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = parcel.readString();
        }
        this.A05 = parcel.readInt();
        this.A0D = parcel.readLong();
        this.A0a = 1BM.A07(parcel);
        this.A0b = parcel.readInt() != 1 ? false : z;
        this.A0E = parcel.readLong();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = MemberRequestApprovalSetting.values()[parcel.readInt()];
        }
        this.A0W = parcel.readString();
        this.A0F = parcel.readLong();
        this.A08 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = 0S2.A00(2)[parcel.readInt()];
        }
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A0X = parcel.readString();
        this.A0G = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = Long.valueOf(parcel.readLong());
        }
        this.A0Y = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        this.A0M = parcel.readInt() != 0 ? C20M.values()[parcel.readInt()] : c20m;
        this.A0H = parcel.readLong();
        this.A0I = parcel.readLong();
        this.A0C = parcel.readInt();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A0i = Collections.unmodifiableSet(hashSet);
    }

    private Integer A00() {
        if (this.A0i.contains(AbE.A00(405))) {
            return this.A0f;
        }
        if (A0m == null) {
            synchronized (this) {
                if (A0m == null) {
                    A0m = 0S2.A00;
                }
            }
        }
        return A0m;
    }

    public AdF A01() {
        if (this.A0i.contains(AbE.A00(458))) {
            return this.A0c;
        }
        if (A0j == null) {
            synchronized (this) {
                if (A0j == null) {
                    A0j = AdF.A03;
                }
            }
        }
        return A0j;
    }

    public CommunityNewBadgeStatus A02() {
        if (this.A0i.contains(AbE.A00(459))) {
            return this.A0d;
        }
        if (A0k == null) {
            synchronized (this) {
                if (A0k == null) {
                    A0k = CommunityNewBadgeStatus.A03;
                }
            }
        }
        return A0k;
    }

    public MemberRequestApprovalSetting A03() {
        if (this.A0i.contains(AbE.A00(585))) {
            return this.A0e;
        }
        if (A0l == null) {
            synchronized (this) {
                if (A0l == null) {
                    A0l = MemberRequestApprovalSetting.A03;
                }
            }
        }
        return A0l;
    }

    public Integer A04() {
        if (this.A0i.contains(AbE.A00(532))) {
            return this.A0g;
        }
        if (A0n == null) {
            synchronized (this) {
                if (A0n == null) {
                    A0n = 0S2.A00;
                }
            }
        }
        return A0n;
    }

    public Integer A05() {
        if (this.A0i.contains("pauseStatus")) {
            return this.A0h;
        }
        if (A0o == null) {
            synchronized (this) {
                if (A0o == null) {
                    A0o = 0S2.A00;
                }
            }
        }
        return A0o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Community)) {
                return false;
            }
            Community community = (Community) obj;
            if (this.A00 != community.A00 || this.A01 != community.A01 || A00() != community.A00() || this.A02 != community.A02 || A01() != community.A01() || A02() != community.A02() || this.A0J != community.A0J || !11T.A0O(this.A0R, community.A0R) || this.A03 != community.A03 || !11T.A0O(this.A0S, community.A0S) || !11T.A0O(this.A0P, community.A0P) || this.A0K != community.A0K || this.A0L != community.A0L || !11T.A0O(this.A0T, community.A0T) || A04() != community.A04() || !11T.A0O(this.A0N, community.A0N) || !11T.A0O(this.A0O, community.A0O) || !11T.A0O(this.A0U, community.A0U) || this.A04 != community.A04 || !11T.A0O(this.A0V, community.A0V) || this.A05 != community.A05 || this.A0D != community.A0D || this.A0a != community.A0a || this.A0b != community.A0b || this.A0E != community.A0E || this.A06 != community.A06 || this.A07 != community.A07 || A03() != community.A03() || !11T.A0O(this.A0W, community.A0W) || this.A0F != community.A0F || this.A08 != community.A08 || A05() != community.A05() || this.A09 != community.A09 || this.A0A != community.A0A || this.A0B != community.A0B || !11T.A0O(this.A0X, community.A0X) || this.A0G != community.A0G || !11T.A0O(this.A0Q, community.A0Q) || !11T.A0O(this.A0Y, community.A0Y) || !11T.A0O(this.A0Z, community.A0Z) || this.A0M != community.A0M || this.A0H != community.A0H || this.A0I != community.A0I || this.A0C != community.A0C) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A0Z, C1pq.A04(this.A0Y, C1pq.A04(this.A0Q, C1pq.A01(C1pq.A04(this.A0X, (((((((((C1pq.A01(C1pq.A04(this.A0W, (((((C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A01((C1pq.A04(this.A0V, (C1pq.A04(this.A0U, C1pq.A04(this.A0O, C1pq.A04(this.A0N, (C1pq.A04(this.A0T, (((C1pq.A04(this.A0P, C1pq.A04(this.A0S, (C1pq.A04(this.A0R, ((((((((((((this.A00 + 31) * 31) + this.A01) * 31) + C3o5.A04(A00())) * 31) + this.A02) * 31) + C3o5.A03(A01())) * 31) + C3o5.A03(A02())) * 31) + C3o5.A03(this.A0J)) * 31) + this.A03)) * 31) + C3o5.A03(this.A0K)) * 31) + C3o5.A03(this.A0L)) * 31) + C3o5.A04(A04())))) * 31) + this.A04) * 31) + this.A05, this.A0D), this.A0a), this.A0b), this.A0E) * 31) + this.A06) * 31) + this.A07) * 31) + C3o5.A03(A03())), this.A0F) * 31) + this.A08) * 31) + C3o5.A04(A05())) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A0B), this.A0G))));
        C20M c20m = this.A0M;
        if (c20m != null) {
            i = c20m.ordinal();
        }
        return (C1pq.A01(C1pq.A01((A04 * 31) + i, this.A0H), this.A0I) * 31) + this.A0C;
    }

    public String toString() {
        String str;
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Community{adminCount=");
        A0k2.append(this.A00);
        A0k2.append(", allChatsCount=");
        A0k2.append(this.A01);
        A0k2.append(", attachEventToChatPermission=");
        Integer A00 = A00();
        A0k2.append(A00 != null ? 1 - A00.intValue() != 0 ? "ALL_MEMBERS" : "ADMINS_ONLY" : "null");
        A0k2.append(", blockedFromCommunityMemberCount=");
        A0k2.append(this.A02);
        A0k2.append(", communityChatsAdminAssistRegistrationStatus=");
        A0k2.append(A01());
        A0k2.append(", communityNewBadgeStatus=");
        A0k2.append(A02());
        A0k2.append(", communityType=");
        A0k2.append(this.A0J);
        A0k2.append(JQw.A00(5));
        A0k2.append(this.A0R);
        A0k2.append(", directInviteCount=");
        A0k2.append(this.A03);
        A0k2.append(", directInviteLink=");
        A0k2.append(this.A0S);
        A0k2.append(", disableTimestamp=");
        A0k2.append(this.A0P);
        A0k2.append(", enableState=");
        A0k2.append(this.A0K);
        A0k2.append(", fbGroupType=");
        A0k2.append(this.A0L);
        A0k2.append(", groupId=");
        A0k2.append(this.A0T);
        A0k2.append(", groupParticipationApprovalStatus=");
        Integer A04 = A04();
        if (A04 != null) {
            switch (A04.intValue()) {
                case 1:
                    str = "PARTICIPATION_REQUEST_REQUIRED";
                    break;
                case 2:
                    str = "PARTICIPATION_REQUEST_PENDING";
                    break;
                default:
                    str = "CAN_PARTICIPATE";
                    break;
            }
        } else {
            str = "null";
        }
        A0k2.append(str);
        A0k2.append(", hasPendingAdminInvite=");
        A0k2.append(this.A0N);
        A0k2.append(", hasPendingModeratorInvite=");
        A0k2.append(this.A0O);
        A0k2.append(", id=");
        A0k2.append(this.A0U);
        A0k2.append(", initialThreadCount=");
        A0k2.append(this.A04);
        A0k2.append(", inviteLink=");
        A0k2.append(this.A0V);
        A0k2.append(", inviteStatus=");
        A0k2.append(this.A05);
        A0k2.append(", invitedThreadId=");
        A0k2.append(this.A0D);
        A0k2.append(", isHidden=");
        A0k2.append(this.A0a);
        A0k2.append(", isMember=");
        A0k2.append(this.A0b);
        A0k2.append(", lastActivityTimestamp=");
        A0k2.append(this.A0E);
        A0k2.append(", maxAudioChannelActiveParticipantCount=");
        A0k2.append(this.A06);
        A0k2.append(", memberCount=");
        A0k2.append(this.A07);
        A0k2.append(", memberRequestApprovalSetting=");
        A0k2.append(A03());
        A0k2.append(", name=");
        A0k2.append(this.A0W);
        A0k2.append(", notificationMutedUntil=");
        A0k2.append(this.A0F);
        A0k2.append(", numActiveMembers=");
        A0k2.append(this.A08);
        A0k2.append(", pauseStatus=");
        Integer A05 = A05();
        A0k2.append(A05 != null ? 1 - A05.intValue() != 0 ? "ACTIVE" : "PAUSED_BY_SOFT_ACTION" : "null");
        A0k2.append(", pendingAdmodReviewCount=");
        A0k2.append(this.A09);
        A0k2.append(", pendingMemberChatSuggestionCount=");
        A0k2.append(this.A0A);
        A0k2.append(", pendingMemberRequestsCount=");
        A0k2.append(this.A0B);
        A0k2.append(7zK.A00(53));
        A0k2.append(this.A0X);
        A0k2.append(", readTimestampMs=");
        A0k2.append(this.A0G);
        A0k2.append(", sendsBlockedUntil=");
        A0k2.append(this.A0Q);
        A0k2.append(", snippet=");
        A0k2.append(this.A0Y);
        A0k2.append(", snippetText=");
        A0k2.append(this.A0Z);
        A0k2.append(", takeDownState=");
        A0k2.append(this.A0M);
        A0k2.append(", totalChatRequestsCount=");
        A0k2.append(this.A0H);
        A0k2.append(", totalChatRequestsCountForMembers=");
        A0k2.append(this.A0I);
        A0k2.append(", unreadCount=");
        A0k2.append(this.A0C);
        return AnonymousClass001.A0d("}", A0k2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        C3o5.A0f(parcel, this.A0f);
        parcel.writeInt(this.A02);
        C3o5.A0e(parcel, this.A0c);
        C3o5.A0e(parcel, this.A0d);
        C3o5.A0e(parcel, this.A0J);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A03);
        1BL.A13(parcel, this.A0S);
        C3o5.A0g(parcel, this.A0P);
        C3o5.A0e(parcel, this.A0K);
        C3o5.A0e(parcel, this.A0L);
        parcel.writeString(this.A0T);
        C3o5.A0f(parcel, this.A0g);
        Boolean bool = this.A0N;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A0O;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0U);
        parcel.writeInt(this.A04);
        1BL.A13(parcel, this.A0V);
        parcel.writeInt(this.A05);
        parcel.writeLong(this.A0D);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeLong(this.A0E);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        C3o5.A0e(parcel, this.A0e);
        parcel.writeString(this.A0W);
        parcel.writeLong(this.A0F);
        parcel.writeInt(this.A08);
        C3o5.A0f(parcel, this.A0h);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0B);
        parcel.writeString(this.A0X);
        parcel.writeLong(this.A0G);
        C3o5.A0g(parcel, this.A0Q);
        parcel.writeString(this.A0Y);
        1BL.A13(parcel, this.A0Z);
        C3o5.A0e(parcel, this.A0M);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A0C);
        Iterator A0S = C3o5.A0S(parcel, this.A0i);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
