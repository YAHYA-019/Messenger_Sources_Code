package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLXFBFbMsgrNoteReactionType.class */
public enum GraphQLXFBFbMsgrNoteReactionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ANGRY("ANGRY"),
    /* JADX INFO: Fake field, exist only in values array */
    HAHA("HAHA"),
    /* JADX INFO: Fake field, exist only in values array */
    LIKE("LIKE"),
    /* JADX INFO: Fake field, exist only in values array */
    LOVE("LOVE"),
    /* JADX INFO: Fake field, exist only in values array */
    SAD("SAD"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID),
    /* JADX INFO: Fake field, exist only in values array */
    WOW("WOW");

    public final String serverValue;

    GraphQLXFBFbMsgrNoteReactionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
