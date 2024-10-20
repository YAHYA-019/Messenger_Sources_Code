package com.facebook.graphql.enums;

/* loaded from: GraphQLGenericXMAStateIndicatorType.class */
public enum GraphQLGenericXMAStateIndicatorType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ERROR("ERROR"),
    LOADING("LOADING"),
    PENDING("PENDING");

    public final String serverValue;

    GraphQLGenericXMAStateIndicatorType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
