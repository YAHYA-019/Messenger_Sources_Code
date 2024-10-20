package com.facebook.graphql.enums;

/* loaded from: GraphQLFBStoryAdsOptimizationType.class */
public enum GraphQLFBStoryAdsOptimizationType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADVERTISER_PROFILE_CARD("ADVERTISER_PROFILE_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    CAPTION_TO_CAROUSEL("CAPTION_TO_CAROUSEL"),
    /* JADX INFO: Fake field, exist only in values array */
    DYNAMIC_CAPTION_LINE("DYNAMIC_CAPTION_LINE"),
    /* JADX INFO: Fake field, exist only in values array */
    END_SCENE("END_SCENE"),
    /* JADX INFO: Fake field, exist only in values array */
    HEADLINE("HEADLINE"),
    /* JADX INFO: Fake field, exist only in values array */
    LEADGEN_FIRST_QUESTION_CARD("LEADGEN_FIRST_QUESTION_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTWEIGHT_CLICK_TO_MESSAGE("LIGHTWEIGHT_CLICK_TO_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTWEIGHT_LEADGEN_STICKER("LIGHTWEIGHT_LEADGEN_STICKER"),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_VIDEO_TO_CAROUSEL("LONG_VIDEO_TO_CAROUSEL"),
    /* JADX INFO: Fake field, exist only in values array */
    MAI_SCREENSHOT_CAROUSEL("MAI_SCREENSHOT_CAROUSEL"),
    /* JADX INFO: Fake field, exist only in values array */
    MID_VIDEO_TO_CAROUSEL("MID_VIDEO_TO_CAROUSEL");

    public final String serverValue;

    GraphQLFBStoryAdsOptimizationType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
