package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBLSContactBlockedByViewerStatus.class */
public enum GraphQLXFBLSContactBlockedByViewerStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FULLY_BLOCKED("FULLY_BLOCKED"),
    MESSAGE_BLOCKED("MESSAGE_BLOCKED"),
    UNBLOCKED("UNBLOCKED");

    public final String serverValue;

    GraphQLXFBLSContactBlockedByViewerStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
