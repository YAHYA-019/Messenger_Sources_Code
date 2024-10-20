package com.facebook.graphql.enums;

/* loaded from: GraphQLServicesCalendarSyncType.class */
public enum GraphQLServicesCalendarSyncType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_ONLY("CLIENT_ONLY"),
    NO_CALENDAR_SYNC("NO_CALENDAR_SYNC"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_CONTINUOUS("SERVER_CONTINUOUS"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_SINGLE("SERVER_SINGLE");

    public final String serverValue;

    GraphQLServicesCalendarSyncType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
