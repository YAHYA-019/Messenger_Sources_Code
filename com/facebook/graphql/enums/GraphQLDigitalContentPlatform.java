package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLDigitalContentPlatform.class */
public enum GraphQLDigitalContentPlatform {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    APPLE("APPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING("BILLING"),
    /* JADX INFO: Fake field, exist only in values array */
    FB("FB"),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE("GOOGLE"),
    /* JADX INFO: Fake field, exist only in values array */
    OC("OC"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLDigitalContentPlatform(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
