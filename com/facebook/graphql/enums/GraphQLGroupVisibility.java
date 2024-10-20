package com.facebook.graphql.enums;

/* loaded from: GraphQLGroupVisibility.class */
public enum GraphQLGroupVisibility {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CLOSED("CLOSED"),
    OPEN("OPEN"),
    SECRET("SECRET");

    public final String serverValue;

    GraphQLGroupVisibility(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
