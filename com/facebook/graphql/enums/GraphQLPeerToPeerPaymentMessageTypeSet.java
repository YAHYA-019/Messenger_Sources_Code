package com.facebook.graphql.enums;

import X.02H;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPeerToPeerPaymentMessageTypeSet.class */
public final class GraphQLPeerToPeerPaymentMessageTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"CANCELED_CHARGEBACK", "CANCELED_CUSTOMER_SERVICE", "CANCELED_DECLINED", "CANCELED_EXPIRED", "CANCELED_RECIPIENT_RISK", "CANCELED_SAME_CARD", "CANCELED_SENDER_RISK", "CANCELED_SYSTEM_FAIL", "REQUEST_CANCELED_BY_REQUESTER", "REQUEST_DECLINED_BY_REQUESTEE", "REQUEST_EXPIRED", "SENT_IN_GROUP"});

    public static final Set getSet() {
        return A00;
    }
}
