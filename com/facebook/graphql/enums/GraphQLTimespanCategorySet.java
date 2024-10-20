package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLTimespanCategorySet.class */
public final class GraphQLTimespanCategorySet {
    public static final HashSet A00 = 02H.A00(new String[]{"INSTANTLY", "LONGER_THAN_A_DAY", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "WITHIN_A_DAY", "WITHIN_FEW_HOURS", "WITHIN_HOUR", "WITHIN_MINUTES"});

    public static final Set getSet() {
        return A00;
    }
}
