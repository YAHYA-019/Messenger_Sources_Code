package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMetaAiCardIconName.class */
public enum GraphQLXFBMetaAiCardIconName {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CAKE("CAKE"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIENDS("FRIENDS"),
    /* JADX INFO: Fake field, exist only in values array */
    GEN_AI("GEN_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS("REELS"),
    /* JADX INFO: Fake field, exist only in values array */
    SEARCH("SEARCH"),
    /* JADX INFO: Fake field, exist only in values array */
    TRENDING("TRENDING");

    public final String serverValue;

    GraphQLXFBMetaAiCardIconName(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
