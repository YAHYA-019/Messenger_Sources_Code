package com.facebook.graphql.enums;

/* loaded from: GraphQLStoryHeaderType.class */
public enum GraphQLStoryHeaderType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BREAKING("BREAKING"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPASS_SUGGESTION("COMPASS_SUGGESTION"),
    /* JADX INFO: Fake field, exist only in values array */
    DEPRECATED("DEPRECATED"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVER_FEED("DISCOVER_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    DISPLAY_EXPLANATION("DISPLAY_EXPLANATION"),
    /* JADX INFO: Fake field, exist only in values array */
    DITTO_DISCOVER_FEED("DITTO_DISCOVER_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    FEED_HOISTED_STORY("FEED_HOISTED_STORY"),
    /* JADX INFO: Fake field, exist only in values array */
    FOLLOW_UP("FOLLOW_UP"),
    /* JADX INFO: Fake field, exist only in values array */
    HAPPY_BIRTHDAY("HAPPY_BIRTHDAY"),
    /* JADX INFO: Fake field, exist only in values array */
    LIKE_COUNT("LIKE_COUNT"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGES_FEED("PAGES_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    PE_FEED_IFR_INSIGHT_HEADER("PE_FEED_IFR_INSIGHT_HEADER"),
    /* JADX INFO: Fake field, exist only in values array */
    POPULAR_ON("POPULAR_ON"),
    /* JADX INFO: Fake field, exist only in values array */
    RECOMMEND_ACTION("RECOMMEND_ACTION"),
    /* JADX INFO: Fake field, exist only in values array */
    SECTION("SECTION"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTION("SUGGESTION"),
    /* JADX INFO: Fake field, exist only in values array */
    THROWBACK("THROWBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC("TOPIC"),
    /* JADX INFO: Fake field, exist only in values array */
    TRENDING("TRENDING"),
    /* JADX INFO: Fake field, exist only in values array */
    WHALESHARK("WHALESHARK");

    public final String serverValue;

    GraphQLStoryHeaderType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
