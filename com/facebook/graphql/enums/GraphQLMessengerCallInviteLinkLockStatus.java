package com.facebook.graphql.enums;

/* loaded from: GraphQLMessengerCallInviteLinkLockStatus.class */
public enum GraphQLMessengerCallInviteLinkLockStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LOCKED_BY_OWNER("LOCKED_BY_OWNER"),
    LOCKED_BY_OWNER_DISCONNECT("LOCKED_BY_OWNER_DISCONNECT"),
    OPEN("OPEN");

    public final String serverValue;

    GraphQLMessengerCallInviteLinkLockStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
