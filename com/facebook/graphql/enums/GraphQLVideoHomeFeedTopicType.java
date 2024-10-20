package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLVideoHomeFeedTopicType.class */
public final class GraphQLVideoHomeFeedTopicType {
    public static final /* synthetic */ GraphQLVideoHomeFeedTopicType[] A00;
    public static final GraphQLVideoHomeFeedTopicType A01;
    public final String serverValue;

    static {
        GraphQLVideoHomeFeedTopicType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLVideoHomeFeedTopicType A003 = A00("ALL_VIDEOS", 1);
        GraphQLVideoHomeFeedTopicType A004 = A00("ANIMALS", 2);
        GraphQLVideoHomeFeedTopicType A005 = A00("AUDIO", 3);
        GraphQLVideoHomeFeedTopicType A006 = A00("BEAUTY", 4);
        GraphQLVideoHomeFeedTopicType A007 = A00("CREATE_WATCH_PARTY", 5);
        GraphQLVideoHomeFeedTopicType A008 = A00("EPHEMERAL_DESTINATION", 6);
        GraphQLVideoHomeFeedTopicType A009 = A00("EXPLORE_FEED", 7);
        GraphQLVideoHomeFeedTopicType A0010 = A00("EXPLORE_HASHTAG_A", 8);
        GraphQLVideoHomeFeedTopicType A0011 = A00("EXPLORE_HASHTAG_B", 9);
        GraphQLVideoHomeFeedTopicType A0012 = A00("EXPLORE_SUBTAB", 10);
        GraphQLVideoHomeFeedTopicType A0013 = A00("FOLLOWING", 11);
        GraphQLVideoHomeFeedTopicType A0014 = A00("FOLLOWING_CONTINUE_WATCHING", 12);
        GraphQLVideoHomeFeedTopicType A0015 = A00("FOLLOWING_LATEST", 13);
        GraphQLVideoHomeFeedTopicType A0016 = A00("FOLLOWING_NOT_WATCHED", 14);
        GraphQLVideoHomeFeedTopicType A0017 = A00("FOLLOWING_RECOMMENDED", 15);
        GraphQLVideoHomeFeedTopicType A0018 = A00("FOOD", 16);
        GraphQLVideoHomeFeedTopicType A0019 = A00("FOR_YOU", 17);
        GraphQLVideoHomeFeedTopicType A0020 = A00("GAMING", 18);
        GraphQLVideoHomeFeedTopicType A0021 = A00("HOME", 19);
        GraphQLVideoHomeFeedTopicType A0022 = A00("INTERESTS", 20);
        GraphQLVideoHomeFeedTopicType A0023 = A00("LBV", 21);
        GraphQLVideoHomeFeedTopicType A0024 = A00("LIVE", 22);
        GraphQLVideoHomeFeedTopicType A0025 = A00("LIVE_INTEREST", 23);
        GraphQLVideoHomeFeedTopicType A0026 = A00("MAJOR_MOMENTS", 24);
        GraphQLVideoHomeFeedTopicType A0027 = A00("MUSIC", 25);
        GraphQLVideoHomeFeedTopicType A0028 = A00("MY_LIBRARY", 26);
        GraphQLVideoHomeFeedTopicType[] graphQLVideoHomeFeedTopicTypeArr = new GraphQLVideoHomeFeedTopicType[38];
        System.arraycopy(new GraphQLVideoHomeFeedTopicType[]{A00("NEWS", 27), A00("PILLS", 28), A00("REELS", 29), A00("SAVED_VIDEOS", 30), A00("SBO", 31), A00("SPONSORED", 32), A00("SPORTS", 33), A00("TIMELY", 34), A00("TOP_MOST_SHARED_VIDEOS", 35), A00("TRENDING_LEADERBOARD", 36), A00("WATCHLIST", 37)}, 1BK.A1W(new GraphQLVideoHomeFeedTopicType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLVideoHomeFeedTopicTypeArr) ? 1 : 0, graphQLVideoHomeFeedTopicTypeArr, 27, 11);
        A00 = graphQLVideoHomeFeedTopicTypeArr;
    }

    public GraphQLVideoHomeFeedTopicType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLVideoHomeFeedTopicType A00(String str, int i) {
        return new GraphQLVideoHomeFeedTopicType(str, i, str);
    }

    public static GraphQLVideoHomeFeedTopicType valueOf(String str) {
        return (GraphQLVideoHomeFeedTopicType) Enum.valueOf(GraphQLVideoHomeFeedTopicType.class, str);
    }

    public static GraphQLVideoHomeFeedTopicType[] values() {
        return (GraphQLVideoHomeFeedTopicType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
