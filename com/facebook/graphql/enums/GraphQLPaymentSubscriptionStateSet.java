package com.facebook.graphql.enums;

import X.02H;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPaymentSubscriptionStateSet.class */
public final class GraphQLPaymentSubscriptionStateSet {
    public static final HashSet A00 = 02H.A00(new String[]{"ACTIVE", "CANCELLED", "EXPIRED", "FREE_TRIAL", "INITED", "IN_GRACE_PERIOD", "ON_HOLD", "PAUSED", "REINITED"});

    public static final Set getSet() {
        return A00;
    }
}
