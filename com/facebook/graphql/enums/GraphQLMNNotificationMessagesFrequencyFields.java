package com.facebook.graphql.enums;

/* loaded from: GraphQLMNNotificationMessagesFrequencyFields.class */
public enum GraphQLMNNotificationMessagesFrequencyFields {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DAILY("DAILY"),
    MONTHLY("MONTHLY"),
    WEEKLY("WEEKLY");

    public final String serverValue;

    GraphQLMNNotificationMessagesFrequencyFields(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
