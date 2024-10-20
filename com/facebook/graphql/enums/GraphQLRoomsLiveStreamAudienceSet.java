package com.facebook.graphql.enums;

import X.DKG;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLRoomsLiveStreamAudienceSet.class */
public final class GraphQLRoomsLiveStreamAudienceSet {
    public static final HashSet A00 = DKG.A1B("ALL_FRIENDS", "EVERYONE", "FRIENDS_OF_FRIENDS", "SELF", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public static final Set getSet() {
        return A00;
    }
}
