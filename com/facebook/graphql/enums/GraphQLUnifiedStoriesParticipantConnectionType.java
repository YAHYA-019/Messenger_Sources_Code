package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLUnifiedStoriesParticipantConnectionType.class */
public enum GraphQLUnifiedStoriesParticipantConnectionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CONNECTION("CONNECTION"),
    FOLLOWER("FOLLOWER"),
    FRIENDS("FRIENDS"),
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLUnifiedStoriesParticipantConnectionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
