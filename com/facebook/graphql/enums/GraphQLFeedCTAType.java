package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLFeedCTAType.class */
public final class GraphQLFeedCTAType {
    public static final /* synthetic */ GraphQLFeedCTAType[] A00;
    public static final GraphQLFeedCTAType A01;
    public final String serverValue;

    static {
        GraphQLFeedCTAType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLFeedCTAType A003 = A00("ADD_PHOTOS_TO_MAP", 1);
        GraphQLFeedCTAType A004 = A00("ADD_TO_ALBUM", 2);
        GraphQLFeedCTAType A005 = A00("ADD_TO_FB_STORY", 3);
        GraphQLFeedCTAType A006 = A00("ADD_TO_POST", 4);
        GraphQLFeedCTAType A007 = A00("AMPLIFIED_MOVEMENTS", 5);
        GraphQLFeedCTAType A008 = A00("ARTICLE_CONTEXT", 6);
        GraphQLFeedCTAType A009 = A00("BIRTHDAY_VIDEO", 7);
        GraphQLFeedCTAType A0010 = A00("BLOOD_DONATION_UPSELL", 8);
        GraphQLFeedCTAType A0011 = A00("BLOOD_REQUEST_UPSELL", 9);
        GraphQLFeedCTAType A0012 = A00("BOOST_LISTING", 10);
        GraphQLFeedCTAType A0013 = A00("COLLABORATIVE_POST_ADD_MORE", 11);
        GraphQLFeedCTAType A0014 = A00("COVER_PHOTO_UPDATE", 12);
        GraphQLFeedCTAType A0015 = A00("CREATE_EFFECT", 13);
        GraphQLFeedCTAType A0016 = A00("CREATE_POLL", 14);
        GraphQLFeedCTAType A0017 = A00("CREATE_TOURNAMENT_UPSELL", 15);
        GraphQLFeedCTAType A0018 = A00("CRISIS_COMMUNITY_HELP_POST", 16);
        GraphQLFeedCTAType A0019 = A00("CRISIS_COMMUNITY_HELP_REQUEST", 17);
        GraphQLFeedCTAType A0020 = A00("CRISIS_NEWS_UPSELL", 18);
        GraphQLFeedCTAType A0021 = A00("CULTURAL_MOMENT_HOLIDAY_CARD", 19);
        GraphQLFeedCTAType A0022 = A00("EDIT_POST", 20);
        GraphQLFeedCTAType A0023 = A00("EXPLORE_VIDEO_HOME", 21);
        GraphQLFeedCTAType A0024 = A00("FOR_SALE_CROSS_POSTING", 22);
        GraphQLFeedCTAType A0025 = A00("FOR_SALE_POST_REMOVE_SALE_FORMAT", 23);
        GraphQLFeedCTAType A0026 = A00("FOR_SALE_SHIPPING", 24);
        GraphQLFeedCTAType A0027 = A00("FUNDRAISER_OFFSITE", 25);
        GraphQLFeedCTAType A0028 = A00("FUNDRAISER_OVERLAY", 26);
        GraphQLFeedCTAType A0029 = A00("GIF_UPSELL", 27);
        GraphQLFeedCTAType A0030 = A00("GOODWILL_ADD_TO_STORY", 28);
        GraphQLFeedCTAType A0031 = A00("GROUP_MEMBER_PROFILE", 29);
        GraphQLFeedCTAType A0032 = A00("HEALTH_BLOOD_REQUEST_POST", 30);
        GraphQLFeedCTAType A0033 = A00("INSPIRATION", 31);
        GraphQLFeedCTAType A0034 = A00("JOIN_CHALLENGE", 32);
        GraphQLFeedCTAType A0035 = A00("JOIN_GROUP_CHALLENGE", 33);
        GraphQLFeedCTAType A0036 = A00("LIVE", 34);
        GraphQLFeedCTAType A0037 = A00("LIVE_CHECKIN", 35);
        GraphQLFeedCTAType A0038 = A00("LIVE_FORMAT", 36);
        GraphQLFeedCTAType A0039 = A00("LOYALTY_LEARN_MORE", 37);
        GraphQLFeedCTAType A0040 = A00("MARS", 38);
        GraphQLFeedCTAType A0041 = A00("MENTORSHIP_SHARE_APPLICATION_ATTACHMENT", 39);
        GraphQLFeedCTAType A0042 = A00("MOVIE", 40);
        GraphQLFeedCTAType A0043 = A00("NON_SALE_POST_CROSS_POST_TO_MARKETPLACE", 41);
        GraphQLFeedCTAType A0044 = A00("PLAY_PODCAST_EPISODE", 42);
        GraphQLFeedCTAType A0045 = A00("POE_PURCHASE", 43);
        GraphQLFeedCTAType A0046 = A00("POE_VIEW_EVENT", 44);
        GraphQLFeedCTAType A0047 = A00("POST_ABOUT_TOPIC", 45);
        GraphQLFeedCTAType A0048 = A00("PRIVATE_REPLY_REVIEW", 46);
        GraphQLFeedCTAType A0049 = A00("PROFILE_PICTURE_OVERLAY", 47);
        GraphQLFeedCTAType A0050 = A00("PROFILE_SONG", 48);
        GraphQLFeedCTAType A0051 = A00("PROFILE_VIDEO", 49);
        GraphQLFeedCTAType A0052 = A00("QUILTS_PROMINENT_CONTRIBUTE", 50);
        GraphQLFeedCTAType A0053 = A00("QUILTS_TRY_IT", 51);
        GraphQLFeedCTAType A0054 = A00("SAVE_PODCAST_EPISODE", 52);
        GraphQLFeedCTAType A0055 = A00("SELFIE_TOPIC", 53);
        GraphQLFeedCTAType A0056 = A00("SHARE_PROMPT", 54);
        GraphQLFeedCTAType A0057 = A00("SHORT_VIDEO_WATCH", 55);
        GraphQLFeedCTAType A0058 = A00("STALE_PROFILE", 56);
        GraphQLFeedCTAType A0059 = A00("STANDARD_STORY_LEVEL", 57);
        GraphQLFeedCTAType A0060 = A00("STORY_AVATAR_TEXT_POST_UPSELL", 58);
        GraphQLFeedCTAType A0061 = A00("STORY_SATP_UPSELL", 59);
        GraphQLFeedCTAType A0062 = A00("SWIPEABLE_FRAMES", 60);
        GraphQLFeedCTAType A0063 = A00("TAGGED_IN_STORY", 61);
        GraphQLFeedCTAType A0064 = A00("TALENT_SHOW_AUDITION", 62);
        GraphQLFeedCTAType A0065 = A00("TALENT_SHOW_AUDITION_VOTE", 63);
        GraphQLFeedCTAType A0066 = A00("THREE_D_IN_FEED", 64);
        GraphQLFeedCTAType A0067 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 65);
        GraphQLFeedCTAType A0068 = A00("VOICE_POST", 66);
        GraphQLFeedCTAType A0069 = A00("VOLUNTEERING_SIGNUP", 67);
        GraphQLFeedCTAType A0070 = A00("WRITE_ON_WALL", 68);
        GraphQLFeedCTAType A0071 = A00("WRITE_REVIEW", 69);
        GraphQLFeedCTAType[] graphQLFeedCTATypeArr = new GraphQLFeedCTAType[70];
        System.arraycopy(new GraphQLFeedCTAType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, 0, graphQLFeedCTATypeArr, 0, 27);
        System.arraycopy(new GraphQLFeedCTAType[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055}, 0, graphQLFeedCTATypeArr, 27, 27);
        System.arraycopy(new GraphQLFeedCTAType[]{A0056, A0057, A0058, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071}, 0, graphQLFeedCTATypeArr, 54, 16);
        A00 = graphQLFeedCTATypeArr;
    }

    public GraphQLFeedCTAType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLFeedCTAType A00(String str, int i) {
        return new GraphQLFeedCTAType(str, i, str);
    }

    public static GraphQLFeedCTAType valueOf(String str) {
        return (GraphQLFeedCTAType) Enum.valueOf(GraphQLFeedCTAType.class, str);
    }

    public static GraphQLFeedCTAType[] values() {
        return (GraphQLFeedCTAType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
