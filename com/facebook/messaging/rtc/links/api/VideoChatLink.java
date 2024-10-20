package com.facebook.messaging.rtc.links.api;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.2JX;
import X.4YT;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C23u;
import X.CSS;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLGroupRoomType;
import com.facebook.graphql.enums.GraphQLMessengerCallInviteLinkLockStatus;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: VideoChatLink.class */
public final class VideoChatLink implements Parcelable {
    public static volatile GraphQLGroupRoomType A0n;
    public static final Parcelable.Creator CREATOR = new CSS(54);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final GraphQLGroupRoomType A04;
    public final GraphQLMessengerCallInviteLinkLockStatus A05;
    public final 2JX A06;
    public final 2JX A07;
    public final 2JX A08;
    public final 2JX A09;
    public final 2JX A0A;
    public final User A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final Long A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final Set A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoChatLink(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        User[] userArr = new User[readInt];
        for (int i = 0; i < readInt; i++) {
            userArr[i] = parcel.readParcelable(classLoader);
        }
        this.A0C = ImmutableList.copyOf(userArr);
        2JX r311 = null;
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = Long.valueOf(parcel.readLong());
        }
        boolean z = true;
        this.A0V = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A0B = (User) parcel.readParcelable(classLoader);
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = GraphQLGroupRoomType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        this.A0Z = 1BM.A07(parcel);
        this.A0a = 1BM.A07(parcel);
        this.A0b = 1BM.A07(parcel);
        this.A0c = 1BM.A07(parcel);
        this.A0d = 1BM.A07(parcel);
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = 1BM.A07(parcel);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A03 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = FJ8.A01(parcel);
        }
        this.A0M = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = GraphQLMessengerCallInviteLinkLockStatus.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            int readInt2 = parcel.readInt();
            VideoChatLinkRingableParticipant[] videoChatLinkRingableParticipantArr = new VideoChatLinkRingableParticipant[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                videoChatLinkRingableParticipantArr[i2] = parcel.readParcelable(classLoader);
            }
            this.A0D = ImmutableList.copyOf(videoChatLinkRingableParticipantArr);
        }
        int readInt3 = parcel.readInt();
        User[] userArr2 = new User[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            userArr2[i3] = parcel.readParcelable(classLoader);
        }
        this.A0E = ImmutableList.copyOf(userArr2);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = FJ8.A01(parcel);
        }
        this.A0l = 1BM.A07(parcel);
        this.A0m = parcel.readInt() != 1 ? false : z;
        int readInt4 = parcel.readInt();
        String[] strArr = new String[readInt4];
        for (int i4 = 0; i4 < readInt4; i4++) {
            strArr[i4] = parcel.readString();
        }
        this.A0F = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = parcel.readString();
        }
        this.A0T = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0A = parcel.readInt() != 0 ? (2JX) FJ8.A01(parcel) : r311;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt5 = parcel.readInt();
        for (int i5 = 0; i5 < readInt5; i5++) {
            A0v.add(parcel.readString());
        }
        this.A0U = Collections.unmodifiableSet(A0v);
    }

    public VideoChatLink(GraphQLGroupRoomType graphQLGroupRoomType, GraphQLMessengerCallInviteLinkLockStatus graphQLMessengerCallInviteLinkLockStatus, 2JX r304, 2JX r305, 2JX r306, 2JX r307, 2JX r308, User user, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Set set, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.A02 = j;
        C1pq.A08("activeCallParticipants", immutableList);
        this.A0C = immutableList;
        this.A0G = l;
        this.A0V = z;
        this.A0H = str;
        C1pq.A08("creator", user);
        this.A0B = user;
        this.A0I = str2;
        this.A0J = str3;
        this.A04 = graphQLGroupRoomType;
        this.A0K = str4;
        this.A0L = str5;
        this.A0W = z2;
        this.A0X = z3;
        this.A0Y = z4;
        this.A0Z = z5;
        this.A0a = z6;
        this.A0b = z7;
        this.A0c = z8;
        this.A0d = z9;
        this.A0e = z10;
        this.A0f = z11;
        this.A0g = z12;
        this.A0h = z13;
        this.A0i = z14;
        this.A0j = z15;
        this.A0k = z16;
        this.A03 = j2;
        this.A06 = r304;
        C1pq.A08(4YT.A00(370), str6);
        this.A0M = str6;
        this.A0N = str7;
        this.A07 = r305;
        this.A05 = graphQLMessengerCallInviteLinkLockStatus;
        this.A08 = r306;
        this.A0O = str8;
        this.A0P = str9;
        this.A0Q = str10;
        this.A0R = str11;
        this.A0D = immutableList2;
        C1pq.A08(AbE.A00(701), immutableList3);
        this.A0E = immutableList3;
        this.A09 = r307;
        this.A0l = z17;
        this.A0m = z18;
        C1pq.A08("supportedAppsJoinStrategy", immutableList4);
        this.A0F = immutableList4;
        this.A0S = str12;
        C1pq.A08("url", str13);
        this.A0T = str13;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = r308;
        this.A0U = Collections.unmodifiableSet(set);
    }

    public static void A00(Parcel parcel, C23u c23u) {
        if (c23u == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, c23u);
        }
    }

    public GraphQLGroupRoomType A01() {
        if (this.A0U.contains("groupRoomType")) {
            return this.A04;
        }
        if (A0n == null) {
            synchronized (this) {
                if (A0n == null) {
                    A0n = GraphQLGroupRoomType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                }
            }
        }
        return A0n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoChatLink)) {
                return false;
            }
            VideoChatLink videoChatLink = (VideoChatLink) obj;
            if (this.A02 != videoChatLink.A02 || !11T.A0O(this.A0C, videoChatLink.A0C) || !11T.A0O(this.A0G, videoChatLink.A0G) || this.A0V != videoChatLink.A0V || !11T.A0O(this.A0H, videoChatLink.A0H) || !11T.A0O(this.A0B, videoChatLink.A0B) || !11T.A0O(this.A0I, videoChatLink.A0I) || !11T.A0O(this.A0J, videoChatLink.A0J) || A01() != videoChatLink.A01() || !11T.A0O(this.A0K, videoChatLink.A0K) || !11T.A0O(this.A0L, videoChatLink.A0L) || this.A0W != videoChatLink.A0W || this.A0X != videoChatLink.A0X || this.A0Y != videoChatLink.A0Y || this.A0Z != videoChatLink.A0Z || this.A0a != videoChatLink.A0a || this.A0b != videoChatLink.A0b || this.A0c != videoChatLink.A0c || this.A0d != videoChatLink.A0d || this.A0e != videoChatLink.A0e || this.A0f != videoChatLink.A0f || this.A0g != videoChatLink.A0g || this.A0h != videoChatLink.A0h || this.A0i != videoChatLink.A0i || this.A0j != videoChatLink.A0j || this.A0k != videoChatLink.A0k || this.A03 != videoChatLink.A03 || !11T.A0O(this.A06, videoChatLink.A06) || !11T.A0O(this.A0M, videoChatLink.A0M) || !11T.A0O(this.A0N, videoChatLink.A0N) || !11T.A0O(this.A07, videoChatLink.A07) || this.A05 != videoChatLink.A05 || !11T.A0O(this.A08, videoChatLink.A08) || !11T.A0O(this.A0O, videoChatLink.A0O) || !11T.A0O(this.A0P, videoChatLink.A0P) || !11T.A0O(this.A0Q, videoChatLink.A0Q) || !11T.A0O(this.A0R, videoChatLink.A0R) || !11T.A0O(this.A0D, videoChatLink.A0D) || !11T.A0O(this.A0E, videoChatLink.A0E) || !11T.A0O(this.A09, videoChatLink.A09) || this.A0l != videoChatLink.A0l || this.A0m != videoChatLink.A0m || !11T.A0O(this.A0F, videoChatLink.A0F) || !11T.A0O(this.A0S, videoChatLink.A0S) || !11T.A0O(this.A0T, videoChatLink.A0T) || this.A00 != videoChatLink.A00 || this.A01 != videoChatLink.A01 || !11T.A0O(this.A0A, videoChatLink.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0B, C1pq.A04(this.A0H, C1pq.A02(C1pq.A04(this.A0G, C1pq.A04(this.A0C, 1BL.A01(this.A02) + 31)), this.A0V)))));
        GraphQLGroupRoomType A01 = A01();
        int i = -1;
        int A042 = C1pq.A04(this.A07, C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A06, C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0L, C1pq.A04(this.A0K, (A04 * 31) + (A01 == null ? -1 : A01.ordinal()))), this.A0W), this.A0X), this.A0Y), this.A0Z), this.A0a), this.A0b), this.A0c), this.A0d), this.A0e), this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A03)))));
        GraphQLMessengerCallInviteLinkLockStatus graphQLMessengerCallInviteLinkLockStatus = this.A05;
        if (graphQLMessengerCallInviteLinkLockStatus != null) {
            i = graphQLMessengerCallInviteLinkLockStatus.ordinal();
        }
        return C1pq.A04(this.A0A, (((C1pq.A04(this.A0T, C1pq.A04(this.A0S, C1pq.A04(this.A0F, C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0R, C1pq.A04(this.A0Q, C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A08, (A042 * 31) + i)))))))), this.A0l), this.A0m)))) * 31) + this.A00) * 31) + this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoChatLink{activeCallParticipantCount=");
        A0k.append(this.A02);
        A0k.append(", activeCallParticipants=");
        A0k.append(this.A0C);
        A0k.append(", callCreatedTime=");
        A0k.append(this.A0G);
        A0k.append(", canDisplayActiveParticipants=");
        A0k.append(this.A0V);
        A0k.append(", conferenceName=");
        A0k.append(this.A0H);
        A0k.append(", creator=");
        A0k.append(this.A0B);
        A0k.append(", emoji=");
        A0k.append(this.A0I);
        A0k.append(", groupReportableId=");
        A0k.append(this.A0J);
        A0k.append(", groupRoomType=");
        A0k.append(A01());
        A0k.append(", groupThreadId=");
        A0k.append(this.A0K);
        A0k.append(", id=");
        A0k.append(this.A0L);
        A0k.append(", isAnonymousAllowed=");
        A0k.append(this.A0W);
        A0k.append(", isAudioRoom=");
        A0k.append(this.A0X);
        A0k.append(", isBreakoutRoom=");
        A0k.append(this.A0Y);
        A0k.append(", isCreatorIncallInviteFriendsEnabled=");
        A0k.append(this.A0Z);
        A0k.append(", isEndToEndEncrypted=");
        A0k.append(this.A0a);
        A0k.append(", isHostPresent=");
        A0k.append(this.A0b);
        A0k.append(", isJoinable=");
        A0k.append(this.A0c);
        A0k.append(", isJoinerIncallInviteFriendsEnabled=");
        A0k.append(this.A0d);
        A0k.append(", isLiveProducerForRoomEnabled=");
        A0k.append(this.A0e);
        A0k.append(", isRemoteLearningClass=");
        A0k.append(this.A0f);
        A0k.append(", isReportToFBEnabled=");
        A0k.append(this.A0g);
        A0k.append(", isReportToGroupAdminsEnabled=");
        A0k.append(this.A0h);
        A0k.append(", isRevoked=");
        A0k.append(this.A0i);
        A0k.append(", isVideoAllowed=");
        A0k.append(this.A0j);
        A0k.append(", isViewerRoomAdmin=");
        A0k.append(this.A0k);
        A0k.append(", lastAccessTime=");
        A0k.append(this.A03);
        A0k.append(", linkContainer=");
        A0k.append(this.A06);
        A0k.append(", linkHash=");
        A0k.append(this.A0M);
        A0k.append(", linkSurface=");
        A0k.append(this.A0N);
        A0k.append(", liveVideoRoomLobby=");
        A0k.append(this.A07);
        A0k.append(", lockStatus=");
        A0k.append(this.A05);
        A0k.append(", meeting=");
        A0k.append(this.A08);
        A0k.append(", meetingId=");
        A0k.append(this.A0O);
        A0k.append(", memberPin=");
        A0k.append(this.A0P);
        A0k.append(", name=");
        A0k.append(this.A0Q);
        A0k.append(", phoneNumber=");
        A0k.append(this.A0R);
        A0k.append(", ringableParticipants=");
        A0k.append(this.A0D);
        A0k.append(", ringableUsersOnJoin=");
        A0k.append(this.A0E);
        A0k.append(", selfWorkCommunity=");
        A0k.append(this.A09);
        A0k.append(", shouldCallerJoinWithMicrophoneMuted=");
        A0k.append(this.A0l);
        A0k.append(", shouldDisplayBloksLobby=");
        A0k.append(this.A0m);
        A0k.append(", supportedAppsJoinStrategy=");
        A0k.append(this.A0F);
        A0k.append(", unsupportedVersionUrl=");
        A0k.append(this.A0S);
        A0k.append(", url=");
        A0k.append(this.A0T);
        A0k.append(", version=");
        A0k.append(this.A00);
        A0k.append(", visibilityMode=");
        A0k.append(this.A01);
        A0k.append(", workCommunity=");
        A0k.append(this.A0A);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A0C);
        while (A0b.hasNext()) {
            parcel.writeParcelable((User) A0b.next(), i);
        }
        Long l = this.A0G;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A0V ? 1 : 0);
        1BL.A13(parcel, this.A0H);
        parcel.writeParcelable(this.A0B, i);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
        GraphQLGroupRoomType graphQLGroupRoomType = this.A04;
        if (graphQLGroupRoomType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLGroupRoomType.ordinal());
        }
        1BL.A13(parcel, this.A0K);
        1BL.A13(parcel, this.A0L);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeLong(this.A03);
        A00(parcel, this.A06);
        parcel.writeString(this.A0M);
        1BL.A13(parcel, this.A0N);
        A00(parcel, this.A07);
        GraphQLMessengerCallInviteLinkLockStatus graphQLMessengerCallInviteLinkLockStatus = this.A05;
        if (graphQLMessengerCallInviteLinkLockStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLMessengerCallInviteLinkLockStatus.ordinal());
        }
        A00(parcel, this.A08);
        1BL.A13(parcel, this.A0O);
        1BL.A13(parcel, this.A0P);
        1BL.A13(parcel, this.A0Q);
        1BL.A13(parcel, this.A0R);
        ImmutableList immutableList = this.A0D;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList);
            while (A0b2.hasNext()) {
                parcel.writeParcelable((VideoChatLinkRingableParticipant) A0b2.next(), i);
            }
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A0E);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((User) A0b3.next(), i);
        }
        A00(parcel, this.A09);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        1Du A0b4 = 1BL.A0b(parcel, this.A0F);
        while (A0b4.hasNext()) {
            parcel.writeString(AnonymousClass001.A0i(A0b4));
        }
        1BL.A13(parcel, this.A0S);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        A00(parcel, this.A0A);
        Set set = this.A0U;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(AnonymousClass001.A0i(it));
        }
    }
}
