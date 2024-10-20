package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLAnimationStartTypeEnum.class */
public enum GraphQLAnimationStartTypeEnum {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO_VIEW("PROMO_VIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_ANGRY("REACTION_ANGRY"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_CONFUSED("REACTION_CONFUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_FLOWER("REACTION_FLOWER"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_HAHA("REACTION_HAHA"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_LIKE("REACTION_LIKE"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_LOVE("REACTION_LOVE"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_PRIDE("REACTION_PRIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_SAD("REACTION_SAD"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_WOW("REACTION_WOW"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTION_YAY("REACTION_YAY"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLAnimationStartTypeEnum(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
