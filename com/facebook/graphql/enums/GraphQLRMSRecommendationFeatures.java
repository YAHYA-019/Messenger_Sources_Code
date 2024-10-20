package com.facebook.graphql.enums;

import com.facebook.acra.criticaldata.CriticalAppData;

/* loaded from: GraphQLRMSRecommendationFeatures.class */
public enum GraphQLRMSRecommendationFeatures {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AI_CAPTION("AI_CAPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKDROP_PROMPT_KEY("BACKDROP_PROMPT_KEY"),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_ID(CriticalAppData.DEVICE_ID),
    /* JADX INFO: Fake field, exist only in values array */
    GI_ASSET_ID("GI_ASSET_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_ID("LOCAL_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_ID("MEDIA_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_ID("MUSIC_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_TYPE("PRODUCT_TYPE");

    public final String serverValue;

    GraphQLRMSRecommendationFeatures(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
