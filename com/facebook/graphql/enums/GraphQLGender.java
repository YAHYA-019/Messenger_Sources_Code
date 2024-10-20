package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLGender.class */
public enum GraphQLGender {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOCKED("BLOCKED"),
    /* JADX INFO: Fake field, exist only in values array */
    FEMALE("FEMALE"),
    /* JADX INFO: Fake field, exist only in values array */
    MALE("MALE"),
    /* JADX INFO: Fake field, exist only in values array */
    NEUTER("NEUTER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLGender(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
