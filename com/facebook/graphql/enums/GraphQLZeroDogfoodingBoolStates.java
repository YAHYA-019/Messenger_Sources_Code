package com.facebook.graphql.enums;

/* loaded from: GraphQLZeroDogfoodingBoolStates.class */
public enum GraphQLZeroDogfoodingBoolStates {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    OFF("OFF"),
    /* JADX INFO: Fake field, exist only in values array */
    ON("ON");

    public final String serverValue;

    GraphQLZeroDogfoodingBoolStates(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
