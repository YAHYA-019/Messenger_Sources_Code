package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLInstantGamesExperienceTypeSet.class */
public final class GraphQLInstantGamesExperienceTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"FULL_EXPERIENCE", "LITE_EXPERIENCE", "NATIVE_ONLY_EXPERIENCE", MessageAvailabilityResponseId$Companion.NOT_SUPPORTED});

    public static final Set getSet() {
        return A00;
    }
}