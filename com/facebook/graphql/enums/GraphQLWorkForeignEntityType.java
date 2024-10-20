package com.facebook.graphql.enums;

/* loaded from: GraphQLWorkForeignEntityType.class */
public enum GraphQLWorkForeignEntityType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FOREIGN("FOREIGN"),
    LIMITED("LIMITED"),
    NOT_FOREIGN("NOT_FOREIGN");

    public final String serverValue;

    GraphQLWorkForeignEntityType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
