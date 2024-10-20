package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerThreadTakedownState.class */
public enum GraphQLXFBMessengerThreadTakedownState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    RESTORED("GEO_BLOCKED"),
    /* JADX INFO: Fake field, exist only in values array */
    RESTORED("RESTORED"),
    TAKEN_DOWN("TAKEN_DOWN");

    public final String serverValue;

    GraphQLXFBMessengerThreadTakedownState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
