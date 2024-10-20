package com.facebook.graphql.enums;

import X.DKG;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPeerToPeerPaymentMethodCategorySet.class */
public final class GraphQLPeerToPeerPaymentMethodCategorySet {
    public static final HashSet A00 = DKG.A1B("CREDIT_CARD", "DEBIT_CARD", "PAYPAL_BA", "PREPAID_CARD", "STORED_VALUE_ACCOUNT");

    public static final Set getSet() {
        return A00;
    }
}
