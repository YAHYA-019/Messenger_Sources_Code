package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLMessengerAccountStatusCategory.class */
public enum GraphQLMessengerAccountStatusCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEACTIVATED_ALLOWED_ON_MESSENGER("DEACTIVATED_ALLOWED_ON_MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_CONFIRMED("FACEBOOK_CONFIRMED"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_PENDING("FACEBOOK_PENDING"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_ONLY_NOT_ALLOWED_ON_MESSENGER("FB_ONLY_NOT_ALLOWED_ON_MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_ONLY_CONFIRMED("MESSENGER_ONLY_CONFIRMED"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_ONLY_DEACTIVATED("MESSENGER_ONLY_DEACTIVATED"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_ONLY_NOT_ALLOWED_ON_FB("MESSENGER_ONLY_NOT_ALLOWED_ON_FB"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLMessengerAccountStatusCategory(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
