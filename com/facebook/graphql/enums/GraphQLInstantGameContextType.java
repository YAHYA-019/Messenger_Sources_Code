package com.facebook.graphql.enums;

/* loaded from: GraphQLInstantGameContextType.class */
public enum GraphQLInstantGameContextType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    GENERIC("GENERIC"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("GROUP"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("MATCH"),
    SOLO("SOLO"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("STORY"),
    THREAD("THREAD");

    public final String serverValue;

    GraphQLInstantGameContextType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
