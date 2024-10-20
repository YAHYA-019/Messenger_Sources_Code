package com.facebook.graphql.enums;

/* loaded from: GraphQLVideoBroadcastInfraType.class */
public enum GraphQLVideoBroadcastInfraType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_DID_SWAP("DASH_INGEST"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_DID_SWAP("FBVP_QUIC"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_DID_SWAP("FBVP_TCP"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_DID_SWAP("RTC"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_DID_SWAP("RTC_DID_SWAP"),
    RTC_HUDDLE("RTC_HUDDLE"),
    /* JADX INFO: Fake field, exist only in values array */
    RTC_ROOMS("RTC_ROOMS"),
    /* JADX INFO: Fake field, exist only in values array */
    RTMP("RTMP"),
    /* JADX INFO: Fake field, exist only in values array */
    RTMP_SWAP_ENABLED("RTMP_SWAP_ENABLED");

    public final String serverValue;

    GraphQLVideoBroadcastInfraType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
