package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLLivingRoomEntrySource.class */
public final class GraphQLLivingRoomEntrySource {
    public static final /* synthetic */ GraphQLLivingRoomEntrySource[] A00;
    public static final GraphQLLivingRoomEntrySource A01;
    public static final GraphQLLivingRoomEntrySource A02;
    public static final GraphQLLivingRoomEntrySource A03;
    public final String serverValue;

    static {
        GraphQLLivingRoomEntrySource A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A03 = A002;
        GraphQLLivingRoomEntrySource A003 = A00("CHANNEL_PLAYER", 1);
        GraphQLLivingRoomEntrySource A004 = A00("COMPOSER", 2);
        GraphQLLivingRoomEntrySource A005 = A00("CTA_CREATION_DIALOG", 3);
        GraphQLLivingRoomEntrySource A006 = A00("DASHBOARD", 4);
        GraphQLLivingRoomEntrySource A007 = A00("DEEPLINK", 5);
        GraphQLLivingRoomEntrySource A008 = A00("END_SCREEN_CHAINING", 6);
        GraphQLLivingRoomEntrySource A009 = A00("EVERGREEN_CONSUMPTION_QP", 7);
        GraphQLLivingRoomEntrySource A0010 = A00("EVERGREEN_PRODUCTION_QP", 8);
        GraphQLLivingRoomEntrySource A0011 = A00("FEED", 9);
        GraphQLLivingRoomEntrySource A0012 = A00("FEED_JOIN_CTA", 10);
        GraphQLLivingRoomEntrySource A0013 = A00("FEED_QP", 11);
        GraphQLLivingRoomEntrySource A0014 = A00("GOODWILL_THROWBACK_CTA", 12);
        GraphQLLivingRoomEntrySource A0015 = A00("GROUPS_TAB", 13);
        GraphQLLivingRoomEntrySource A0016 = A00("GROUP_FEED", 14);
        GraphQLLivingRoomEntrySource A0017 = A00("GROUP_FEED_QP", 15);
        GraphQLLivingRoomEntrySource A0018 = A00("LIVE_VIDEO_SHARE_SHEET", 16);
        GraphQLLivingRoomEntrySource A0019 = A00("MESSENGER_AUTO_JOIN", 17);
        GraphQLLivingRoomEntrySource A0020 = A00("MESSENGER_COMPOSER", 18);
        GraphQLLivingRoomEntrySource A0021 = A00("MESSENGER_INBOX", 19);
        GraphQLLivingRoomEntrySource A0022 = A00("MESSENGER_RTC_CALL", 20);
        A01 = A0022;
        GraphQLLivingRoomEntrySource A0023 = A00("MESSENGER_RTC_CALL_PIP", 21);
        A02 = A0023;
        GraphQLLivingRoomEntrySource A0024 = A00("MESSENGER_SOLO_PLAYER", 22);
        GraphQLLivingRoomEntrySource A0025 = A00("MESSENGER_SOLO_PLAYER_FULL_SCREEN", 23);
        GraphQLLivingRoomEntrySource A0026 = A00("MESSENGER_THREAD_BANNER", 24);
        GraphQLLivingRoomEntrySource A0027 = A00("MESSENGER_VIDEO_ATTACHMENT", 25);
        GraphQLLivingRoomEntrySource A0028 = A00("MESSENGER_XMA", 26);
        GraphQLLivingRoomEntrySource[] graphQLLivingRoomEntrySourceArr = new GraphQLLivingRoomEntrySource[49];
        System.arraycopy(new GraphQLLivingRoomEntrySource[]{A00("NOTIFICATIONS", 27), A00("PAGE_FEED_OPTION", 28), A00("PAGE_TIMELINE", 29), A00("PERMALINK", 30), A00("PUSH_NOTIFICATIONS", 31), A00("REPLAY_CHAINING_BANNER", 32), A00("REPLAY_CHIANING_LIST", 33), A00("SCHEDULED_STORY_ATTACHMENT", 34), A00("SEARCH_RESULTS", 35), A00("SEARCH_VIDEO_HOME", 36), A00("SEARCH_VIDEO_TAB", 37), A00("SOCIAL_PLAYER", 38), A00("STORY_ATTACHMENT", 39), A00("TAHOE", 40), A00("TAHOE_TO_FEED", 41), A00("UFI_VOICE_ACTOR_CHANGE", 42), A00("USER_TIMELINE", 43), A00("WATCHING_TOGETHER_UNIT", 44), A00("WATCHING_TOGETHER_UNIT_GROUPS_TAB", 45), A00("WATCH_FEED_INJECTION", 46), A00("WATCH_PARTY_RST_CUE", 47), A00("WATCH_TAB", 48)}, 1BK.A1W(new GraphQLLivingRoomEntrySource[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLLivingRoomEntrySourceArr) ? 1 : 0, graphQLLivingRoomEntrySourceArr, 27, 22);
        A00 = graphQLLivingRoomEntrySourceArr;
    }

    public GraphQLLivingRoomEntrySource(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLLivingRoomEntrySource A00(String str, int i) {
        return new GraphQLLivingRoomEntrySource(str, i, str);
    }

    public static GraphQLLivingRoomEntrySource valueOf(String str) {
        return (GraphQLLivingRoomEntrySource) Enum.valueOf(GraphQLLivingRoomEntrySource.class, str);
    }

    public static GraphQLLivingRoomEntrySource[] values() {
        return (GraphQLLivingRoomEntrySource[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
