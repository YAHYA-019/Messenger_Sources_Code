package com.facebook.graphql.enums;

/* loaded from: GraphQLLightweightEventType.class */
public enum GraphQLLightweightEventType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CALL("CALL"),
    DIRECT_M("DIRECT_M"),
    EVENT("EVENT"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENTS_REMINDER("MEETING_PLAN"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENTS_REMINDER("M_PERSONAL_REMINDER"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENTS_REMINDER("M_REMINDER"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENTS_REMINDER("PAYMENTS_REMINDER"),
    SAFETY_LOCATION_SHARE("SAFETY_LOCATION_SHARE"),
    /* JADX INFO: Fake field, exist only in values array */
    WORKCHAT_PERSONAL_REMINDER("WORKCHAT_PERSONAL_REMINDER");

    public final String serverValue;

    GraphQLLightweightEventType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
