package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBThreadStatus.class */
public enum GraphQLXFBThreadStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT("DEFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSED("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSED_AND_UPGRADED_TO_COMMUNITY("PAUSED_AND_UPGRADED_TO_COMMUNITY"),
    /* JADX INFO: Fake field, exist only in values array */
    UPGRADED_TO_COMMUNITY_AND_TO_BE_PAUSED("UPGRADED_TO_COMMUNITY_AND_TO_BE_PAUSED");

    public final String serverValue;

    GraphQLXFBThreadStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
