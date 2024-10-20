package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLProductAvailabilitySet.class */
public final class GraphQLProductAvailabilitySet {
    public static final HashSet A00 = 02H.A00(new String[]{"AVAILABLE_FOR_ORDER", "DISCONTINUED", "IN_STOCK", "MARK_AS_SOLD", "OUT_OF_STOCK", "PENDING", "PREORDER", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID});

    public static final Set getSet() {
        return A00;
    }
}
