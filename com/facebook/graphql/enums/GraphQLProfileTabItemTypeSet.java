package com.facebook.graphql.enums;

import X.02H;
import X.1BK;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLProfileTabItemTypeSet.class */
public final class GraphQLProfileTabItemTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"SHOP", "SUBSCRIBER_HUB", "TOPICS", "TRIBUTES", "VIDEOS"}, 1BK.A1W(new String[]{"ABOUT", "ARTICLES", "CHATS", "COLLECTIBLES", "COMMUNITY", "COMMUNITY_HELP", "EVENTS", "EVENTS_BLOKS", "FAN_HUB", "FILES", "FUNDRAISERS", "GUIDES", "HOME", "JOBS", "JOINABLE_VIDEO_CHATS", "LOOKING_FOR_PLAYERS", "MENTIONS", "MENTORSHIP", "MENU", "MUSIC_CHARTS", "OVERFLOW", "PHOTOS", "PODCASTS", "QUESTIONS", "RECOMMENDATIONS", "REELS", "SERVICES"}, strArr) ? 1 : 0, strArr, 27, 5);
        A00 = 02H.A00(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
