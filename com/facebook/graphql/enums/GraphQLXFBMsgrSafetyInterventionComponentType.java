package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionComponentType.class */
public enum GraphQLXFBMsgrSafetyInterventionComponentType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ABOVE_COMPOSER_BANNER("ABOVE_COMPOSER_BANNER"),
    BOTTOM_SHEET("BOTTOM_SHEET"),
    COMPOSER_BLOCK("COMPOSER_BLOCK");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionComponentType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
