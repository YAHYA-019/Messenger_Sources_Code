package com.facebook.graphql.enums;

/* loaded from: GraphQLInsertionPointOrigin.class */
public enum GraphQLInsertionPointOrigin {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SCRUBBER("SCRUBBER"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO");

    public final String serverValue;

    GraphQLInsertionPointOrigin(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
