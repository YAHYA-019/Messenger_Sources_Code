package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGroupLinkJoinType.class */
public enum GraphQLXFBMessengerGroupLinkJoinType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CHANNEL("CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNITY("COMMUNITY"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNITY_AND_CHANNEL("COMMUNITY_AND_CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVERABLE_PUBLIC_BROADCAST_CHAT("DISCOVERABLE_PUBLIC_BROADCAST_CHAT"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVERABLE_PUBLIC_CHAT("DISCOVERABLE_PUBLIC_CHAT"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIEND_AND_FAMILY("FRIEND_AND_FAMILY");

    public final String serverValue;

    GraphQLXFBMessengerGroupLinkJoinType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
