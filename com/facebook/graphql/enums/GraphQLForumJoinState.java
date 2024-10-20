package com.facebook.graphql.enums;

/* loaded from: GraphQLForumJoinState.class */
public enum GraphQLForumJoinState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_JOIN("CANNOT_JOIN"),
    /* JADX INFO: Fake field, exist only in values array */
    CAN_JOIN("CAN_JOIN"),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER("MEMBER");

    public final String serverValue;

    GraphQLForumJoinState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
