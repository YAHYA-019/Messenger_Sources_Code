package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLEventInviteeStatusTypeSet.class */
public final class GraphQLEventInviteeStatusTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"GOING", "HIDDEN_REASON", "INELIGIBLE_FOR_EVENT", "INVITABLE", "INVITABLE_FOF", "INVITED", "MAYBE", "NOT_FRIEND", "NOT_GOING", "NOT_GROUP_FRIEND", "NOT_GROUP_MEMBER", "OVER_LIMIT", "REMOVED", "SUBSCRIBED", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "VIEWER_SELF"});

    public static final Set getSet() {
        return A00;
    }
}
