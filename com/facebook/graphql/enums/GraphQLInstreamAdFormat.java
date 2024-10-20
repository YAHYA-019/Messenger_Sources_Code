package com.facebook.graphql.enums;

/* loaded from: GraphQLInstreamAdFormat.class */
public enum GraphQLInstreamAdFormat {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE("IMAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_AD_POD("IMAGE_AD_POD"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_INTERRUPTIVE_AD_POD("NON_INTERRUPTIVE_AD_POD"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_SKIPPABLE_VIDEO("NON_SKIPPABLE_VIDEO"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_SKIPPABLE_VIDEO_AD_POD("NON_SKIPPABLE_VIDEO_AD_POD"),
    /* JADX INFO: Fake field, exist only in values array */
    SKIPPABLE_VIDEO("SKIPPABLE_VIDEO"),
    /* JADX INFO: Fake field, exist only in values array */
    SKIPPABLE_VIDEO_AD_POD("SKIPPABLE_VIDEO_AD_POD");

    public final String serverValue;

    GraphQLInstreamAdFormat(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
