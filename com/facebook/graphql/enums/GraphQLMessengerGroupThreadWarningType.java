package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLMessengerGroupThreadWarningType.class */
public enum GraphQLMessengerGroupThreadWarningType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CEI_BANK_HIT("CEI_BANK_HIT"),
    CEI_SHARER("CEI_SHARER"),
    CLEAR("CLEAR"),
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLMessengerGroupThreadWarningType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
