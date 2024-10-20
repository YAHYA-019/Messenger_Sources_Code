package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCallRequestButtonType.class */
public enum GraphQLXFBCallRequestButtonType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_CALL_REQUEST_BUTTON("DISABLE_CALL_REQUEST_BUTTON"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_CALL_REQUEST_BUTTON("HIDE_CALL_REQUEST_BUTTON"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_CALL_REQUEST_BUTTON("SHOW_CALL_REQUEST_BUTTON");

    public final String serverValue;

    GraphQLXFBCallRequestButtonType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
