package com.facebook.graphql.enums;

/* loaded from: GraphQLBusinessMomentReminderTriggerType.class */
public enum GraphQLBusinessMomentReminderTriggerType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_BASED("DEVICE_BASED"),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_BASED("TIME_BASED");

    public final String serverValue;

    GraphQLBusinessMomentReminderTriggerType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
