package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPageCallToActionActionTypeSet.class */
public final class GraphQLPageCallToActionActionTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{PaymentDetailChangeTypes$Companion.EMAIL, "EVENT_TICKET", "FIRST_PARTY", "FOLLOW_PAGE", "GROUP", "LEAD_GEN", "MESSENGER", "MOBILE_CENTER", "PHONE_CALL", "SHOP_ON_FACEBOOK", "VIEW_INVENTORY", "VIEW_SHOP", "WEBSITE", "WHATSAPP_MESSAGE"});

    public static final Set getSet() {
        return A00;
    }
}
