package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGenAICardLayoutType.class */
public enum GraphQLXFBMessengerGenAICardLayoutType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT("DEFAULT"),
    HEADER("HEADER"),
    /* JADX INFO: Fake field, exist only in values array */
    HEADER_CTAS("HEADER_CTAS");

    public final String serverValue;

    GraphQLXFBMessengerGenAICardLayoutType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
