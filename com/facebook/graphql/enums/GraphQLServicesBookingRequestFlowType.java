package com.facebook.graphql.enums;

/* loaded from: GraphQLServicesBookingRequestFlowType.class */
public enum GraphQLServicesBookingRequestFlowType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    JOB_INTERVIEW("FACEBOOK_APPOINTMENT"),
    INSTANT_BOOKING("INSTANT_BOOKING"),
    /* JADX INFO: Fake field, exist only in values array */
    JOB_INTERVIEW("JOB_INTERVIEW"),
    MESSAGING_APPOINTMENTS_WEBHOOK("MESSAGING_APPOINTMENTS_WEBHOOK"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TIME("REQUEST_TIME");

    public final String serverValue;

    GraphQLServicesBookingRequestFlowType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
