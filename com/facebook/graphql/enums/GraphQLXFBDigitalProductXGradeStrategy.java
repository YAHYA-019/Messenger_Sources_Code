package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBDigitalProductXGradeStrategy.class */
public enum GraphQLXFBDigitalProductXGradeStrategy {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DEFERRED("DEFERRED"),
    IMMEDIATE_AND_CHARGE_FULL_PRICE("IMMEDIATE_AND_CHARGE_FULL_PRICE"),
    IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE("IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE"),
    IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS("IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS"),
    IMMEDIATE_SWITCH_WITH_TIME_PRORATION("IMMEDIATE_SWITCH_WITH_TIME_PRORATION"),
    IMMEDIATE_WITHOUT_PRORATION("IMMEDIATE_WITHOUT_PRORATION");

    public final String serverValue;

    GraphQLXFBDigitalProductXGradeStrategy(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
