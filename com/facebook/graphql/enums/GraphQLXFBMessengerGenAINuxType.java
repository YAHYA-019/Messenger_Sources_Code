package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGenAINuxType.class */
public enum GraphQLXFBMessengerGenAINuxType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AI_VOICE("AI_VOICE"),
    GEN_AI_CHATS("GEN_AI_CHATS"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AI_VOICE("IG_AI_VOICE"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_GEN_AI_CHATS("IG_GEN_AI_CHATS");

    public final String serverValue;

    GraphQLXFBMessengerGenAINuxType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
