package com.facebook.graphql.enums;

import X.1BK;
import X.DKF;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLAlohaAbilityCategoryEnumSet.class */
public final class GraphQLAlohaAbilityCategoryEnumSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[35];
        A00 = DKF.A0w(new String[]{"SYSTEM", "TRAVEL_AND_REVIEWS", "TV_AND_MOVIES", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "UTILITIES", "VIDEO", "WEATHER", "WEBSITE"}, strArr, 1BK.A1W(new String[]{"AR_EXPERIENCES", "BUSINESS", "EDUCATION", "ENTERTAINMENT", "FAMILY", "FINANCE", "FOOD", "GAMES", "HEALTH", "HELP", "HOME_AUTOMATION", "INTERNET", "LIFESTYLE", "MUSIC", "MUSIC_AND_PODCASTS", "NEWS", "NEWS_AND_WEATHER", "OTHER", "PHOTO", "PRODUCTIVITY", "REFERENCE", "RETAIL", "SHOPPING", "SHORTCUT", "SHOW", "SOCIAL", "SPORTS"}, strArr) ? 1 : 0, 27, 8);
    }

    public static final Set getSet() {
        return A00;
    }
}
