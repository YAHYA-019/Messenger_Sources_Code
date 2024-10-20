package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessageReplyType.class */
public enum GraphQLXFBMessageReplyType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BUMP("BUMP"),
    /* JADX INFO: Fake field, exist only in values array */
    REGULAR("REGULAR");

    public final String serverValue;

    GraphQLXFBMessageReplyType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
