package com.facebook.graphql.enums;

import com.facebook.acra.constants.ActionId;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLStoryCardTypes.class */
public final class GraphQLStoryCardTypes {
    public static final /* synthetic */ GraphQLStoryCardTypes[] A00;
    public static final GraphQLStoryCardTypes A01;
    public static final GraphQLStoryCardTypes A02;
    public static final GraphQLStoryCardTypes A03;
    public final String serverValue;

    static {
        GraphQLStoryCardTypes A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A03 = A002;
        GraphQLStoryCardTypes A003 = A00("ADD_PREDICTION_MID_CARD", 1);
        GraphQLStoryCardTypes A004 = A00("ADD_TO_STORY", 2);
        GraphQLStoryCardTypes A005 = A00("ADD_TO_STORY_MID_CARD", 3);
        GraphQLStoryCardTypes A006 = A00("ADMINED_ADDITIONAL_PROFILE_STORY", 4);
        GraphQLStoryCardTypes A007 = A00("AGGREGATED_BIRTHDAY_STORY", 5);
        GraphQLStoryCardTypes A008 = A00("AGGREGATED_STORY", 6);
        GraphQLStoryCardTypes A009 = A00("ARCHIVED_STORY", 7);
        GraphQLStoryCardTypes A0010 = A00("BIRTHDAY_GENERATED_STORY", 8);
        GraphQLStoryCardTypes A0011 = A00("BIRTHDAY_STORY", 9);
        GraphQLStoryCardTypes A0012 = A00("BIRTHDAY_WALLPOST_GENERATED_STORY", 10);
        GraphQLStoryCardTypes A0013 = A00("BUCKET_FEEDBACK_STORY", 11);
        GraphQLStoryCardTypes A0014 = A00("CHANNEL_BUCKET", 12);
        GraphQLStoryCardTypes A0015 = A00("CHANNEL_GENERATED_STORY", 13);
        GraphQLStoryCardTypes A0016 = A00("CHANNEL_STORY", 14);
        GraphQLStoryCardTypes A0017 = A00("CHRONOLOGICALLY_AGGREGATED_STORY", 15);
        GraphQLStoryCardTypes A0018 = A00("CONTACT_IMPORTER_STORY", 16);
        GraphQLStoryCardTypes A0019 = A00("CONVERSATION_STARTER_STORY", 17);
        GraphQLStoryCardTypes A0020 = A00("COVID_SUPPORT", 18);
        GraphQLStoryCardTypes A0021 = A00("COVID_SUPPORT_GENERATED_STORY", 19);
        GraphQLStoryCardTypes A0022 = A00("CREW_STORY", 20);
        GraphQLStoryCardTypes A0023 = A00("DEPTH_PLAYGROUND_GENERATED_STORY", 21);
        GraphQLStoryCardTypes A0024 = A00("DIRECT", 22);
        GraphQLStoryCardTypes A0025 = A00("DIRECT_NUX", 23);
        GraphQLStoryCardTypes A0026 = A00("DUMMY_SELF_BUCKET", 24);
        GraphQLStoryCardTypes A0027 = A00("EVENT_STORY", 25);
        GraphQLStoryCardTypes A0028 = A00("FEATURED_HIGHLIGHTS_STORY", 26);
        GraphQLStoryCardTypes A0029 = A00("FRIENDVERSARY_STORY", 27);
        GraphQLStoryCardTypes A0030 = A00("FRIEND_GROUP_STORY", 28);
        GraphQLStoryCardTypes A0031 = A00("FRIEND_REQUEST_STORY", 29);
        GraphQLStoryCardTypes A0032 = A00("FX_FB_STORIES_CROSS_POSTING_AFTER_SELFVIEW_QP", 30);
        GraphQLStoryCardTypes A0033 = A00("GEMSTONE_STORY", 31);
        GraphQLStoryCardTypes A0034 = A00("GOODWILL_GENERATED_STORY", 32);
        GraphQLStoryCardTypes A0035 = A00("GOODWILL_STORY", 33);
        GraphQLStoryCardTypes A0036 = A00("GROUP_DIRECT", 34);
        GraphQLStoryCardTypes A0037 = A00("GROUP_PROMPT_STORY", 35);
        GraphQLStoryCardTypes A0038 = A00("GROUP_STORY", 36);
        GraphQLStoryCardTypes A0039 = A00("GROUP_USER_STORY", 37);
        GraphQLStoryCardTypes A0040 = A00("HASHTAG_GENERATED_STORY", 38);
        GraphQLStoryCardTypes A0041 = A00("HASHTAG_STORY", 39);
        GraphQLStoryCardTypes A0042 = A00("HIGHLIGHTED_STORY", 40);
        GraphQLStoryCardTypes A0043 = A00("IMBE_STORY", 41);
        GraphQLStoryCardTypes A0044 = A00("LAST_CHANCE_STORY", 42);
        GraphQLStoryCardTypes A0045 = A00("LIVE_STORY", 43);
        GraphQLStoryCardTypes A0046 = A00("LOCAL_EVENT_RSVP_STORY", 44);
        GraphQLStoryCardTypes A0047 = A00("LOCAL_TRENDING_EVENTS_STORY", 45);
        GraphQLStoryCardTypes A0048 = A00("LOCKED_PROFILE_COMPREHENSION_MID_CARD", 46);
        GraphQLStoryCardTypes A0049 = A00("LOL_DAILY_DROP_STORY", 47);
        GraphQLStoryCardTypes A0050 = A00("MEMORIES_STORY", 48);
        GraphQLStoryCardTypes A0051 = A00("MESSENGER_THREAD_STORY", 49);
        GraphQLStoryCardTypes A0052 = A00("MOMENTS_STORY", 50);
        GraphQLStoryCardTypes A0053 = A00("MULTI_AUTHOR_GENERATED_STORY", 51);
        GraphQLStoryCardTypes A0054 = A00("MULTI_AUTHOR_STORY", 52);
        GraphQLStoryCardTypes A0055 = A00("MUSIC_STORY_MID_CARD", 53);
        GraphQLStoryCardTypes A0056 = A00("M_GROUP_STORY", 54);
        GraphQLStoryCardTypes A0057 = A00("NATIVE_TEMPLATES_GENERATED_STORY", 55);
        GraphQLStoryCardTypes A0058 = A00("NEW_FRIENDSHIP_STORY", 56);
        GraphQLStoryCardTypes A0059 = A00("NULL_HEADS", 57);
        GraphQLStoryCardTypes A0060 = A00("NULL_STATE_STORY", 58);
        GraphQLStoryCardTypes A0061 = A00("ONE_BY_ONE_MID_CARD", 59);
        GraphQLStoryCardTypes A0062 = A00("OPTIMISTIC_STORY", 60);
        GraphQLStoryCardTypes A0063 = A00("PAGE_GENERATED_STORY", 61);
        GraphQLStoryCardTypes A0064 = A00("PAGE_INSIGHTS_STORY", 62);
        GraphQLStoryCardTypes A0065 = A00("PAGE_STORY", 63);
        GraphQLStoryCardTypes A0066 = A00("PREDICTION_STORY_RESULTS", 64);
        GraphQLStoryCardTypes A0067 = A00("PRODUCTION_POG_STORY", 65);
        GraphQLStoryCardTypes A0068 = A00("PROFESSIONAL_STORY", 66);
        GraphQLStoryCardTypes A0069 = A00("PROFILE_PLUS_STORY", 67);
        GraphQLStoryCardTypes A0070 = A00("PROMOTION_GENERATED_STORY", 68);
        GraphQLStoryCardTypes A0071 = A00("PROMOTION_STORY", 69);
        GraphQLStoryCardTypes A0072 = A00("PYMK_GENERATED_STORY", 70);
        GraphQLStoryCardTypes A0073 = A00("PYMK_PROFILE_FORWARD_STORY", 71);
        GraphQLStoryCardTypes A0074 = A00("PYMK_STORY", 72);
        GraphQLStoryCardTypes A0075 = A00("QUICK_PROMOTION_STORY_VIEWER_ONLY_STORY", 73);
        GraphQLStoryCardTypes A0076 = A00("REPLY_STORY", 74);
        GraphQLStoryCardTypes A0077 = A00("SCHOOL_COMMUNITY_STORY", 75);
        GraphQLStoryCardTypes A0078 = A00("SC_INDIA_FRIENDING_CTA_STORY", 76);
        GraphQLStoryCardTypes A0079 = A00("SELF_BIRTHDAY_STORY", 77);
        GraphQLStoryCardTypes A0080 = A00("SHARED_ADMINED_ADDITIONAL_PROFILE_STORY", 78);
        GraphQLStoryCardTypes A0081 = A00("SHARED_CHANNEL_STORY", 79);
        GraphQLStoryCardTypes A0082 = A00("SHARED_PAGE_STORY", 80);
        GraphQLStoryCardTypes A0083 = A00("SHARED_PROFILE_PLUS_STORY", 81);
        GraphQLStoryCardTypes A0084 = A00("SHARED_REPLY_STORY", 82);
        GraphQLStoryCardTypes A0085 = A00("SHARED_USER_STORY", 83);
        GraphQLStoryCardTypes A0086 = A00("STICKER_AGGREGATED_GENERATED_STORY", 84);
        GraphQLStoryCardTypes A0087 = A00("STICKER_AGGREGATED_STORY", 85);
        GraphQLStoryCardTypes A0088 = A00("STORIES_END_CARD", 86);
        GraphQLStoryCardTypes A0089 = A00("STORIES_IG_XPOSTING_MID_CARD", 87);
        GraphQLStoryCardTypes A0090 = A00("STORIES_READER_MID_CARD_UPSELL", 88);
        GraphQLStoryCardTypes A0091 = A00("STORIES_READER_POG_UPSELL", 89);
        GraphQLStoryCardTypes A0092 = A00("STORY", 90);
        A01 = A0092;
        GraphQLStoryCardTypes A0093 = A00("STORY_AUTOPLAY_MID_CARD", 91);
        GraphQLStoryCardTypes A0094 = A00("STORY_NUX", 92);
        GraphQLStoryCardTypes A0095 = A00("STORY_QP_RMS_MIDCARD", 93);
        GraphQLStoryCardTypes A0096 = A00("STORY_REQUEST_MID_CARD", 94);
        GraphQLStoryCardTypes A0097 = A00("STORY_VIEWER_ONLY_GENERATED_STORY", 95);
        GraphQLStoryCardTypes A0098 = A00("SUGGESTED_AGGREGATED_STORY", 96);
        GraphQLStoryCardTypes A0099 = A00("TOPIC_STORY", 97);
        GraphQLStoryCardTypes A00100 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 98);
        A02 = A00100;
        GraphQLStoryCardTypes A00101 = A00("UNPUBLISHED_STORY", 99);
        GraphQLStoryCardTypes A00102 = A00("WAS_LIVE", 100);
        GraphQLStoryCardTypes[] graphQLStoryCardTypesArr = new GraphQLStoryCardTypes[ActionId.ON_VIEW_CREATED_END];
        System.arraycopy(new GraphQLStoryCardTypes[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, 0, graphQLStoryCardTypesArr, 0, 27);
        System.arraycopy(new GraphQLStoryCardTypes[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055}, 0, graphQLStoryCardTypesArr, 27, 27);
        System.arraycopy(new GraphQLStoryCardTypes[]{A0056, A0057, A0058, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081, A0082}, 0, graphQLStoryCardTypesArr, 54, 27);
        System.arraycopy(new GraphQLStoryCardTypes[]{A0083, A0084, A0085, A0086, A0087, A0088, A0089, A0090, A0091, A0092, A0093, A0094, A0095, A0096, A0097, A0098, A0099, A00100, A00101, A00102}, 0, graphQLStoryCardTypesArr, 81, 20);
        A00 = graphQLStoryCardTypesArr;
    }

    public GraphQLStoryCardTypes(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLStoryCardTypes A00(String str, int i) {
        return new GraphQLStoryCardTypes(str, i, str);
    }

    public static GraphQLStoryCardTypes valueOf(String str) {
        return (GraphQLStoryCardTypes) Enum.valueOf(GraphQLStoryCardTypes.class, str);
    }

    public static GraphQLStoryCardTypes[] values() {
        return (GraphQLStoryCardTypes[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
