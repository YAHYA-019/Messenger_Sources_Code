package com.facebook.graphql.enums;

/* loaded from: GraphQLVideoBroadcastStatus.class */
public enum GraphQLVideoBroadcastStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LIVE("LIVE"),
    LIVE_STOPPED("LIVE_STOPPED"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("PREVIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("PRE_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("SCHEDULED_CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("SCHEDULED_EXPIRED"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("SCHEDULED_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("SCHEDULED_PREVIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    SEAL_FAILED("SEAL_FAILED"),
    SEAL_STARTED("SEAL_STARTED"),
    VOD_READY("VOD_READY");

    public final String serverValue;

    GraphQLVideoBroadcastStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
