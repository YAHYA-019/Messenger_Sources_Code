package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGamesIAPSubscriptionTerm.class */
public enum GraphQLXFBGamesIAPSubscriptionTerm {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ANNUAL("ANNUAL"),
    /* JADX INFO: Fake field, exist only in values array */
    MONTHLY("MONTHLY"),
    /* JADX INFO: Fake field, exist only in values array */
    QUARTERLY("QUARTERLY"),
    /* JADX INFO: Fake field, exist only in values array */
    SEMIANNUAL("SEMIANNUAL"),
    /* JADX INFO: Fake field, exist only in values array */
    WEEKLY("WEEKLY");

    public final String serverValue;

    GraphQLXFBGamesIAPSubscriptionTerm(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
