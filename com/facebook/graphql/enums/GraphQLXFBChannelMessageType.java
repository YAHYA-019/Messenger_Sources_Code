package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLXFBChannelMessageType.class */
public enum GraphQLXFBChannelMessageType {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    TEXT("TEXT"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLXFBChannelMessageType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
