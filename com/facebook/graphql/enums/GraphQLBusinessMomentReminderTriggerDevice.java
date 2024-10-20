package com.facebook.graphql.enums;

/* loaded from: GraphQLBusinessMomentReminderTriggerDevice.class */
public enum GraphQLBusinessMomentReminderTriggerDevice {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP("DESKTOP");

    public final String serverValue;

    GraphQLBusinessMomentReminderTriggerDevice(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
