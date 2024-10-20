package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBDelightAtRangeType.class */
public enum GraphQLXFBDelightAtRangeType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CAMPAIGN("CAMPAIGN"),
    MAGIC_WORD("MAGIC_WORD");

    public final String serverValue;

    GraphQLXFBDelightAtRangeType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
