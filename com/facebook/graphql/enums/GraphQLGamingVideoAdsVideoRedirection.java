package com.facebook.graphql.enums;

/* loaded from: GraphQLGamingVideoAdsVideoRedirection.class */
public enum GraphQLGamingVideoAdsVideoRedirection {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    STREAMER_HUB("STREAMER_HUB"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_PLAYER("VIDEO_PLAYER");

    public final String serverValue;

    GraphQLGamingVideoAdsVideoRedirection(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
