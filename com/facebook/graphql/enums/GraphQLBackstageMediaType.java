package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLBackstageMediaType.class */
public enum GraphQLBackstageMediaType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE("LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTES_FB("NOTES_FB"),
    /* JADX INFO: Fake field, exist only in values array */
    PHOTO("PHOTO"),
    /* JADX INFO: Fake field, exist only in values array */
    SATP("SATP"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO"),
    /* JADX INFO: Fake field, exist only in values array */
    WAS_LIVE("WAS_LIVE");

    public final String serverValue;

    GraphQLBackstageMediaType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
