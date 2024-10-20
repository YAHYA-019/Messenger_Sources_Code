package com.facebook.graphql.enums;

/* loaded from: GraphQLZeroTokenUnregisteredReason.class */
public enum GraphQLZeroTokenUnregisteredReason {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_DIALTONE_COUNTRY("NOT_IN_DIALTONE_COUNTRY"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_REGION("NOT_IN_REGION"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_REGION_SUPPORTED_CARRIER("NOT_IN_REGION_SUPPORTED_CARRIER"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_REGION_UNSUPPORTED_CARRIER("NOT_IN_REGION_UNSUPPORTED_CARRIER"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_REGION_WIFI("NOT_IN_REGION_WIFI"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ON_CARRIER("NOT_ON_CARRIER"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CAMPAIGN("NO_CAMPAIGN"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_ROAMING_SIM("ON_ROAMING_SIM"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_WIFI("ON_WIFI"),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE("UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_BROWSER("UNSUPPORTED_BROWSER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_CARRIER("UNSUPPORTED_CARRIER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_CATEGORY("UNSUPPORTED_CATEGORY");

    public final String serverValue;

    GraphQLZeroTokenUnregisteredReason(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
