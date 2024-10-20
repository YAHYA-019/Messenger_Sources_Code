package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIOrchestratorSearchEngine.class */
public enum GraphQLXFBGenAIOrchestratorSearchEngine {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BING("BING"),
    /* JADX INFO: Fake field, exist only in values array */
    BRAVE("BRAVE"),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE("GOOGLE"),
    /* JADX INFO: Fake field, exist only in values array */
    HELP_CENTER("HELP_CENTER"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_HOUSE("IN_HOUSE"),
    /* JADX INFO: Fake field, exist only in values array */
    KSS("KSS"),
    /* JADX INFO: Fake field, exist only in values array */
    MASE("MASE");

    public final String serverValue;

    GraphQLXFBGenAIOrchestratorSearchEngine(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
