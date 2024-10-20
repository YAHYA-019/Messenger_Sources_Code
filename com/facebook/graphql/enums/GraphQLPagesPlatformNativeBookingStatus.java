package com.facebook.graphql.enums;

/* loaded from: GraphQLPagesPlatformNativeBookingStatus.class */
public enum GraphQLPagesPlatformNativeBookingStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CANCELLED("CANCELLED"),
    CONFIRMED("CONFIRMED"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANT_BOOKING_PENDING("DECLINED"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANT_BOOKING_PENDING("EXTERNAL_PROVIDER"),
    FULFILLED("FULFILLED"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANT_BOOKING_PENDING("INSTANT_BOOKING_PENDING"),
    NO_SHOW("NO_SHOW"),
    PENDING("PENDING"),
    REQUESTED("REQUESTED");

    public final String serverValue;

    GraphQLPagesPlatformNativeBookingStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
