package com.facebook.messaging.communitymessaging.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityMessagingJoinFlowEntrypoint.class */
public final class CommunityMessagingJoinFlowEntrypoint implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ CommunityMessagingJoinFlowEntrypoint[] A01;
    public static final CommunityMessagingJoinFlowEntrypoint A02;
    public static final CommunityMessagingJoinFlowEntrypoint A03;
    public static final CommunityMessagingJoinFlowEntrypoint A04;
    public static final CommunityMessagingJoinFlowEntrypoint A05;
    public static final CommunityMessagingJoinFlowEntrypoint A06;
    public static final CommunityMessagingJoinFlowEntrypoint A07;
    public static final CommunityMessagingJoinFlowEntrypoint A08;
    public static final CommunityMessagingJoinFlowEntrypoint A09;
    public static final CommunityMessagingJoinFlowEntrypoint A0A;
    public static final CommunityMessagingJoinFlowEntrypoint A0B;
    public static final CommunityMessagingJoinFlowEntrypoint A0C;
    public static final CommunityMessagingJoinFlowEntrypoint A0D;
    public static final CommunityMessagingJoinFlowEntrypoint A0E;
    public static final CommunityMessagingJoinFlowEntrypoint A0F;
    public static final CommunityMessagingJoinFlowEntrypoint A0G;
    public static final CommunityMessagingJoinFlowEntrypoint A0H;
    public static final CommunityMessagingJoinFlowEntrypoint A0I;
    public static final CommunityMessagingJoinFlowEntrypoint A0J;
    public static final CommunityMessagingJoinFlowEntrypoint A0K;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint = new CommunityMessagingJoinFlowEntrypoint("SHARED_LINK", 0, 0);
        A0I = communityMessagingJoinFlowEntrypoint;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint2 = new CommunityMessagingJoinFlowEntrypoint("SEARCH", 1, 1);
        A0H = communityMessagingJoinFlowEntrypoint2;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint3 = new CommunityMessagingJoinFlowEntrypoint("DIRECT_INVITE_NOTIFICATION", 2, 2);
        A07 = communityMessagingJoinFlowEntrypoint3;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint4 = new CommunityMessagingJoinFlowEntrypoint("IA_INBOX_COMMUNITY_INVITE", 3, 3);
        A0A = communityMessagingJoinFlowEntrypoint4;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint5 = new CommunityMessagingJoinFlowEntrypoint("ACTIVE_NOW_TRAY", 4, 4);
        A02 = communityMessagingJoinFlowEntrypoint5;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint6 = new CommunityMessagingJoinFlowEntrypoint("CHATS_IN_YOUR_COMMUNITIES", 5, 5);
        A03 = communityMessagingJoinFlowEntrypoint6;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint7 = new CommunityMessagingJoinFlowEntrypoint("RECOMMENDED_COMMUNITIES", 6, 6);
        A0G = communityMessagingJoinFlowEntrypoint7;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint8 = new CommunityMessagingJoinFlowEntrypoint("HIGHLIGHTS", 7, 7);
        A08 = communityMessagingJoinFlowEntrypoint8;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint9 = new CommunityMessagingJoinFlowEntrypoint("CHAT_ENTITY", 8, 8);
        A04 = communityMessagingJoinFlowEntrypoint9;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint10 = new CommunityMessagingJoinFlowEntrypoint("HIGHLIGHTS_TAB", 9, 11);
        A09 = communityMessagingJoinFlowEntrypoint10;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint11 = new CommunityMessagingJoinFlowEntrypoint("INBOX_CHANNEL_FOLDER", 10, 12);
        A0B = communityMessagingJoinFlowEntrypoint11;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint12 = new CommunityMessagingJoinFlowEntrypoint("QP_BANNER_GYSJ", 11, 13);
        A0F = communityMessagingJoinFlowEntrypoint12;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint13 = new CommunityMessagingJoinFlowEntrypoint("COMMUNITIES_TAB", 12, 14);
        A05 = communityMessagingJoinFlowEntrypoint13;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint14 = new CommunityMessagingJoinFlowEntrypoint("XMA", 13, 15);
        A0K = communityMessagingJoinFlowEntrypoint14;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint15 = new CommunityMessagingJoinFlowEntrypoint("WEB_SPLASH", 14, 16);
        A0J = communityMessagingJoinFlowEntrypoint15;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint16 = new CommunityMessagingJoinFlowEntrypoint("MOBILE_SPLASH", 15, 17);
        A0E = communityMessagingJoinFlowEntrypoint16;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint17 = new CommunityMessagingJoinFlowEntrypoint("LINK_PREVIEW_REDIRECT", 16, 18);
        A0D = communityMessagingJoinFlowEntrypoint17;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint18 = new CommunityMessagingJoinFlowEntrypoint("JOIN_CHAT_CHANNELS", 17, 19);
        A0C = communityMessagingJoinFlowEntrypoint18;
        CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint19 = new CommunityMessagingJoinFlowEntrypoint("COMMUNITY_CONTAINER", 18, 34);
        A06 = communityMessagingJoinFlowEntrypoint19;
        CommunityMessagingJoinFlowEntrypoint[] communityMessagingJoinFlowEntrypointArr = {communityMessagingJoinFlowEntrypoint, communityMessagingJoinFlowEntrypoint2, communityMessagingJoinFlowEntrypoint3, communityMessagingJoinFlowEntrypoint4, communityMessagingJoinFlowEntrypoint5, communityMessagingJoinFlowEntrypoint6, communityMessagingJoinFlowEntrypoint7, communityMessagingJoinFlowEntrypoint8, communityMessagingJoinFlowEntrypoint9, communityMessagingJoinFlowEntrypoint10, communityMessagingJoinFlowEntrypoint11, communityMessagingJoinFlowEntrypoint12, communityMessagingJoinFlowEntrypoint13, communityMessagingJoinFlowEntrypoint14, communityMessagingJoinFlowEntrypoint15, communityMessagingJoinFlowEntrypoint16, communityMessagingJoinFlowEntrypoint17, communityMessagingJoinFlowEntrypoint18, communityMessagingJoinFlowEntrypoint19};
        A01 = communityMessagingJoinFlowEntrypointArr;
        A00 = C00t.A00(communityMessagingJoinFlowEntrypointArr);
        CREATOR = new CSW(87);
    }

    public CommunityMessagingJoinFlowEntrypoint(String str, int i, int i2) {
        this.value = i2;
    }

    public static CommunityMessagingJoinFlowEntrypoint valueOf(String str) {
        return (CommunityMessagingJoinFlowEntrypoint) Enum.valueOf(CommunityMessagingJoinFlowEntrypoint.class, str);
    }

    public static CommunityMessagingJoinFlowEntrypoint[] values() {
        return (CommunityMessagingJoinFlowEntrypoint[]) A01.clone();
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
