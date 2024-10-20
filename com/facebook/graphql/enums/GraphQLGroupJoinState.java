package com.facebook.graphql.enums;

/* loaded from: GraphQLGroupJoinState.class */
public enum GraphQLGroupJoinState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_JOIN_OR_REQUEST("CANNOT_JOIN_OR_REQUEST"),
    CAN_JOIN("CAN_JOIN"),
    CAN_REQUEST("CAN_REQUEST"),
    MEMBER("MEMBER"),
    REQUESTED("REQUESTED");

    public final String serverValue;

    GraphQLGroupJoinState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
