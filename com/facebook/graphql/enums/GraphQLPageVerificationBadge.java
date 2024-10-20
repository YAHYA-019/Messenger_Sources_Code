package com.facebook.graphql.enums;

/* loaded from: GraphQLPageVerificationBadge.class */
public enum GraphQLPageVerificationBadge {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BLUE_VERIFIED("BLUE_VERIFIED"),
    GRAY_VERIFIED("GRAY_VERIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_VERIFIED("NOT_VERIFIED");

    public final String serverValue;

    GraphQLPageVerificationBadge(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
