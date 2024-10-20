package com.facebook.graphql.enums;

/* loaded from: GraphQLInstreamPlacement.class */
public enum GraphQLInstreamPlacement {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNSTREAM("DOWNSTREAM"),
    /* JADX INFO: Fake field, exist only in values array */
    MID_ROLL("MID_ROLL"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_INTERRUPTIVE("NON_INTERRUPTIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    OVERLAY("OVERLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    POST_ROLL("POST_ROLL"),
    /* JADX INFO: Fake field, exist only in values array */
    PRE_ROLL("PRE_ROLL");

    public final String serverValue;

    GraphQLInstreamPlacement(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
