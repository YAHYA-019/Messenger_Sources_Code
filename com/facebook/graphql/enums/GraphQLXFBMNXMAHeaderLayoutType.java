package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMNXMAHeaderLayoutType.class */
public enum GraphQLXFBMNXMAHeaderLayoutType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BELOW_PREVIEW("BELOW_PREVIEW"),
    DEFAULT("DEFAULT"),
    OVERLAY_PREVIEW("OVERLAY_PREVIEW");

    public final String serverValue;

    GraphQLXFBMNXMAHeaderLayoutType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
