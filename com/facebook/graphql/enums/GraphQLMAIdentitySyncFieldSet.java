package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLMAIdentitySyncFieldSet.class */
public final class GraphQLMAIdentitySyncFieldSet {
    public static final HashSet A00 = 02H.A00(new String[]{"AVATAR", "CATEGORY", "DESCRIPTION", PaymentDetailChangeTypes$Companion.EMAIL, "LOCATION_ADDRESS", "LOCATION_CITY_ID", "LOCATION_ZIP", "NAME", "PHONE", "PROFILE_PHOTO", "USERNAME", "WEBSITE"});

    public static final Set getSet() {
        return A00;
    }
}
