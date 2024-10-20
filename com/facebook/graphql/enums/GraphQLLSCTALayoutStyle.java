package com.facebook.graphql.enums;

/* loaded from: GraphQLLSCTALayoutStyle.class */
public enum GraphQLLSCTALayoutStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ALWAYS_VERTICAL("ALWAYS_VERTICAL"),
    HORIZONTAL_IF_POSSIBLE("HORIZONTAL_IF_POSSIBLE");

    public final String serverValue;

    GraphQLLSCTALayoutStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
