package com.facebook.graphql.enums;

import X.02H;
import X.1BK;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLTimelineContextListTargetTypeSet.class */
public final class GraphQLTimelineContextListTargetTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[36];
        System.arraycopy(new String[]{"REFRESHER", "SAFETY_INFORMATION", "SELF_TIMELINE_REVIEW", "SERP", "STATE_CONTROLLED_MEDIA", "WHATSAPP_NUMBER", "WIFI", "WORKVERSARIES", "WORK_NULL_STATE"}, 1BK.A1W(new String[]{"ADDRESS", "ADMIN_LOCATION_MISMATCH", "BUSINESS_HOURS", "BUSINESS_SERVICES", "COMPOSER", "CONFIRMED_OWNER", "CREATOR_LEADERBOARD_RANKING", "DISCOVERY_BUCKET", "DISCOVERY_GRID", "DISCOVERY_ITEM_FEED", "DISCOVERY_LIST", "DISCOVERY_STREAM", "DISCOVERY_SWITCHER", "EDUCATION_NULL_STATE", "FOLLOWERS", "FRIENDS", "MESSAGE", "MUTUAL_FRIENDS", "NO_ACTION", "OTHER_ACCOUNTS", "PHOTO_UPLOADS", "PROFILE_EMAIL", "PROFILE_PHONE", "PROFILE_TRANSPARENCY", "PROFILE_WEBSITE", "RATINGS", "RECENT_FRIENDS"}, strArr) ? 1 : 0, strArr, 27, 9);
        A00 = 02H.A00(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
