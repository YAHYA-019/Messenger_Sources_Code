package com.facebook.graphql.enums;

/* loaded from: GraphQLContactRelationshipStatus.class */
public enum GraphQLContactRelationshipStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CONTACT("CONTACT"),
    NON_CONTACT("NON_CONTACT"),
    SOFT_CONTACT("SOFT_CONTACT");

    public final String serverValue;

    GraphQLContactRelationshipStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
