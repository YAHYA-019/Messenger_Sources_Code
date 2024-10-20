package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCommunityMessagingOnboardingTaskType.class */
public enum GraphQLXFBCommunityMessagingOnboardingTaskType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNITY_INTRO("COMMUNITY_INTRO"),
    /* JADX INFO: Fake field, exist only in values array */
    GROW_YOUR_COMMUNITY("GROW_YOUR_COMMUNITY");

    public final String serverValue;

    GraphQLXFBCommunityMessagingOnboardingTaskType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
