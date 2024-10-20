package com.facebook.messaging.data.communitymessaging.memberlist.model;

import X.7zL;
import X.7zU;
import X.C00t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityMemberListSource.class */
public final class CommunityMemberListSource implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ CommunityMemberListSource[] A01;
    public static final CommunityMemberListSource A02;
    public static final CommunityMemberListSource A03;
    public static final CommunityMemberListSource A04;
    public static final CommunityMemberListSource A05;
    public static final CommunityMemberListSource A06;
    public static final CommunityMemberListSource A07;
    public static final CommunityMemberListSource A08;
    public static final CommunityMemberListSource A09;
    public static final CommunityMemberListSource A0A;
    public static final CommunityMemberListSource A0B;
    public static final CommunityMemberListSource A0C;
    public static final CommunityMemberListSource A0D;
    public static final CommunityMemberListSource A0E;
    public static final CommunityMemberListSource A0F;
    public static final CommunityMemberListSource A0G;
    public static final CommunityMemberListSource A0H;
    public static final CommunityMemberListSource A0I;
    public static final CommunityMemberListSource A0J;
    public static final CommunityMemberListSource A0K;
    public static final CommunityMemberListSource A0L;
    public static final CommunityMemberListSource A0M;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        CommunityMemberListSource communityMemberListSource = new CommunityMemberListSource("MEMBER_LIST", 0, 0);
        A0I = communityMemberListSource;
        CommunityMemberListSource communityMemberListSource2 = new CommunityMemberListSource("INVITE_MEMBER_LIST", 1, 1);
        A0B = communityMemberListSource2;
        CommunityMemberListSource communityMemberListSource3 = new CommunityMemberListSource("INVITE_ACTIVE_MEMBER", 2, 2);
        A03 = communityMemberListSource3;
        CommunityMemberListSource communityMemberListSource4 = new CommunityMemberListSource("INVITE_CONVERSATION_STARTER", 3, 3);
        A07 = communityMemberListSource4;
        CommunityMemberListSource communityMemberListSource5 = new CommunityMemberListSource("INVITE_NEW_MEMBERS", 4, 4);
        A0E = communityMemberListSource5;
        CommunityMemberListSource communityMemberListSource6 = new CommunityMemberListSource("INVITE_FACEBOOK_FRIENDS", 5, 5);
        A08 = communityMemberListSource6;
        CommunityMemberListSource communityMemberListSource7 = new CommunityMemberListSource("INVITE_ALL_MEMBERS", 6, 6);
        A06 = communityMemberListSource7;
        CommunityMemberListSource communityMemberListSource8 = new CommunityMemberListSource("THREAD_PARTICIPANT_LIST", 7, 7);
        A0M = communityMemberListSource8;
        CommunityMemberListSource communityMemberListSource9 = new CommunityMemberListSource("MENTION_LIST", 8, 8);
        A0J = communityMemberListSource9;
        CommunityMemberListSource communityMemberListSource10 = new CommunityMemberListSource("INVITE_NON_MEMBERS", 9, 11);
        A0F = communityMemberListSource10;
        CommunityMemberListSource communityMemberListSource11 = new CommunityMemberListSource("PENDING_JOIN_REQUEST", 10, 12);
        A0K = communityMemberListSource11;
        CommunityMemberListSource communityMemberListSource12 = new CommunityMemberListSource("BLOCKED_MEMBER_LIST", 11, 13);
        A02 = communityMemberListSource12;
        CommunityMemberListSource communityMemberListSource13 = new CommunityMemberListSource("INVITE_FB_FRIENDS_AND_FOLLOWERS", 12, 15);
        A09 = communityMemberListSource13;
        CommunityMemberListSource communityMemberListSource14 = new CommunityMemberListSource("INVITE_ALL_FB_FRIENDS", 13, 16);
        A04 = communityMemberListSource14;
        CommunityMemberListSource communityMemberListSource15 = new CommunityMemberListSource("INVITE_MOST_INTERACTED_FB_FRIENDS", 14, 17);
        A0C = communityMemberListSource15;
        CommunityMemberListSource communityMemberListSource16 = new CommunityMemberListSource("INVITE_TOP_FANS", 15, 18);
        A0H = communityMemberListSource16;
        CommunityMemberListSource communityMemberListSource17 = new CommunityMemberListSource("INVITE_TOP_COMMENTERS", 16, 19);
        A0G = communityMemberListSource17;
        CommunityMemberListSource communityMemberListSource18 = new CommunityMemberListSource("INVITE_NEW_FOLLOWERS", 17, 20);
        A0D = communityMemberListSource18;
        CommunityMemberListSource communityMemberListSource19 = new CommunityMemberListSource("INVITE_ALL_FOLLOWERS", 18, 21);
        A05 = communityMemberListSource19;
        CommunityMemberListSource communityMemberListSource20 = new CommunityMemberListSource("INVITE_GROUP_THREAD_MEMBERS", 19, 24);
        A0A = communityMemberListSource20;
        CommunityMemberListSource communityMemberListSource21 = new CommunityMemberListSource("THREAD_JOIN_REQUEST_QUEUE", 20, 25);
        A0L = communityMemberListSource21;
        CommunityMemberListSource[] communityMemberListSourceArr = {communityMemberListSource, communityMemberListSource2, communityMemberListSource3, communityMemberListSource4, communityMemberListSource5, communityMemberListSource6, communityMemberListSource7, communityMemberListSource8, communityMemberListSource9, communityMemberListSource10, communityMemberListSource11, communityMemberListSource12, communityMemberListSource13, communityMemberListSource14, communityMemberListSource15, communityMemberListSource16, communityMemberListSource17, communityMemberListSource18, communityMemberListSource19, communityMemberListSource20, communityMemberListSource21};
        A01 = communityMemberListSourceArr;
        A00 = C00t.A00(communityMemberListSourceArr);
        CREATOR = 7zL.A0v(31);
    }

    public CommunityMemberListSource(String str, int i, int i2) {
        this.value = i2;
    }

    public static CommunityMemberListSource valueOf(String str) {
        return (CommunityMemberListSource) Enum.valueOf(CommunityMemberListSource.class, str);
    }

    public static CommunityMemberListSource[] values() {
        return (CommunityMemberListSource[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zU.A11(parcel, this);
    }
}
