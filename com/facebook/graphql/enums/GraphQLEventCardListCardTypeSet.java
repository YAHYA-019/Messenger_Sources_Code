package com.facebook.graphql.enums;

import X.DKF;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLEventCardListCardTypeSet.class */
public final class GraphQLEventCardListCardTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[60];
        System.arraycopy(new String[]{"EVENT_ABOUT_GROUP", "EVENT_ABOUT_ROLES", "EVENT_ABOUT_VENUE", "EVENT_ARENA", "EVENT_ARTIST_TOP_TRACKS", "EVENT_DASHBOARD_CALENDAR_TAB_NUX", "EVENT_DASHBOARD_FEEDBACK", "EVENT_DASHBOARD_HERO_HSCROLL", "EVENT_DASHBOARD_HERO_HSCROLL_NUX", "EVENT_DASHBOARD_LOCATION_PICKER", "EVENT_DASHBOARD_NATIVE_UPCOMING_HSCROLL", "EVENT_DASHBOARD_PROMO_UNIT", "EVENT_DASHBOARD_TEST", "EVENT_DASHBOARD_TIME_FILTER", "EVENT_DASHBOARD_TIME_FILTER_PILL", "EVENT_DASHBOARD_UPCOMING", "EVENT_DASHBOARD_UPCOMING_EXPANDED", "EVENT_DASHBOARD_UPCOMING_HSCROLL", "EVENT_DASHBOARD_UPCOMING_SHORT", "EVENT_DASHBOARD_UPCOMING_UNIT_NUX", "EVENT_DETAILS", "EVENT_FUNDRAISER", "EVENT_GUEST_LIST", "EVENT_INSTANCE_PARENT_EVENT_LINK", "EVENT_MESSAGE_FRIENDS_UNIT", "EVENT_OTHER_TOUR_EVENTS", "EVENT_PEOPLE_CARD_FACEPILES"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"EVENT_PEOPLE_CARD_HSCROLL", "EVENT_PEOPLE_CARD_LIST", "EVENT_PEOPLE_CARD_LIST_GO_WITH_FRIENDS", "EVENT_PHOTOS_GALLERY", "EVENT_PHOTOS_OF_GROUP", "EVENT_PHOTOS_OF_ROLES", "EVENT_PHOTOS_OF_VENUE", "EVENT_POPULAR_TIMES_WITH_FRIENDS", "EVENT_POST_COMPOSER", "EVENT_POST_COMPOSER_NT", "EVENT_POST_PIVOT", "EVENT_RECENT_POSTS", "EVENT_REGISTERED_GUESTS", "EVENT_REGISTERED_GUESTS_WITH_FACEPILE", "EVENT_REGISTRATION_INSIGHTS", "EVENT_REGISTRATION_SUMMARY", "EVENT_RELATED", "EVENT_RELATED_GROUPS", "EVENT_SOCAL_UPSELL", "EVENT_UPCOMING_EVENTS_AT_VENUE", "EVENT_UPCOMING_EVENTS_FOR_GROUP", "EVENT_UPCOMING_EVENTS_IN_CITY", "EVENT_UPCOMING_EVENTS_WITH_PRIMARY_ROLE", "EVENT_UPCOMING_TIMES", "EVENT_UPCOMING_TIMES_WITH_CONNECTION", "MOVIES_COMING_SOON", "MOVIES_NOW_PLAYING"}, 0, strArr, 27, 27);
        A00 = DKF.A0w(new String[]{"MOVIES_POPULAR_WITH_FRIENDS", "MOVIES_PROMO_UNIT", "MOVIE_DETAILS_ABOUT", "MOVIE_DETAILS_MORE_MOVIES", "MOVIE_DISCOUNT_PROMOTION", "UNKNOWN_CARD_TYPE"}, strArr, 0, 54, 6);
    }

    public static final Set getSet() {
        return A00;
    }
}
