package com.facebook.graphql.enums;

/* loaded from: GraphQLStructuredNamePart.class */
public enum GraphQLStructuredNamePart {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FIRST("first"),
    LAST("last"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE("middle");

    public final String serverValue;

    GraphQLStructuredNamePart(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
