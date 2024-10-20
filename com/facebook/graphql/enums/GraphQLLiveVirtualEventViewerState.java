package com.facebook.graphql.enums;

/* loaded from: GraphQLLiveVirtualEventViewerState.class */
public enum GraphQLLiveVirtualEventViewerState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTDOWN("COUNTDOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    IS_LIVE("IS_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    PAST_WITH_NO_BROADCAST("PAST_WITH_NO_BROADCAST"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARING_VOD("PREPARING_VOD"),
    /* JADX INFO: Fake field, exist only in values array */
    PRE_LIVE("PRE_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_BROADCAST("WAITING_FOR_BROADCAST"),
    /* JADX INFO: Fake field, exist only in values array */
    WAS_LIVE("WAS_LIVE");

    public final String serverValue;

    GraphQLLiveVirtualEventViewerState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
