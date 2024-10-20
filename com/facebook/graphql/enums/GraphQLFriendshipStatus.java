package com.facebook.graphql.enums;

/* loaded from: GraphQLFriendshipStatus.class */
public enum GraphQLFriendshipStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ARE_FRIENDS("ARE_FRIENDS"),
    CANNOT_REQUEST("CANNOT_REQUEST"),
    CAN_REQUEST("CAN_REQUEST"),
    INCOMING_REQUEST("INCOMING_REQUEST"),
    OUTGOING_REQUEST("OUTGOING_REQUEST");

    public final String serverValue;

    GraphQLFriendshipStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
