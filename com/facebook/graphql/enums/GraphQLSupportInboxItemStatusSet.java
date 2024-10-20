package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLSupportInboxItemStatusSet.class */
public final class GraphQLSupportInboxItemStatusSet {
    public static final HashSet A00 = 02H.A00(new String[]{"AWAITING_ACTION", "CLOSED", "IN_REVIEW", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID});

    public static final Set getSet() {
        return A00;
    }
}
