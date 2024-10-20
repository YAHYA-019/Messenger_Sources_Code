package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCommunityChatsToDoTaskStatus.class */
public enum GraphQLXFBCommunityChatsToDoTaskStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DONE("DONE"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_PROGRESS("IN_PROGRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_STARTED("NOT_STARTED");

    public final String serverValue;

    GraphQLXFBCommunityChatsToDoTaskStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
