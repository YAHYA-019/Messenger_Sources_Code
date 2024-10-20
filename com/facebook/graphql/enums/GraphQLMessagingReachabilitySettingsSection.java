package com.facebook.graphql.enums;

/* loaded from: GraphQLMessagingReachabilitySettingsSection.class */
public enum GraphQLMessagingReachabilitySettingsSection {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER_PEOPLE("OTHER_PEOPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    POTENTIAL_CONNECTIONS("POTENTIAL_CONNECTIONS");

    public final String serverValue;

    GraphQLMessagingReachabilitySettingsSection(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
