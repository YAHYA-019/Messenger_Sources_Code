package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLCreditCardAssociationSet.class */
public final class GraphQLCreditCardAssociationSet {
    public static final HashSet A00 = 02H.A00(new String[]{"AMERICANEXPRESS", "CUP", "DINERSCLUB", "DISCOVER", "ELO", "INTERAC", "JCB", "MAESTRO", "MASTERCARD", "PIN_ONLY", "RUPAY", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "VISA"});

    public static final Set getSet() {
        return A00;
    }
}
