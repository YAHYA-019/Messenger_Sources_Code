package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGenAICardCategory.class */
public enum GraphQLXFBMessengerGenAICardCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AI_DISCOVERY("AI_DISCOVERY"),
    /* JADX INFO: Fake field, exist only in values array */
    CORE_MESSAGING("CORE_MESSAGING"),
    /* JADX INFO: Fake field, exist only in values array */
    HEADER("HEADER"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONAL_DEVELOPMENT("PERSONAL_DEVELOPMENT"),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL("SOCIAL");

    public final String serverValue;

    GraphQLXFBMessengerGenAICardCategory(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
