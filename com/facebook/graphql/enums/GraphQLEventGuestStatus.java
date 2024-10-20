package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLEventGuestStatus.class */
public enum GraphQLEventGuestStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    GOING("GOING"),
    /* JADX INFO: Fake field, exist only in values array */
    HOST("HOST"),
    /* JADX INFO: Fake field, exist only in values array */
    INVITED("INVITED"),
    /* JADX INFO: Fake field, exist only in values array */
    LIKED("LIKED"),
    /* JADX INFO: Fake field, exist only in values array */
    MAYBE("MAYBE"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_GOING("NOT_GOING"),
    /* JADX INFO: Fake field, exist only in values array */
    SAVED("SAVED"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_BUT_NOT_CONNECTED("SHARED_BUT_NOT_CONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBED_ADMIN_CALENDAR("SUBSCRIBED_ADMIN_CALENDAR"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLEventGuestStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
