package com.facebook.graphql.enums;

/* loaded from: GraphQLServicesBookingRequestAdminApprovalType.class */
public enum GraphQLServicesBookingRequestAdminApprovalType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN_ACCEPT_DECLINE("ADMIN_ACCEPT_DECLINE"),
    ADMIN_SCHEDULE_DECLINE("ADMIN_SCHEDULE_DECLINE");

    public final String serverValue;

    GraphQLServicesBookingRequestAdminApprovalType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
