package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLWorkUserAvailabilityStatusTypeSet.class */
public final class GraphQLWorkUserAvailabilityStatusTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{MessageAvailabilityResponseId$Companion.AVAILABLE, "BUSY", "DO_NOT_DISTURB", "EMOJI_STATUS", "FOCUS", "NONE", "SPORADIC", "TENTATIVE"});

    public static final Set getSet() {
        return A00;
    }
}
