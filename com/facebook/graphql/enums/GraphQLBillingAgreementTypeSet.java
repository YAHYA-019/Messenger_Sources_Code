package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLBillingAgreementTypeSet.class */
public final class GraphQLBillingAgreementTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"DAILY", "MINUTELY", "MONTHLY", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "WEEKLY", "YEARLY"});

    public static final Set getSet() {
        return A00;
    }
}
