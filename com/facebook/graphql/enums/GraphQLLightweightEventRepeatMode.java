package com.facebook.graphql.enums;

/* loaded from: GraphQLLightweightEventRepeatMode.class */
public enum GraphQLLightweightEventRepeatMode {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DAILY("DAILY"),
    /* JADX INFO: Fake field, exist only in values array */
    MONTHLY("MONTHLY"),
    /* JADX INFO: Fake field, exist only in values array */
    ONCE("ONCE"),
    /* JADX INFO: Fake field, exist only in values array */
    WEEKLY("WEEKLY"),
    /* JADX INFO: Fake field, exist only in values array */
    YEARLY("YEARLY");

    public final String serverValue;

    GraphQLLightweightEventRepeatMode(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
