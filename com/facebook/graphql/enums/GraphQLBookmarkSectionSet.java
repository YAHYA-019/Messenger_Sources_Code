package com.facebook.graphql.enums;

import X.02H;
import X.1BK;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLBookmarkSectionSet.class */
public final class GraphQLBookmarkSectionSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[52];
        System.arraycopy(new String[]{"NEO_USER", "NEWS_FEED", "NEWS_FEED_TOOL", "NON_COMPANY_GROUP", "NON_COMPANY_GROUP_TOOL", "PAGE", "PAGE_TOOL", "PAYMENT", "PAYMENT_TOOL", "PINNABLE_PAGE_TOOL", "PLATFORM_APP", "SCRAPBOOK", "SHORTCUT_ACTIONS", "SUBSCRIPTIONS", "TOPIC_FEEDS", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "USER", "USER_TOOL", "WORK_GROUPS_ANNOUNCEMENT", "WORK_GROUPS_CROSS_COMPANY", "WORK_GROUPS_FEEDBACK", "WORK_GROUPS_MULTI_COMPANY", "WORK_GROUPS_SOCIAL", "WORK_GROUPS_TEAM", "WORK_PINNED_GROUPS"}, 1BK.A1W(new String[]{"APP", "APP_TOOL", "BUSINESS", "BUSINESS_PAGE", "CANVAS_APP_GAME", "COMBINED_APP_AND_TOOLS", "COMPANY", "COMPANY_TOOL", "DEVELOPER", "DEVELOPER_TOOL", "EVENT", "EVENT_TOOL", "FACEBOOK_APP", "FOLDER", "FOLLOWED_PAGES", "FRIEND_LIST", "FUNDRAISER", "FUNDRAISER_TOOL", "GAME", "GAMETIME_LIVE_EVENTS", "GAME_TOOL", "GAMING_VIDEO_CREATOR", "GROUP", "GROUP_TOOL", "INTEREST_AND_CURATED_LIST", "INTEREST_LIST", "LIST_TOOL"}, strArr) ? 1 : 0, strArr, 27, 25);
        A00 = 02H.A00(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
