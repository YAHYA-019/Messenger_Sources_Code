package com.facebook.graphql.enums;

/* loaded from: GraphQLAccountClaimStatus.class */
public enum GraphQLAccountClaimStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CLAIMED_ACTIVE("CLAIMED_ACTIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    CLAIMED_ONBOARDING("CLAIMED_ONBOARDING"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_LAUNCHED("NOT_LAUNCHED"),
    /* JADX INFO: Fake field, exist only in values array */
    UNCLAIMED("UNCLAIMED");

    public final String serverValue;

    GraphQLAccountClaimStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
