package com.facebook.graphql.enums;

import X.02H;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPayTransactionStatusSet.class */
public final class GraphQLPayTransactionStatusSet {
    public static final HashSet A00 = 02H.A00(new String[]{"CANCELED", "CHARGED_BACK", "COMPLETED", "DECLINED", "EXPIRED", "INITED", "PARTIAL_REFUND", "PENDING", "REFUNDED", "UNAVAILABLE"});

    public static final Set getSet() {
        return A00;
    }
}
