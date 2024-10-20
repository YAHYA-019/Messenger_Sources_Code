package com.facebook.graphql.enums;

/* loaded from: GraphQLMessageProfileRangeType.class */
public enum GraphQLMessageProfileRangeType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMINS("ADMINS"),
    /* JADX INFO: Fake field, exist only in values array */
    AI("AI"),
    /* JADX INFO: Fake field, exist only in values array */
    AI_IMAGE("AI_IMAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS("ANONYMOUS"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNITY_AI("COMMUNITY_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNITY_CHANNEL("COMMUNITY_CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM("CUSTOM"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    POLL("POLL"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE("PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    SILENT("SILENT"),
    /* JADX INFO: Fake field, exist only in values array */
    SUMMARY("SUMMARY"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD("THREAD"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD_ACTIVE("THREAD_ACTIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD_SHOUT("THREAD_SHOUT");

    public final String serverValue;

    GraphQLMessageProfileRangeType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
